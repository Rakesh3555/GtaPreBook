package util;

import java.sql.*;

import model.Pojogta;

public class GtaDataBase {
	
	
	public static Connection getConnection(Pojogta pg) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection gtaConnect = DriverManager.getConnection("jdbc:mysql://localhost:3308/gta", "root", "root");
		return gtaConnect;
		
	}
	
	public static void writePre_books(Pojogta pg) throws ClassNotFoundException, SQLException {
		Connection gtaConnection = getConnection(pg);
		
		//String query = "select username,Date_of_birth,mail from pre_books where username=? and Date_of_birth=? and mail=?";
		String query = "insert into pre_books values (?,?,?);";
		PreparedStatement ps = gtaConnection.prepareStatement(query);
		ps.setString(1, pg.getUsername());
		ps.setString(2, pg.getDate_of_birth());
		ps.setString(3, pg.getMail());
	}
	
	public static void readPre_books(Pojogta pg) throws ClassNotFoundException, SQLException {
		Connection gtaConnection = getConnection(pg);
		String query = "select * pre_books ";
		PreparedStatement pr = gtaConnection.prepareStatement(query);
		
	}

}
