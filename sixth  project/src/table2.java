import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class table2 {

  private static final String EMPLOYEE_TABLE = "create table MyEmployees3 ( "
      + "   id INT PRIMARY KEY, firstName VARCHAR(20), lastName VARCHAR(20), "
      + "   title VARCHAR(20), salary INT )";

  public static Connection getConnection() throws Exception {
    String driver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://localhost/mydatabase";
    String username = "root";
    String password = "root";
    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

  public static void main(String args[]) {
    Connection conn = null;
    Statement stmt = null;
    try {
      conn = getConnection();
      stmt = conn.createStatement();
      stmt.executeUpdate(EMPLOYEE_TABLE);
      stmt.executeUpdate("insert into MyEmployees3(id, firstName) values(100, 'A')");
      stmt.executeUpdate("insert into MyEmployees3(id, firstName) values(200, 'B')");
      System.out.println("CreateEmployeeTableMySQL: main(): table created.");
    } catch (ClassNotFoundException e) {
      System.out.println("error: failed to load MySQL driver.");
      e.printStackTrace();
    } catch (SQLException e) {
      System.out.println("error: failed to create a connection object.");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("other error:");
      e.printStackTrace();
    } finally {
      try {
        stmt.close();
        conn.close();        
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
