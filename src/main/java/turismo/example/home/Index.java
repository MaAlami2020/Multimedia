package turismo.example.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Index {

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }
    
    
}
