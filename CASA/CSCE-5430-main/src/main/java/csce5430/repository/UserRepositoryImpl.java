package csce5430.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import csce5430.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public class UserRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    
    public List<User> findProperty(String temp) {
        return entityManager.createQuery("SELECT u FROM User u ",
        		User.class).getResultList();
    }

}
