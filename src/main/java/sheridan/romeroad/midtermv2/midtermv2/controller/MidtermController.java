package sheridan.romeroad.midtermv2.midtermv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MidtermController {

    private static final String[] status = {
            "--- Select Your Status ---",
            "Full-Time", "Part-Time"};

    @GetMapping(value = {"/Output"})
    public ModelAndView input(){

        return new ModelAndView("Output");
    }

}
