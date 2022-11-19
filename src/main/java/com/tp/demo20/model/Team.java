package com.tp.demo20.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Team  implements Serializable {
    @Id
    @GeneratedValue
    private Long idTeam;

    @Column(length=100)
    private String name;
    public Team (){}
    public Team(String name) {

        this.name = name;
    }

    public Long getIdTeam() {
        return idTeam;
    }

    public String getName() {
        return name;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }

    public void setName(String name) {
        this.name = name;
    }
}