package com.wolken.wolkenapp.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@NamedQueries(value = { 
@NamedQuery(name = "updatePublisherByName", query = "Update LibraryDTO libDTO set libDTO.publisher=: publisher where libDTO.bookName=: bookName"),
@NamedQuery(name="deleteByName",query="delete from LibraryDTO libDTO where libDTO.bookName=:bName "),
@NamedQuery(name="getAll",query="from LibraryDTO ")
})
@Entity
@Table(name = "library_table")
public class LibraryDTO {
	
	@Id
	@Column(name = "book_id")
	private int bookId;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "book_publisher")
	private String publisher;
	
	@Column(name = "book_price")
	private double price;
	
	@Column(name = "book_author")
	private String author;

}
