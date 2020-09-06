package wctc.edu.sbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PBJStep3Controller {

    @RequestMapping("/pbj-step3")
    public String getPBJStep3Page() {
        return "pbj-step3";
    }
}
