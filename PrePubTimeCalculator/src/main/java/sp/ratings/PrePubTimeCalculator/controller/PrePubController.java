package sp.ratings.PrePubTimeCalculator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrePubController {
	
	@RequestMapping("/GetPrePubEndTime")
	public String greeting() {
		return "It will return prepub end time";
	}

}
