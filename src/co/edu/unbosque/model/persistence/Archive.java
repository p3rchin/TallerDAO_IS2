package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import co.edu.unbosque.model.*;

public class Archive {

	private ObjectInputStream input;
	private ObjectOutputStream output;

	public Archive() {

	}

	public Archive(File file) {

		if (file.exists()) {

		} else {
			try {
				file.createNewFile();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Person> readFilePerson(File file) {

		ArrayList<Person> alPerson = new ArrayList<Person>();
		if (file.length() != 0) {

			try {

				input = new ObjectInputStream(new FileInputStream(file));
				alPerson = (ArrayList<Person>) input.readObject();

			} catch (FileNotFoundException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
		}

		return alPerson;
	}

	public void writeFilePerson(File file, ArrayList<Person> alPerson) {
		try {
			output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(alPerson);
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
