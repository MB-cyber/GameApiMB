package ma.emsi.ticketandmatch.web;

import ma.emsi.ticketandmatch.Services.MatchService;
import ma.emsi.ticketandmatch.dao.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MatchGraphQlController {
    @Autowired
    MatchService matchService;

    @MutationMapping
    public Match addMatch(@Argument Match m){

        return matchService.addMatch(m);
    }


}
