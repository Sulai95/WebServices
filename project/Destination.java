package edu.webservice.project;

public class Destination {
		private String country;
		private String town;
		private String type;

		public Destination(String country, String town, String type) {
			this.country = country;
			this.town = town;
			this.type = type;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			} else if (obj != null) {
				if (obj instanceof Destination) {
					Destination dest = (Destination) obj;
					if (dest.getCountry() != null && dest.getTown() != null
							&& dest.getType() != null) {
						if (dest.getCountry().equals(country)
								&& dest.getTown().equals(town)
								&& dest.getType().equals(type)) {
							return true;
						}
					}
				}
			}
			return false;
		}

		public String toString() {
			return "La destination se trouve dans ce pays : " + country + ", dans cette ville du pays plus précisément : " + town + ", et c'est une destination de type : "
					+ type + " .";
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getTown() {
			return town;
		}

		public void setTown(String town) {
			this.town = town;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

	

	

}
