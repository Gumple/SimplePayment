package project.joseph.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by josephgan on 5/11/18.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
