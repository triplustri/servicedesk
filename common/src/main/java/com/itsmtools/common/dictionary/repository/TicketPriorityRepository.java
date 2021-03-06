package com.itsmtools.common.dictionary.repository;


import com.itsmtools.common.dictionary.model.TicketPriority;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;


@Repository
public class TicketPriorityRepository extends AbstractRepository<TicketPriority, Integer, String> {

    @Autowired
    private SessionFactory factory;

    @Override
    public TicketPriority get(Integer id) { return null; }

    @Override
    public void create(TicketPriority entity) {}

    @Override
    public void update(TicketPriority entity) {}

    @Override
    public void delete(Integer id) {}

    @Override
    @SuppressWarnings("unchecked")
    public List<TicketPriority> list(Map<String, String> singleParams, Map<String, List<String>> multiParams) {
        Session session = factory.openSession();
        List<TicketPriority> collection = session.createCriteria(TicketPriority.class).list();
        session.close();
        return collection;
    }
}