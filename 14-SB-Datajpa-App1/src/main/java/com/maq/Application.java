package com.maq;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.maq.entity.Player;
import com.maq.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PlayerRepository playerrepo = context.getBean(PlayerRepository.class);
		System.out.println(playerrepo.getClass().getName());
	
		/*Player p1 = new Player();
		p1.setPlayerId(202);
		p1.setPlayerName("Sehwag");
		p1.setPlayerAge(40);
		p1.setPlayerGender("Male");
		p1.setPlayerCity("Delhi");
		
		playerrepo.save(p1);*/
		
		Optional<Player> row = playerrepo.findById(201);
		if(row.isPresent()) {
			System.out.println(row.get());
		}
		
		System.out.println("Done...");
	}

}
