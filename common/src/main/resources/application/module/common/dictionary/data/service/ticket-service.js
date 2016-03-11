angular.module("common.dictionary.data")
  .factory("ticketService", function ($http, converter) {
    // Ticket business layer
    return {
      // get single ticket
      item: function (id) {
        return $http.get("/ticket/" + id, {}).then(function (response) {
          return converter.in(response.data);
        });
      },

      // get list of ticket
      list: function (start, limit) {
        return $http.get("/ticket/list", {}).then(function (response) {
          return converter.in(response.data);
        }.bind(this));
      },

      // update existing ticket
      update: function (record) {
        return $http.put("/ticket", converter.out(record)).then(function (response) {
          return response.data;
        });
      },

      // create new ticket
      new: function (record) {
        return $http.post("/ticket", converter.out(record)).then(function (response) {
          return response.data;
        });
      },

      // delete ticket by id
      delete: function (id) {
        return $http.delete("/ticket/" + id).then(function (response) {
          return response.data;
        });
      },

      doEscalation: function (ticket, q) {
        ticket.supportLevelId = parseInt(ticket.supportLevelId) + parseInt(q || 0);
      }
    }
  });