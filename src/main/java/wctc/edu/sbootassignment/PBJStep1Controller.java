package wctc.edu.sbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PBJStep1Controller {

    @RequestMapping("/pbj-step1")
    public String getPBJStep1Page() {
        return "pbj-step1";
    }
}
