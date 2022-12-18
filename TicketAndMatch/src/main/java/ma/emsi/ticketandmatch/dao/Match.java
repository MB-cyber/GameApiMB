package ma.emsi.ticketandmatch.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Match implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 16,unique = true, nullable = false)
    private  String ref;
    @Temporal(TemporalType.DATE)
    private Date datHeurs;
    private String lieu;
    private String equipe1;
    private String equipe2;
    @OneToMany(mappedBy="match",fetch=FetchType.LAZY)
    private Collection<Ticket> tickets;


}
