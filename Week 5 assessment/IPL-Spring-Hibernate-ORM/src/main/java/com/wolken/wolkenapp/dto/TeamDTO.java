package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@NamedQuery(name="updateTeamCaptain", query = "update TeamDTO tDTO set tDTO.teamCaptain=:newCaptain where tDTO.teamName=: teamName")
@NamedQuery(name="selectAllTeams", query="from TeamDTO")
@NamedQuery(name="deleteByHomeGround",query="delete from TeamDTO tDTO where tDTO.teamHomeGround=:groundToDelete ")

@Entity
@Table(name = "team_table")
public class TeamDTO {

	@Id
	@Column(name = "team_id")
	private int teamId;

	@Column(name = "team_name")
	private String teamName;

	@Column(name = "team_home_ground")
	private String teamHomeGround;

	@Column(name = "team_captain")
	private String teamCaptain;

}
