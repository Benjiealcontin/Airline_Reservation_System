<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Airline Reservation System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<link href="css/confirmform.css" rel="Stylesheet">
<script src="javascript/datepicker.js"></script>
</head>
<body>

<div class="container">
   <div class="signup-form">
    <form action="AddConfirmBooking" method="POST">
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
    		<h2>Confirm Booking</h2>
		<p class="hint-text">Booking Details</p>
		
        <div class="form-group">
			<div class="row">
			<p>Full Name</p>
				<div class="col"><input type="text" class="form-control" name="fname" id="fname" value="<%out.println(rs.getString("Firstname")); %>,<%out.println(rs.getString("Lastname")); %>" readonly></div>
			</div>        	
        </div>
                <div class="form-group">
                <p>Email</p>
        	<input type="email" class="form-control" value="<%out.println(rs.getString("Email")); %>" name="dob" id="email" readonly>
        </div>
        <div class="form-group">
        <p>Date of birth</p>
        	<input type="email" class="form-control" value="<%out.println(rs.getString("DOB")); %>" name="email" id="email" placeholder="Email" readonly>
        </div>
                <div class="form-group">
        <p>Phone Number</p>
        	<input type="text" class="form-control" value="<%out.println(rs.getString("PhoneNumber")); %>" name="pnumber" id="email" placeholder="Phone Number" maxlength ="11" readonly>
        </div>
                <div class="form-group">		
			<p>Date</p>
				<div class="col"><input type="text" class="form-control" value="<%out.println(rs.getString("Departure Date & Time")); %>" name="add1"placeholder="Address1" id="fname" readonly></div>			
			</div>      
			<div class="form-group">		
			<p>Destination</p>
				<div class="col"><input type="text" class="form-control" value="<%out.println(rs.getString("Destination")); %>" name="add1"placeholder="Address1" id="fname" readonly></div>			
			</div>  
						<div class="form-group">		
			<p>Departing From</p>
				<div class="col"><input type="text" class="form-control" value="<%out.println(rs.getString("Departing From")); %>" name="add1"placeholder="Address1" id="fname" readonly></div>			
			</div>      	
		<div class="form-group">
		<p>Address</p>
            <input type="text" class="form-control" value="<%out.println(rs.getString("Address1")); %>" name="city" id="pass" placeholder="City" readonly>
        </div>
              <div class="form-group">
        		<p>Ticket Price</p>
            <input type="text" class="form-control" value="<%out.println(rs.getString("Ticket_Price")); %>" name="ticket"  placeholder="Airport" readonly>
        </div>
        		<p class="hint-text"><b>Flight Details</b></p>
        		              <div class="form-group">
        		<p>Flight No.</p>
            <input type="text" class="form-control"  name="flightno" required="required">
        </div>
                      <div class="form-group">
        		<p>Travel</p>
            <input type="text" class="form-control"  name="travel"  required="required">
        </div>
                      <div class="form-group">
        		<p>Time</p>
            <input type="time" class="form-control" name="time"  required="required">
        </div>
                      <div class="form-group">
        		<p>Airport name</p>
            <input type="text" class="form-control" name="airport"   required="required">
        </div>
                              <div class="form-group">
        		<p>Date</p>
            <input type="date" class="form-control" name="date"   required="required">
        </div>
                              <div class="form-group">
        		<p>Travel Duration</p>
            <input type="number" class="form-control" name="duration"   required="required">
        </div>
             <div class="form-group">
        		<p>Ticket Price</p>
            <input type="text" class="form-control"  value="<%out.println(rs.getString("Ticket_Price")); %>" name="price"  readonly>
        </div>
        <br>
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block" >Confirm Booking</button>
        </div>

</form>
				<%
				}
				%>
</div>
</div>
</body>
</html>