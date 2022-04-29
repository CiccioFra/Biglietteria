## `SQL`
### `Entità:`
1. [ ] **biglietterie**
- CREATE TABLE `biglietterie` (`id_biglietteria` int AUTO_INCREMENT PRIMARY KEY, 
  <br> `nome_biglietterie` VARCHAR(30) NOT null, 
  <br> `indirizzo` VARCHAR(50) );
- INSERT INTO biglietterie (nome_biglietterie, indirizzo) values <br>
  ('Biglietti per Tutti', 'via gianni'), <br>
  ('tickrt Stadio', 'via Alessanndrino');
<hr>

1. [ ] **biglietti**
   - CREATE TABLE `biglietti` (`id_biglietto` int AUTO_INCREMENT PRIMARY KEY, <br>
     `categoria` VARCHAR(30), <br> 
     `data_evento` VARCHAR(30) NOT null, <br> 
     `quantita` int, <br> 
     `prezzo` double NOT null );
   - INSERT INTO biglietti (categoria, data_evento, quantita, prezzo) values <br>
     ('Calcio', '15 agosto', 500, 12.5), <br>
     ('Concerto', '15 luglio', 400, 16.5), <br>
     ('Teatro', '15 agosto', 650, 24.77);
<hr>

2. [ ] **Relazione:** `biglietteria_vende_biglietti` biglietterie <-> biglietti
   - CREATE TABLE `biglietteria_vende_biglietti` ( <br>
     `id_biglietterie` int NOT null, <br>
     `id_biglietti` int NOT null, <br>
     `quantita` int NOT null, <br>
     FOREIGN KEY(id_biglietterie) REFERENCES biglietterie(id) ON DELETE CASCADE, <br>
     FOREIGN KEY(id_biglietti) REFERENCES biglietti(id) ON DELETE CASCADE, <br>
     PRIMARY KEY(id_biglietterie, id_biglietti)
     );
   - INSERT INTO `biglietteria_vende_biglietti` (id_biglietterie, id_biglietti, quantita) values <br>
     (1, 1, 190), <br>
     (1, 2, 80), <br>
     (1, 3, 200), <br>
     (2, 1, 60), <br>
     (2, 2, 250), <br>
     (2, 3, 50)
<hr>

3. [ ] `utenti`
   - CREATE TABLE `utenti` (`id_utente` int AUTO_INCREMENT PRIMARY KEY, <br>
     `nome_utente` VARCHAR(30), <br>
     `indirizzo` VARCHAR(50) );
   - INSERT INTO `utenti` (nome_utente, indirizzo) values <br>
     ('Francesco', 'via a Caso'), <br>
     ('Alessandra', 'via del pò'), <br>
     ('Dario', 'via Emanuele'), <br>
     ('Giuseppe', 'via Roma')
<hr>

4. [ ] Relazione: `utenti_compra_biglietti` utenti <-> biglietti
   - CREATE TABLE `utenti_compra_biglietti` ( <br>
     `id_utente` int NOT null, <br>
     `id_biglietto` int NOT null, <br>
     `quantita_biglietti_acquistati` int NOT null, <br>
     `data_acquisto` VARCHAR(20) NOT null, <br>
     FOREIGN KEY(id_utente) REFERENCES utenti(id) ON DELETE CASCADE, <br>
     FOREIGN KEY(id_biglietto) REFERENCES biglietti(id) ON DELETE CASCADE, <br>
     PRIMARY KEY(id_utente, id_biglietto, data_acquisto)
     );
   - INSERT INTO `utenti_compra_biglietti` (id_utente, id_biglietto, quantita_biglietti_acquistati, data_acquisto) values <br>
     (1, 3, 1, '15/8/21'), <br>
     (2, 4, 2, '15/7/21'), <br>
     (3, 1, 1, '11/8/21'), <br>
     (1, 1, 1, '1/7/21'), <br>
     (4, 3, 3, '4/9/21')
<hr>


- CREATE TABLE eventi (id int AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(30), indirizzo VARCHAR(50) );

Dipendenze del progetto creato da Hassan in SpringInitializr:
- Spring Web
- Lombok
- Spring Boot DevTools    

io ho messo:
- Spring Web
- importato da Libraries -> Maven -> mysql-connector-java/8.0.27
  - service solo in JPA perché  lavora con i servizi
