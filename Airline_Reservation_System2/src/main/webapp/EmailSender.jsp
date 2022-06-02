<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/emailsender.css" rel="Stylesheet">
</head>
<body>
<%
final String url ="jdbc:mysql://localhost:3306/airline_reservation";
final String user = "root";
final String pass = "";
final String dbloader = "com.mysql.jdbc.Driver";
final String sql = "SELECT * FROM `confirmbooking` WHERE ID =?";
%>
<div class="container">
	<div class="row">
			<h1>contact us</h1>
	</div>
	<div class="row">
			<h4 style="text-align:center">Send E-Email to the Customer</h4>
	</div>
	<form action="EmailSendingServlet" method="post">
	 				<%
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
	<div class="row input-container">
			<div class="col-xs-12">
				<div class="styled-input wide">
					<input type="text" name ="recipient" value="<%out.print(rs.getString("Email")); %>" required />
					<label>Recipient address</label> 
				</div>
			</div>
			<div class="col-md-6 col-sm-12">
				<div class="styled-input">
					<input type="text" name="subject" value="Airline Reservation System"required />
					<label>Subject</label> 
				</div>
			</div>
			<div class="col-xs-12">
				<div class="styled-input wide">
					<textarea name ="content"required>Your Flight No. is <%out.print(rs.getString("Flight No.")); %> and you go to <%out.print(rs.getString("Travel")); %> and you departing from <%out.print(rs.getString("Airport Name")); %> and amount of <%out.print(rs.getString("Ticket Price")); %>  </textarea>
					<label>Content</label>
				</div>
			</div>
			<div class="col-xs-12">
				<div class="btn-lrg submit-btn">
		<div class="form-group">
            <button type="submit">Send</button>
        </div>
</div>
			</div>
	</div>
	</form>
	<%} %>
</div>

</body>
</html>