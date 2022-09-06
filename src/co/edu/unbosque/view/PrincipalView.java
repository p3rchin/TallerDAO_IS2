package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.*;

public class PrincipalView extends JFrame {

	private AddPersonPanel addPersonPanel;
	private EditPersonPanel editPersonPanel;
	private AddSQLPersonPanel addSQLPersonPanel;
	private EditSQLPersonPanel editSQLPersonPanel;
	private ShowAllPersonPanel showAllPersonPanel;
	private JMenuBar menubar;
	private JMenu options, array, binary, sql, noSql;
	private JMenuItem addPersonArray, editPersonArray, deletePersonArray, searchPersonArray, addPersonBinary,
			editPersonBinary, deletePersonBinary, searchPersonBinary, addPersonSQL, editPersonSQL, deletePersonSQL,
			searchPersonSQL, addPersonNoSQL, editPersonNoSQL, deletePersonNoSQL, searchPersonNoSQL, exit;

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

		addPersonPanel = new AddPersonPanel();
		getContentPane().add(addPersonPanel);

		editPersonPanel = new EditPersonPanel();
		getContentPane().add(editPersonPanel);

		addSQLPersonPanel = new AddSQLPersonPanel();
		getContentPane().add(addSQLPersonPanel);

		editSQLPersonPanel = new EditSQLPersonPanel();
		getContentPane().add(editSQLPersonPanel);

		showAllPersonPanel = new ShowAllPersonPanel();
		getContentPane().add(showAllPersonPanel);

		menubar = new JMenuBar();
		getContentPane().add(menubar);
		setJMenuBar(menubar);

		options = new JMenu("Options");
		options.setMnemonic('O');
		menubar.add(options);

		array = new JMenu("ArrayList");
		array.setMnemonic('A');
		options.add(array);

		binary = new JMenu("Binary file");
		binary.setMnemonic('B');
		options.add(binary);

		sql = new JMenu("SQL");
		sql.setMnemonic('S');
		options.add(sql);

		noSql = new JMenu("NoSQL");
		noSql.setMnemonic('N');
		options.add(noSql);

		addPersonArray = new JMenuItem("Add a person");
		addPersonArray.setActionCommand("ADDPERSONARRAY");
		array.add(addPersonArray);

		editPersonArray = new JMenuItem("Edit a person");
		editPersonArray.setActionCommand("EDITPERSONARRAY");
		array.add(editPersonArray);

		deletePersonArray = new JMenuItem("Delete a person");
		deletePersonArray.setActionCommand("DELETEPERSONARRAY");
		array.add(deletePersonArray);

		searchPersonArray = new JMenuItem("Search a person");
		searchPersonArray.setActionCommand("SEARCHPERSONARRAY");
		array.add(searchPersonArray);

		addPersonBinary = new JMenuItem("Add a person");
		addPersonBinary.setActionCommand("ADDPERSONBINARY");
		binary.add(addPersonBinary);

		editPersonBinary = new JMenuItem("Edit a person");
		editPersonBinary.setActionCommand("EDITPERSONBINARY");
		binary.add(editPersonBinary);

		deletePersonBinary = new JMenuItem("Delete a person");
		deletePersonBinary.setActionCommand("DELETEPERSONBINARY");
		binary.add(deletePersonBinary);

		searchPersonBinary = new JMenuItem("Search a person");
		searchPersonBinary.setActionCommand("SEARCHPERSONBINARY");
		binary.add(searchPersonBinary);

		addPersonSQL = new JMenuItem("Add a person");
		addPersonSQL.setActionCommand("ADDPERSONSQL");
		sql.add(addPersonSQL);

		editPersonSQL = new JMenuItem("Edit a person");
		editPersonSQL.setActionCommand("EDITPERSONSQL");
		sql.add(editPersonSQL);

		deletePersonSQL = new JMenuItem("Delete a person");
		deletePersonSQL.setActionCommand("DELETEPERSONSQL");
		sql.add(deletePersonSQL);

		searchPersonSQL = new JMenuItem("Search a person");
		searchPersonSQL.setActionCommand("SEARCHPERSONSQL");
		sql.add(searchPersonSQL);

		addPersonNoSQL = new JMenuItem("Add a person");
		addPersonNoSQL.setActionCommand("ADDPERSONNOSQL");
		noSql.add(addPersonNoSQL);

		editPersonNoSQL = new JMenuItem("Edit a person");
		editPersonNoSQL.setActionCommand("EDITPERSONNOSQL");
		noSql.add(editPersonNoSQL);

		deletePersonNoSQL = new JMenuItem("Delete a person");
		deletePersonNoSQL.setActionCommand("DELETEPERSONNOSQL");
		noSql.add(deletePersonNoSQL);

		searchPersonNoSQL = new JMenuItem("Search a person");
		searchPersonNoSQL.setActionCommand("SEARCHPERSONNOSQL");
		noSql.add(searchPersonNoSQL);

