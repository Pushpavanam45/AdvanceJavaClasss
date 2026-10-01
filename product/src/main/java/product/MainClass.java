package product;
import jakarta.persistence.*;

public class MainClass {

	public static void main(String [] args) {
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("dev");
	    EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e = new Employee();
		e.setEno("Emp04");
		e.setName("ramesh");
		e.setEmail("ramesh@gmail.com");
		e.setGender("male");
		e.setPhone(931648473);
		e.setSal(2000);
		
		et.begin();
		em.persist(e);
		et.commit();
		
		em.close();
        emf.close();
		
	}

}
