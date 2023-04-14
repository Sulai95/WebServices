package travelagentREST.management.service;

import javax.jms.Destination;

public class CountryAlreadyExistsException  extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CountryAlreadyExistsException(Destination dest) {
		super("Destination exists : " + dest.toString());
	}
}
