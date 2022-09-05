package co.edu.unbosque.model.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectSQL {
	
	private final String URL = "jdbc:sqlite:Conexion.db";
	private final String DRIVER = "org.sqlite.JDBC";

	public Connection conexionDB() throws SQLException {
		Connection c = null;
		try {
			Class.forName(DRIVER).newInstance();
			c = DriverManager.getConnection(URL);
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
			throw new SQLException(e.getMessage());
		}

		return c;
	}

}
