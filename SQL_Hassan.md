su rep
- come si seleziona una relazione

> SELECT BVB.id_be, BVB.id_bi, BVB.quantita, B.nome_be, B.indirizzo, T.prezzo
FROM disponibilita_b_b AS BVB
JOIN biglietterie AS B ON BVB.id_bi = B.nome_be
JOIN biglietti AS T ON BVB.id_be = T.id
WHERE BVB.id_be = 1;

1. payload
2. BiglietteriaController -> come si filtra con parametro per avere una GET -> @GetMapping
3. {idBiglietteria} è una variabile di indirizzo
4. @PathVariable è il parametro che metto dopo lo / posto alla riga sopra
5. postman -> (dopo aver runnato spring e con server up) http://localhost:8081/biglietteria/selezionaBigliettoByBiglietteria/1
6. biglietteria -> controller con cui sto lavorando
7. selezionaBigliettoByBiglietteria -> metodo