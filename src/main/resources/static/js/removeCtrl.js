
app.controller('removeCtrl', function($scope,$http) {
    $scope.emp2 = {};
    $scope.myWelcome={};
    $scope.removemsg={};
    $scope.removeById = function() {
    
    	$http.get("/removeById?eid="+$scope.emp2.id)
    	  .then(function(response) {
    		  $scope.removemsg=response.data;
    	     
    	  });
    };
   
    
});
