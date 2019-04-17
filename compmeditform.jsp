<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>company Mailer</title>
<style type="text/css">
.inputform {
	float: left;
	width: 400px;
	border: 1px solid pink;
	border-radius: 10px;
	padding: 10px;
}

.inputform table tr td input, textarea, select {
	width: 200px;
}

#gender1, #gender2 {
	width: 10px;
}

#submit {
	margin-left: 100px;
	width: 100px;
}

#reset {
	width: 100px;
}

.design {
	background-color: red;
	color: white;
	padding-left: 100px;
}
</style>
</head>
<body>
	<h1>Edit Company Mailer</h1>
	<!-- header -->
	<h2>Company Mailer</h2>
	<h3 style="background-color: red; color: red;">c</h3>
	<!-- body -->

	<div class="inputform">
		       <form:form method="POST" action="/CompanyMailer/editsave">   
      	<table>
      	<tr><td>Id:</td><td><form:hidden path="id" /></td></tr> 
         <tr><td>Name:</td><td><form:input path="name"/></td></tr>  
         <tr><td>Email:</td><td><form:input path="email"/>@mailer.com</td></tr> 
         <tr><td>Password:</td><td><form:input path="password" /></td></tr> 
          <tr><td>Gender:</td></td><td><input id="gender1" type="radio" name="gender" value="male"/>Male<input type="radio" id="gender2" name="gender" value="female"/>Female
</td></tr> 
      <tr><td>Company:</td><td><form:input path="company" /></td></tr> 
         <tr><td>Country:</td><td><select name="country">
							<option>Select-Country:</option>
							<option>Tunisie</option>
							<option>Cameroun</option>
							<option>China</option>
							<option>Canada</option>
							<option>USA</option>
							<option>France</option>
							<option>Other</option>
					</select></td></tr>  
          <tr><td>Contact:</td><td><form:input path="contact" /></td></tr>
         <tr><td> </td><td><input type="submit" value="Edit Save" /></td></tr></table> 
        </form:form>   
	</div>
	<div class="inputform" style="float: right;">
		<h2 class="design">Login Form</h2>
		<form action="save" method="post">
			<table>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td colspan="2"><input id="submit" type="submit" value="login" />
					</td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>
