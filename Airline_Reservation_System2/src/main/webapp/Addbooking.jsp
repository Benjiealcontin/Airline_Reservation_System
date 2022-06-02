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
                <a href="Adduser.jsp" class="nav-item nav-link">Add User</a>
                <a href="Userlists.jsp" class="nav-item nav-link">User List</a>
                <a href="#" class="nav-item nav-link">Add Booking</a>
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
    <form action="AddbookingFromAdmin" method="POST">
    		<h2>Add Booking</h2>
		<p class="hint-text">Please fill up all the form</p>
        <div class="form-group">
			<div class="row">
			<p>Full Name</p>
				<div class="col"><input type="text" class="form-control" name="fname" id="fname" required="required"></div>
				<div class="col"><input type="text" class="form-control" name="lname" id="fname" required="required"></div>
			</div>        	
        </div>
                <div class="form-group">
                <p>Date of Birth</p>
        	<input type="date" class="form-control" name="dob" id="email" required="required">
        </div>
        <div class="form-group">
        <p>Email Address</p>
        	<input type="email" class="form-control" name="email" id="email" required="required">
        </div>
                <div class="form-group">
        <p>Phone Number</p>
        	<input type="text" class="form-control" name="pnumber" id="email" required="required">
        </div>
                <div class="form-group">
			
			<p>Address</p>
				<div class="col"><input type="text" class="form-control" name="add1" id="fname" required="required"></div>
			<div class="col"><input type="text" class="form-control" name="add2" id="fname" required="required"></div>			
			</div>        	
		<div class="form-group">
		<p>City</p>
            <input type="text" class="form-control" name="city" id="pass" required="required">
        </div>
        <div class="form-group">
        		<p>Provincial</p>
            <input type="text" class="form-control" name="province" id="pass" required="required">
        </div>
                <div class="form-group">
        		<p>ZIP CODE</p>
            <input type="text" class="form-control" name="zipcode" id="pass" required="required">
        </div>
                <div class="form-group">
        		<p>Country</p>
            <input type="text" class="form-control" name="country" id="pass" required="required">
        </div>
		<div class="form-group">
		<p>Departure Date & Time</p>
            <input type="date" class="form-control" name="departure" id="pass2" required="required"> 
        </div>        
                <div class="form-group">
        		<p>Return Date & Time</p>
            <input type="date" class="form-control" name="return" id="pass" required="required">
        </div>
                <div class="form-group">
        		<p>Departing From</p>
            <input type="text" class="form-control" name="airport" id="pass" required="required">
        </div>
                <div class="form-group">
        		<p>Destination</p>
            <select class="form-select"  name="destination"
            aria-label="Default select example" required="required">
  			<option value="Boracay">Boracay</option>
  			<option value="Siargao">Siargao</option>
  			<option value="Bohol">Bohol</option>
			</select>
        </div>
                <div class="form-group">
        		<p>Fair</p>
                        <select class="form-select"  name ="fair"aria-label="Default select example" required="required">
  			<option value="RoundTrip">RoundTrip</option>
			</select>
        </div>
               <div class="form-group">
        		<p>Ticket Price</p>
            <input type="text" class="form-control" name="ticket" id="pass" required="required">
        </div>
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block" >Add Booking</button>
        </div>

</form>
</div>
</div>
</body>
</html>