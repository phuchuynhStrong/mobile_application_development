'use strict';
var rad = function(x) {
  return x * Math.PI / 180;
};

var getDistance = function(arrays) {
  var R = 6378137; // Earth’s mean radius in meter
  var dLat = rad(arrays[2] - arrays[0]);
  var dLong = rad(arrays[3] - arrays[1]);
  var a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
    Math.cos(rad(arrays[0])) * Math.cos(rad(arrays[2])) *
    Math.sin(dLong / 2) * Math.sin(dLong / 2);
  var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
  var d = R * c;
  return d; // returns the distance in meter
};


exports.test = function(req, res) {
	var queryString = req.params.queryString
	var arrays = queryString.split("&")
							.map(x => x.replace("lat=", ""))
							.map(x => x.replace("long=", ""))
	res.json({Distance: getDistance(arrays)})
}