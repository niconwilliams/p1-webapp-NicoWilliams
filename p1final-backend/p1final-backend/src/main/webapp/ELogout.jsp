<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<h1>Employee Reimbursement System</h1>
<title>Enjoy Your Day, GOODBYE!</title>
</head>
<body>
<form th:action="@{/logout}" method="post">
		<input type="submit" class="btn btn-info" value="Logout" />
	</form>
</body>
</html>