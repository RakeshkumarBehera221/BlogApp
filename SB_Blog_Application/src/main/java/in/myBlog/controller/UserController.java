package in.myBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/registration")
	public String home() {
		
		
		
		return "registration";
	}

}
