<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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

	<!-- header -->
	<h2>Company Mailer</h2>
	<h3 style="background-color: red; color: red;">c</h3>
	<!-- body -->

	<div class="inputform">
		<h2 class="design">Registration Form</h2>
		<form:form method="post" action="save">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" />@cmailer.com</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><input id="gender1" type="radio" name="gender"
						value="male" />Male <input type="radio" id="gender2" name="gender"
						value="female" />Female</td>
				</tr>
				<tr>
					<td>Company:</td>
					<td><input type="text" name="company" /></td>
				</tr>
				<tr>
					<td>Country:</td>
					<td><select name="country">
							<option>Select-Country:</option>
							<option>Tunisie</option>
							<option>Cameroun</option>
							<option>China</option>
							<option>Bhutan</option>
							<option>USA</option>
							<option>France</option>
							<option>Other</option>
					</select></td>
				</tr>
				<tr>
					<td>Contact:</td>
					<td><input type="text" name="contact" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Save" /></td>
				</tr>
			</table>
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

