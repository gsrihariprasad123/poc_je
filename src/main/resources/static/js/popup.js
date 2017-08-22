
function fillDataFunction() { 
	
	var xx=window.location.href;
	console.log(xx);
	var url_string = window.location.href;
	var url = new URL(url_string);
	
	var eid = url.searchParams.get("eid");
	var ename = url.searchParams.get("ename");
	var eposition = url.searchParams.get("eposition");
	var eage = url.searchParams.get("eage");
	var eexp = url.searchParams.get("eexp");
	document.getElementById("eid").value = eid;
	document.getElementById("ename").value = ename;
	document.getElementById("eposition").value = eposition;
	document.getElementById("eage").value = eage;
	document.getElementById("eexp").value = eexp;
	console.log(eid);
	
	console.log(ename);
	
	
	} 	
	
function getupdatefrompopup(ename,eid,eposition ,eage,eexp){
	
	console.log(" "+ename.value);
	console.log(eexp);
	
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      document.getElementById("demo").innerHTML = this.responseText;
	    }
	  };
	  xhttp.open("POST", "save", true);
	  xhttp.setRequestHeader("Content-type", "application/json");
	  
			  var jsondata = {
			  "name": ename.value,
			  "id": eid.value,
			  "position": eposition.value,
			  "age": eage.value,
			  "exp": eexp.value,
			}
	  //xmlhttp.send(JSON.stringify({name:"+John Rambo", time:"2pm"}));
	  //alert(JSON.stringify(jsondata));
	  //xhttp.send("ename="+ename+"&eid="+eid+"&eposition="+eposition+"&eage="+eage+"&eexp="+eexp);
	  xhttp.send(JSON.stringify(jsondata));
	  window.opener.location.reload();
	  window.close();
}
	
	
	