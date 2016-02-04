function loadDoc() {
var xhttp = new XMLHttpRequest;
xhttp.onreadystatechange = function(){
  if(xhttp.readyState==4&&xhttp.status==200) {
      document.getElementById("myhead").innerHTML = xhttp.responseText;
  }  
};
xhttp.open("GET","AjaxServlet",true);
xhttp.send();
}