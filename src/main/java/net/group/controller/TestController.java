package net.group.controller;

import net.group.controller.util.CustomResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

  @GetMapping
  public ResponseEntity<CustomResponseBody<Object>> testApi() {
    CustomResponseBody<Object> responseBody =
        CustomResponseBody.builder().data(null).message("version 3").build();

    return new ResponseEntity<>(responseBody, HttpStatus.OK);
  }
}
