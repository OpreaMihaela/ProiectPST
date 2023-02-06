package com.example.pst.farmacie.farmacie.service;

import com.example.pst.farmacie.farmacie.model.Produse;
import com.example.pst.farmacie.farmacie.repository.ProduseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduseService {
    private ProduseRepository produseRepository;

    public ProduseService(ProduseRepository produseRepository){
        this.produseRepository = produseRepository;
    }

    public List<Produse> getAllProduse(){
        List<Produse> produseList = new ArrayList<>();
        produseRepository.findAll().forEach(x -> produseList.add(x));
        return produseList;
    }

    public Produse getProduse(int id){
        return produseRepository.findById(id).orElse(null);
    }

    public Produse saveProduse(Produse produse){
        return produseRepository.save(produse);
    }

    public Produse deleteAllProduse(){
        produseRepository.deleteAll();
        return null;
    }

    public Produse deleteProduse(int id){
        produseRepository.deleteById(id);
        return null;
    }
}
