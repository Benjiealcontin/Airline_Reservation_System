<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Airline Reservation System</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="css/RegisterForm.css" rel="Stylesheet">
<script src="javascript/Validation.js"></script>
</head>
<body>
	<div class="container">
		<div class="signup-form">
			<form action="CodeVerifying" method="POST"
				onSubmit="return validation();">
				<h2>Verification</h2>
				<p class="hint-text">Create your account. It's free and only
					takes a minute.</p>
				<div class="form-group">
					<div class="row">
						<div class="col">
							<input type="text" class="form-control" name="fname" id="fname" value="${F}"
								 required>
						</div>
						<div class="col">
							<input type="text" class="form-control" name="lname" id="lname" value="${L}"
								 required>
						</div>
					</div>
				</div>
				<div class="form-group">
					<input type="email" class="form-control" name="email" id="email" value="${E}"
						 required>
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name="pass" id="pass" value="${P}"
						required> <span
						id="messages" style="color: red"> </span>
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name="confirm_password" value="${P}"
						id="pass2" required>
					<span id="message" style="color: red"> </span> <br>
					<br>
				</div>
				<p class="hint-text">Please check your Email for the Verification Code</p>
				<div class="form-group">
					<input type="text" class="form-control" name="authcode"
						id="pass2" placeholder="Enter the Code" required="required">
					<span id="message" style="color: red"> </span> <br>
					<br>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-success btn-lg btn-block">Verify</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>