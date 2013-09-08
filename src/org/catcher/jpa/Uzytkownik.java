package org.catcher.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="uzytkownik")
public class Uzytkownik implements Serializable {
	private static final long serialVersionUID = -3299291830280417103L;
	@Id
	private int id;
	private String imie;
	private String nazwisko;
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
}
