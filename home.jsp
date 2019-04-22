<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>compM Management Screen</title>
<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg tr{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
</head>
<body>
	<div align="center">
		<h1>CompM List</h1>

		<table border="1">

			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Gender</th>
				<th>Company</th>
				<th>Country</th>
				<th>Contact</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>

			<c:forEach var="compM" items="${listCompM}">
				<tr>
					<td>${compM.id}</td>
					<td>${compM.name}</td>
					<td>${compM.email}</td>
					<td>${compM.password}</td>
					<td>${compM.gender}</td>
					<td>${compM.company}</td>
					<td>${compM.country}</td>
					<td>${compM.contact}</td>
					<td><a href="editCompM?id=${compM.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="deleteCompM?id=${compM.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New CompM Register <a href="newcompM">here</a>
		</h4>
	</div>
</body>
</html>