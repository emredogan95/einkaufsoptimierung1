package Projekt1;

import java.util.ArrayList;

public class Geschaeft {
	public String name;
	public ArrayList<Artikel> liste = new ArrayList<Artikel>();
	
	Geschaeft(ArrayList<Artikel> liste1, String name){
		liste=liste1;
		this.name=name;
	}
	
	public void set_preis(double preis,int index){
		
		liste.get(index).preis = preis;
	}

}
