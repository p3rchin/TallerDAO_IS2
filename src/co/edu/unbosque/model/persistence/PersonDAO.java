package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.Person;

public class PersonDAO {

	ArrayList<Person> alPerson = new ArrayList<Person>();

	public boolean searchPerson(String id) {
		for (int i = 0; i < alPerson.size(); i++) {
			if (id.equals(alPerson.get(i).getId())) {
				return true;
			}
		}
		return false;
	}

	public boolean addPerson(Person person, String id) {

		if (searchPerson(id) == false) {
			alPerson.add(person);
			return true;
		} else {

			return false;

		}
	}

	public boolean editPerson(Person person, String id) {

		for (int i = 0; i < alPerson.size(); i++) {
			if (id.equals(alPerson.get(i).getId())) {

				alPerson.get(i).setName(person.getName());
				alPerson.get(i).setLastName(person.getLastName());
				alPerson.get(i).setAge(person.getAge());
				alPerson.get(i).setSex(person.getSex());
				alPerson.get(i).setCountry(person.getCountry());
				alPerson.get(i).setTelephone(person.getTelephone());
				alPerson.get(i).setEmail(person.getEmail());

				return true;

			}
		}
		return false;
	}

	public boolean deletePerson(String id) {

		for (int i = 0; i < alPerson.size(); i++) {
			if (id.equals(alPerson.get(i).getId())) {

				alPerson.remove(i);
				return true;
			}
		}
		return false;
	}
}
