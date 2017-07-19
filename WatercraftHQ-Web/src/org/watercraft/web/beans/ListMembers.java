package org.watercraft.web.beans;

import java.util.Collection;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import org.watercraft.session.beans.MemberService;
import org.watercraft.ejb.Member;

@ManagedBean
public class ListMembers {
	
	@EJB
	MemberService memberService;
	
	private Collection<Member> members;
	
	public Collection<Member> getMembers(){
		
		if(members == null) {
			
			members = memberService.findMembers();
			
		}
		
		return members;
		
	}
	
	public void setMember(Collection<Member> members) {
		
		this.members = members;
		
	}

}
