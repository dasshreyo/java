package com.shreyosri.onetotone;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Table(name="emp5")
@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@PrimaryKeyJoinColumn
private int id;
private String name;
@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
private Address address ;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
