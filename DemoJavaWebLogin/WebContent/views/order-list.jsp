<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/add-customer" method = "POST">
	<table>
		<tr>
			<td>Customer Name:</td>
			<td><input type = "text" id ="name" name = "name" value = "${customer.customerName}"/></td>
		</tr>
	
		<tr>
			<td>Email:</td>
			<td><input type = "text" id ="email" name = "email" value = "${customer.email}"/></td>
		</tr>
		
		<tr>
			<td>Phone:</td>
			<td><input type = "text" id = "phone" name = "phone" value = "${customer.phone}"/></td>
		</tr>
		
		<tr>
			<td>FirstName:</td>
			<td><input type = "text" id = "firstName" name = "firstName" value = "${customer.firstName}"/></td>
		</tr>
		
		<tr>
			<td>LastName:</td>
			<td><input type = "text" id = "lastName" name = "lastName" value = "${customer.lastName}"/></td>
		</tr>
		
		<tr>
			<td></td>
			<td><button id = "${id != null ? 'btn-update' : 'btn-add' }" type = "submit">${id != null ? 'Update' : 'Add'}</button></td>
		</tr>
	</table>
</form>	
	<script>
		$(document).ready(function() {
			$("#btn-update").click(function() {
				
			});
			
			$("#btn-add").click(function() {
				// document.getEmelemtById("email").value;
				var customerName = $("#name").val();
				var email = $("#email").val();
				var phone = $("#phone").val();
				var firstName = $("#firstName").val();
				var lastName = $("#lastName").val();
				
				$.ajax({
					url : 'add-customer',
					type : 'POST',
					data : {
						"name" : customerName, 
						"email" : email,
						"phone" : phone,
						"firstName" : firstName,
						"lastName" : lastName
					},
					success : function(response) {
						$("#body").html(response);
					}
				})
			})
		});
	</script>
</body>
</html>