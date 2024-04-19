package csce5430.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // This tells Hibernate to make a table out of this class
public class Dictionary {
	@Id
	@Column(name="id")
	private String id;

	@Column(name="keyword")
	private String keyword;	

	@Column(name="words")
	private String words;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String word) {
		this.keyword = word;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}	
	

}
