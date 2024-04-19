package csce5430.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import csce5430.model.Property;
import csce5430.model.User;
import csce5430.repository.PropertyRepositoryImpl;
import csce5430.repository.UserRepositoryImpl;
import csce5430.util.SearchQueryParser;

@Controller // This means that this class is a Controller
public class MainController {
	@Autowired
	PropertyRepositoryImpl propertyDataRepositoryImpl;
	
	@Autowired
	UserRepositoryImpl userRepositoryImpl;

	@Autowired
	SearchQueryParser searchQueryParser;
	

	
	@GetMapping("/api/homesearch/{search}")
	public @ResponseBody Iterable<Property> getPropertyData(@PathVariable("search") String search) {
		// This returns a JSON or XML with the users
		List<Property> propertyDataList = propertyDataRepositoryImpl.findProperty(
				searchQueryParser.parse(search));
		return propertyDataList;
		
	}
	
}
