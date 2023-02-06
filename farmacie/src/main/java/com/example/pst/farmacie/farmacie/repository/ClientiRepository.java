package com.example.pst.farmacie.farmacie.repository;

import com.example.pst.farmacie.farmacie.model.Clienti;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientiRepository extends CrudRepository<Clienti,Integer> {
}
