import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EjMain {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db2amt?user=root&password=No.");
		DatabaseMetaData dbmd=null;
		
		dbmd=con.getMetaData();
		
		

	}

}
