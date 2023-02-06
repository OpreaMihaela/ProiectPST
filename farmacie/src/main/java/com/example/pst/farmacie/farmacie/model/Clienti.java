package com.example.pst.farmacie.farmacie.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "clienti")
@SequenceGenerator(name = "clienti_seq",initialValue = 3,allocationSize = 100)
public class Clienti {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "clienti_seq")
    @Column(name = "clienti_id")
    private Integer clientiId;

    @Column(name = "nume")
    private String nume;

    @Column(name = "prenume")
    private String prenume;

    @Column(name = "email")
    private String email;

    @Column(name = "nr_tel")
    private String nr_tel;

    public Integer getClientiId() {
        return clientiId;
    }

    public void setClientiId(Integer teacherId) {
        this.clientiId = clientiId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String Nume) {
        this.nume = Nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNr_tel() {
        return nr_tel;
    }

    public void setNr_tel(String nr_tel) {
        this.nr_tel = nr_tel;
    }
}
