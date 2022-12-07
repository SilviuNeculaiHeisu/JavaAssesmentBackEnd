package solera.task.java.custom.task.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import solera.task.java.custom.task.models.CustomTableHeisuSilviu;
import solera.task.java.custom.task.services.CustomTableService;



@RestController
public class CustomController {
	@Autowired
	private CustomTableService service;

	@GetMapping("/data")
	public List<CustomTableHeisuSilviu> getAll() {
		return this.service.getAll();

	}
	@PostMapping("/data")
	@CrossOrigin(origins = "http://localhost:3000")
	public void postData(@RequestBody CustomTableHeisuSilviu data) {
		System.out.println(data.toString());
		this.service.postData(data);
	}
}
