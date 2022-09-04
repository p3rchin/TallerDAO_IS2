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

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();

		if (command.equals("ADDPERSONARRAY")) {

			principalView.getAddPersonPanel().setVisible(true);
			principalView.getMenubar().setVisible(false);

		}

		if (command.equals("REGISTERPERSONBUTTON")) {

			if (!"".equals(principalView.getAddPersonPanel().getTextName().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextLastName().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextSex().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextId().getText())
					&& !"".equals(principalView.getAddPersonPanel().getCountry().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextTelephone().getText())
					&& !"".equals(principalView.getAddPersonPanel().getTextEmail().getText())) {
				
				principalView.getAddPersonPanel().formatSpaces();
			} else {
				JOptionPane.showMessageDialog(null, "Required fields", "Error", JOptionPane.ERROR_MESSAGE);
				principalView.getAddPersonPanel().formatSpaces();
			}

		}
	}

}
