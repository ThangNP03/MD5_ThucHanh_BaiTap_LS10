package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import ra.model.User;


@Controller
@RequestMapping("/session")
@SessionAttributes("user")
public class SessonController {
    @ModelAttribute("user")
    public User setUpUserForm(){
        return new User();
    }
    @RequestMapping("/login")
    public String login (){
        return "login";}
    @PostMapping("/doLogin")
    public String doLogin(@ModelAttribute("user") User user, Model model){
        if (user.getUsername().equals("ThangNp")&& user.password.equals("11111")) {
            return "redirect:/session/home";
        }else {
            return "login";
        }
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/logout")
    public String logout(SessionStatus status){
        status.isComplete();
        return "login";
    }

}
