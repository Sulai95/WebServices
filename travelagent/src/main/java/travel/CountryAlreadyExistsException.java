package travel;

public class CountryAlreadyExistsException  extends Exception {
	public CountryAlreadyExistsException(Destination dest) {
		super("Destination exists : " + dest.toString());
	}
}
