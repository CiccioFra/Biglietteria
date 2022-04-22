package engim.biglietteria.model.relations;

import engim.biglietteria.model.Biglietto;
import engim.biglietteria.model.Utente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtenteCompraBiglietto {
    private Utente utente;
    private Biglietto biglietto;
    private String dataAcquisto;
    private Integer quantitaBigliettiAcquistati;
}
