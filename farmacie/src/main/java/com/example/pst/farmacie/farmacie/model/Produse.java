package com.example.pst.farmacie.farmacie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "produse")
@SequenceGenerator(name = "produse_seq",initialValue = 4,allocationSize = 100)
public class Produse {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "produse_seq")
    @Column(name = "produse_id")
    private Integer produseId;

    @JsonIgnore
    private Integer clientId;

    @Column(name = "denumire")
    private String denumire;

    @Column(name = "pret")
    private Float pret;

    @Column(name = "tip_produs")
    private String tip_produs;

    public Integer getProduseId() {
        return produseId;
    }

    public void setProduseId(Integer produseId) {
        this.produseId = produseId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Float getPret() {
        return pret;
    }

    public void setPret(Float pret) { this.pret = pret; }

    public String getTip_produs() {
        return tip_produs;
    }

    public void setTip_produs(String tip_produs) {
        this.tip_produs = tip_produs;
    }


}
