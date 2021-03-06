package com.itsmtools.common.dictionary.repository;


import com.itsmtools.common.dictionary.model.TicketType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;


@Repository
public class TicketTypeRepository extends AbstractRepository<TicketType, Integer, String> {

    @Autowired
    private SessionFactory factory;

    @Override
    public TicketType get(Integer id) { return null; }

    @Override
    public void create(TicketType entity) {}

    @Override
    public void update(TicketType entity) {}

    @Override
    public void delete(Integer id) {}

    @Override
    @SuppressWarnings("unchecked")
    public List<TicketType> list(Map<String, String> singleParams, Map<String, List<String>> multiParams) {
        Session session = factory.openSession();
        List<TicketType> collection = session.createCriteria(TicketType.class).list();
        session.close();
        return collection;
    }
}