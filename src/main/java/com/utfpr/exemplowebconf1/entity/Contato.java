package com.utfpr.exemplowebconf1.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CONTATOS")
public class Contato extends AbstractPersistable<Long> {

    @Column(name = "nome", length = 64, nullable = false)
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

}
