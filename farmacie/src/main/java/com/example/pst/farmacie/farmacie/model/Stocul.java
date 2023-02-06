package com.example.pst.farmacie.farmacie.model;


import javax.persistence.*;

@Entity
@Table(name = "stocul")
@SequenceGenerator(name = "stocul_seq",initialValue = 4,allocationSize = 100)
public class Stocul {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "stocul_seq")
    @Column(name = "stocul_id")
    private Integer stoculId;

    @Column(name = "nr_produse")
    private Integer nr_produse;

    private Integer produseId;

    public Integer getStoculId() {
        return stoculId;
    }

    public void setStoculId(Integer stoculId) {
        this.stoculId = stoculId;
    }

    public Integer getNr_produse() {
        return nr_produse;
    }

    public void setNr_produse(Integer nr_produse) { this.nr_produse = nr_produse;
    }


    public Integer getProduseId() {
        return produseId;
    }

    public void setProduseId(Integer produseId) {
        this.produseId = produseId;
    }
}
