package com.project.ipl.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.ipl.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
}
