package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.TeamDTO;


public interface TeamDAO {

	public String saveTeam(TeamDTO teamDTO);
	
	public String updateTeamCaptainByTeamName(String newCaptainName, String teamNameToUpdate);
	
	public String deleteTeamByTeamHomeGround(String teamHomeGroundToDelete);
	
	public List<TeamDTO> getAllTeams();
	
}
