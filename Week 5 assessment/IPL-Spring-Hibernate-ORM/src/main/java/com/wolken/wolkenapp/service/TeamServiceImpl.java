package com.wolken.wolkenapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dao.TeamDAO;
import com.wolken.wolkenapp.dto.TeamDTO;

@Component
public class TeamServiceImpl implements TeamService {
	@Autowired
	TeamDAO teamDAO;

	@Override
	public String validateAndsaveTeam(TeamDTO teamDTO) {
		// TODO Auto-generated method stub
		if (teamDTO != null) {
			teamDAO.saveTeam(teamDTO);
			return "SUCCESSFULLY ADDED";
		}

		return "NOT ADDED";

	}

	@Override
	public String validateAndUpdateTeamCaptainByTeamName(String newCaptainName, String teamNameToUpdate) {
		// TODO Auto-generated method stub
		if (newCaptainName != null) {
			if (teamNameToUpdate != null) {
				teamDAO.updateTeamCaptainByTeamName(newCaptainName, teamNameToUpdate);
				return "SUCCESSFULLY UPDATED";
			}
		}
		return "NOT UPDATED";
	}

	@Override
	public String validateAndDeleteTeamByTeamHomeGround(String teamHomeGroundToDelete) {
		// TODO Auto-generated method stub
		if (teamHomeGroundToDelete != null) {
			teamDAO.deleteTeamByTeamHomeGround(teamHomeGroundToDelete);
			return "SUCCESSFULLY DELETED";

		}
		return "NOT DELETED";
	}

	@Override
	public List<TeamDTO> validateAndGetAllTeams() {
		// TODO Auto-generated method stub
		return teamDAO.getAllTeams();
		 
	}

}
