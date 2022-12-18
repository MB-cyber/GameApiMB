package ma.emsi.ticketandmatch.Services;

import ma.emsi.ticketandmatch.dao.Match;

public interface MatchService {

    Match addMatch(Match m);

    Match getMatchByref(String ref);

}
