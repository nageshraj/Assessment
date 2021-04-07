<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

body{
background-image: url('https://previews.123rf.com/images/vtmila/vtmila1707/vtmila170700060/82498902-open-book-hardback-books-on-bright-colorful-background-.jpg');
            background-repeat: no-repeat;
            background-size: cover;
            height: 100%;
            }
            
</style>

</head>
<body style="text-align: center">
	<center>
		<table>
			<th>BOOK ID</th>
			<th>BOOK NAME</th>
			<th>BOOK PUBLISHER</th>
			<th>BOOK PRICE</th>
			<th>BOOK AUTHOR</th>
			<c:forEach var="book" items="${bookList}">
				<tr>
					<td>${book.getBookId()}</td>
					<td>${book.getBookName()}</td>
					<td>${book.getPublisher()}</td>
					<td>${book.getPrice()}</td>
					<td>${book.getAuthor()}</td>
					<td>
						<button
							onclick="location.href ='http://localhost:8080/Library-Hibernate-Servlet/updateBook.jsp'">
							UPDATE</button>
					</td>
					<td>
						<button
							onclick="location.href ='http://localhost:8080/Library-Hibernate-Servlet/deleteBook.jsp'">
							DELETE</button>
					</td>
				</tr>

			</c:forEach>

		</table>
		
</body>
</html>






<%-- <%
List<VegetableDTO> vegetableList = (List<VegetableDTO>) request.getAttribute("vegList");
%> --%>
