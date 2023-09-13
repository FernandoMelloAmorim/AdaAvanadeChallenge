package com.SpringWarriors.AdaAvanadeChallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AdaAvanadeChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdaAvanadeChallengeApplication.class, args);
	}

}
