package com.wolken.wolkenapp.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.wolkenapp.HibernateUtil;
import com.wolken.wolkenapp.DTO.LibraryDTO;

public class LibraryDAOImpl implements LibraryDAO {

	@Override
	public void addBook(LibraryDTO libraryDTO) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();

		session.save(libraryDTO);
		transaction.commit();
		session.clear();

	}

	@Override
	public void updateBookPublisherByName(String bookPublisherToBeUpdated, String BookNameToUpdate) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session.getNamedQuery("updatePublisherByName");
		query.setParameter("publisher", bookPublisherToBeUpdated);
		query.setParameter("bookName", BookNameToUpdate);
		query.executeUpdate();

		transaction.commit();
		session.clear();

	}

	@Override
	public void deleteBookByBookName(String bookNameToBeDeleted) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session.getNamedQuery("deleteByName");
		query.setParameter("bName", bookNameToBeDeleted);

		query.executeUpdate();

		transaction.commit();
		session.clear();

	}

	@Override
	public List<LibraryDTO> getAllBooks() {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getFactory().openSession();
		Query query = session.getNamedQuery("getAll");

		List<LibraryDTO> libraryDTOs = query.list();
		System.out.println(libraryDTOs);
		return libraryDTOs;
	}

}
