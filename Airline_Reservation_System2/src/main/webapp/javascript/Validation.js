function validation(){
	var pass = document.getElementById("pass").value; 
	var pass2 = document.getElementById("pass2").value; 
	
	
  if(pass != pass2) {  
     document.getElementById("message").innerHTML = "**It must same password!";  
     return false;  
  }  
  if(pass.length < 8) {  
     document.getElementById("messages").innerHTML = "**Password length must be atleast 8 characters";  
     return false;  
  }  
    }