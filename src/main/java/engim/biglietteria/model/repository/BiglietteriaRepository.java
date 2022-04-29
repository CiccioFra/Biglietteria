package engim.biglietteria.model.repository;

import engim.biglietteria.constants.DBConfig;
import engim.biglietteria.model.Biglietteria;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static engim.biglietteria.constants.DBConfig.*;

public class BiglietteriaRepository {
    public static List<Biglietteria> selezionaBiblietteria(){
        List<Biglietteria> biglietteriaList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL, DBConfig.USER, DBConfig.PW);
            String query = "SELECT * FROM biglietteria";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Biglietteria b = new Biglietteria(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("indirizzo")
                );
                biglietteriaList.add(b);
            }
            statement.close();
            connection.close();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return biglietteriaList;
    }
}
