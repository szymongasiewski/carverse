package net.carverse.model;
// Generated 21 lis 2022, 14:48:23 by Hibernate Tools 6.1.3.Final

/**
 * Gwiazdki generated by hbm2java
 */
public class Gwiazdki implements java.io.Serializable {

	private Integer id;
	private Samochody samochody;
	private long sredniaGwiazdek;

	public Gwiazdki() {
	}

	public Gwiazdki(Samochody samochody, long sredniaGwiazdek) {
		this.samochody = samochody;
		this.sredniaGwiazdek = sredniaGwiazdek;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Samochody getSamochody() {
		return this.samochody;
	}

	public void setSamochody(Samochody samochody) {
		this.samochody = samochody;
	}

	public long getSredniaGwiazdek() {
		return this.sredniaGwiazdek;
	}

	public void setSredniaGwiazdek(long sredniaGwiazdek) {
		this.sredniaGwiazdek = sredniaGwiazdek;
	}

}