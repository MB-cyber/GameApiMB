package ma.emsi.ticketandmatch.Services;

import ma.emsi.ticketandmatch.dao.Ticket;
import ma.emsi.ticketandmatch.repos.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TicketServicesImp implements  TicketService{

    @Autowired
    TicketRepo ticketRepo;
    @Override

        public String buyTicket(int i) {
            Ticket e = ticketRepo.findById(i).orElse(null);
            List<Ticket> t= ticketRepo.findAll();
            if(e == null){
                return "not ticket availabel";
            }else {
                if(t.size()<2022){
                    e.setActif(true);
                    ticketRepo.save(e);
                    return "you just bought a ticket";
                }else {
                    return "no ticket in stock";
                }


            }
        }




    @Override
    public Ticket updateTicket(Integer id,Ticket ticket) {

        Ticket t = ticketRepo.findById(id).get();
            if(t!=null){

                t.setActif(ticket.getActif());
                t.setPrix(ticket.getPrix());

                return ticketRepo.save(t);

            }
            return null;
        }

}
