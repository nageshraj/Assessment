package com.wolken.wolkenapp.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.DTO.LibraryDTO;
import com.wolken.wolkenapp.Service.LibraryService;
import com.wolken.wolkenapp.Service.LibraryServiceImpl;

@WebServlet(urlPatterns = "/getAllBooks", loadOnStartup = +1)
public class ServletForDisplayBook extends HttpServlet {
	
	LibraryDTO libraryDTO = new LibraryDTO();
	LibraryService libraryService = new LibraryServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<LibraryDTO> bookList = libraryService.ValidateAndGetAllBooks();

		req.setAttribute("bookList", bookList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("displayBooks.jsp");
		dispatcher.forward(req, resp);
	
	}

}
