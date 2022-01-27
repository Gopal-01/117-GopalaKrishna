package com.marticus.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class library {
  
	
	private long libraryid;
	private String libraryname;
	private Set<Books> Books = new HashSet<Books>(0);
	
	public library() {
	}
	public library(String libraryname) {
		this.libraryname = libraryname;
	}

	public library(String libraryname, Set<Books> Books) {
		this.libraryname = libraryname;
		this.Books = Books;
	}
	

	@Id
	@GeneratedValue
	@Column(name = "libraryid")
	public long getLibraryid() {
		return libraryid;
	}
	public void setLibraryid(long libraryid) {
		this.libraryid = libraryid;
	}
	
	@Column(name = "libraryname", nullable = false, length = 100)
	public String getLibraryname() {
		return libraryname;
	}
	public void setLibraryname(String libraryname) {
		this.libraryname = libraryname;
	}
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "library_books", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "BOOK_ID") })
	public Set<Books> getBooks() {
		return Books;
	}
	public void setBooks(Set<Books> Books) {
		this.Books = Books;
	}
	
	
	
}
