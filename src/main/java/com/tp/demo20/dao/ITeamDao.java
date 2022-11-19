package com.tp.demo20.dao;

import com.tp.demo20.model.Team;


import java.util.List;
public interface ITeamDao {
    public  void save (Team t);
    public List<Team> findAll();
    public List<Team> findByName(String name);
    public Team findOne(Long idTeam);
    public void update(Team t);
    public void remove(Long idTeam);

}
