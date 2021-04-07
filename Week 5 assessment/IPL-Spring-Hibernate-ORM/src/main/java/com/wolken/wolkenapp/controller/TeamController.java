package com.wolken.wolkenapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dao.TeamDAO;
import com.wolken.wolkenapp.dto.TeamDTO;
import com.wolken.wolkenapp.service.TeamService;

@Component
@RequestMapping("/")
public class TeamController {

	@Autowired
	TeamService teamService;

	@RequestMapping("/addTeam.do")
	public String save(@ModelAttribute TeamDTO teamDTO, HttpServletRequest req) {
		String msg = teamService.validateAndsaveTeam(teamDTO);

		req.setAttribute("msg", msg);
		return "finalMessage.jsp";

	}

	@RequestMapping("/displayTeam.do")
	public String displayTeams(HttpServletRequest req){
		
		List<TeamDTO> teamsList = teamService.validateAndGetAllTeams();
		req.setAttribute("teamsList", teamsList);
		return "displayTeams.jsp";
	}
	
	@RequestMapping("/updateTeamCaptain.do")
	public String updateTeamCaptainByTeamName(HttpServletRequest req) {
		String newCaptainName= req.getParameter("newTeamCaptain");
		String TeamNameToUpdate= req.getParameter("teamName");
		String msg = teamService.validateAndUpdateTeamCaptainByTeamName(newCaptainName, TeamNameToUpdate);
		
		req.setAttribute("msg", msg);
		
		return "finalMessage.jsp";

		
	}
	@RequestMapping("/deleteByHG.do")
	public String deleteTeamByHomeGround(HttpServletRequest req) {
		String homeGroundToDelete= req.getParameter("HGToDelete");
		String msg = teamService.validateAndDeleteTeamByTeamHomeGround(homeGroundToDelete);
		
		req.setAttribute("msg", msg);
		
		return "finalMessage.jsp";

		
		
	}
}
