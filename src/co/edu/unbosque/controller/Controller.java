package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.PrincipalView;

public class Controller implements ActionListener {

	private PrincipalView principalView;

	public Controller() {

		principalView = new PrincipalView();
		assignListeners();

	}

	public void assignListeners() {

		principalView.getAddPersonArray().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();

		if (command.equals("ADDPERSONARRAY")) {

			principalView.getAddPersonPanel().setVisible(true);
			

		}
	}

}
