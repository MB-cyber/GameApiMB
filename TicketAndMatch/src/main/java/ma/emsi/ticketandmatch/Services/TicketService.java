package ma.emsi.ticketandmatch.Services;

import ma.emsi.ticketandmatch.dao.Match;
import ma.emsi.ticketandmatch.dao.Ticket;


public interface TicketService {


    public String buyTicket(int i);
    public Ticket updateTicket(Integer id,Ticket ticket);
}
