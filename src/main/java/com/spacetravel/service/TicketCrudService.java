package com.spacetravel.service;

import com.spacetravel.entity.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TicketCrudService {
    private final SessionFactory sessionFactory;

    public TicketCrudService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addTicket(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            if (ticket.getClient() == null || ticket.getClient().getId() == 0) {
                throw new IllegalArgumentException("Client cannot be null or invalid.");
            }
            if (ticket.getFromPlanet() == null || ticket.getFromPlanet().getId() == null) {
                throw new IllegalArgumentException("From Planet cannot be null or invalid.");
            }
            if (ticket.getToPlanet() == null || ticket.getToPlanet().getId() == null) {
                throw new IllegalArgumentException("To Planet cannot be null or invalid.");
            }
            session.save(ticket);
            transaction.commit();
        }
    }

    public Ticket getTicket(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Ticket.class, id);
        }
    }

    public void updateTicket(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(ticket);
            transaction.commit();
        }
    }

    public void deleteTicket(int id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Ticket ticket = session.get(Ticket.class, id);
            if (ticket != null) {
                session.delete(ticket);
            }
            transaction.commit();
        }
    }
}
