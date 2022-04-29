su rep
- come si seleziona una relazione

> SELECT BVB.id_be, BVB.id_bi, BVB.quantita, B.nome_be, B.indirizzo, T.prezzo
> FROM disponibilita_b_b AS BVB
> JOIN biglietterie AS B ON BVB.id_bi = B.nome_be
> JOIN biglietti AS T ON BVB.id_be = T.id
> WHERE BVB.id_be = 1;

1. payload
2. BiglietteriaController -> come si filtra con parametro per avere una GET -> @GetMapping
3. {idBiglietteria} è una variabile di indirizzo
4. @PathVariable è il parametro che metto dopo lo / posto alla riga sopra
5. postman -> (dopo aver runnato spring e con server up) http://localhost:8081/biglietteria/selezionaBigliettoByBiglietteria/1
6. biglietteria -> controller con cui sto lavorando
7. selezionaBigliettoByBiglietteria -> metodo

connesione Angular
1. creazione model: ng g cl models/biglietteria/biglietteria (interfaccia) *consiglio: dare stessi nomi di java
   - idBiglietteria! : number;
   - nomeBiglietteria!: string;
   - indirizzo: string;
   - agiungere costruttore per togleire ! (che indica che può essere null), qui le inizializziamo a 0
2. **enviroment.ts** -> (vado nelle variabili di ambiante di angular) e dichiaro l'url di spring
3. creo il service, che si interfaccia col backend
   > ng g service services/bigleitteria/bigleitteria
4. x- in class: private host: string = environment.serverURL (così prendo la variabile dall'oggetto environment)
5. x- faccio injection dell'oggetto http -> nel costruttore come parametri (private : http HttpClient)
6. x- public selezionaBiglietteria() : Observable<Biglietteria[]> { return this.http.get<Biglietteria[]> (`${this.host}/bigleitteria/selezionaTutteBiglietterie`); }
7. x- andare nel component (home.component.ts) a richiamare il metodo del service -> faccio injection del service
8. xx- costructor(private bigleitteriaSrvice : BiglietteriaService)
9. xx- prima metto private subscriptions : Subscription[] = []; (fa vedere le interazioni che faccio, viene importato rxjs)
10. xx- public bigleitteriaList : Bigli....
11. xx- poi sotto: private selezionaBiglietterie = () : void => {..}
12. è uguale..: ->> xx- poi sotto: private selezionaBiglietterie() : void { ..vedere file di hassan.. }
13. xx- con push metto in ascolto delle subscribe, ecc
14. è una alternativa al try chatc, in questo modo possiamo catturare meglio i mesasggi di errore, es 400..
15. nella pagina home.component.html costruisco cosa restiture
16. xxxx- in Angular: il component (è come controller)
17. il service comunica con spring: con il controller di Spring -> cosa farci:


1. dichairo il model
2. il server a cui dico di andare a prendere i dati dall'host
