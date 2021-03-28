package rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka;



/**
 * Klasa koja predstavlja autora knjige.
 * 
 * Autor ima ime i prezime kao String vrednosti.
 * 
 * @author Bojan Tomic
 * @version 0.1
 *
 */
public class Autor {
	
	/**
	 * Ime autora kao String.
	 */
	private String ime;
	
	/**
	 * Prezime autora kao String.
	 */
	private String prezime;
	
	/**
	 * Konstruktor koji incijalizuje objekat i nista vise.
	 */
	public Autor() {
		super();
	}

	/**
	 * Konstruktor koji inicijalizuje objekat i postavlja vrednosti za ime i prezime autora.
	 * 
	 * @param ime Ime autora kao String.
	 * @param prezime Prezime autora kao String.
	 */
	public Autor(String ime, String prezime) {
		super();
		setIme(ime);
		setPrezime(prezime);
	}

	/**
	 * Vraca ime autora.
	 * 
	 * @return Ime autora kao String.
	 */
	public String getIme() {
		return ime;
	}
	
	/**
	 * Postavlja ime autora na novu vrednost.
	 * 
	 * @param ime ime autora kao String
	 * 
	 * @throws java.lang.NullPointerException ako je uneto ime null
	 * @throws java.lang.RuntimeException ako je uneto ime koje ima manje od dva znaka 
	 */
	public void setIme(String ime) {
		if (ime == null)
			throw new NullPointerException("Ime ne sme biti null");
		
		if (ime.length() < 2)
			throw new RuntimeException("Ime mora imati vise od dva znaka");
		
		this.ime = ime;
	}
		
	/**
	 * Vraca prezime autora.
	 * 
	 * @return Prezime autora kao String.
	 */
	public String getPrezime() {
		return prezime;
	}
	
	/**
	 * Postavlja prezime autora na novu vrednost.
	 * 
	 * @param prezime prezime autora kao String
	 * 
	 * @throws java.lang.NullPointerException ako je uneto prezime null
	 * @throws java.lang.RuntimeException ako je uneto prezime koje ima manje od dva znaka 
	 */
	public void setPrezime(String prezime) {
		if (prezime == null)
			throw new NullPointerException("Prezime ne sme biti null");
		
		if (prezime.length() < 2)
			throw new RuntimeException("Prezime mora imati vise od dva znaka");
		
		this.prezime = prezime;
	}
	
	/**
	 * @return Vraca String sa svim podacima o Autoru
	 */
	@Override
	public String toString() {
		return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}
	
	/**
	 * Poredi dva autora i vraca true ako su isti, a false ako nisu.
	 * 
	 * Autori se porede po imenu i prezimenu i oba moraju da budu ista.
	 * 
	 * @return 
	 * <ul>
	 * 		<li>true ako su oba objeka klase Autor i imaju ista imena i prezimena</li>
	 * 		<li>false u svim ostalim slucajevima</li>
	 * </ul>  
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}

}

