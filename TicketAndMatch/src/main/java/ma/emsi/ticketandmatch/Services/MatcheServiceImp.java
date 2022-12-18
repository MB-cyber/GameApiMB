package ma.emsi.ticketandmatch.Services;

import ma.emsi.ticketandmatch.dao.Match;
import ma.emsi.ticketandmatch.dao.Ticket;
import ma.emsi.ticketandmatch.repos.MatchRepo;
import ma.emsi.ticketandmatch.repos.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

@Service
public class  MatcheServiceImp implements MatchService  {

    @Autowired
    MatchRepo matchRepo;
    @Autowired
    TicketRepo ticketRepo;
    @Override
    public Match addMatch(Match m) {

        int maxTickets =2022;
        matchRepo.save(m);

        Match savedmatch =matchRepo.findByRef(m.getRef());


        SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmm");
        for (int i = 0; i < maxTickets; i++) {
            ticketRepo.save(new Ticket(null,i+f.format(m.getDatHeurs()),2000.00,false,savedmatch));
        }



        return  savedmatch;
    }

    @Override
    public Match getMatchByref(String ref) {
        return matchRepo.findByRef(ref);
    }
}
