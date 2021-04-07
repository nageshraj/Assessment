package com.wolken.wolkenapp.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.DTO.LibraryDTO;
import com.wolken.wolkenapp.Service.LibraryService;
import com.wolken.wolkenapp.Service.LibraryServiceImpl;

@WebServlet(urlPatterns = "/addABook", loadOnStartup = +1)
public class ServletForAddBook extends HttpServlet {

	LibraryDTO libraryDTO = new LibraryDTO();
	LibraryService libraryService = new LibraryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int bookId = Integer.parseInt(req.getParameter("bookId"));
		String bookName = req.getParameter("bookName");
		String bookPublisher = req.getParameter("bookPublisher");
		double bookPrice = Double.parseDouble(req.getParameter("bookPrice"));
		String bookAuthor = req.getParameter("bookAuthor");

		libraryDTO.setBookId(bookId);
		libraryDTO.setBookName(bookName);
		libraryDTO.setPublisher(bookPublisher);
		libraryDTO.setPrice(bookPrice);
		libraryDTO.setAuthor(bookAuthor);

		libraryService.ValidateAndAddBook(libraryDTO);

		PrintWriter printWriter = resp.getWriter();
		resp.setContentType("text/html");
		printWriter.print(
				"<center><h2>SUCCESSFULLY ADDED</h2><a href='http://localhost:8080/Library-Hibernate-Servlet/' > HOME PAGE </a></center>");

		printWriter.flush();
		printWriter.close();

	}

}
