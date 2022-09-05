package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddSQLPersonPanel extends JPanel {

	private JLabel title, labelName, lastname, age, sex, id, country, telephone, email;
	private JTextField textName, textLastName, textAge, textSex, textId, textCountry, textTelephone, textEmail;
	private JButton addButton, returnButton;

	public AddSQLPersonPanel() {

		setSize(800, 500);
		setBackground(new Color(252, 244, 132));
		setVisible(false);
		setLayout(null);
		initialize();
	}

	public void initialize() {

		title = new JLabel("Add person SQL");
		title.setBounds(335, 40, 400, 50);
		title.setFont(new Font("Arial", Font.CENTER_BASELINE, 22));
		add(title);

		labelName = new JLabel("Name: ");
		labelName.setBounds(225, 120, 250, 20);
		labelName.setFont(new Font("Arial", Font.BOLD, 15));
		labelName.setForeground(Color.black);
		add(labelName);

		textName = new JTextField();
		textName.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		textName.setBounds(320, 120, 200, 20);
		add(textName);

		lastname = new JLabel("Lastname: ");
		lastname.setBounds(225, 150, 250, 20);
		lastname.setFont(new Font("Arial", Font.BOLD, 15));
		lastname.setForeground(Color.black);
		add(lastname);

		textLastName = new JTextField();
		textLastName.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		textLastName.setBounds(320, 150, 200, 20);
		add(textLastName);

		age = new JLabel("Age: ");
		age.setBounds(225, 180, 250, 20);
		age.setFont(new Font("Arial", Font.BOLD, 15));
		age.setForeground(Color.black);
		add(age);

		textAge = new JTextField();
		textAge.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		textAge.setBounds(320, 180, 200, 20);
		add(textAge);

		sex = new JLabel("Sex: ");
		sex.setBounds(225, 210, 250, 20);
		sex.setFont(new Font("Arial", Font.BOLD, 15));
		sex.setForeground(Color.black);
		add(sex);

		textSex = new JTextField();
		textSex.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		textSex.setBounds(320, 210, 200, 20);
		add(textSex);

		id = new JLabel("ID: ");
		id.setBounds(225, 240, 250, 20);
		id.setFont(new Font("Arial", Font.BOLD, 15));
		id.setForeground(Color.black);
		add(id);

		textId = new JTextField();
		textId.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		textId.setBounds(320, 240, 200, 20);
		add(textId);

		country = new JLabel("Country: ");
		country.setBounds(225, 270, 250, 20);
		country.setFont(new Font("Arial", Font.BOLD, 15));
		country.setForeground(Color.black);
		add(country);

		textCountry = new JTextField();
		textCountry.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		textCountry.setBounds(320, 270, 200, 20);
		add(textCountry);

		telephone = new JLabel("Telephone: ");
		telephone.setBounds(225, 300, 250, 20);
		telephone.setFont(new Font("Arial", Font.BOLD, 15));
		telephone.setForeground(Color.black);
		add(telephone);

		textTelephone = new JTextField();
		textTelephone.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		textTelephone.setBounds(320, 300, 200, 20);
		add(textTelephone);

		email = new JLabel("E-mail: ");
		email.setBounds(225, 330, 250, 20);
		email.setFont(new Font("Arial", Font.BOLD, 15));
		email.setForeground(Color.black);
		add(email);

		textEmail = new JTextField();
		textEmail.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		textEmail.setBounds(320, 330, 200, 20);
		add(textEmail);

		addButton = new JButton("Register");
		addButton.setBounds(335, 370, 150, 35);
		addButton.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		addButton.setActionCommand("REGISTERPERSONSQLBUTTON");
		add(addButton);

		returnButton = new JButton(" ← Home");
		returnButton.setBounds(20, 20, 100, 30);
		returnButton.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		returnButton.setActionCommand("RETURNREGISTESQLBUTTON");
		add(returnButton);
	}

	public void formatSpaces() {

		textName.setText("");
		textLastName.setText("");
		textAge.setText("");
		textSex.setText("");
		textId.setText("");
		textCountry.setText("");
		textTelephone.setText("");
		textEmail.setText("");
	}

	public JLabel getTitle() {
		return title;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JLabel getLabelName() {
		return labelName;
	}

	public void setLabelName(JLabel labelName) {
		this.labelName = labelName;
	}

	public JLabel getLastname() {
		return lastname;
	}

	public void setLastname(JLabel lastname) {
		this.lastname = lastname;
	}

	public JLabel getAge() {
		return age;
	}

	public void setAge(JLabel age) {
		this.age = age;
	}

	public JLabel getSex() {
		return sex;
	}

	public void setSex(JLabel sex) {
		this.sex = sex;
	}

	public JLabel getId() {
		return id;
	}

	public void setId(JLabel id) {
		this.id = id;
	}

	public JLabel getCountry() {
		return country;
	}

	public void setCountry(JLabel country) {
		this.country = country;
	}

	public JLabel getTelephone() {
		return telephone;
	}

	public void setTelephone(JLabel telephone) {
		this.telephone = telephone;
	}

	public JLabel getEmail() {
		return email;
	}

	public void setEmail(JLabel email) {
		this.email = email;
	}

	public JTextField getTextName() {
		return textName;
	}

	public void setTextName(JTextField textName) {
		this.textName = textName;
	}

	public JTextField getTextLastName() {
		return textLastName;
	}

	public void setTextLastName(JTextField textLastName) {
		this.textLastName = textLastName;
	}

	public JTextField getTextAge() {
		return textAge;
	}

	public void setTextAge(JTextField textAge) {
		this.textAge = textAge;
	}

	public JTextField getTextSex() {
		return textSex;
	}

	public void setTextSex(JTextField textSex) {
		this.textSex = textSex;
	}

	public JTextField getTextId() {
		return textId;
	}

	public void setTextId(JTextField textId) {
		this.textId = textId;
	}

	public JTextField getTextCountry() {
		return textCountry;
	}

	public void setTextCountry(JTextField textCountry) {
		this.textCountry = textCountry;
	}

	public JTextField getTextTelephone() {
		return textTelephone;
	}

	public void setTextTelephone(JTextField textTelephone) {
		this.textTelephone = textTelephone;
	}

	public JTextField getTextEmail() {
		return textEmail;
	}

	public void setTextEmail(JTextField textEmail) {
		this.textEmail = textEmail;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}

	public JButton getReturnButton() {
		return returnButton;
	}

	public void setReturnButton(JButton returnButton) {
		this.returnButton = returnButton;
	}
}
