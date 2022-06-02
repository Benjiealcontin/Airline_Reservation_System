<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Airline Reservation System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<link href="../css/bookingform.css" rel="Stylesheet">
<script src="javascript/datepicker.js"></script>
</head>
<body>
<div class="container">
   <div class="signup-form">
    <form action="../Addbooking" method="POST">
    		<h2>Book Form</h2>
		<p class="hint-text">Please fill up all the form</p>
        <div class="form-group">
			<div class="row">
			<p>Full Name</p>
				<div class="col"><input type="text" class="form-control" name="fname" id="fname" placeholder="First Name" required="required"></div>
				<div class="col"><input type="text" class="form-control" name="lname" id="fname" placeholder="last Name"required="required"></div>
			</div>        	
        </div>
                <div class="form-group">
                <p>Date of Birth</p>
        	<input type="date" class="form-control" name="dob" id="email" required="required">
        </div>
        <div class="form-group">
        <p>Email Address</p>
        	<input type="email" class="form-control" name="email" id="email" placeholder="Email" required="required">
        </div>
                <div class="form-group">
        <p>Phone Number</p>
        	<input type="text" class="form-control" name="pnumber" id="email" placeholder="Phone Number" maxlength ="11"required="required">
        </div>
                <div class="form-group">
			
			<p>Address</p>
				<div class="col"><input type="text" class="form-control" name="add1"placeholder="Address1" id="fname" required="required"></div>
			<div class="col"><input type="text" class="form-control" name="add2" id="fname" placeholder="Address2" required="required"></div>			
			</div>        	
		<div class="form-group">
		<p>City</p>
            <input type="text" class="form-control" name="city" id="pass" placeholder="City" required="required">
        </div>
        <div class="form-group">
        		<p>Provincial</p>
            <input type="text" class="form-control" name="province" id="pass" placeholder="Province" required="required">
        </div>
                <div class="form-group">
        		<p>ZIP CODE</p>
            <input type="text" class="form-control" name="zipcode" id="pass" placeholder="ZIP CODE" required="required">
        </div>
                <div class="form-group">
        		<p>Country</p>
            <input type="text" class="form-control" name="country" id="pass" placeholder="Country" required="required">
        </div>
		<div class="form-group">
		<p>Departure Date & Return</p>
	<input type="week" class="form-control" name="departure" id="email" required="required">
        </div>        
                <div class="form-group">
        		<p>Departure & Return Time</p>
            <input type="time" class="form-control" name="return" id="pass" required="required">
        </div>
                <div class="form-group">
        		<p>Departing From</p>
            <input type="text" class="form-control" name="airport" id="pass" placeholder="Airport" required="required">
        </div>
              <div class="form-group">
        		<p>Destination</p>
        		<%   
    
        		String destination=(String)session.getAttribute("bohol");   
        		
  
				%> 
            <input type="text" class="form-control" name="destination" value="<%=destination%>" placeholder="Airport" readonly>
        </div>
                <div class="form-group">
        		<p>Fair</p>
            <select class="form-select"  name ="fair"aria-label="Default select example"  required="required">
  			<option value="RoundTrip">RoundTrip</option>
			</select>
        </div>
              <div class="form-group">
        		<p>Ticket Price</p>
        		<%   
  
				String amount=(String)session.getAttribute("bohol_price");   
        		
  
				%> 
            <input type="text" class="form-control" name="ticket" value="<%=amount%>" placeholder="Airport" readonly>
        </div>
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block" >Add Booking</button>
        </div>

</form>
</div>
</div>
</body>
</html>