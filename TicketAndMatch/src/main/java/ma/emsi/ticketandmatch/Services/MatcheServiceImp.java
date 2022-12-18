package ma.emsi.ticketandmatch.Services;

import ma.emsi.ticketandmatch.dao.Match;
import ma.emsi.ticketandmatch.repos.MatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class  MatcheServiceImp implements MatchService  {

    @Autowired
    MatchRepo matchRepo;
    @Override
    public Match addMatch(Match m) {
        matchRepo.save(m);
        return   m;
    }
}
