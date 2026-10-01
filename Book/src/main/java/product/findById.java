package product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class findById {
	public static void main(String[] args) {
		EntityManagerFactory emp = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emp.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Book b= em.find(Book.class, "B04");
		
		if(b != null) {
			System.out.println(b);
		}else{
			System.out.println("not found");
		}
		em.close();
		emp.close();
	}
	
	// find and display using fetch
}

