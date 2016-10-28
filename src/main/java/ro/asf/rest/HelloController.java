package ro.asf.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ro.asf.rest.services.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/")
	public String index() {
		try {
			return String.format("Greetings from Spring Boot at %s", helloService.getSysdate());
		} catch (Exception e) {
			return "sss";
		}
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello(@RequestParam(value = "name", defaultValue = "Ionel") String name) {
		return "Hello " + name;
	}

}