package org.watercraft.web.service;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.watercraft.ejb.Member;
import org.watercraft.session.beans.MemberService;

@Stateless
@Path("/member")
public class MemberResource {
	
	@EJB
	MemberService memberService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createMember(Member member) {
		
		memberService.create(member);
		
	}
	
	@GET
	@Path("{memberId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Member getMember(@PathParam("memberId") String userId) {
		
		return memberService.findMember(Integer.parseInt(userId));
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Member> getMembers(){
		Collection<Member> members = memberService.findMembers();
		members.toString();
		return members;
		
	}
	
}
