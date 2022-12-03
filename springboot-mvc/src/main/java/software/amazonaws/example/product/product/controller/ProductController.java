package software.amazonaws.example.product.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @RequestMapping("/controller/product/")
  public String hello() {
    return "Hello Controller!";
  }

  @RequestMapping("/controller/product/name/")
  public String helloName() {
    return "Hello Controller Name!";
  }
}
