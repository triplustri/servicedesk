angular.module("backend.settings")
  .controller("IndexSettingsController", function ($scope) {

    $scope.tabs = [
      {
        id: 1,
        heading: "Пользователи",
        templateUrl: "/public/application/module/backend/settings/template/tabs/users.html"
      },
      {
        id: 2,
        heading: "Контексты",
        templateUrl: "/public/application/module/backend/settings/template/tabs/contexts.html"
      },
      {
        id: 3,
        heading: "Группы",
        templateUrl: "/public/application/module/backend/settings/template/tabs/groups.html"
      },
      {
        id: 4,
        heading: "Внешний вид",
        templateUrl: "/public/application/module/backend/settings/template/tabs/ui.html"
      }
    ];

    $scope.saveActiveTab = function ($event) {
      localStorage["settings.activeTab"] = $event.currentTarget.id;
    };

    $scope.tabs.forEach(function (tab) {
      if ("tab-" + tab.id === localStorage["settings.activeTab"]){
        tab.active = true;
      }
    });
  });