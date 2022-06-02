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
    <form action="UpdatePayment" method="POST" onSubmit="return validation();">
<%
	final String url ="jdbc:mysql://localhost:3306/airline_reservation";
	final String user ="root";
	final String pass ="";
	final String dbloader ="com.mysql.jdbc.Driver";
	final String sql = "SELECT * FROM `payment` WHERE ID =?";
	
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
				<div class="col"><input type="text" class="form-control" name="name" id="fname" value="<%out.println(rs.getString("Name_of_Owner")); %>" required="required"></div>
			</div>        	
        </div>
        <div class="form-group">
        	<input type="text" class="form-control" name="cardnum" id="email" value="<%out.println(rs.getString("Card_Number")); %>" required="required">
        </div>
                <div class="form-group">
        	<input type="text" class="form-control" name="date" id="email" value="<%out.println(rs.getString("Date")); %>" required="required">
        </div>
		<div class="form-group">
            <input type="text" class="form-control" name="code" id="pass" value="<%out.println(rs.getString("CVV_code")); %>" required="required">
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