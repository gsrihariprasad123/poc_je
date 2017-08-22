var app = angular.module("myApp", ["ngRoute"]);

app.controller('mainCtl', function($scope,$http) {
	
});


app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "home.html"
    })
    .when("/empform", {
        templateUrl : "empform.html"
    })
     .when("/removebyid", {
        templateUrl : "remove.html"
    })
    .when("/getemp", {
        templateUrl : "getdata.html"
    });
});






app.service('shareDataService', function() {
	  var eid = "";
	  var addEid = function(newObj) {
		  
		  eid=null;
		  eid="";
		  eid=newObj;
		 
	  }

	  var getEid = function(){
		  console.log(eid);
	      return eid;
	  }
    var makeNullEid = function(){
	        eid =null;
	     

	  }
	  return {
		  addEid: addEid,
		  getEid: getEid
		
	  };

	});








