package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UsersTest {

	public static void main(String[] args) {
		Users user1 = new Users();
		user1.setEmail("email@gmail");
		user1.setFullName(" name Ha Mingh");
		user1.setPassword("helloWorld");
		
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	entityManager.persist(user1);
	entityManager.getTransaction().commit();
	entityManager.close();
	entityManagerFactory.close();
	System.out.print("An user object was persiste");
	}

}
