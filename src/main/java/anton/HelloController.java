package anton;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hey")
    public String sayHello() {
        logger.info("Hey endpoint called");
        return "hey";
    }
}
