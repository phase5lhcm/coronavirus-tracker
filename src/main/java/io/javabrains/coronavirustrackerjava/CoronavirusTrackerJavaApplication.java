package io.javabrains.coronavirustrackerjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerJavaApplication.class, args);
	}

}
