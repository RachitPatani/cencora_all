package com.dockerhello.docker_kuber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerKuberApplication {
	@RequestMapping("/")
	public String home()
	{
		return "hello kubernetes";
	}

	public static void main(String[] args) {



		SpringApplication.run(DockerKuberApplication.class, args);


	}

}
