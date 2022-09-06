package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Person;
import co.edu.unbosque.model.persistence.PersonDAO;
import co.edu.unbosque.model.persistence.PersonSQLDAO;
import co.edu.unbosque.view.PrincipalView;

public class Controller implements ActionListener {

	private PrincipalView principalView;
	private PersonDAO personDAO;
	private PersonSQLDAO personSQLDAO;

	public Controller() {

		principalView = new PrincipalView();
		personDAO = new PersonDAO();
		personSQLDAO = new PersonSQLDAO();
		assignListeners();

	}

	public void assignListeners() {

		principalView.getAddPersonArray().addActionListener(this);
		principalView.getAddPersonPanel().getAddButton().addActionListener(this);
		principalView.getAddPersonPanel().getReturnButton().addActionListener(this);
		principalView.getEditPersonArray().addActionListener(this);
		principalView.getEditPersonPanel().getEditButton().addActionListener(this);
		principalView.getEditPersonPanel().getReturnButton().addActionListener(this);
		principalView.getSearchPersonArray().addActionListener(this);
		principalView.getShowAllPersonPanel().getReturnButton().addActionListener(this);
		principalView.getDeletePersonArray().addActionListener(this);

		principalView.getAddPersonSQL().addActionListener(this);
		principalView.getAddSQLPersonPanel().getAddButton().addActionListener(this);
		principalView.getAddSQLPersonPanel().getReturnButton().addActionListener(this);
		principalView.getEditPersonSQL().addActionListener(this);
		principalView.getEditSQLPersonPanel().getEditButton().addActionListener(this);
		principalView.getEditSQLPersonPanel().getReturnButton().addActionListener(this);
		principalView.getDeletePersonSQL().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();

		// -------------------------------ARRAY----------------------------------

		if (command.equals("ADDPERSONARRAY")) {

			principalView.getAddPersonPanel().setVisible(true);
			principalView.getMenubar().setVisible(false);

		}

		if (command.equals("REGISTERPERSONARRAYBUTTON")) {

			if (!"".equals(principalView.getAddPersonPanel().getTextName().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextLastName().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextAge().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextSex().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextId().getText())
					&& !"".equals(principalView.getAddPersonPanel().getCountry().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextTelephone().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextEmail().getText())) {

				String pName = principalView.getAddPersonPanel().getTextName().getText();
				String pLastname = principalView.getAddPersonPanel().getTextLastName().getText();
				String pAge = principalView.getAddPersonPanel().getTextAge().getText();
				String pSex = principalView.getAddPersonPanel().getTextSex().getText();
				String pID = principalView.getAddPersonPanel().getTextId().getText();
				String pCountry = principalView.getAddPersonPanel().getTextCountry().getText();
				String pTelephone = principalView.getAddPersonPanel().getTextTelephone().getText();
				String pEmail = principalView.getAddPersonPanel().getTextEmail().getText();

				Person person = new Person(pName, pLastname, pAge, pSex, pID, pCountry, pTelephone, pEmail);

				if (!personDAO.addPerson(person, pID)) {
					principalView.getAddPersonPanel().errorMessages(
							"Surgió un error. Puede ser que ya esté registrado el ID. Intenta agregar de nuevo a la persona");
				} else {
					principalView.getAddPersonPanel().informationMessages(
							"Felicidades " + pName + " " + pLastname + " ha sido registrado con éxito.");
					principalView.getAddPersonPanel().formatSpaces();
				}

			} else {
				JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
				principalView.getAddPersonPanel().formatSpaces();
			}

		} else if (command.equals("RETURNREGISTERARRAYBUTTON")) {

			principalView.getAddPersonPanel().formatSpaces();
			principalView.getAddPersonPanel().setVisible(false);
			principalView.getMenubar().setVisible(true);
		}

		if (command.equals("EDITPERSONARRAY")) {

			String messageEditPerson = "";

			try {
				messageEditPerson = JOptionPane.showInputDialog("Fill in the gap with the ID of the person to edit");

				if (messageEditPerson != null) {

					if (!"".equals(messageEditPerson)) {
						principalView.getEditPersonPanel().getTextId().setText(messageEditPerson);
						principalView.getEditPersonPanel().setVisible(true);
						principalView.getMenubar().setVisible(false);

					} else {
						JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Cancelation process ", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}

		if (command.equals("EDITPERSONARRAYBUTTON")) {

			if (!"".equals(principalView.getEditPersonPanel().getTextName().getText())
					&& !"".equals(principalView.getEditPersonPanel().getTextLastName().getText())
					&& !"".equals(principalView.getEditPersonPanel().getTextSex().getText())
					&& !"".equals(principalView.getEditPersonPanel().getTextAge().getText())
					&& !"".equals(principalView.getEditPersonPanel().getCountry().getText())
					&& !"".equals(principalView.getEditPersonPanel().getTextTelephone().getText())
					&& !"".equals(principalView.getEditPersonPanel().getTextEmail().getText())) {

				String pName = principalView.getEditPersonPanel().getTextName().getText();
				String pLastname = principalView.getEditPersonPanel().getTextLastName().getText();
				String pAge = principalView.getEditPersonPanel().getTextAge().getText();
				String pSex = principalView.getEditPersonPanel().getTextSex().getText();
				String pID = principalView.getEditPersonPanel().getTextId().getText();
				String pCountry = principalView.getEditPersonPanel().getCountry().getText();
				String pTelephone = principalView.getEditPersonPanel().getTextTelephone().getText();
				String pEmail = principalView.getEditPersonPanel().getTextEmail().getText();

				Person person = new Person(pName, pLastname, pAge, pSex, pID, pCountry, pTelephone, pEmail);

				if (!personDAO.editPerson(person, pID)) {
					principalView.getEditPersonPanel().errorMessages(
							"Surgió un error. Puede ser que ya esté registrado el ID. Intenta editar de nuevo a la persona");
				} else {
					principalView.getEditPersonPanel().informationMessages(
							"Felicidades " + pName + " " + pLastname + " ha sido editado con éxito.");
					principalView.getEditPersonPanel().formatSpaces();
				}

			} else {
				JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
				principalView.getEditPersonPanel().formatSpaces();
			}
		} else if (command.equals("RETURNEDITARRAYBUTTON")) {

			principalView.getEditPersonPanel().formatSpaces();
			principalView.getEditPersonPanel().setVisible(false);
			principalView.getMenubar().setVisible(true);
		}

		if (command.equals("SEARCHPERSONARRAY")) {

			principalView.getShowAllPersonPanel().setVisible(true);
			principalView.getMenubar().setVisible(false);
			principalView.getShowAllPersonPanel().getTextAreaShow().setText(personDAO.showAllContact());

		}
		if (command.equals("RETURNSHOWPERSONARRAYBUTTON")) {

			principalView.getShowAllPersonPanel().setVisible(false);
			principalView.getMenubar().setVisible(true);

		}

		if (command.equals("DELETEPERSONARRAY")) {

			String id = "";

			try {
				id = JOptionPane.showInputDialog("Fill in the gap with the ID of the person to delete SQL");
				if (id != null) {

					if (!"".equals(id)) {
						if (!personDAO.deletePerson(id)) {
							principalView.errorMessages(
									"Surgió un error. Puede ser que no exista la ID. Intenta borrar de nuevo a la persona");
						} else {
							principalView.informationMessages(
									"Felicidades la persona con la ID: " + id + " ha sido borrada con éxito.");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Cancelation process ", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}

		// -------------------------------SQL----------------------------------

		if (command.equals("ADDPERSONSQL")) {
			principalView.getAddSQLPersonPanel().setVisible(true);
			principalView.getMenubar().setVisible(false);

		}
		if (command.equals("REGISTERPERSONSQLBUTTON")) {

		
			if (!"".equals(principalView.getAddSQLPersonPanel().getTextName().getText())
					&& !"".equals(principalView.getAddSQLPersonPanel().getTextLastName().getText())
					&& !"".equals(principalView.getAddSQLPersonPanel().getTextAge().getText())
					&& !"".equals(principalView.getAddSQLPersonPanel().getTextSex().getText())
					&& !"".equals(principalView.getAddSQLPersonPanel().getTextId().getText())
					&& !"".equals(principalView.getAddSQLPersonPanel().getCountry().getText())
					&& !"".equals(principalView.getAddSQLPersonPanel().getTextTelephone().getText())
					&& !"".equals(principalView.getAddSQLPersonPanel().getTextEmail().getText())) {
				String pName = principalView.getAddSQLPersonPanel().getTextName().getText();
				String pLastname = principalView.getAddSQLPersonPanel().getTextLastName().getText();
				String pAge = principalView.getAddSQLPersonPanel().getTextAge().getText();
				String pSex = principalView.getAddSQLPersonPanel().getTextSex().getText();
				String pID = principalView.getAddSQLPersonPanel().getTextId().getText();
				String pCountry = principalView.getAddSQLPersonPanel().getTextCountry().getText();
				String pTelephone = principalView.getAddSQLPersonPanel().getTextTelephone().getText();
				String pEmail = principalView.getAddSQLPersonPanel().getTextEmail().getText();

				if (!personSQLDAO.create(pName, pLastname, pAge, pSex, pID, pCountry, pTelephone, pEmail)) {
					principalView.getAddSQLPersonPanel().errorMessages(
							"Surgió un error. Puede ser que ya esté registrado el ID. Intenta agregar de nuevo a la persona");
				} else {
					principalView.getAddSQLPersonPanel().informationMessages(
							"Felicidades " + pName + " " + pLastname + " ha sido registrado con éxito.");
					principalView.getAddSQLPersonPanel().formatSpaces();
				}

			} else {
				JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
				principalView.getAddSQLPersonPanel().formatSpaces();

			}

		} else if (command.equals("RETURNREGISTESQLBUTTON")) {

			principalView.getAddSQLPersonPanel().formatSpaces();
			principalView.getAddSQLPersonPanel().setVisible(false);
			principalView.getJMenuBar().setVisible(true);
		}

		if (command.equals("EDITPERSONSQL")) {

			String id = "";

			try {
				id = JOptionPane.showInputDialog("Fill in the gap with the ID of the person to edit on SQL");

				if (id != null) {

					if (!"".equals(id)) {
						principalView.getEditSQLPersonPanel().getTextId().setText(id);
						principalView.getEditSQLPersonPanel().setVisible(true);
						principalView.getMenubar().setVisible(false);

					} else {
						JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Cancelation process ", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}
		if (command.equals("EDITPERSONSQLBUTTON")) {

			if (!"".equals(principalView.getEditSQLPersonPanel().getTextName().getText())
					&& !"".equals(principalView.getEditSQLPersonPanel().getTextLastName().getText())
					&& !"".equals(principalView.getEditSQLPersonPanel().getTextSex().getText())
					&& !"".equals(principalView.getEditSQLPersonPanel().getTextId().getText())
					&& !"".equals(principalView.getEditSQLPersonPanel().getCountry().getText())
					&& !"".equals(principalView.getEditSQLPersonPanel().getTextTelephone().getText())
					&& !"".equals(principalView.getEditSQLPersonPanel().getTextEmail().getText())) {

				String pName = principalView.getEditSQLPersonPanel().getTextName().getText();
				String pLastname = principalView.getEditSQLPersonPanel().getTextLastName().getText();
				String pEdad = principalView.getEditSQLPersonPanel().getTextAge().getText();
				String pSex = principalView.getEditSQLPersonPanel().getTextSex().getText();
				String pID = principalView.getEditSQLPersonPanel().getTextId().getText();
				String pCountry = principalView.getEditSQLPersonPanel().getTextCountry().getText();
				String pTelephone = principalView.getEditSQLPersonPanel().getTextTelephone().getText();
				String pEmail = principalView.getEditSQLPersonPanel().getTextEmail().getText();

				if (!personSQLDAO.edit(pName, pLastname, pEdad, pSex, pID, pCountry, pTelephone, pEmail)) {
					principalView.getEditSQLPersonPanel().errorMessages(
							"Surgió un error. Puede ser que ya esté registrado el ID. Intenta editar de nuevo a la persona");
				} else {
					principalView.getEditSQLPersonPanel().informationMessages(
							"Felicidades " + pName + " " + pLastname + " ha sido editado con éxito.");
					principalView.getEditSQLPersonPanel().formatSpaces();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
			}

		} else if (command.equals("RETURNEDITSQLBUTTON")) {

			principalView.getEditSQLPersonPanel().formatSpaces();
			principalView.getEditSQLPersonPanel().setVisible(false);
			principalView.getJMenuBar().setVisible(true);

		}

		if (command.equals("DELETEPERSONSQL")) {

			String id = "";

			try {
				id = JOptionPane.showInputDialog("Fill in the gap with the ID of the person to delete SQL");
				if (id != null) {

					if (!"".equals(id)) {
						if (!personSQLDAO.eliminar(id)) {
							principalView.errorMessages(
									"Surgió un error. Puede ser que no exista la ID. Intenta borrar de nuevo a la persona");
						} else {
							principalView.informationMessages(
									"Felicidades la persona con la ID: " + id + " ha sido borrada con éxito.");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Cancelation process ", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}

		if (command.equals("SEARCHPERSONSQL")) {

			personSQLDAO.mostrar();

		}
	}

}
