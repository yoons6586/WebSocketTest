package yoonsung.band.sns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TalkController {
	@GetMapping("/talk")
	public String getTalk(Model model) {
		return "talk";
	}
}
