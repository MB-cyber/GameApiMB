package ma.emsi.ticketandmatch.web;


import ma.emsi.ticketandmatch.Services.MatchService;
import ma.emsi.ticketandmatch.Services.TicketService;
import ma.emsi.ticketandmatch.dao.Match;
import ma.emsi.ticketandmatch.dao.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller

public class TicketGraphqlController {
    @Autowired
    TicketService ticketService;

    @MutationMapping
    public String buyTicket(@Argument int Tid){

        return ticketService.buyTicket(Tid);
    }
    @MutationMapping
    public Ticket editTicket(@Argument Integer id, @Argument Ticket ticket){

        return ticketService.updateTicket( id, ticket);
    }

}
