package edu.webservice.project;

import java.util.Scanner;

public class Travel {
	public static void main(String[] args) throws CountryAlreadyExistsException {
		DestinationList dl = new DestinationList();
		Scanner sc = new Scanner(System.in);
		int a = 2;
		do{
			System.out.println("Hello, si vous souhaitez ajouter une destination, saisissez A \n"
		
				+ "si vous souhaitez rechercher un type de destination, saisissez T \n"
				+ "Sinon si vous souhaitez afficher toutes les destinations présentes, saisissez L \n");
		
		String name = sc.nextLine();
		switch(name){
		case "A":
			System.out.println("Voici ce que vous avez saisi : "+name);
			
			System.out.println("Vous pouvez saisir un nom de pays : ");
			
			String c = sc.nextLine();
			System.out.println("Vous pouvez saisir un nom de ville : ");

			String t = sc.nextLine();
			System.out.println("Vous pouvez saisir le type de destination de la ville choisie"
					+ " : ");

			String ty = sc.nextLine();
			Destination D= new Destination(c, t, ty);
			dl.add(D);
			
			System.out.println(D.toString());
			break;
		case "T":
			System.out.println("Voici ce que vous avez saisi : "+name+" \n");
			System.out.println("Vous pouvez choisir parmi ces différents types de destination : 'Voyage de noce',"
					+ " 'Tourisme culturel',"
					+ " 'Playa et fiesta',"
					+ "et 'En famille'"
					);
			System.out.println("Saisissez le ttype de destination que vous voulez parmi ces quatres là : \n");
			String d = sc.nextLine();
			System.out.println(dl.searchByType(d)); 

			
			break;
		case "L":
			System.out.println("Voici ce que vous avez saisi : "+name);
			System.out.println(dl.toString()); 
			break;
		}
	}while(a!=0);
}
}
