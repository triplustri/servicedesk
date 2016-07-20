angular.module("common.dictionary.data")
  .factory("serviceService", function ($http) {
    return {
      list: function (start, limit) {
        return $http.get('/service', {})
          .then(function (response) {
            return response.data;
          });
      },

      create: function(data){
        return $http.post('/service', data)
          .then(function (response) {
            return response.data;
          });
      },

      update: function(data){
        return $http.put('/service', data)
          .then(function (response) {
            return response.data;
          });
      }
    }
  });


export var service = 5;