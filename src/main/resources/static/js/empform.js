app.controller('empformCtrl', function($scope,$http) {
	
	$scope.empmsg={};
    $scope.emp1 = {};
    
    $scope.submitform= function() {
    
    	
    	 var url = 'save', data = $scope.emp1,config='contenttype';
    	    $http.post(url, data, config).then(function (response) {
    	    	$scope.empmsg=JSON.stringify(response.data);
    	    }, function (response) {
    	    alert(JSON.stringify(response));
    	    });
    	
    };
    
});