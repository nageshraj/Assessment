<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function isInputValid() {
		var id = document.getElementByName("bookId").value;
		var name = document.getElementByName("bookName").value;
		var publisher = document.getElementByName("bookPublisher").value;
		var price = document.getElementByName("bookPrice").value;
		var author = document.getElementByName("bookAuthor").value;

		if (id > 100) {
			if (price > 10000) {
				alert("Data entered is not valid, try again");
				return false;
			}

		}
	}
</script>

<style type="text/css">
body {
	background-image:
		url('https://previews.123rf.com/images/vtmila/vtmila1707/vtmila170700060/82498902-open-book-hardback-books-on-bright-colorful-background-.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	height: 100%;
}
</style>

</head>
<body>

	<form action="addABook" style="text-align: center"
		onsubmit="return isInputValid()">
		BOOK ID: <input type="number" name="bookId"><br> <br>
		BOOK NAME: <input type="text" name="bookName"><br> <br>
		BOOK PUBLISHER: <input type="text" name="bookPublisher"><br>
		<br> BOOK PRICE: <input type="text" name="bookPrice"><br>
		<br> BOOK AUTHOR: <input type="text" name="bookAuthor"><br>
		<br> <input type="submit" value="SUBMIT">
	</form>

</body>
</html>