<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<body>

	<form action="updateBook" style="text-align: center">
		<h3>UPDATE PUBLISHER NAME THROUGH BOOK NAME</h3>
		NEW PUBLISHER NAME: <input type="text" name="publisher"><br>
		<br> BOOK NAME <input type="text" name="bookName"> <br>
		<br> <input type="submit" value="SUBMIT">

	</form>

</body>
</html>