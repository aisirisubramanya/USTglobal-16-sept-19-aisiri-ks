<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<table>
			<form action="./form" method="post">
				<tr>
					<td>Id</td>
					<td><input name="id" type="number"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input name="name" type="text"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input name="gender" type="text"></td>
				</tr>
				<tr>
					<td>DOJ</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
				<td><input type="submit" value="register"></td>
				<td> <input type="reset" value="reset"></td>
				</tr>

			</form>
		</table>
	</fieldset>
</body>
</html>