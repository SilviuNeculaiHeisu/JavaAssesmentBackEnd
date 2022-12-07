package solera.task.java.custom.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import solera.task.java.custom.task.controllers.CustomController;
import solera.task.java.custom.task.models.CustomTableHeisuSilviu;
import solera.task.java.custom.task.services.CustomTableService;


@SpringBootApplication
public class TaskApplication implements CommandLineRunner {
	@Autowired
	CustomTableService service;
	@Autowired 
	CustomController controller;
	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	
		
		
	}

}
