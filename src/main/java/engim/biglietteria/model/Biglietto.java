package engim.biglietteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data           //getter setter (li prende per impliciti scritti
@AllArgsConstructor     //costruttore pieno
@NoArgsConstructor      //costruttore vuoto
public class Biglietto {
    private Long idBiglietto;
    private Double costo;
    private String dataEvento;
    private String categoria;
}
