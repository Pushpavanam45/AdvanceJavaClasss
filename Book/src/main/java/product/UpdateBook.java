package product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateBook {
	public static void main(String[] args) {
		EntityManagerFactory emp = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emp.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Book b = em.find(Book.class, "B07");
		
		if(b != null) {
			b.setDescription("its about the last day of earth");
			et.begin();
			em.merge(b);
			et.commit();
			System.out.println("data updated");
			em.close();
		}else {
			System.out.println("data not found");
		}
	}

}
