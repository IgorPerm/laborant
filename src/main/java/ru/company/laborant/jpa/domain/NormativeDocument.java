package ru.company.laborant.jpa.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Cheranev N.
 * created on 04.02.2017.
 */
@Entity
@Data
public class NormativeDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NORMATIVE_DOCUMENT")
    @SequenceGenerator(name="SEQ_NORMATIVE_DOCUMENT", sequenceName="SEQ_NORMATIVE_DOCUMENT", allocationSize=100)
    private Long id;
    private String name;
    private String description;
    private Integer ord;
    @ManyToOne
    @JoinColumn(name="folderId")
    private Folder folder;
}
