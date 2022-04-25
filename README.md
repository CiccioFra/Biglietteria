### `SQL`
- CREATE TABLE biglietterie (id int AUTO_INCREMENT PRIMARY KEY, nome_biglietterie VARCHAR(30) NOT null, indirizzo VARCHAR(50) );
- INSERT INTO biglietterie (nome_biglietterie, indirizzo) values
  ('Biglietti per Tutti', 'via gianni'),
  ('tickrt Stadio', 'via Alessanndrino');

  
- CREATE TABLE biglietti (id int AUTO_INCREMENT PRIMARY KEY, categoria VARCHAR(30), data_evento VARCHAR(30) NOT null, quantita int, prezzo double NOT null );
- INSERT INTO biglietti (categoria, data_evento, quantita, prezzo) values
  ('Calcio', '15 agosto', 15, 12.5),
  ('Concerto', '15 luglio', 18, 16.5),
  ('Teatro', '15 agosto', 35, 24.77);


- CREATE TABLE disponibilita_b_b (id_biglietterie int NOT null, id_biglietti int NOT null, quantita int NOT null,
  FOREIGN KEY(id_biglietterie) REFERENCES biglietterie(id) ON DELETE CASCADE,
  FOREIGN KEY(id_biglietti) REFERENCES biglietti(id) ON DELETE CASCADE,
  PRIMARY KEY(id_biglietterie, id_biglietti)
  );


- CREATE TABLE utenti (id int AUTO_INCREMENT PRIMARY KEY, nome_utente VARCHAR(30), indirizzo VARCHAR(50) );


- CREATE TABLE utente_compra_biglietti (id_utente int NOT null, id_biglietto int NOT null, quantita_biglietti_acquistati int NOT null, data_acquisto VARCHAR(20) NOT null,
  FOREIGN KEY(id_utente) REFERENCES utenti(id) ON DELETE CASCADE,
  FOREIGN KEY(id_biglietto) REFERENCES biglietti(id) ON DELETE CASCADE,
  PRIMARY KEY(id_utente, id_biglietto, data_acquisto)
  );


- CREATE TABLE eventi (id int AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(30), indirizzo VARCHAR(50) );

Dipendenze del progetto creato da Hassan in SpringInitializr:
- Spring Web
- Lombok
- Spring Boot DevTools    

io ho messo:
- Spring Web
- importato da Libraries -> Maven -> mysql-connector-java/8.0.27
  - service solo in JPA perché  lavora con i servizi
