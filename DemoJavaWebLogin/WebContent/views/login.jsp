<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">
</head>
<body>
	<div class="container">
		<div id="frm-login">
			<div id="form-header">
				<h3>Login Form</h3>
				
			</div>
			<form action="<%=request.getContextPath()%>/login" method="POST">
				<div id="body">
					<input type="text" name="username" placeholder="Username" /> <input
						type="password" placeholder="Password" name="password" />
					<div id="remember">
						<input type="checkbox"><span id="remember-me">
							Remember me?</span>
					</div>
					<button type="submit">Log In</button>
				</div>
			</form>
			
			
		</div>
	</div>
	
	<p style = "text-align:center">${error}</p>
</body>
</html>