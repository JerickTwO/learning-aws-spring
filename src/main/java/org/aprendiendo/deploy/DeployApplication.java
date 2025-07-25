package org.aprendiendo.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployApplication {

    @GetMapping("/mensaje")
    public String mensaje() {
        return "Bienvenido a Java + Azure";
    }

    public static void main(String[] args) {
        SpringApplication.run(DeployApplication.class, args);
    }

}
