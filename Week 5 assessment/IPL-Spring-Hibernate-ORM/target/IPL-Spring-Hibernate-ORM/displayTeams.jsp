<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<th>teamId</th>
		<th>teamName</th>
		<th>teamHomeGround</th>
		<th>teamCaptain</th>
		<c:forEach var="team" items="${teamsList}">
			<tr>
				<td>${team.getTeamId()}</td>
				<td>${team.getTeamName()}</td>
				<td>${team.getTeamHomeGround()}</td>
				<td>${team.getTeamCaptain()}</td>

				<td>
					<button
						onclick="location.href ='http://localhost:8080/vegetable-hibernate-UI/updateVegetable.jsp'">
						UPDATE</button>
				</td>
				<td>
					<button
						onclick="location.href ='http://localhost:8080/vegetable-hibernate-UI/deleteVegetable.jsp'">
						DELETE</button>
				</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>