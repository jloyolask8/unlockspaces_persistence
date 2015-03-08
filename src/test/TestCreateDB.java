/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.unlock.spaces.persistence.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author jonathan
 */
public class TestCreateDB {

    private static final String PERSISTENCE_UNIT_NAME = "DEFAULT_PU";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
//        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//        EntityManager em = factory.createEntityManager();
//        // Read the existing entries and write to console
//        Query q = em.createQuery("SELECT u FROM Usuario u");
//        List<Usuario> userList = q.getResultList();
//        userList.stream().forEach((user) -> {
//            System.out.println(user.getName());
//        });
//        System.out.println("Size: " + userList.size());
//
//        // Create new user
//        em.getTransaction().begin();
//        System.out.println(em.find(Usuario.class, 0L));
//        em.getTransaction().commit();
//
//        em.close();

        String s = "hello";
        String backup_of_s = s;
        s = "bye";
        
        System.out.println("s:"+s);
        System.out.println("backup_of_s:"+backup_of_s);

    }
}
