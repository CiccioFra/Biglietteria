package engim.biglietteria.model.repository;

import engim.biglietteria.constants.DBConfig.*;
import static engim.biglietteria.constants.DBConfig.*;
import engim.biglietteria.model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UtenteRepository {
    public static List<Utente> selezionaUtenti(){
        List<Utente> utenteList = new ArrayList<>();
        try{
            Connection connection = DriverManager.getConnection(URL, USER, PW);
            String query = "SELECT * FROM utenti";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Utente utente = new Utente(
                  rs.getLong("id"),
                  rs.getString("nome_utente"),
                  rs.getString("indirizzo")
                );
                utenteList.add(utente);
            }
            statement.close();
            connection.close();
        }
        catch (SQLException ex){
            System.out.printf(ex.getMessage());
        }
        return utenteList;
    }
}
