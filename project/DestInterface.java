package edu.webservice.project;
import java.util.NoSuchElementException;

public interface DestInterface {


	public interface PhonebookInterface {
		void add(Destination dest) throws CountryAlreadyExistsException;

		Destination searchByCountry(String country) throws NoSuchElementException;

		Destination searchByTown(String town) throws NoSuchElementException;

		Destination searchByType(String type) throws NoSuchElementException;
		
		boolean contains(Destination dest);

		void remove(Destination dest);

		int destCount();
	}

}
