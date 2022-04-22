### `SQL`
- CREATE TABLE biglietterie (id int AUTO_INCREMENT PRIMARY KEY, nome_be VARCHAR(30) NOT null, indirizzo VARCHAR(50) );
- CREATE TABLE biglietti (id int AUTO_INCREMENT PRIMARY KEY, categoria VARCHAR(30), data_evento VARCHAR(30) NOT null, quantita int, prezzo double NOT null );
- CREATE TABLE disponibilita_b_b (id_be int NOT null, id_bi int NOT null, quantita int NOT null,
  FOREIGN KEY(id_be) REFERENCES biglietterie(id) ON DELETE CASCADE,
  FOREIGN KEY(id_bi) REFERENCES biglietti(id) ON DELETE CASCADE,
  PRIMARY KEY(id_be, id_bi)
  );
- CREATE TABLE utenti (id int AUTO_INCREMENT PRIMARY KEY, nome_utente VARCHAR(30), indirizzo VARCHAR(50) );
- CREATE TABLE utente_compra_biglietti (id_utente int NOT null, id_biglietto int NOT null, quantita_biglietti_acquistati int NOT null, data_acquisto VARCHAR(20) NOT null,
  FOREIGN KEY(id_utente) REFERENCES utenti(id) ON DELETE CASCADE,
  FOREIGN KEY(id_biglietto) REFERENCES biglietti(id) ON DELETE CASCADE,
  PRIMARY KEY(id_utente, id_biglietto, data_acquisto)
  );
- CREATE TABLE eventi (id int AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(30), indirizzo VARCHAR(50) );


dipendenze del progetto creato da Hassan in SpringInitializr:
- Spring Web
- Lombok
- Spring Boot DevTools

io ho messo:
- Spring Web
- importato da Libraries -> Maven -> mysql-connector-java/8.0.27
  - service solo in JPA perchè lavora con i servizi