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
<link href="css/userpage.css" rel="Stylesheet">
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
                <a href="#" class="nav-item nav-link active">Home</a>
                <a href="#" class="nav-item nav-link">Services</a>
                <a href="#" class="nav-item nav-link">About</a>
                <a href="#" class="nav-item nav-link">Contact</a>
				<%
				String uid = (String)session.getAttribute("email");
				%>

               	<a href="#" class="nav-item nav-link disabled" tabindex="-1">Hi, <%=uid%> </a>

            </div>
            <div class="navbar-nav ms-auto">
                <a href="Logout.jsp" class="nav-item nav-link">Log out</a>
            </div>
        </div>
    </div>
</nav>
<div class="container">
  <div class="row align-items-start">
    <div class="col">
      <div class="card" class="cell" style="width: 18rem;">
  <img src="images/boracay.jpeg" class="card-img-top" alt="boracay">
  <div class="card-body">
    <h5 class="card-title">Boracay</h5>
    <p class="card-text">Boracay is a small island in the central Philippines. It's known for its resorts and beaches. Along the west coast, White Beach is backed by palm trees, bars and restaurants.</p>
   	<p>25,000</p>
   	        <%   
	String boracay_price= "25,000"; 
    String boracay = "Boracay"; 
  
	session.setAttribute("boracay_price",boracay_price);
	session.setAttribute("boracay", boracay);
  
	%>  
    <a href="bookingform/BoracayForm.jsp" class="btn btn-primary">Book Now!</a>
  </div>
</div>
    </div>
    <div class="col">
      <div class="card" style="width: 18rem;">
  <img src="images/sairgao.jpeg" class="card-img-top" alt="Siargao">
  <div class="card-body">
    <h5 class="card-title">Siargao</h5>
    <p class="card-text">Siargao is a tear-drop shaped island in the Philippine Sea situated 196 kilometers southeast of Tacloban.</p>
    <p>50,000</p>
        <%   
	String sairgao_price= "50,000"; 
    String sairgao = "Sairgao"; 
  
	session.setAttribute("sairgao_price",sairgao_price);
	session.setAttribute("sairgao", sairgao);
  
	%>  
    <a href="bookingform/SairgaoForm.jsp" class="btn btn-primary">Book Now!</a>
  </div>
</div>
    </div>
    <div class="col">
      <div class="card" style="width: 18rem;">
  <img src="images/Bohol2.jpg" class="card-img-top" alt="Bohol">
  <div class="card-body">
    <h5 class="card-title">Bohol</h5>
    <p class="card-text">Bohol is a province of the Philippines, in the country’s Central Visayas region. It comprises Bohol Island and numerous smaller surrounding islands.	</p>
    <p>100,000</p>
    <%   
	String bohol_price= "100,000"; 
    String bohol = "Bohol"; 
  
	session.setAttribute("bohol_price",bohol_price);
	session.setAttribute("bohol", bohol);
  
	%>  
    <a href="bookingform/BoholForm.jsp"  class="btn btn-primary">Book Now!</a>
  </div>
</div>
    </div>
  </div>

</div>
</body>
</html>