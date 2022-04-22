package engim.biglietteria.model.relations;

import engim.biglietteria.model.Biglietteria;
import engim.biglietteria.model.Biglietto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BiglietteriaVendeBiglietti {
    private Biglietteria biglietteria;
    private Biglietto biglietto;
    private Integer quantita;
}
