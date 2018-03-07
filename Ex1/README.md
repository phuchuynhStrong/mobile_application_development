# Exsercise 1 README

## Part 1.
WebService of GoogleMap which I've found is :
```
https://maps.googleapis.com/maps/api/geocode/json?latlng=LAT,LONG&key=YOUR_API_KEY
```
- LAT, LONG is your coordinates
- YOUR_API_KEY : GoogleMap geocoding API key. You can get one by access to this page : https://developers.google.com/maps/documentation/geocoding/get-api-key

Sample query URL :
```
https://maps.googleapis.com/maps/api/geocode/json?latlng=10.881784,106.804496&key=AIzaSyBljRYTH_Yj5I1fVwgnBARQQMd-h5bPcV4
```
Result : 
```
{
   "results" : [
      {
         "address_components" : [
            {
               "long_name" : "A3",
               "short_name" : "A3",
               "types" : [ "route" ]
            },
            {
               "long_name" : "Đông Hòa",
               "short_name" : "Đông Hòa",
               "types" : [ "political", "sublocality", "sublocality_level_1" ]
            },
            {
               "long_name" : "Thị xã Dĩ An",
               "short_name" : "Tx. Dĩ An",
               "types" : [ "locality", "political" ]
            },
            {
               "long_name" : "Đông Hoà",
               "short_name" : "Đông Hoà",
               "types" : [ "administrative_area_level_3", "political" ]
            },
            {
               "long_name" : "Dĩ An",
               "short_name" : "Dĩ An",
               "types" : [ "administrative_area_level_2", "political" ]
            },
            {
               "long_name" : "Bình Dương",
               "short_name" : "Bình Dương",
               "types" : [ "administrative_area_level_1", "political" ]
            },
            {
               "long_name" : "Việt Nam",
               "short_name" : "VN",
               "types" : [ "country", "political" ]
            }
         ],
         "formatted_address" : "A3, Đông Hòa, Dĩ An, Bình Dương, Việt Nam",
         "geometry" : {
            "bounds" : {
               "northeast" : {
                  "lat" : 10.8821153,
                  "lng" : 106.8047354
               },
               "southwest" : {
                  "lat" : 10.8795774,
                  "lng" : 106.8030887
               }
            },
            "location" : {
               "lat" : 10.8808464,
               "lng" : 106.803912
            },
            "location_type" : "GEOMETRIC_CENTER",
            "viewport" : {
               "northeast" : {
                  "lat" : 10.8821953302915,
                  "lng" : 106.8052610302915
               },
               "southwest" : {
                  "lat" : 10.8794973697085,
                  "lng" : 106.8025630697085
               }
            }
         },
         "place_id" : "ChIJiwhAMKXYdDERkCqc6j-Kav0",
         "types" : [ "route" ]
      },
      {
         "address_components" : [
            {
               "long_name" : "Đông Hòa",
               "short_name" : "Đông Hòa",
               "types" : [ "political", "sublocality", "sublocality_level_1" ]
            },
            {
               "long_name" : "Thị xã Dĩ An",
               "short_name" : "Tx. Dĩ An",
               "types" : [ "locality", "political" ]
            },
            {
               "long_name" : "Dĩ An",
               "short_name" : "Dĩ An",
               "types" : [ "administrative_area_level_2", "political" ]
            },
            {
               "long_name" : "Bình Dương",
               "short_name" : "Bình Dương",
               "types" : [ "administrative_area_level_1", "political" ]
            },
            {
               "long_name" : "Việt Nam",
               "short_name" : "VN",
               "types" : [ "country", "political" ]
            }
         ],
         "formatted_address" : "Đông Hòa, Tx. Dĩ An, Bình Dương, Việt Nam",
         "geometry" : {
            "bounds" : {
               "northeast" : {
                  "lat" : 10.9067126,
                  "lng" : 106.8141138
               },
               "southwest" : {
                  "lat" : 10.867214,
                  "lng" : 106.7685807
               }
            },
            "location" : {
               "lat" : 10.8906827,
               "lng" : 106.7846345
            },
            "location_type" : "APPROXIMATE",
            "viewport" : {
               "northeast" : {
                  "lat" : 10.9067126,
                  "lng" : 106.8141138
               },
               "southwest" : {
                  "lat" : 10.867214,
                  "lng" : 106.7685807
               }
            }
         },
         "place_id" : "ChIJYflEfZbYdDERXRhKLd_se94",
         "types" : [ "political", "sublocality", "sublocality_level_1" ]
      },
      {
         "address_components" : [
            {
               "long_name" : "Thị xã Dĩ An",
               "short_name" : "Tx. Dĩ An",
               "types" : [ "locality", "political" ]
            },
            {
               "long_name" : "Bình Dương",
               "short_name" : "Bình Dương",
               "types" : [ "administrative_area_level_1", "political" ]
            },
            {
               "long_name" : "Việt Nam",
               "short_name" : "VN",
               "types" : [ "country", "political" ]
            }
         ],
         "formatted_address" : "Tx. Dĩ An, Bình Dương, Việt Nam",
         "geometry" : {
            "bounds" : {
               "northeast" : {
                  "lat" : 10.9689156,
                  "lng" : 106.840571
               },
               "southwest" : {
                  "lat" : 10.8585318,
                  "lng" : 106.7365821
               }
            },
            "location" : {
               "lat" : 10.8964757,
               "lng" : 106.7527418
            },
            "location_type" : "APPROXIMATE",
            "viewport" : {
               "northeast" : {
                  "lat" : 10.9689156,
                  "lng" : 106.840571
               },
               "southwest" : {
                  "lat" : 10.8585318,
                  "lng" : 106.7365821
               }
            }
         },
         "place_id" : "ChIJDTqLuB7ZdDERTJCr_EHum8I",
         "types" : [ "locality", "political" ]
      },
      {
         "address_components" : [
            {
               "long_name" : "Đông Hoà",
               "short_name" : "Đông Hoà",
               "types" : [ "administrative_area_level_3", "political" ]
            },
            {
               "long_name" : "Thị xã Dĩ An",
               "short_name" : "Tx. Dĩ An",
               "types" : [ "locality", "political" ]
            },
            {
               "long_name" : "Dĩ An",
               "short_name" : "Dĩ An",
               "types" : [ "administrative_area_level_2", "political" ]
            },
            {
               "long_name" : "Bình Dương",
               "short_name" : "Bình Dương",
               "types" : [ "administrative_area_level_1", "political" ]
            },
            {
               "long_name" : "Việt Nam",
               "short_name" : "VN",
               "types" : [ "country", "political" ]
            }
         ],
         "formatted_address" : "Đông Hoà, Dĩ An, Bình Dương, Việt Nam",
         "geometry" : {
            "bounds" : {
               "northeast" : {
                  "lat" : 10.904981,
                  "lng" : 106.8142269
               },
               "southwest" : {
                  "lat" : 10.8670221,
                  "lng" : 106.7687879
               }
            },
            "location" : {
               "lat" : 10.8877579,
               "lng" : 106.7883416
            },
            "location_type" : "APPROXIMATE",
            "viewport" : {
               "northeast" : {
                  "lat" : 10.904981,
                  "lng" : 106.8142269
               },
               "southwest" : {
                  "lat" : 10.8670221,
                  "lng" : 106.7687879
               }
            }
         },
         "place_id" : "ChIJZ9vkXpbYdDERFfX2zK911cI",
         "types" : [ "administrative_area_level_3", "political" ]
      },
      {
         "address_components" : [
            {
               "long_name" : "Dĩ An",
               "short_name" : "Dĩ An",
               "types" : [ "administrative_area_level_2", "political" ]
            },
            {
               "long_name" : "Bình Dương",
               "short_name" : "Bình Dương",
               "types" : [ "administrative_area_level_1", "political" ]
            },
            {
               "long_name" : "Việt Nam",
               "short_name" : "VN",
               "types" : [ "country", "political" ]
            }
         ],
         "formatted_address" : "Dĩ An, Bình Dương, Việt Nam",
         "geometry" : {
            "bounds" : {
               "northeast" : {
                  "lat" : 10.9690931,
                  "lng" : 106.840371
               },
               "southwest" : {
                  "lat" : 10.86301,
                  "lng" : 106.734521
               }
            },
            "location" : {
               "lat" : 10.9044391,
               "lng" : 106.7824429
            },
            "location_type" : "APPROXIMATE",
            "viewport" : {
               "northeast" : {
                  "lat" : 10.9690931,
                  "lng" : 106.840371
               },
               "southwest" : {
                  "lat" : 10.86301,
                  "lng" : 106.734521
               }
            }
         },
         "place_id" : "ChIJGdgu7x3ZdDERTwk_YoBbkjI",
         "types" : [ "administrative_area_level_2", "political" ]
      },
      {
         "address_components" : [
            {
               "long_name" : "Bình Dương",
               "short_name" : "Bình Dương",
               "types" : [ "administrative_area_level_1", "political" ]
            },
            {
               "long_name" : "Việt Nam",
               "short_name" : "VN",
               "types" : [ "country", "political" ]
            }
         ],
         "formatted_address" : "Bình Dương, Việt Nam",
         "geometry" : {
            "bounds" : {
               "northeast" : {
                  "lat" : 11.5013561,
                  "lng" : 106.966831
               },
               "southwest" : {
                  "lat" : 10.86301,
                  "lng" : 106.335151
               }
            },
            "location" : {
               "lat" : 11.3254024,
               "lng" : 106.477017
            },
            "location_type" : "APPROXIMATE",
            "viewport" : {
               "northeast" : {
                  "lat" : 11.5013561,
                  "lng" : 106.966831
               },
               "southwest" : {
                  "lat" : 10.86301,
                  "lng" : 106.335151
               }
            }
         },
         "place_id" : "ChIJeSj5jmq2dDERcxSNHInanzM",
         "types" : [ "administrative_area_level_1", "political" ]
      },
      {
         "address_components" : [
            {
               "long_name" : "Ho Chi Minh City Metropolitan Area",
               "short_name" : "Ho Chi Minh City Metropolitan Area",
               "types" : [ "political" ]
            },
            {
               "long_name" : "Việt Nam",
               "short_name" : "VN",
               "types" : [ "country", "political" ]
            }
         ],
         "formatted_address" : "Ho Chi Minh City Metropolitan Area, Việt Nam",
         "geometry" : {
            "bounds" : {
               "northeast" : {
                  "lat" : 12.2978089,
                  "lng" : 107.5823451
               },
               "southwest" : {
                  "lat" : 8.630172999999999,
                  "lng" : 105.5037139
               }
            },
            "location" : {
               "lat" : 11.2136337,
               "lng" : 106.912251
            },
            "location_type" : "APPROXIMATE",
            "viewport" : {
               "northeast" : {
                  "lat" : 12.2978089,
                  "lng" : 107.5823451
               },
               "southwest" : {
                  "lat" : 8.630172999999999,
                  "lng" : 105.5037139
               }
            }
         },
         "place_id" : "ChIJ1z7UIRkvdTER06xXZFy3wAI",
         "types" : [ "political" ]
      },
      {
         "address_components" : [
            {
               "long_name" : "Việt Nam",
               "short_name" : "VN",
               "types" : [ "country", "political" ]
            }
         ],
         "formatted_address" : "Việt Nam",
         "geometry" : {
            "bounds" : {
               "northeast" : {
                  "lat" : 23.393395,
                  "lng" : 109.6765
               },
               "southwest" : {
                  "lat" : 8.195200099999999,
                  "lng" : 102.14441
               }
            },
            "location" : {
               "lat" : 14.058324,
               "lng" : 108.277199
            },
            "location_type" : "APPROXIMATE",
            "viewport" : {
               "northeast" : {
                  "lat" : 23.393395,
                  "lng" : 109.6765
               },
               "southwest" : {
                  "lat" : 8.195200099999999,
                  "lng" : 102.14441
               }
            }
         },
         "place_id" : "ChIJXx5qc016FTERvmL-4smwO7A",
         "types" : [ "country", "political" ]
      }
   ],
   "status" : "OK"
}
```

## Part 2





##### Created by PhucHuynhStrong