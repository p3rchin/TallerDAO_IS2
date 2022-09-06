package co.edu.unbosque.model.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PersonSQLDAO {

	public boolean create(String nombre, String apellido, String edad, String sexo, String id, String pais,
			String numero, String correo) {
		ConectSQL conectabd = new ConectSQL();
		try (Connection c = conectabd.conexionDB()) {
			PreparedStatement ps = c.prepareStatement("INSERT into persona Values(?,?,?,?,?,?,?,?)");
			ps.setString(1, nombre);
			ps.setString(2, apellido);
			ps.setString(3, edad);
			ps.setString(4, sexo);
			ps.setString(5, id);
			ps.setString(6, pais);
			ps.setString(7, numero);
			ps.setString(8, correo);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.print("Error: " + e.getMessage());
		}
		return false;
	}

	public boolean eliminar(String id) {
		ConectSQL conectabd = new ConectSQL();
		Scanner sc = new Scanner(System.in).useDelimiter("");
		try (Connection c = conectabd.conexionDB()) {
			PreparedStatement ps = c.prepareStatement("DELETE FROM persona WHERE id=?");
			
			ps.setString(1, id);

			ps.executeUpdate();

			return true;
		} catch (Exception e) {
			System.err.print("Error: " + e.getMessage());
		}
		return false;
	}

	public boolean edit(String nombre, String apellido, String edad, String sexo, String id, String pais, String numero,
			String correo) {
		ConectSQL conectabd = new ConectSQL();
		Scanner sc = new Scanner(System.in).useDelimiter("");
		try (Connection c = conectabd.conexionDB()) {
			PreparedStatement ps = c.prepareStatement(
					"UPDATE  persona  SET nombre=?, apellido=?,edad=?,sexo=?,pais=?,celular=?,correo=? WHERE id=?");

			ps.setString(1, nombre);
			ps.setString(2, apellido);
			ps.setString(3, edad);
			ps.setString(4, sexo);
			ps.setString(5, pais);
			ps.setString(6, numero);
			ps.setString(7, correo);
			ps.setString(8, id);
			ps.executeUpdate();
			return true;

		} catch (Exception e) {
			System.err.print("Error: " + e.getMessage());
		}
		return false;
	}

	public static void mostrar() {
		ConectSQL conectabd = new ConectSQL();

		try (Connection c = conectabd.conexionDB()) {

			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM persona");

			while (rs.next()) {
				System.out.print(rs.getString(1));
			}

			System.out.print("Conexión exitosa");
		} catch (Exception e) {
			System.err.print("Error: " + e.getMessage());
		}
	}

}
