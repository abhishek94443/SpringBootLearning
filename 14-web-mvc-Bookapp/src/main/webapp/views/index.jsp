<HTML>
	<HEAD></HEAD>
	
	<BODY>
		<H3> Book Details </H3>
		<form action="book">
			Book id: <input type= "text" name ="id"/>
			<input type="submit" value = "Search"/>
			<hr>
			Book ID : ${book.bookId}<br>
			Book Name :${book.bookName} <br>
			Book Price :${book.bookPrice} <br>
		</form>	
	</BODY>
</HTML>