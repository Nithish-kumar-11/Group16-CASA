package csce5350.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import csce5350.model.Dictionary;
import csce5350.model.Property;
import csce5350.repository.DictionaryRepositoryImpl;

@Service
public class SearchQueryParser {
	
	@Autowired
	DictionaryRepositoryImpl dictionaryRepositoryImpl;
	
	public String parse(String query) {
		String newQuery = query;
		
		// If search query is not empty
		if (!query.isEmpty()) {
			
			//Get a list of words in the search query
			String queryWords[] = query.split(" ");
			
			//For each of the words in the search query
			for (int i=0; i < queryWords.length; i++) {
				
				//Find any matching misspelling 
				List<Dictionary> wordList = dictionaryRepositoryImpl.findWords(
						queryWords[i]);
				
				//If a misspelling exist
				if (wordList.size() > 0) {
					
					//Replace the misspelling with the correct spelling in the query
					newQuery = newQuery.replace(queryWords[i], wordList.get(0).getKeyword());
				}						
			}			
		}		
		return newQuery;
	}
}
