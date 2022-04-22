package engim.biglietteria.controller;

import engim.biglietteria.model.Biglietteria;
import engim.biglietteria.model.repository.BiglietteriaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/biglietteria")
public class BiglietteriaController {
    @GetMapping(value = "/selezionaTutteBiglietterie")
    public List<Biglietteria> selezionaBiglietterie(){
        return BiglietteriaRepository.selezionaBiblietteria();
    }
}
