package com.wolken.wolkenapp.DAO;

import java.util.List;

import com.wolken.wolkenapp.DTO.LibraryDTO;

public interface LibraryDAO {

	public void addBook(LibraryDTO libraryDTO);

	public void updateBookPublisherByName(String bookPublisherToBeUpdated, String BookNameToUpdate);

	public void deleteBookByBookName(String bookNameToBeDeleted);

	public List<LibraryDTO> getAllBooks();

}
