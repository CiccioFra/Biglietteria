package engim.biglietteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Biglietteria {
    private Long idBiglietteria;
    private String nomeBiglietteria;
    private String indirizzo;

}
