package org.watercraft.ejb;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Member implements java.io.Serializable{

	///////////////
	// Variables //
	///////////////
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memberId;
	
	@NotNull
	private String name;

	@ManyToMany
	private Collection<Watercraft> watercrafts;

	/////////////
	// Methods //
	/////////////
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Collection<Watercraft> getWatercrafts() {
		return watercrafts;
	}

	public void setWatercrafts(Collection<Watercraft> watercrafts) {
		this.watercrafts = watercrafts;
	}
	
}
