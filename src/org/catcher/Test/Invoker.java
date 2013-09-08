package org.catcher.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.catcher.jpa.Uzytkownik;

public class Invoker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task task1 = new Task();
		//System.out.println(task1.toString());
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ManagerTest");
		EntityManager em = emf.createEntityManager();
		Uzytkownik u = em.find(Uzytkownik.class, 2);
		System.out.println(u.getImie());
		em.close();
		emf.close();
	}
}
