<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
<form action="update">
	<input type="hidden" name="customerID" value="${id}" > 
	<table>
		
		<tr>
			<td>CustomerID  </td>
			<td>${id}</td>
		</tr>
		<tr>
			<td>Company Name: </td>
			<td><input type="text" name="companyName"></td>
		</tr>
        <tr>
			<td>Contact Name:</td>
			<td><input type="text" name="contactName"></td>
		</tr>
		 <tr>
			<td>Contact Title:</td>
			<td><input type="text" name="contactTitle"> </td>
		</tr>
	
		
	</table>

	<input id="submitBtn" type="submit" value="Update">
	
	</form>
</body>
</html>