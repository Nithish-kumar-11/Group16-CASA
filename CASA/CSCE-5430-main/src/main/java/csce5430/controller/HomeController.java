package csce5430.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {
	@GetMapping("/")
	public String home(Principal principal) {
		return "home";
	}

}