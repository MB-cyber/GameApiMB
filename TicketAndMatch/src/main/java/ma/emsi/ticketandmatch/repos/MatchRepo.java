package ma.emsi.ticketandmatch.repos;

import ma.emsi.ticketandmatch.dao.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MatchRepo  extends JpaRepository<Match,Integer> {

    Match findByRef(String ref);
}
