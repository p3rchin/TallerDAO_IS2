package co.edu.unbosque.view;

import javax.swing.*;

public class PrincipalView {

	JMenu menu, lista, binario, sql, nsql;
	JMenuItem l1, l2, l3, l4, b1, b2, b3, b4, s1, s2, s3, s4, n1, n2, n3, n4;

	public PrincipalView() {
		JFrame f = new JFrame("Menu and MenuItem Example");
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Menu");
		
		lista = new JMenu("Lista");
		binario = new JMenu("Binario");
		sql = new JMenu("SQL");
		nsql = new JMenu("NOSQL");
		
		l1 = new JMenuItem("Crear");
		l2 = new JMenuItem("Borrar");
		l3 = new JMenuItem("Editar");
		l4 = new JMenuItem("Consultar");
		
		b1 = new JMenuItem("Crear");
		b2 = new JMenuItem("Borrar");
		b3 = new JMenuItem("Editar");
		b4 = new JMenuItem("Consultar");
		
		s1 = new JMenuItem("Crear");
		s2 = new JMenuItem("Borrar");
		s3 = new JMenuItem("Editar");
		s4 = new JMenuItem("Consultar");
		
		n1 = new JMenuItem("Crear");
		n2 = new JMenuItem("Borrar");
		n3 = new JMenuItem("Editar");
		n4 = new JMenuItem("Consultar");
		
		lista.add(l1);
		lista.add(l2);
		lista.add(l3);
		lista.add(l4);
		
		binario.add(b1);
		binario.add(b2);
		binario.add(b3);
		binario.add(b4);
		
		sql.add(s1);
		sql.add(s2);
		sql.add(s3);
		sql.add(s4);
		
		nsql.add(n1);
		nsql.add(n2);
		nsql.add(n3);
		nsql.add(n4);
		
		menu.add(lista);
		menu.add(binario);
		menu.add(sql);
		menu.add(nsql);
		
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
