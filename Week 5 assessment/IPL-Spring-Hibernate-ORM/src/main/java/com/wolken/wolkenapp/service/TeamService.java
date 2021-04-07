package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.TeamDTO;

public interface TeamService {
	
public String validateAndsaveTeam(TeamDTO teamDTO);
	
	public String validateAndUpdateTeamCaptainByTeamName(String newCaptainName, String teamNameToUpdate);
	
	public String validateAndDeleteTeamByTeamHomeGround(String teamHomeGroundToDelete);
	
	public List<TeamDTO> validateAndGetAllTeams();

}
