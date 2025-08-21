import javax.xml.transform.Result;
import java.sql.*;

//testing out connectivty to database
//testing out nonsense here ignore this
public class myJDBC {

    public static void main (String []args){

        try {  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jnnbadb","root","@Garcopsy4856");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT TM FROM PLAYER_PER_GAME");

            while (resultSet.next()){
                System.out.println(resultSet.getString("TM"));
            }

        }

        catch(SQLException e){
          e.printStackTrace();
        }
    }


}
