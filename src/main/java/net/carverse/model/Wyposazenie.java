package net.carverse.model;
// Generated 21 lis 2022, 14:48:23 by Hibernate Tools 6.1.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Wyposazenie generated by hbm2java
 */
public class Wyposazenie implements java.io.Serializable {

	private String id;
	private String opis;
	private Set samochodies = new HashSet(0);

	public Wyposazenie() {
	}

	public Wyposazenie(String id, String opis) {
		this.id = id;
		this.opis = opis;
	}

	public Wyposazenie(String id, String opis, Set samochodies) {
		this.id = id;
		this.opis = opis;
		this.samochodies = samochodies;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Set getSamochodies() {
		return this.samochodies;
	}

	public void setSamochodies(Set samochodies) {
		this.samochodies = samochodies;
	}

}