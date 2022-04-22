package engim.biglietteria.controller;

import engim.biglietteria.model.Utente;
import engim.biglietteria.model.repository.UtenteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController         // dice che è API Rest
@RequestMapping(value = "/utente")  // Per fare richieste all'utente mappata come utente
public class UtenteController {
    @GetMapping(value = "/selezionaTuttiUtenti")
    public List<Utente> selezionaTuttiUtenti(){
        return UtenteRepository.selezionaUtenti();
    }
}
