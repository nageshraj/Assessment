package com.wolken.wolkenapp.Service;

import java.util.List;

import com.wolken.wolkenapp.DTO.LibraryDTO;

public interface LibraryService {
	
	public void ValidateAndAddBook(LibraryDTO libraryDTO);

	public void ValidateAndUpdateBookPublisherByName(String bookPublisherToBeUpdated, String BookNameToUpdate);

	public void ValidateAndDeleteBookByBookName(String bookNameToBeDeleted);

	public List<LibraryDTO> ValidateAndGetAllBooks();

}
