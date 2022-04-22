package engim.biglietteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utente {
    private Long idUtente;
    private String nome;
    private String indirizzo;
}
