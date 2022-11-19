package com.tp.demo20.dao;
import com.tp.demo20.model.Team;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TeamDaoImpl implements ITeamDao {
    @PersistenceContext
    private EntityManager entityManager ;

    @Override
    public void save(Team t) {
        entityManager.persist(t);
    }
    @Override
    public List<Team> findAll() {
        Query query = entityManager.createQuery("select t from Team t");
        return query.getResultList();

    }

    @Override
    public List<Team> findByName(String name) {

        Query query = entityManager.createQuery("select t from Team t where t.name like :x ");
        query.setParameter("x", "%"+ name +"%");
        return query.getResultList();

    }

    @Override
    public Team findOne(Long idTeam) {
        Team t = entityManager.find(Team.class,  idTeam);
        return t;

    }

    @Override
    public void update(Team t) {
        entityManager.merge(t);
    }

    @Override
    public void remove(Long idTeam) {
        Team t = entityManager.find(Team.class, idTeam);
        entityManager.remove(t);

    }
}
