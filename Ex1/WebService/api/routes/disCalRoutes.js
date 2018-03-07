'use strict';
module.exports = function(app) {
  var disCalController = require('../controllers/disCalController');

  app.route('/:queryString')
    .get(disCalController.test)
};