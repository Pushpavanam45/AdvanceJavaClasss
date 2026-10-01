package product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClassBook {
	public static void main(String[] args) {
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("dev");
	    EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
	    Book b = new Book();
	    b.setBook_id("B04");
	    b.setTitle("Batman Hush");
	    b.setAuthor("Matreeves");
	    b.setCategory("Crime , Inverstigation");
	    b.setPrice(500000);
	    b.setQuantity(1000);
	    b.setDescription(" its about a crime investigation");
	    
	    et.begin();
		em.persist(b);
		et.commit();
		
		em.close();
        emf.close();
	    
	}

}
