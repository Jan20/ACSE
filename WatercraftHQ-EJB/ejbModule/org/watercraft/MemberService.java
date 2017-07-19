package org.watercraft;

import java.util.Collection;

import javax.ejb.Remote;

import org.watercraft.ejb.Member;

@Remote
public interface MemberService {

	public void createMember(String name);
	
	public Member findMember(int memberId);
	
	public Collection<Member> findMembers();
	
}
