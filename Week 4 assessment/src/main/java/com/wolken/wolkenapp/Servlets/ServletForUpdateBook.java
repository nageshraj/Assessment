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

@WebServlet(urlPatterns = "/updateBook", loadOnStartup = +1)

public class ServletForUpdateBook extends HttpServlet {

	LibraryDTO libraryDTO = new LibraryDTO();
	LibraryService libraryService = new LibraryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String publisher = req.getParameter("publisher");
		String bookName = req.getParameter("bookName");

		libraryService.ValidateAndUpdateBookPublisherByName(publisher, bookName);
		PrintWriter printWriter = resp.getWriter();

		resp.setContentType("text/html");
		
		printWriter.print(
				"<center><h2>SUCCESSFULLY DELETED</h2><a href='http://localhost:8080/Library-Hibernate-Servlet/' > HOME PAGE </a><br><br> <a href='http://localhost:8080/Library-Hibernate-Servlet/getAllBooks?' >CHECK RESULTS</a></center>");
		printWriter.flush();
		printWriter.close();

	}

}
