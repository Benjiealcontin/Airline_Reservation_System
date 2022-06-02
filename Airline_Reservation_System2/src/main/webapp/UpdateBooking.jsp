<!DOCTYPE html>
<%@page import="java.sql.*" %>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Airline Reservation System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="css/RegisterForm.css" rel="Stylesheet">
<script src="javascript/Validation.js"></script>
</head>
<body>
<div class="container">
   <div class="signup-form">
    <form action="UpdateBooking" method="POST">
<%
	final String url ="jdbc:mysql://localhost:3306/airline_reservation";
	final String user ="root";
	final String pass ="";
	final String dbloader ="com.mysql.jdbc.Driver";
	final String sql = "SELECT * FROM `requestbooking` WHERE ID =?";
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	Class.forName(dbloader);
	con = DriverManager.getConnection(url,user,pass);
	pst = con.prepareStatement(sql);
	String id = request.getParameter("ID");
	pst.setString(1, id);
	rs = pst.executeQuery();
	
	
	
	while(rs.next()){

	
%>
		<h2>Update</h2>
		<p class="hint-text">Update Booking Details of the User</p>
        <div class="form-group">
        <div class="form-group">
        	<input type="text" class="form-control" name="ID" value="<%out.println(rs.getString("ID")); %>" readonly>
        </div>
			<div class="row">
			<p>Full Name</p>
				<div class="col"><input type="text" class="form-control" name="fname" id="fname" value="<%out.println(rs.getString("Firstname")); %>" required></div>
				<div class="col"><input type="text" class="form-control" name="lname" id="fname" value="<%out.println(rs.getString("Lastname")); %>" required></div>
			</div>        	
        </div>
                <div class="form-group">
                <p>Date of Birth</p>
        	<input type="text" class="form-control" name="dob" id="email" value="<%out.println(rs.getString("DOB")); %>" required>
        </div>
        <div class="form-group">
        <p>Email Address</p>
        	<input type="email" class="form-control" name="email" id="email" value="<%out.println(rs.getString("Email")); %>" required>
        </div>
                <div class="form-group">
        <p>Phone Number</p>
        	<input type="text" class="form-control" name="pnumber" id="email" value="<%out.println(rs.getString("PhoneNumber")); %>" required>
        </div>
                <div class="form-group">
			
			<p>Address</p>
				<div class="col"><input type="text" class="form-control" name="add1" id="fname" value="<%out.println(rs.getString("Address1")); %>" required></div>
			<div class="col"><input type="text" class="form-control" name="add2" id="fname" value="<%out.println(rs.getString("Address2")); %>" required></div>			
			</div>        	
		<div class="form-group">
		<p>City</p>
            <input type="text" class="form-control" name="city" id="pass" value="<%out.println(rs.getString("City")); %>" required>
            <span id = "messages" style="color:red"> </span>
        </div>
        <div class="form-group">
        		<p>Provincial</p>
            <input type="text" class="form-control" name="province" id="pass" value="<%out.println(rs.getString("Provincial")); %>" required>
        </div>
                <div class="form-group">
        		<p>ZIP CODE</p>
            <input type="text" class="form-control" name="zipcode" id="pass" value="<%out.println(rs.getString("ZIP_CODE")); %>" required>
        </div>
                <div class="form-group">
        		<p>Country</p>
            <input type="text" class="form-control" name="country" id="pass" value="<%out.println(rs.getString("Country")); %>" required>
        </div>
		<div class="form-group">
            <input type="text" class="form-control" name="departure" id="pass2" value="<%out.println(rs.getString("Departure Date & Time")); %>" required> 
        </div>        
                <div class="form-group">
        		<p>Return Date & Time</p>
            <input type="text" class="form-control" name="return" id="pass" value="<%out.println(rs.getString("Return Date & Time")); %>" required>
        </div>
                <div class="form-group">
        		<p>Departing From</p>
            <input type="text" class="form-control" name="airport" id="pass" value="<%out.println(rs.getString("Departing From")); %>" required>
        </div>
                <div class="form-group">
        		<p>Destination</p>
            <input type="text" class="form-control" name="destination" id="pass" value="<%out.println(rs.getString("Destination")); %>" required >
        </div>
                <div class="form-group">
        		<p>Fair</p>
            <input type="text" class="form-control" name="fair" id="pass" value="<%out.println(rs.getString("Fair")); %>" required>
        </div>
          <div class="form-group">
        		<p>Ticket Price</p>
            <input type="text" class="form-control" name="ticket" id="pass" value="<%out.println(rs.getString("Ticket_Price")); %>" required>
        </div>
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block" >Update</button>
        </div>
				<%
				}
				%>
</form>
</div>
</div>
</body>
</html>