<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

body{
background-image: url('https://resources.platform.bcci.tv/bcci/photo/2020/08/10/39b2b594-796b-4d1e-91ff-e89c4a2e740a/IPL-CORPORATE-LOGO-WITH-BRANDING-CMS-SIZE.jpg');
            background-repeat: no-repeat;
            background-size: cover;
            height: 100%;
            }
            
</style>

</head>
<body style="text-align: center;color: white">
<center>
	<table border="black">
		<th>TEAM ID</th>
		<th>TEAM NAME</th>
		<th>TEAM HOME GROUND</th>
		<th>TEAM CAPTAIN</th>
		<c:forEach var="team" items="${teamsList}">
			<tr>
				<td>${team.getTeamId()}</td>
				<td>${team.getTeamName()}</td>
				<td>${team.getTeamHomeGround()}</td>
				<td>${team.getTeamCaptain()}</td>

				<td>
					<button
						onclick="location.href ='http://localhost:8080/IPL-Spring-Hibernate-ORM/updateCaptainByTeamName.jsp'">
						UPDATE</button>
				</td>
				<td>
					<button
						onclick="location.href ='http://localhost:8080/IPL-Spring-Hibernate-ORM/deleteTeamByHG.jsp'">
						DELETE</button>
				</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>