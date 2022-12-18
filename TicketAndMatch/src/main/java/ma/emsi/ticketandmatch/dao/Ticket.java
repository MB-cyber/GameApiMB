package ma.emsi.ticketandmatch.dao;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 16,unique = true, nullable = false)
    private String ref;
    private Double prix;
    private Boolean actif;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Match_ID")
    private Match match;


}
