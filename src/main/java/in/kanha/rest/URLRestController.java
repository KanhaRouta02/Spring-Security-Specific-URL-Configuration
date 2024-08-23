package in.kanha.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLRestController {

	// No security
	@GetMapping("/home")
	public String homePage() {
		return "Home page Loaded";
	}
	
	// Security
	@GetMapping("/transfer")
	public String tranfer() {
		return "Transaction Successful;";
	}
	
	// Security
	@GetMapping("/check")
	public String ckeck() {
		return "45000000000";
	}
	
	// No security
	@GetMapping("/contact")
	public String contactUs() {
		return "+91 9348133039";
	}
}
