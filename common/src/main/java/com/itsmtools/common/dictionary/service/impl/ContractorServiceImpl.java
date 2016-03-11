package com.itsmtools.common.dictionary.service.impl;


import com.itsmtools.common.dictionary.model.Contractor;
import com.itsmtools.common.dictionary.service.spec.ContractorService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ContractorServiceImpl implements ContractorService {

    @Autowired
    Session session;

    @Override
    public Contractor item(Integer id) {
        return null;
    }

    @Override
    public void save(Contractor entity) {
        session.save(entity);
    }

    @Override
    public void update(Contractor entity) {
        Optional.ofNullable((Contractor) session.get(Contractor.class, entity.getId()))
            .ifPresent((value) -> {
                value.setFullName(entity.getFullName());
                value.setMetaInfo(entity.getMetaInfo());
                session.update(value);
                session.flush();
            });
    }

    @Override
    public void delete(Integer id) {
        Optional.ofNullable(session.get(Contractor.class, id)).ifPresent((i) -> {
            session.delete(i);
            session.flush();
        });
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Contractor> list() {
        return (List<Contractor>) session.createCriteria(Contractor.class).list();
    }
}