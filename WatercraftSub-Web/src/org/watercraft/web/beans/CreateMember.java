package org.watercraft.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import org.watercraft.session.beans.MemberService;
import org.watercraft.ejb.Member;

@ManagedBean
public class CreateMember {

	@EJB
	MemberService memberService;
	
	Member member;
	
	public void persist() {
		
		memberService.createMember(getMember().getName());
		member = null;
		
	}
	
	public Member getMember() {
		
		if(member == null) {
			
			member = new Member();
			
		}
		
		return member;
		
	}
	
	public void setMember(Member member) {
		
		this.member = member;
		
	}
	
}
