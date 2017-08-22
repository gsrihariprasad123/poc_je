app.controller('emppopupCtrl', function($scope,$http,$window,shareDataService) {
	$scope.eidpop=shareDataService.getEid;
	
 	$http.get("/getById?eid="+$scope.emp.id)
	  .then(function(response) {
		  
	      $scope.myWelcome = response.data;
	  });
	
});