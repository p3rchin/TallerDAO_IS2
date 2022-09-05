package co.edu.unbosque.model.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PersonSQLDAO {

	public static void create() {
		ConectSQL conectabd = new ConectSQL();
		try (Connection c = conectabd.conexionDB()) {
			PreparedStatement ps = c.prepareStatement("INSERT into persona Values(?,?,?,?,?,?,?,?)");
			ps.setString(1, "Santy");
			ps.setString(2, "Porras");
			ps.setString(3, "20");
			ps.setString(4, "M");
			ps.setString(5, "2");
			ps.setString(6, "Colombia");
			ps.setString(7, "21412311");
			ps.setString(8, "sporras@unbusque.edu.co");
			ps.executeUpdate();

			System.out.print("Conexión exitosa");
		} catch (Exception e) {
			System.err.print("Error: " + e.getMessage());
		}
	}

	public static void eliminar() {
		ConectSQL conectabd = new ConectSQL();
		Scanner sc = new Scanner(System.in).useDelimiter("");
		try (Connection c = conectabd.conexionDB()) {
			PreparedStatement ps = c.prepareStatement("DELETE FROM persona WHERE id=?");
			System.out.print("ingresar codigo");
			String id = sc.next();
			ps.setString(1, id);

			ps.executeUpdate();

			System.out.print("Conexión exitosa");
		} catch (Exception e) {
			System.err.print("Error: " + e.getMessage());
		}
	}

	public static void edit() {
		ConectSQL conectabd = new ConectSQL();
		Scanner sc = new Scanner(System.in).useDelimiter("");
		try (Connection c = conectabd.conexionDB()) {
			PreparedStatement ps = c.prepareStatement(
					"UPDATE  persona  SET nombre=?, apellido=?,edad=?,sexo=?,pais=?,celular=?,correo=? WHERE id=?");

			System.out.print("ingresar codigo");
			String id = sc.next();

			ps.setString(1, "Santy");
			ps.setString(2, "Porras");
			ps.setString(3, "20");
			ps.setString(4, "M");
			ps.setString(5, "Colombia");
			ps.setString(6, "21412311");
			ps.setString(7, "sporras");
			ps.setString(8, id);
			ps.executeUpdate();

			System.out.print("Conexión exitosa");
		} catch (Exception e) {
			System.err.print("Error: " + e.getMessage());
		}
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
