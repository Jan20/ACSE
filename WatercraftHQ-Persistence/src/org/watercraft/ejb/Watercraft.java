package org.watercraft.ejb;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public abstract class Watercraft implements java.io.Serializable {
	
	///////////////
	// Variables //
	///////////////
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int watercraftId;
	
	@NotNull
	protected String name;
	
	@ManyToMany
	private Collection<Member> members;
	
	/////////////
	// Methods //
	/////////////
	public int getWatercraftId() {
		return this.watercraftId;
	}
	
	public void setWatercraftId(int watercraftId) {
		this.watercraftId = watercraftId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Member> getMembers() {
		return members;
	}

	public void setMembers(Collection<Member> members) {
		this.members = members;
	}

}