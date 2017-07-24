package org.watercraft.session.beans;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.watercraft.ejb.Member;

@Path("member")
public interface MemberResource {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void create(Member member);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{memberId}")
	public Member getMember(@PathParam("memberId") String memberId);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Member> getMembers();
}
