package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import ra.model.Counter;
import ra.model.User;

@Controller
@SessionAttributes("counter")
public class CouterController {
    @ModelAttribute("counter")
    public Counter setUpCounter() {
        return new Counter();
    }
    @GetMapping("/counter")
    public String get(@ModelAttribute("counter") Counter counter) {
        counter.increment();
        return "/counter";
    }
}
