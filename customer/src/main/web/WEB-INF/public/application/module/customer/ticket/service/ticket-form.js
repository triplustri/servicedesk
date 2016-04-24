angular.module("customer.ticket")
  .factory("ticketForm", function ($uibModal) {
    return {
      open: function (ticket) {
        $uibModal.open({
          controller: 'TicketFormController',
          resolve: { ticket: ticket },
          size: 'lg',
          backdrop: 'static',
          templateUrl: '/public/application/template/customer/ticket/form/ticket.html'
        });
      }
    };
  });