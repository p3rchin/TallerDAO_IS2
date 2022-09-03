package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.*;

public class PrincipalView extends JFrame {

	private JMenuBar menubar;
	private JMenu options;
	private JMenuItem addPerson, editPerson, deletePerson, searchPerson, exit;

	public PrincipalView() {

		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(244, 196, 196));

		initializeComponents();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void initializeComponents() {

		menubar = new JMenuBar();
		getContentPane().add(menubar);
		setJMenuBar(menubar);

		options = new JMenu("Options");
		options.setMnemonic('O');
		menubar.add(options);

		addPerson = new JMenuItem("Add a person");
		addPerson.setActionCommand("ADDPERSON");
		options.add(addPerson);

		editPerson = new JMenuItem("Edit a person");
		editPerson.setActionCommand("EDITPERSON");
		options.add(editPerson);

		deletePerson = new JMenuItem("Delete a person");
		deletePerson.setActionCommand("DELETEPERSON");
		options.add(deletePerson);

		searchPerson = new JMenuItem("Search a person");
		searchPerson.setActionCommand("SEARCHPERSON");
		options.add(searchPerson);

		exit = new JMenuItem("Exit");
		exit.setActionCommand("EXIT");
		options.add(exit);
	}

	public JMenuBar getMenubar() {
		return menubar;
	}

	public void setMenubar(JMenuBar menubar) {
		this.menubar = menubar;
	}

	public JMenu getOptions() {
		return options;
	}

	public void setOptions(JMenu options) {
		this.options = options;
	}

	public JMenuItem getAddPerson() {
		return addPerson;
	}

	public void setAddPerson(JMenuItem addPerson) {
		this.addPerson = addPerson;
	}

	public JMenuItem getEditPerson() {
		return editPerson;
	}

	public void setEditPerson(JMenuItem editPerson) {
		this.editPerson = editPerson;
	}

	public JMenuItem getDeletePerson() {
		return deletePerson;
	}

	public void setDeletePerson(JMenuItem deletePerson) {
		this.deletePerson = deletePerson;
	}

	public JMenuItem getSearchPerson() {
		return searchPerson;
	}

	public void setSearchPerson(JMenuItem searchPerson) {
		this.searchPerson = searchPerson;
	}

	public JMenuItem getExit() {
		return exit;
	}

	public void setExit(JMenuItem exit) {
		this.exit = exit;
	}
}