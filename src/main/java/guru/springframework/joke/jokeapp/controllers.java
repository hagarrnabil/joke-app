package guru.springframework.joke.jokeapp;

import guru.springframework.joke.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllers {
    private JokeService jokeService;

    public controllers(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"","/"})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
