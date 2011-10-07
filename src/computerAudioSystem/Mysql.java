package computerAudioSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Mysql {
	static public Connection connection;
	
	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "thaCh4xa");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static public void executeQuery(String query) {
		try {
			Mysql.connection.createStatement().execute(query);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
