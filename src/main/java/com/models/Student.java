package com.models;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptop_id", referencedColumnName = "lapId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Laptop laptop;
	private NameDetails names;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}


	public NameDetails getNames() {
		return names;
	}
	public void setNames(NameDetails names) {
		this.names = names;
	}

	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
}
