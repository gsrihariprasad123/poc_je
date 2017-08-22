   
app.controller('homeCtrl', function($scope,$http,$window,shareDataService) {
	
	 
    $scope.emp = {};
    $scope.getalldata={};
    $scope.updatedsucc={};
    $scope.eeid="";
    
    
    $scope.OpenPopupWindow = function ( ename,eid,eexp,eposition,eage) {
    	$scope.eeid=eid;
    	console.log(" eid "+eid);
    	shareDataService.addEid($scope.eeid);
    	
    	
     	
    		  
    	$scope.greeting =null; 
    	var myWindow =null;
    	
   
        
    	 myWindow = window.open("/emppopup.html?eid="+eid+"&ename="+ename+"&eexp="+eexp+"&eposition="+eposition+"&eage="+eage, "MsgWindow", "width=200,height=100");
       // myWindow.document.write( $scope.greeting);
    };

$scope.getupdate=function(name,id,exp,position,age){
    	
	console.log(name  + "    "+ id +  "   "+  position+ "    "+ exp+"   "+ age);
    	$scope.updatedata={ 'name':name, 'id':id, 'position':position, 'exp':exp, 'age':age};
    	
    	console.log($scope.updatedata);
    	var url = 'update', data = $scope.updatedata,config='contenttype';
    	$http.put(url, data, config).then(function (response) {
    		$scope.updatedsucc=response.data;
    	}, function (response) {
    	// this function handles error
    		$scope.updatedsucc=response.data;
    	});
    	
    	
    };
    
    	$http.get("/getAll")
    	  .then(function(response) {
    		  
    	      $scope.getalldata = response.data;
    	  });
   
});

