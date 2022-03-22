
package library.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class System {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "123456";
    private static final String db = "library";
    private static final String url = "jdbc:mysql://localhost/"+db+"";
    
    public System(){
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            
            // Connect?
            if(conn != null)
                System.out.println("Conexión establecida exitosamente");
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Conexión Fallida:\n\n"+ex);
        }
    }
    

    public Connection getConnection() {
        return conn; //To change body of generated methods, choose Tools | Templates.
    }
}

