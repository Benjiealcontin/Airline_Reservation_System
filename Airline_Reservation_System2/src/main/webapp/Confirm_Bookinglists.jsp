<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Airline Reservation System</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<link href="css/userlist.css" rel="Stylesheet">
<script src="javascript/checkbox.js"></script>
</head>
<body>
<%
final String url ="jdbc:mysql://localhost:3306/airline_reservation";
final String user = "root";
final String pass = "";
final String dbloader = "com.mysql.jdbc.Driver";
final String sql = "SELECT * FROM `confirmbooking`";
%>
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
                <a href="Addbooking.jsp" class="nav-item nav-link">Add Booking</a>
                <a href="Bookinglists.jsp" class="nav-item nav-link">Booking List</a>
                <a href="Paymentlists.jsp" class="nav-item nav-link">Payment Lists</a>
                <a href="#" class="nav-item nav-link">Confirm Booking</a>
                <a href="#" class="nav-item nav-link disabled" tabindex="-1">Hi, Admin</a>
            </div>
            <div class="navbar-nav ms-auto">
                <a href="LoginForm.jsp" class="nav-item nav-link">Log out</a>
            </div>
        </div>
    </div>
</nav>
<div class="container-xl">
    <div class="table-responsive">
        <div class="table-wrapper">			
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="show-entries">
                            <span>Show</span>
                            <select>
                                <option>5</option>
                                <option>10</option>
                                <option>15</option>
                                <option>20</option>
                            </select>
                            <span>entries</span>
                        </div>						
                    </div>
                    <div class="col-sm-4">
                        <h2 class="text-center">Confirm <b>Booking</b></h2>
                    </div>
                    <div class="col-sm-4">
                        <div class="search-box">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="material-icons">&#xE8B6;</i></span>
                                <input type="text" id="myInput" onkeyup="myFunction()" class="form-control" placeholder="Search&hellip;">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <table class="table table-bordered" id="myTable">         
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Flight No.</th>
                        <th>Email</th>
                        <th>Travel</th>
                        <th>Time</th>
                        <th>Airport Name</th>
                        <th>Date</th>
                        <th>Travel Duration</th>
                        <th>Ticket Price</th>
                        <th>Action</th>
                        <th>Check Box</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
 				<%
 				Connection con;
 				PreparedStatement pst;
 				ResultSet rs;
 				
 				con = DriverManager.getConnection(url,user,pass);
 				pst = con.prepareStatement(sql);
 				rs = pst.executeQuery();
 				
 				while(rs.next()){
 					
 				String ID = rs.getString("ID");
 				
 				%>
                        <td><%out.print(rs.getString("ID")); %> </td>
                        <td><%out.print(rs.getString("Flight No.")); %></td>
                        <td><%out.print(rs.getString("Email")); %></td>
                        <td><%out.print(rs.getString("Travel")); %></td>
                        <td><%out.print(rs.getString("Time")); %></td>
                        <td><%out.print(rs.getString("Airport Name")); %></td>
                        <td><%out.print(rs.getString("Date")); %></td>
                        <td><%out.print(rs.getString("Travel Duration")); %> Hours</td>
                        <td><%out.print(rs.getString("Ticket Price")); %></td>
                       
                        <td>
                        
                            <a href="ConfirmBookingView.jsp?ID=<%out.print(rs.getString("ID")); %>" class="view" title="View" data-toggle="tooltip"><i class="material-icons">&#xE417;</i></a>
                            <a href="UpdateConfirmBooking.jsp?ID=<%out.print(rs.getString("ID")); %>" class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                            <a href="<%=request.getContextPath()%>/Deletebooking?ID=<%out.print(rs.getString("ID")); %>" class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                      		<a href="EmailSender.jsp?ID=<%out.print(rs.getString("ID")); %>"class="view" title="Send Email" data-toggle="tooltip"><i class="material-icons">chat</i></a>
                        </td>
                         <td>
                         <!-- pwede siya dungagan ug id="s_item1" id="s_item2" -->
                        <input id="s_item3" type="checkbox">
                        </td>
                    </tr>
                  <%
 				}
                  %>
</tbody>
</table>
</div>
</div>
</div>
</body>
</html>