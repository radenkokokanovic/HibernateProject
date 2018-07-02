package com.hibernate.HibernateProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
//Annotation mapping for table columns
@Entity
@Table
public class Employee {
	   @Id
	   @GeneratedValue(strategy = IDENTITY)
	   @Column(name = "id", unique = true, nullable = false)
	   private int id;
	   @Column(name = "first_name", unique = true, nullable = false)
	   private String firstName; 
	   @Column(name = "last_name", unique = true, nullable = false)
	   private String lastName;   
	   @Column(name = "salary", unique = true, nullable = false)
	   private int salary;  

	   public Employee() {}
	   public Employee(String fname, String lname, int salary) {
	      this.firstName = fname;
	      this.lastName = lname;
	      this.salary = salary;
	   }
	   
	   public int getId() {
	      return id;
	   }
	   
	   public void setId( int id ) {
	      this.id = id;
	   }
	   
	   public String getFirstName() {
	      return firstName;
	   }
	   
	   public void setFirstName( String first_name ) {
	      this.firstName = first_name;
	   }
	   
	   public String getLastName() {
	      return lastName;
	   }
	   
	   public void setLastName( String last_name ) {
	      this.lastName = last_name;
	   }
	   
	   public int getSalary() {
	      return salary;
	   }
	   
	   public void setSalary( int salary ) {
	      this.salary = salary;
	   }
	}