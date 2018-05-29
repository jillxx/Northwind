<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>
		<form action="addUser">
			<table>

				<tr>
					<td>CustomerID</td>
					<td><input type="text" name="customerID"></td>
				</tr>
				<tr>
					<td>Company Name:</td>
					<td><input type="text" name="companyName"></td>
				</tr>
				<tr>
					<td>Contact Name:</td>
					<td><input type="text" name="contactName"></td>
				</tr>
				<tr>
					<td>Contact Title:</td>
					<td><input type="text" name="contactTitle"></td>
				</tr>


			</table>

			<input id="submitBtn" type="submit" value="Add Customere">

		</form>
	</h1>

	<table class="table" border="1">
		<thead>
			<tr>
				<th>Customer ID</th>
				<th>Company Name</th>
				<th>Contact Name</th>
				<th>Contact Title</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="customers" items="${customers}">
				<tr>
					<td>${customers.customerID}</td>
					<td>${customers.companyName}</td>
					<td>${customers.contactName}</td>
					<td>${customers.contactTitle}</td>
					<td><a
						href="updateCustomer?customerID=${customers.customerID}">Edit</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>




</body>
</html>