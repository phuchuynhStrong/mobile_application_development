package phucht.com.currencytrans

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.support.design.widget.TextInputLayout
import android.support.v4.widget.SwipeRefreshLayout
import android.view.View
import android.widget.*
import com.jakewharton.rxbinding.widget.RxTextView
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    lateinit var mStartSpin : Spinner
    lateinit var mEndSpin : Spinner
    lateinit var mTextInputLayout : TextInputLayout
    lateinit var mEditText: TextInputEditText
    lateinit var mResult: TextView
    lateinit var mRates: JSONObject
    lateinit var mCurrencyList: JSONArray
    lateinit var mRefreshLayout: SwipeRefreshLayout

    private var mBaseCurrency = "EUR"
    private val mHttpClient = OkHttpClient()

    private fun initComponent() {
        mRefreshLayout = findViewById(R.id.swipe_refresh_layout)
        mStartSpin = findViewById(R.id.currency_start_spinner)
        mEndSpin = findViewById(R.id.currency_end_spinner)
        mTextInputLayout = findViewById(R.id.start_curr_text_input_layout)
        mEditText = findViewById(R.id.start_curr)
        mResult = findViewById(R.id.result_tv)

        mRefreshLayout.setOnRefreshListener {
            fetchingCurrencyList()
        }
    }

    val onItemSelected: AdapterView.OnItemSelectedListener = object: AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {

        }

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            transfer(mEditText.text.toString())
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponent()

        RxTextView.
                textChanges(mEditText)
                .debounce(2, TimeUnit.SECONDS)
                .map { s -> s.toString() }
                .subscribe { s -> transfer(s) }

        mStartSpin.onItemSelectedListener = onItemSelected
        mEndSpin.onItemSelectedListener = onItemSelected
    }

    override fun onResume() {
        super.onResume()

        fetchingCurrencyList()
    }

    private fun fetchingCurrencyList() {
        val request = Request.Builder()
                .url(Utils.FIXER_URL)
                .build()
       mHttpClient.newCall(request).enqueue(object: Callback {
            override fun onFailure(call: Call?, e: IOException?) {
                Toast.makeText(this@MainActivity, "Check your internet connections", Toast.LENGTH_SHORT).show()
                runOnUiThread { mRefreshLayout.isRefreshing = false }
            }

            override fun onResponse(call: Call?, response: Response?) {
                updateCurrencyList(response?.body()?.string().toString())
                runOnUiThread { mRefreshLayout.isRefreshing = false }
            }

        })
    }

    private fun updateCurrencyList(resultString: String) {
        val obj = JSONObject(resultString)
        mBaseCurrency = obj.getString("base")
        mRates = obj.getJSONObject("rates")
        mCurrencyList = mRates.names()
        val listdata = ArrayList<String>()
            for (i in 0 until mCurrencyList.length()) {
                listdata.add(mCurrencyList.getString(i))
            }
        val adapter : ArrayAdapter<CharSequence> = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listdata as List<CharSequence>?)
        runOnUiThread {
            mStartSpin.adapter = adapter
            mEndSpin.adapter = adapter
        }

    }

    private fun transfer(amount: String) {

        if (mEditText.text.toString().isEmpty()) {
            runOnUiThread { mResult.text = "Fill the amount" }
            return
        }

        val from = mStartSpin.selectedItem.toString()
        val end = mEndSpin.selectedItem.toString()

        val amountInBase = amount.toDouble() / (mRates.getDouble(from))
        val result = amountInBase * (mRates.getDouble(end))

        runOnUiThread { mResult.text = "$result $end" }

    }
}
