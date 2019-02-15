package se.ffcg.hackatontest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestController {
  @RequestMapping(path = "/hello", method = RequestMethod.GET, produces = "application/json")
  public String getHello() {
    return "Heloooooo";
  }
}
