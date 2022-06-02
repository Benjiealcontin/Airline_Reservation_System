<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
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
    <form action="UpdateConfirmBooking" method="POST" onSubmit="return validation();">
<%
	final String url ="jdbc:mysql://localhost:3306/airline_reservation";
	final String user ="root";
	final String pass ="";
	final String dbloader ="com.mysql.jdbc.Driver";
	final String sql = "SELECT * FROM `confirmbooking` WHERE ID =?";
	
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
		<p class="hint-text">Update the Payment Details of user</p>
        <div class="form-group">
        <div class="form-group">
        	<input type="text" class="form-control" name="ID" value="<%out.println(rs.getString("ID")); %>" readonly>
        </div>
			<div class="row">
				<div class="col"><input type="text" class="form-control" name="flightno." id="fname" value="<%out.println(rs.getString("Flight No.")); %>" required="required"></div>
			</div>        	
        </div>
        <div class="form-group">
        	<input type="text" class="form-control" name="email" id="email" value="<%out.println(rs.getString("Email")); %>" required="required">
        </div>
                <div class="form-group">
        	<input type="text" class="form-control" name="travel" id="email" value="<%out.println(rs.getString("Travel")); %>" required="required">
        </div>
		<div class="form-group">
            <input type="text" class="form-control" name="time" id="pass" value="<%out.println(rs.getString("Time")); %>" required="required">
            <span id = "messages" style="color:red"> </span>
        </div>     
        		<div class="form-group">
            <input type="text" class="form-control" name="airport" id="pass" value="<%out.println(rs.getString("Airport Name")); %>" required="required">
            <span id = "messages" style="color:red"> </span>
        </div> 
                		<div class="form-group">
            <input type="date" class="form-control" name="date" id="pass"  value="<%out.println(rs.getString("Date")); %>" required="required">
            <span id = "messages" style="color:red"> </span>
        </div> 
        		<div class="form-group">
            <input type="text" class="form-control" name="duration" id="pass" value="<%out.println(rs.getString("Travel Duration")); %>" required="required">
            <span id = "messages" style="color:red"> </span>
        </div> 
        		<div class="form-group">
            <input type="text" class="form-control" name="price" id="pass" value="<%out.println(rs.getString("Ticket Price")); %>" readonly>
            <span id = "messages" style="color:red"> </span>
        </div>   
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block" value="update" >Update</button>
        </div>
				<%
				}
				%>
</form>
</div>
</div>
</body>
</html>