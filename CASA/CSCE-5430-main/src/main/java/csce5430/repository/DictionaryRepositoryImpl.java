package csce5430.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import csce5430.model.Dictionary;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public class DictionaryRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    private final String SEARCH_QUERY = "SELECT * FROM dictionary WHERE MATCH(words) AGAINST('%s')";
    
    public List<Dictionary> findWords(String searchString ) {
        System.out.println(String.format(SEARCH_QUERY,searchString));
        Query nativeQuery = entityManager.createNativeQuery(String.format(SEARCH_QUERY,searchString),Dictionary.class);
        return nativeQuery.getResultList();   	
   }

    
}
