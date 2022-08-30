package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import co.edu.unbosque.model.*;

public class Archive {

	public Archive() {

	}

	public ArrayList<Person> readFilePerson(File file) {

		try {
			if (file.exists()) {
				BufferedReader bReader = new BufferedReader(new FileReader(file));
				ArrayList<Person> listOfPerson = new ArrayList<Person>();
				Scanner scanner;
				scanner = new Scanner(file);

				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					Scanner separate = new Scanner(line);
					separate = new Scanner(line);
					separate.useDelimiter("\\s*,\\s*");
					Person c = new Person();

					c.setName(separate.next());
					c.setLastName(separate.next());
					c.setAge(separate.next());
					c.setSex(separate.next());
					c.setId(separate.next());
					c.setTelephone(separate.next());
					c.setEmail(separate.next());

					listOfPerson.add(c);
				}

				bReader.close();
				return listOfPerson;

			} else {
				return null;

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;

		}

	}

	public String writeFilePerson(File file, ArrayList<Person> listOfPerson) {

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			BufferedWriter fWrite = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(file, true), "ISO-8859-1"));

			for (Person person : listOfPerson) {
				try {
					fWrite.write(person.getName() + "," + person.getLastName() + "," + person.getAge() + ","
							+ person.getSex() + "," + person.getId() + "," + person.getCountry() + "," + person.getTelephone() + ","
							+ person.getEmail() + "\n");
				} catch (Exception e) {
					System.out.print("Error in file");
				}
			}
			fWrite.close();
			return "Correctly";
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			return "Error in exception";
		}
	}

	public void deleteArchivePerson() throws IOException {
		String filePath = "data\\people.dat";
		String input = null;
		Scanner sc = new Scanner(new File(filePath));
		FileWriter writer = new FileWriter("data\\people.dat");
		Set set = new HashSet();
		while (sc.hasNextLine()) {
			input = sc.nextLine();
			if (set.add(input)) {
				writer.append(input + "\n");
			}
		}
		writer.flush();
	}

}
