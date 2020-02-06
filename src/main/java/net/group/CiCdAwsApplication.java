package net.group;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CiCdAwsApplication {
  public static void main(String[] args) {
    log.info("CI-CD AWS SPRINGBOOT STARTING ...");
    SpringApplication.run(CiCdAwsApplication.class, args);
  }
}
