package com.tp.demo20;

import com.tp.demo20.dao.ITeamDao;
import com.tp.demo20.model.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Demo20Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Demo20Application.class, args);
        ITeamDao teamDao = ctx.getBean(ITeamDao.class);
        teamDao.save(new Team("Avenir Sportif de Lala"));
        teamDao.save(new Team("Club Olympique de Transport"));
        teamDao.save(new Team("Stir Sportif Jarzouna"));

        List<Team> teams = teamDao.findByName("sportif");
        for (Team t : teams) {
            System.out.println("Team : " + t.getName());
        }
    }

}
