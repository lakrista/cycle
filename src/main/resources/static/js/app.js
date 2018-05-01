let app = angular.module('cycleApp',['ui.router']);

app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {

        $stateProvider.state('home', {
                url: '/',
                templateUrl: 'partials/main',
                controller:'MainController'
            });
        $urlRouterProvider.otherwise('/');
    }]);