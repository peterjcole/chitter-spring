package net.petercole.chitterspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication(scanBasePackages = "net.petercole.chitterspring")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