		exit = new JMenuItem("Exit");
		exit.setActionCommand("EXIT");
		options.add(exit);
	}

	public void warningMessages(String message) {
		JOptionPane.showMessageDialog(null, message, "Advertencia", JOptionPane.WARNING_MESSAGE);
	}

	public void errorMessages(String message) {
		JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void informationMessages(String message) {
		JOptionPane.showMessageDialog(null, message, "Información", JOptionPane.INFORMATION_MESSAGE);
	}

	public AddPersonPanel getAddPersonPanel() {
		return addPersonPanel;
	}

	public void setAddPersonPanel(AddPersonPanel addPersonPanel) {
		this.addPersonPanel = addPersonPanel;
	}

	public EditPersonPanel getEditPersonPanel() {
		return editPersonPanel;
	}

	public void setEditPersonPanel(EditPersonPanel editPersonPanel) {
		this.editPersonPanel = editPersonPanel;
	}

	public AddSQLPersonPanel getAddSQLPersonPanel() {
		return addSQLPersonPanel;
	}

	public void setAddSQLPersonPanel(AddSQLPersonPanel addSQLPersonPanel) {
		this.addSQLPersonPanel = addSQLPersonPanel;
	}

	public EditSQLPersonPanel getEditSQLPersonPanel() {
		return editSQLPersonPanel;
	}

	public void setEditSQLPersonPanel(EditSQLPersonPanel editSQLPersonPanel) {
		this.editSQLPersonPanel = editSQLPersonPanel;
	}

	public ShowAllPersonPanel getShowAllPersonPanel() {
		return showAllPersonPanel;
	}

	public void setShowAllPersonPanel(ShowAllPersonPanel showAllPersonPanel) {
		this.showAllPersonPanel = showAllPersonPanel;
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

	public JMenu getArray() {
		return array;
	}

	public void setArray(JMenu array) {
		this.array = array;
	}

	public JMenu getBinary() {
		return binary;
	}

	public void setBinary(JMenu binary) {
		this.binary = binary;
	}

	public JMenu getSql() {
		return sql;
	}

	public void setSql(JMenu sql) {
		this.sql = sql;
	}

	public JMenu getNoSql() {
		return noSql;
	}

	public void setNoSql(JMenu noSql) {
		this.noSql = noSql;
	}

	public JMenuItem getAddPersonArray() {
		return addPersonArray;
	}

	public void setAddPersonArray(JMenuItem addPersonArray) {
		this.addPersonArray = addPersonArray;
	}

	public JMenuItem getEditPersonArray() {
		return editPersonArray;
	}

	public void setEditPersonArray(JMenuItem editPersonArray) {
		this.editPersonArray = editPersonArray;
	}

	public JMenuItem getDeletePersonArray() {
		return deletePersonArray;
	}

	public void setDeletePersonArray(JMenuItem deletePersonArray) {
		this.deletePersonArray = deletePersonArray;
	}

	public JMenuItem getSearchPersonArray() {
		return searchPersonArray;
	}

	public void setSearchPersonArray(JMenuItem searchPersonArray) {
		this.searchPersonArray = searchPersonArray;
	}

	public JMenuItem getAddPersonBinary() {
		return addPersonBinary;
	}

	public void setAddPersonBinary(JMenuItem addPersonBinary) {
		this.addPersonBinary = addPersonBinary;
	}

	public JMenuItem getEditPersonBinary() {
		return editPersonBinary;
	}

	public void setEditPersonBinary(JMenuItem editPersonBinary) {
		this.editPersonBinary = editPersonBinary;
	}

	public JMenuItem getDeletePersonBinary() {
		return deletePersonBinary;
	}

	public void setDeletePersonBinary(JMenuItem deletePersonBinary) {
		this.deletePersonBinary = deletePersonBinary;
	}

	public JMenuItem getSearchPersonBinary() {
		return searchPersonBinary;
	}

	public void setSearchPersonBinary(JMenuItem searchPersonBinary) {
		this.searchPersonBinary = searchPersonBinary;
	}

	public JMenuItem getAddPersonSQL() {
		return addPersonSQL;
	}

	public void setAddPersonSQL(JMenuItem addPersonSQL) {
		this.addPersonSQL = addPersonSQL;
	}

	public JMenuItem getEditPersonSQL() {
		return editPersonSQL;
	}

	public void setEditPersonSQL(JMenuItem editPersonSQL) {
		this.editPersonSQL = editPersonSQL;
	}

	public JMenuItem getDeletePersonSQL() {
		return deletePersonSQL;
	}

	public void setDeletePersonSQL(JMenuItem deletePersonSQL) {
		this.deletePersonSQL = deletePersonSQL;
	}

	public JMenuItem getSearchPersonSQL() {
		return searchPersonSQL;
	}

	public void setSearchPersonSQL(JMenuItem searchPersonSQL) {
		this.searchPersonSQL = searchPersonSQL;
	}

	public JMenuItem getAddPersonNoSQL() {
		return addPersonNoSQL;
	}

	public void setAddPersonNoSQL(JMenuItem addPersonNoSQL) {
		this.addPersonNoSQL = addPersonNoSQL;
	}

	public JMenuItem getEditPersonNoSQL() {
		return editPersonNoSQL;
	}

	public void setEditPersonNoSQL(JMenuItem editPersonNoSQL) {
		this.editPersonNoSQL = editPersonNoSQL;
	}

	public JMenuItem getDeletePersonNoSQL() {
		return deletePersonNoSQL;
	}

	public void setDeletePersonNoSQL(JMenuItem deletePersonNoSQL) {
		this.deletePersonNoSQL = deletePersonNoSQL;
	}

	public JMenuItem getSearchPersonNoSQL() {
		return searchPersonNoSQL;
	}

	public void setSearchPersonNoSQL(JMenuItem searchPersonNoSQL) {
		this.searchPersonNoSQL = searchPersonNoSQL;
	}

	public JMenuItem getExit() {
		return exit;
	}

	public void setExit(JMenuItem exit) {
		this.exit = exit;
	}
}