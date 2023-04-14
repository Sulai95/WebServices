package edu.webservice.project;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * In this class, we show 3 ways for iterating an array list. 
 * 1) by for loop 2) by iterator 3) by element index
 */

public class DestinationList implements DestInterface {
		private ArrayList<Destination> dests = new ArrayList<Destination>();

		public void add(Destination dest) throws CountryAlreadyExistsException {
			if (dests.contains(dest)) {
				throw new CountryAlreadyExistsException(dest);
			} else {
				dests.add(dest);
			}
		}

		
		public Destination searchByCountry(String country) throws NoSuchElementException {
			Destination result = null;
			for (Destination dest : dests) {
				if (dest.getCountry().equals(country)) {
					result = dest;
				}
			}
			if (result == null) {
				throw new NoSuchElementException("Destination " + country + " does not exists.");
			} else {
				return result;
			}
		}

		
		public Destination searchByTown(String town) throws NoSuchElementException {
			Destination result = null;
			Iterator<Destination> iterator = dests.iterator();
			while (iterator.hasNext()) {
				Destination dest = iterator.next();
				if (dest.getTown().equals(town)) {
					result = dest;
				}
			}
			if (result == null) {
				throw new NoSuchElementException("Destination " + town + " does not exists.");
			} else {
				return result;
			}
		}

		
		public Destination searchByType(String type) throws NoSuchElementException {
			Destination result = null;
			for (int index = 0; index < destCount(); index++) {
				Destination dest = dests.get(index);
				if (dest.getType().equals(type)) {
					result = dest;
				}
			}
			if (result == null) {
				throw new NoSuchElementException("Destination " + type + " does not exists.");
			} else {
				return result;
			}
		}

		
		public void remove(Destination dest) {
			// This works because equals has been redefined (override) in Destination class.
			dests.remove(dest);
		}

		
		public int destCount() {
			return dests.size();
		}

		public boolean contains(Destination dest) {
			return dests.contains(dest);
		}


		@Override
		public String toString() {
			return "DestinationList [dests=" + dests + "]";
		}
		
	

}
