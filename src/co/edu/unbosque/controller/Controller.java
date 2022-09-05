package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.PrincipalView;

public class Controller implements ActionListener {

	private PrincipalView principalView;

	public Controller() {

		principalView = new PrincipalView();
		assignListeners();

	}

	public void assignListeners() {

		principalView.getAddPersonArray().addActionListener(this);
		principalView.getAddPersonPanel().getAddButton().addActionListener(this);
		principalView.getAddPersonPanel().getReturnButton().addActionListener(this);
		principalView.getEditPersonArray().addActionListener(this);
		principalView.getEditPersonPanel().getEditButton().addActionListener(this);
		principalView.getEditPersonPanel().getReturnButton().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();

		if (command.equals("ADDPERSONARRAY")) {

			principalView.getAddPersonPanel().setVisible(true);
			principalView.getMenubar().setVisible(false);

		}

		if (command.equals("REGISTERPERSONARRAYBUTTON")) {

			if (!"".equals(principalView.getAddPersonPanel().getTextName().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextLastName().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextSex().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextId().getText())
					&& !"".equals(principalView.getAddPersonPanel().getCountry().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextTelephone().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextEmail().getText())) {

				String pName = principalView.getAddPersonPanel().getTextName().getText();
				String pLastname = principalView.getAddPersonPanel().getTextLastName().getText();
				String pSex = principalView.getAddPersonPanel().getTextSex().getText();
				String pID = principalView.getAddPersonPanel().getTextId().getText();
				String pCountry = principalView.getAddPersonPanel().getCountry().getText();
				String pTelephone = principalView.getAddPersonPanel().getTextTelephone().getText();
				String pEmail = principalView.getAddPersonPanel().getTextEmail().getText();

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

			String messageEditCloseFriend = "";

			try {
				messageEditCloseFriend = JOptionPane
						.showInputDialog("Fill in the gap with the ID of the person to edit");

				principalView.getEditPersonPanel().getTextId().setText(messageEditCloseFriend);
				principalView.getEditPersonPanel().setVisible(true);
				principalView.getMenubar().setVisible(false);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Cancelation process ", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}

		if (command.equals("EDITPERSONARRAYBUTTON")) {

			if (!"".equals(principalView.getEditPersonPanel().getTextName().getText())
					&& !"".equals(principalView.getEditPersonPanel().getTextLastName().getText())
					&& !"".equals(principalView.getEditPersonPanel().getTextSex().getText())
					&& !"".equals(principalView.getEditPersonPanel().getCountry().getText())
					&& !"".equals(principalView.getEditPersonPanel().getTextTelephone().getText())
					&& !"".equals(principalView.getEditPersonPanel().getTextEmail().getText())) {

			} else {
				JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
				principalView.getEditPersonPanel().formatSpaces();
			}
		} else if (command.equals("RETURNEDITARRAYBUTTON")) {
			
			principalView.getEditPersonPanel().formatSpaces();
			principalView.getEditPersonPanel().setVisible(false);
			principalView.getMenubar().setVisible(true);
		}
	}

}
