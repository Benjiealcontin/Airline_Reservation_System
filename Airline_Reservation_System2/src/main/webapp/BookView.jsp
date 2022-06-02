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
    <form action="Bookinglists.jsp">
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
		<h2>Details</h2>
		<p class="hint-text">Booking Details of the User</p>
        <div class="form-group">
        <div class="form-group">
        	<input type="text" class="form-control" name="ID" value="<%out.println(rs.getString("ID")); %>" readonly>
        </div>
			<div class="row">
			<p>Full Name</p>
				<div class="col"><input type="text" class="form-control" name="fname" id="fname" value="<%out.println(rs.getString("Firstname")); %>, <%out.println(rs.getString("Lastname")); %>" readonly></div>
			</div>        	
        </div>
                <div class="form-group">
                <p>Date of Birth</p>
        	<input type="text" class="form-control" name="email" id="email" value="<%out.println(rs.getString("DOB")); %>" readonly>
        </div>
        <div class="form-group">
        <p>Email Address</p>
        	<input type="email" class="form-control" name="email" id="email" value="<%out.println(rs.getString("Email")); %>" readonly>
        </div>
                <div class="form-group">
        <p>Phone Number</p>
        	<input type="text" class="form-control" name="email" id="email" value="<%out.println(rs.getString("PhoneNumber")); %>" readonly>
        </div>
                <div class="form-group">
			
			<p>Address</p>
				<div class="col"><input type="text" class="form-control" name="fname" id="fname" value="<%out.println(rs.getString("Address1")); %>" readonly></div>
			<div class="col"><input type="text" class="form-control" name="fname" id="fname" value="<%out.println(rs.getString("Address2")); %>" readonly></div>			
			</div>        	
		<div class="form-group">
		<p>City</p>
            <input type="text" class="form-control" name="pass" id="pass" value="<%out.println(rs.getString("City")); %>" readonly>
            <span id = "messages" style="color:red"> </span>
        </div>
        <div class="form-group">
        		<p>Provincial</p>
            <input type="text" class="form-control" name="pass" id="pass" value="<%out.println(rs.getString("Provincial")); %>" readonly>
        </div>
                <div class="form-group">
        		<p>ZIP CODE</p>
            <input type="text" class="form-control" name="pass" id="pass" value="<%out.println(rs.getString("ZIP_CODE")); %>" readonly>
        </div>
                <div class="form-group">
        		<p>Country</p>
            <input type="text" class="form-control" name="pass" id="pass" value="<%out.println(rs.getString("Country")); %>" readonly>
        </div>
		<div class="form-group">
            <input type="text" class="form-control" name="confirm_password" id="pass2" value="<%out.println(rs.getString("Departure Date & Time")); %>" readonly> 
        </div>        
                <div class="form-group">
        		<p>Return Date & Time</p>
            <input type="text" class="form-control" name="pass" id="pass" value="<%out.println(rs.getString("Return Date & Time")); %>" readonly>
        </div>
                <div class="form-group">
        		<p>Departing From</p>
            <input type="text" class="form-control" name="pass" id="pass" value="<%out.println(rs.getString("Departing From")); %>" readonly>
        </div>
                <div class="form-group">
        		<p>Destination</p>
            <input type="text" class="form-control" name="pass" id="pass" value="<%out.println(rs.getString("Destination")); %>" readonly>
        </div>
                <div class="form-group">
        		<p>Fair</p>
            <input type="text" class="form-control" name="pass" id="pass" value="<%out.println(rs.getString("Fair")); %>" readonly>
        </div>
                        <div class="form-group">
        		<p>Ticket_Price</p>
            <input type="text" class="form-control" name="pass" id="pass" value="<%out.println(rs.getString("Ticket_Price")); %>" readonly>
        </div>
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block" >Go back</button>
        </div>
				<%
				}
				%>
</form>
</div>
</div>
</body>
</html>