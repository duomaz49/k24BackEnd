package k24.myFirstApplication.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("index")
	@ResponseBody
	public String index() {
		return "This is the main page";
	}
	@RequestMapping("contact")
	@ResponseBody
	public String contact() {
		return "This is the contact page";
	}
	

    @RequestMapping("hello")
	@ResponseBody
	public String returnGreeting(@RequestParam (name="name", required=true) String firstName, @RequestParam (name="location") String location) {
    	return "Welcome to the  " + location + " " + firstName;
    }

}