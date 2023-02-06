package com.example.pst.farmacie.farmacie.service;

import com.example.pst.farmacie.farmacie.model.Clienti;
import com.example.pst.farmacie.farmacie.repository.ClientiRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientiService {
    private ClientiRepository clientiRepository;
    public ClientiService(ClientiRepository clientiRepository){
        this.clientiRepository = clientiRepository;
    }

    public List<Clienti> getAllClienti(){
        List<Clienti> clientiList = new ArrayList<>();
        clientiRepository.findAll().forEach(x -> clientiList.add(x));
        return clientiList;
    }

    public Clienti getClienti(int id){
        return clientiRepository.findById(id).orElse(null);
    }

    public Clienti saveClienti(Clienti clienti){
        return clientiRepository.save(clienti);
    }

    public Clienti deleteAllClienti(){
        clientiRepository.deleteAll();
        return null;
    }

    public Clienti deleteClienti(int id){
        clientiRepository.deleteById(id);
        return null;
    }

}
