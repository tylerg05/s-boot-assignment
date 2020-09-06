package wctc.edu.sbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PBJStep2Controller {

    @RequestMapping("/pbj-step2")
    public String getPBJStep2Page() {
        return "pbj-step2";
    }
}
