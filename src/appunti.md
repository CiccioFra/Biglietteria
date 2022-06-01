lo swagger ui example -> [link](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)  
è una dipendenza, va in pom.xml
è una pagina relativa al progetto che va vedere i metodi relativi:
cosa restituiesce ecc,
*documentazione ufficiale del progetto online - documentazione come si deve: aggiungi swagger

    copiato da Hassan come esempio:
    presente nel file controller/ClientiController.java
    public class ClientiController
    {
        private static final Logger logger = LogManager.getLogger(ClientiController.class);
        private final ClientoiService clientiService;
        private final TesseraService tesseraService;

        @Autowired
        public ClientiController(ClientiService clientiService, TesseraService tesseraService)
        {
            this.clientiService = clientiService; 
            this.tesseraService = tesseraService; 
        }

        @ApiOperation(
            value = "Searching and retrieving all the client in the client table",
            note= "ritorna i clienti in formato json",
            response = clienti.class,
            produces " application/json"
        )
        @ApiResponses(
            {@ApiResponses(code = 200, message = "Clienti trovati"),
            {@ApiResponses(code = 404, message = "Clienti non trovati")}
        )
        @GetMapping(.....)
    }