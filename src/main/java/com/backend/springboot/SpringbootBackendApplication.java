package com.backend.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.springboot.model.User;
import com.backend.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User(1, "Ramesh", "kk", "qw@sf.com" ));
		this.userRepository.save(new User(2, "Ramesh1", "kk2", "q1w@sf.com" ));
		this.userRepository.save(new User(3, "Ramesh2", "kk2", "q2w@sf.com" ));

	}

}
