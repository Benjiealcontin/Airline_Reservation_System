<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Airline Reservation System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<link href="css/index.css" rel="Stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a href="#" class="navbar-brand">Airline Reservation System</a>
        <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav">
                <a href="Adminpage.jsp" class="nav-item nav-link active">Home</a>
                <a href="#" class="nav-item nav-link">Add User</a>
                <a href="Userlists.jsp" class="nav-item nav-link">User List</a>
                <a href="Addbooking.jsp" class="nav-item nav-link">Add Booking</a>
                <a href="Bookinglists.jsp" class="nav-item nav-link">Booking List</a>
                <a href="Paymentlists.jsp" class="nav-item nav-link">Payment Lists</a>
                <a href="Confirm_Bookinglists.jsp" class="nav-item nav-link">Confirm Booking</a>
                <a href="#" class="nav-item nav-link disabled" tabindex="-1">Hi, Admin</a>
            </div>
            <div class="navbar-nav ms-auto">
                <a href="LoginForm.jsp" class="nav-item nav-link">Log out</a>
            </div>
        </div>
    </div>
</nav>
<div class="container">
   <div class="signup-form">
    <form action="CheckExistsAdmin" method="POST" onSubmit="return validation();">
		<h2>Add user</h2>
        <div class="form-group">
			<div class="row">
				<div class="col"><input type="text" class="form-control" name="fname" id="fname" placeholder="First Name" required="required"></div>
				<div class="col"><input type="text" class="form-control" name="lname" id="lname" placeholder="Last Name" required="required"></div>
			</div>        	
        </div>
        <div class="form-group">
        	<input type="email" class="form-control" name="email" id="email" placeholder="Email" required="required">
        </div>
		<div class="form-group">
            <input type="password" class="form-control" name="pass" id="pass" placeholder="Password" required="required">
            <span id = "messages" style="color:red"> </span>
        </div>
		<div class="form-group">
            <input type="password" class="form-control" name="confirm_password" id="pass2" placeholder="Confirm Password" required="required">
            <span id = "message" style="color:red"> </span> <br><br>  
        </div>        
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Add User</button>
        </div>
    </form>
</div>
</div>
</body>
</html>