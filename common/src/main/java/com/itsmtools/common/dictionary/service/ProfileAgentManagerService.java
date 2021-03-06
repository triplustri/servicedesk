package com.itsmtools.common.dictionary.service;


import com.itsmtools.common.dictionary.model.Account;
import com.itsmtools.common.dictionary.model.ProfileAgentManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class ProfileAgentManagerService implements ProfileService<ProfileAgentManager, Account> {

    @Autowired
    private SessionFactory factory;

    public Optional<ProfileAgentManager> get(Integer id) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public Optional<ProfileAgentManager> getByAccount(Account account) {
        Session session = factory.openSession();
        Optional<ProfileAgentManager> instance = session.createCriteria(ProfileAgentManager.class)
            .add(Restrictions.eq("account", account))
            .list()
            .stream()
            .findFirst();
        session.flush();
        session.close();
        return instance;
    }

    public void save(ProfileAgentManager entity) {
        Session session = factory.openSession();
        session.save(entity);
        session.flush();
        session.close();
    }

    public void update(ProfileAgentManager input) {
        Session session = factory.openSession();
        ProfileAgentManager profile = (ProfileAgentManager) session.get(ProfileAgentManager.class, input.getId());
        profile.setSupportLevels(input.getSupportLevels());
        profile.setEnable(input.getEnable());
        session.update(profile);
        session.flush();
        session.close();
    }

    public List<ProfileAgentManager> list() {
        return null;
    }
}
