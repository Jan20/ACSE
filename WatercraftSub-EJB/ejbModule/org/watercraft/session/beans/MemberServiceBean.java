package org.watercraft.session.beans;

import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.watercraft.ejb.Member;

@PermitAll
@Stateless
public class MemberServiceBean implements MemberService{

	private static final String BASE_URL = "http://localhost:8080/WatercraftHQ-Web/api/";
	private ResteasyWebTarget target;
	private MemberResource memberResource;

	@Override
	public void createMember(String name){
		registerService();
		Member member = new Member();
		member.setName(name);
		try {
			
			memberResource.create(member);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	@Override
	public Member findMember(int memberId) {
		registerService();

		try {

			return memberResource.getMember(String.valueOf(memberId));
			
		}catch(Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}
	
	@Override
	public Collection<Member> findMembers() {
		
		registerService();

		try {

			Collection<Member> members = memberResource.getMembers();
			if(members != null) {
				return members;
			}else {
				return null;
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			return null;
		}
	
	}
	
	public void registerService() {
		
		if(this.target == null) {
			
			RegisterBuiltin.register(ResteasyProviderFactory.getInstance());
			target = new ResteasyClientBuilder().build().target(BASE_URL);
			
		}
		memberResource = target.proxy(MemberResource.class);
		
	}

}
