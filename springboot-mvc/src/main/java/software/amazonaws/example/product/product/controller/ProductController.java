package software.amazonaws.example.product.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @RequestMapping("/controller/")
  public String hello() {
    System.out.println("Hello from ProductController");
    return "Hello Controller!";
  }

  @RequestMapping("/controller/product/name/")
  public String helloName() {
    System.out.println("HelloName from ProductController");
    return "Hello Controller Name!";
  }
}
