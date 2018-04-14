var app = angular.module('arichandra', ['ui.router','satellizer','toastr']);
app.config(['$stateProvider', '$urlRouterProvider','$authProvider', 
             function($stateProvider, $urlRouterProvider,$authProvider) {

    $urlRouterProvider.otherwise('/login');

    $stateProvider
    .state('login', {
        cache:false,
    	url: '/login',
        templateUrl:'resources/static/pages/login/login.html',
      	  controller: 'loginCtrl'
      }).state('blog', {
          cache:false,
      	url: '/blog',
          templateUrl:'resources/static/pages/blog/blog.html'
        })
        
        /*For social media auth*/
        $authProvider.facebook({
            clientId: '741637086224048',
            responseType: 'token'
          });

          $authProvider.google({
            clientId: '892618676317-4khas3mecsfmbntsmmbq075t4rlnf0qb.apps.googleusercontent.com'
          });

          $authProvider.instagram({
            clientId: 'YOUR_INSTAGRAM_CLIENT_ID'
          });



          $authProvider.twitter({
            url: '/auth/twitter',
            responseType: 'token'
          });
        
        
    }]);