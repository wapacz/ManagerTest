package org.catcher.jpa;

import javax.persistence.Embeddable;

@Embeddable
public class AdresUzytkownika {
	private String ulica;
	private String miasto;
	
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
}
