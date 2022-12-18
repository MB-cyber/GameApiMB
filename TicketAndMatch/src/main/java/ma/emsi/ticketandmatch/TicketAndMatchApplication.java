package ma.emsi.ticketandmatch;

import ma.emsi.ticketandmatch.dao.Match;
import ma.emsi.ticketandmatch.dao.Ticket;
import ma.emsi.ticketandmatch.repos.MatchRepo;
import ma.emsi.ticketandmatch.repos.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TicketAndMatchApplication implements CommandLineRunner {
    @Autowired
    MatchRepo matchRepo ;
    @Autowired
    TicketRepo ticketRepo;
    public static void main(String[] args) {
        SpringApplication.run(TicketAndMatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        matchRepo.save(new Match(null,"ref1123",new Date(),"oujda","e1","e2",null));
        matchRepo.save(new Match(null,"ref112r3",new Date(),"oujda","e1","e2",null ));
        matchRepo.save(new Match(null,"ref11r23",new Date(),"oujda","e1","e2",null));

        Match m =matchRepo.findByRef("ref11r23");

        ticketRepo.save(new Ticket(null,"ref41r23",200.00,false,m));
        ticketRepo.save(new Ticket(null,"ere",200.00,false,m));
        ticketRepo.save(new Ticket(null,"e58re",200.00,false,m));

    }
}
