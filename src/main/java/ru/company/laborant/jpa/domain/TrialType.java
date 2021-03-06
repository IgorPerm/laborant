package ru.company.laborant.jpa.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Тип испытания
 *
 * @author Cheranev N.
 * created on 09.05.2019.
 */
@Entity
@Data
public class TrialType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TRIAL_TYPE")
    @SequenceGenerator(name = "SEQ_TRIAL_TYPE", sequenceName = "SEQ_TRIAL_TYPE", allocationSize = 100)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "folderId")
    private Folder folder;
}
