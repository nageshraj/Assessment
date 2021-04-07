package com.wolken.wolkenapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dto.TeamDTO;

@Component
public class TeamDAOImpl implements TeamDAO {
	@Autowired
	LocalSessionFactoryBean bean;

	@Override
	public String saveTeam(TeamDTO teamDTO) {

		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(teamDTO);
		transaction.commit();
		session.close();

		return "SUCCESSFULLY ADDED";
	}

	@Override
	public String updateTeamCaptainByTeamName(String newCaptainName, String teamNameToUpdate) {
		// TODO Auto-generated method stub

		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		org.hibernate.query.Query query = session.getNamedQuery("updateTeamCaptain");
		query.setParameter("newCaptain", newCaptainName);
		query.setParameter("teamName", teamNameToUpdate);

		query.executeUpdate();

		transaction.commit();
		session.close();
		return "SUCCESSFULLY UPDATED";

	}

	@Override
	public String deleteTeamByTeamHomeGround(String teamHomeGroundToDelete) {
		// TODO Auto-generated method stub

		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		org.hibernate.query.Query query = session.getNamedQuery("deleteByHomeGround");

		query.setParameter("groundToDelete", teamHomeGroundToDelete);

		query.executeUpdate();

		transaction.commit();
		session.close();
		return "SUCCESSFULLY DELETED";
	}

	@Override
	public List<TeamDTO> getAllTeams() {
		// TODO Auto-generated method stub

		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		org.hibernate.query.Query query = session.getNamedQuery("selectAllTeams");

		List<TeamDTO> teamDTOs = query.list();

		return teamDTOs;
	}

}
