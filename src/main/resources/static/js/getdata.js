app.controller('getdataCtrl', function($scope,$http) {
    $scope.emp = {};
   
    $scope.getData = function() {
    
    	$http.get("/getById?eid="+$scope.emp.id)
    	  .then(function(response) {
    		  
    	      $scope.myWelcome = response.data;
    	  });
    };
   
    $scope.getupdate=function(){
    	
    	console.log("welcome + "+JSON.stringify($scope.myWelcome));
    	
    	var url = 'update', data = $scope.myWelcome,config='contenttype';
    	$http.put(url, data, config).then(function (response) {
    	// This function handles success
    	}, function (response) {
    	// this function handles error
    	});
    	
    	
    };
    
});