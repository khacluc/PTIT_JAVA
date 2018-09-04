<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<!-- Header -->
	<div id = "header">Header <a href = "#" id = "add-customer">Add Customer</a></div>

	<div id="body">
		<table border="1">
			<thead>
				<tr>
					<th>Username</th>
					<th>Password</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${listCustomer}" var="customer">
					<tr>
						<td>${customer.id}</td>
						<td>${customer.customerName}</td>
						<td><a href="#" class = "btn-update" id = "${customer.id}"> Update </a> &nbsp; <a href="#"> Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<script>
		$(document).ready(function() {
			$(".btn-update").click(function() {
				var customerId = $(this).attr("id");
				$("#header").css("color", "green");
				$("#body").html("<h2>Loading....</h2>");
				
				setTimeout(function(){
					$.ajax({
						url : 'update-customer',
						type : 'POST',
						data : {"id" : customerId},
						success : function(response) {
							$("#body").html(response);
						}
					})
				}, 500);
				
			});
			
			$("#add-customer").click(function() {
				$.get({
					url : 'add-customer',
					success : function(response) {
						$("#body").html(response);
					}
				});
			})
		});
	</script>
</body>
</html>