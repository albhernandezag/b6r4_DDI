package com.example.springrest.ticket.service;

import com.example.springrest.ticket.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
 
}