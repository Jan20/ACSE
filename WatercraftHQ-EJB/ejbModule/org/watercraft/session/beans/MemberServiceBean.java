package org.watercraft.session.beans;

import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.watercraft.ejb.Member;

@PermitAll
@Stateless
public class MemberServiceBean implements MemberService{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void createMember(String name){
		
		Member member = new Member();
		member.setName(name);
		em.persist(member);
		
	}
	
	@Override
	public void create(Member member) {
		
		em.persist(member);
		
	}

	@Override
	public Member findMember(int memberId) {
		
		Member member = em.find(Member.class, memberId);
		
		if(member == null) {
			System.out.println("Member was not found.");
		}
		
		return member;
		
	}
	
	@Override
	public Collection<Member> findMembers() {
		
		Collection<Member> members = em.createQuery("FROM Member", Member.class).getResultList();
		System.out.println(members);
		return members;
	
	}

}
