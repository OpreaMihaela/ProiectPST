package com.example.pst.farmacie.farmacie.controller;


import com.example.pst.farmacie.farmacie.model.Clienti;
import com.example.pst.farmacie.farmacie.service.ClientiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clienti")
public class ClientiController {
    private ClientiService clientiService;

    public ClientiController(ClientiService clientiService){
        this.clientiService = clientiService;
    }

    @GetMapping
    public List<Clienti> getAllClienti(){
        return clientiService.getAllClienti();
    }

    @GetMapping("/{id}")
    public Clienti getClienti(@PathVariable("id") int id){
        return clientiService.getClienti(id);
    }

    @PostMapping
    public Clienti saveClienti(@RequestBody Clienti clienti){
        return clientiService.saveClienti(clienti);
    }

    @PutMapping("/{id}")
    public Clienti updateClienti(@PathVariable("id")int id, @RequestBody Clienti clienti){
        clienti.setClientiId(id);
        return clientiService.saveClienti(clienti);
    }

    @PatchMapping("/{id}")
    public Clienti updatePatchClienti(@PathVariable("id")int id, @RequestBody Clienti clienti){
        Clienti newClienti = clientiService.getClienti(id);
        newClienti.setClientiId(id);

        if(clienti.getNume() != null)
            newClienti.setNume(clienti.getNume());
        if(clienti.getPrenume()!=null)
            newClienti.setPrenume(clienti.getPrenume());
        if(clienti.getEmail()!=null)
            newClienti.setEmail(clienti.getEmail());
        if(clienti.getNr_tel()!=null)
            newClienti.setNr_tel(clienti.getNr_tel());

        return clientiService.saveClienti(newClienti);
    }

    @DeleteMapping
    public Clienti deleteAllClienti(){
        return clientiService.deleteAllClienti();
    }

    @DeleteMapping("/{id}")
    public Clienti deleteClienti(@PathVariable("id")int id){
        return clientiService.deleteClienti(id);
    }
}
