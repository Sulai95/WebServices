package edu.webservice.project;

public class CountryAlreadyExistsException  extends Exception {
	public CountryAlreadyExistsException(Destination dest) {
		super("Destination exists : " + dest.toString());
	}
}
