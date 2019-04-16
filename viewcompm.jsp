    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Company Mailer List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>Gender</th><th>Company</th><th>Country</th><th>Contact</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="compM" items="${list}"> 
    <tr>
    <td>${compM.id}</td>
    <td>${compM.name}</td>
    <td>${compM.email}</td>
    <td>${compM.password}</td>
    <td>${compM.gender}</td>
    <td>${compM.company}</td>
    <td>${compM.country}</td>
    <td>${compM.contact}</td>
    <td><a href="editcompM/${compM.id}">Edit</a></td>
    <td><a href="deletecompM/${compM.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="compmform">Company Mailer</a>