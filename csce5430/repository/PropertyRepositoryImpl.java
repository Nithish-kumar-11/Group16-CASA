package csce5350.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import csce5350.model.Property;

@Repository
public class PropertyRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    private final String SEARCH_QUERY = 
    		"SELECT * FROM property WHERE MATCH(property_description) AGAINST('%s')";
    
    public List<Property> findProperty(String searchString ) {
        System.out.println(String.format(SEARCH_QUERY,searchString));

        Query nativeQuery = entityManager.createNativeQuery(
        		String.format(SEARCH_QUERY,searchString),
        		Property.class);
        return nativeQuery.getResultList();   	
    }
}
