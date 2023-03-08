import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;


public class connectionDB {
    public static void main(String[] args) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            if (conn != null) {
                System.out.println("Connesso");
            } else {
                System.out.println("Connessione fallita");
            }
            
            String[][] cities = {
                {"Carovigno", "ITA", "Apulia", "16770"},
                {"Ostuni", "ITA", "Apulia", "30000"},
                {"Brindisi", "ITA", "Apulia", "60000"},
                {"San Vito dei Normanni", "ITA", "Apulia", "15000"},
                {"Ceglie Messapica", "ITA", "Apulia", "16000"},
                {"Martina Franca", "ITA", "Apulia", "50252"},
                {"Cisternino", "ITA", "Apulia", "12000"},
                {"Casalini", "ITA", "Apulia", "15"},
                {"San Michele Salentino", "ITA", "Apulia", "14252"},
                {"Mesagne", "ITA", "Apulia", "22000"}
        };
        
        for (String[] city : cities) {
            String insertQuery = "INSERT INTO city (Name, CountryCode, District, Population) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setString(1, city[0]);
            pstmt.setString(2, city[1]);
            pstmt.setString(3, city[2]);
            pstmt.setInt(4, Integer.parseInt(city[3]));
            pstmt.executeUpdate();
        }
            
            // Prova lettura db
            String query = "SELECT * FROM world.city WHERE district = 'Apulia'";

            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String cityName = rs.getString("Name");
                System.out.println(cityName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
