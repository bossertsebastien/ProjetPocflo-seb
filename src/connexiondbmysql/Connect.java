package connexiondbmysql;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Connect {
	
	Connection con = null;
	private static String URL = "jdbc:mysql://obiwan2.univ-brest.fr/zfm1-zbosserse";
    private static String LOGIN = "zbosserse";
    private static String PASSWORD = "ewyuxvni";

	public Connect() throws SQLException {
		
		con = (Connection) DriverManager.getConnection(URL, LOGIN, PASSWORD);
	       
	}
	
	public Connection getConnection() {
		return con;
	}
	
	public void CloseConnection() throws SQLException {
		con.close();
	}
}
