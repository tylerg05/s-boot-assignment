package wctc.edu.sbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreditsController {

    @RequestMapping("/credits")
    public String getCreditsPage() {
        return "credits";
    }
}
