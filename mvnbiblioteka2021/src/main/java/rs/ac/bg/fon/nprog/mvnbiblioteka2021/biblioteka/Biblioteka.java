package rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka;

import java.util.LinkedList;

public class Biblioteka implements rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.interfejs.BibliotekaInterface {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		
		if(knjiga==null || knjige.contains(knjiga))
			throw new RuntimeException("Knjiga ne sme biti null i duplikat.");
		
		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		
		if(knjiga==null || !knjige.contains(knjiga))
			throw new RuntimeException("Knjiga ne postoji ili je null.");
		
		knjige.remove(knjiga);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		
		if(autor==null && isbn==null && naslov==null && izdavac==null)
			throw new RuntimeException("Morate uneti bar jedan kriterijum pretrage.");
		
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		
		for(Knjiga knjiga: knjige)
			if(knjiga.getNaslov().contains(naslov))
				rezultat.add(knjiga);
		
		return rezultat;
	}

}
