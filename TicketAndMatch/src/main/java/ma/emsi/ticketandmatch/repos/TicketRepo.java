package ma.emsi.ticketandmatch.repos;


import ma.emsi.ticketandmatch.dao.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TicketRepo  extends JpaRepository<Ticket,Integer> {
}
