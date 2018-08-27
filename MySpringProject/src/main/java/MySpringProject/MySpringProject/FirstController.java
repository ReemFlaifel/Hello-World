package MySpringProject.MySpringProject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FirstController {

	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("result", new StudentInfo());
		return "result";
	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute StudentInfo student) {
		return "result";
	}
}