package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
