package product;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BooksPriceGreater {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select b from Book b where b.price>10000");
		
		List<Book> list = q.getResultList();
		for(Book b : list) {
			System.out.println(b);
		}
		
		
	}

}
