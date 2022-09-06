package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.*;
import java.io.*;
import co.edu.unbosque.model.Person;

public class PersonFileDAO {

	private Archive archive;

	public PersonFileDAO(Archive archive) {
		this.archive = archive;

	}

	public Person searchPerson(String pID, ArrayList<Person> alPerson) {

		Person founded = null;

		if (!alPerson.isEmpty()) {

			for (int i = 0; i < alPerson.size(); i++) {

				if (alPerson.get(i).getId().equals(pID)) {

					founded = alPerson.get(i);
				}
			}
		}

		return founded;
	}

	public boolean addPerson(Person person, ArrayList<Person> alPerson, File file) {
		if (searchPerson(person.getId(), alPerson) == null) {
			alPerson.add(person);
			archive.writeFilePerson(file, alPerson);
			return true;
		} else {
			return false;
		}
	}

	public boolean deletePerson(String pID, ArrayList<Person> alPerson, File file) {
		boolean verificate = false;
		try {

			if (searchPerson(pID, alPerson) == null) {

				alPerson.remove(searchPerson(pID, alPerson));
				file.delete();
				file.createNewFile();
				archive.writeFilePerson(file, alPerson);
				verificate = true;
			} else {

				verificate = false;
			}
			return verificate;

		} catch (Exception e) {

		}
		return verificate;
	}

	public boolean editPerson(Person person, ArrayList<Person> alPerson, File file) {

		boolean founded = false;

		for (int i = 0; i < alPerson.size(); i++) {

			if (alPerson.get(i).getId().equals(person.getId())) {

				alPerson.get(i).setName(person.getName());
				alPerson.get(i).setLastName(person.getLastName());
				alPerson.get(i).setAge(person.getAge());
				alPerson.get(i).setSex(person.getSex());
				alPerson.get(i).setId(person.getId());
				alPerson.get(i).setCountry(person.getCountry());
				alPerson.get(i).setTelephone(person.getTelephone());
				alPerson.get(i).setEmail(person.getEmail());

				file.delete();
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				archive.writeFilePerson(file, alPerson);
				founded = true;
				break;
			} else {
				founded = false;
			}

		}
		return founded;
	}

	
	
}
