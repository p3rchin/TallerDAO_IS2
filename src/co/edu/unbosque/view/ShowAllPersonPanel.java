package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ShowAllPersonPanel extends JPanel {
	private JLabel title;
	private JTextArea textAreaShow;
	private JScrollPane scrollPane;
	private JButton returnButton;

	public ShowAllPersonPanel() {

		setSize(800, 500);
		setBackground(new Color(252, 244, 132));
		setVisible(false);
		setLayout(null);
		initialize();

	}

	public void initialize() {

		title = new JLabel("Show all people");
		title.setBounds(300, 10, 400, 50);
		title.setFont(new Font("Arial", Font.CENTER_BASELINE, 22));
		add(title);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 765, 350);
		add(scrollPane);

		textAreaShow = new JTextArea();
		textAreaShow.setEditable(false);
		textAreaShow.setBackground(new Color(252, 244, 132));
		textAreaShow.setFont(new Font("Verdama", Font.ROMAN_BASELINE, 12));
		textAreaShow.setLineWrap(true);
		scrollPane.setViewportView(textAreaShow);
		
		returnButton = new JButton(" ← Home");
		returnButton.setBounds(20, 20, 100, 30);
		returnButton.setFont(new Font("Arial", Font.PLAIN, 12));
		returnButton.setActionCommand("RETURNSHOWPERSONARRAYBUTTON");
		add(returnButton);

	}

	public JLabel getTitle() {
		return title;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JTextArea getTextAreaShow() {
		return textAreaShow;
	}

	public void setTextAreaShow(JTextArea textAreaShow) {
		this.textAreaShow = textAreaShow;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JButton getReturnButton() {
		return returnButton;
	}

	public void setReturnButton(JButton returnButton) {
		this.returnButton = returnButton;
	}
}
