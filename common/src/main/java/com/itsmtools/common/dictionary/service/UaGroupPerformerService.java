package com.itsmtools.common.dictionary.service;


import com.itsmtools.common.dictionary.model.UaGlobal;
import com.itsmtools.common.dictionary.model.UaGroupPerformer;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UaGroupPerformerService {

    @Autowired
    Session session;

    public Optional<UaGroupPerformer> get(Integer id) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public Optional<UaGroupPerformer> getByUaGlobal(UaGlobal uaGlobal) {
        return session.createCriteria(UaGroupPerformer.class)
            .add(Restrictions.eq("uaGlobal", uaGlobal))
            .list()
            .stream()
            .findFirst();
    }

    public void save(UaGroupPerformer entity) {
        session.save(entity);
        session.flush();
    }

    public void update(UaGroupPerformer entity) {}

    public List<UaGroupPerformer> list() {
        return null;
    }
}