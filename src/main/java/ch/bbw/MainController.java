package ch.bbw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	// make mapping
	@GetMapping("/bmi")
	public String getForm(Model model) {
		model.addAttribute("bmiModel", new BmiModel());
		return "bmi";
	}

	// make mapping
	@PostMapping("/bmi")
	public String showAnswer(Model model, @ModelAttribute BmiModel bmiModel) {
		model.addAttribute("myModel", bmiModel);
		model.addAttribute("bmi", bmiModel.getValue());
		return "bmi";
	}

}
