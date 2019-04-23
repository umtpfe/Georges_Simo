<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Company Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Company List</h1>
		
		<table border="1">

			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Company</th>
			<th>Country</th>
			<th>Gender</th>
			<th>Password</th>
			<th>Action</th>

			<c:forEach var="company" items="${listCompany}">
				<tr>

					<td>${company.name}</td>
					<td>${company.email}</td>
					<td>${company.address}</td>
					<td>${company.telephone}</td>
					<td>${company.company}</td>
					<td>${company.country}</td>
					<td>${company.gender}</td>
					<td>${company.password}</td>
					<td><a href="editCompany?id=${company.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteCompany?id=${company.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h2>
			New Company Register <a href="newCompany">here</a>
		</h2>
	</div>
</body>
</html>