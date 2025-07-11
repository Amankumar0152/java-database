import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Animal {
    public static void main(String args[]) throws Exception
    {
        String url= "jdbc:postgresql://127.0.0.1:5432/product";
        String username = "postgres";
        String password = "AWS4sdlish";

        String sql = "select name from Russian where id = 2";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql) ;
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        con.close();
    }
}
