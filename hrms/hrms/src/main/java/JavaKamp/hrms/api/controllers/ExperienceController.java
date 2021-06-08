package JavaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaKamp.hrms.business.abstracts.ExperienceService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experiences")
public class ExperienceController {
	
	private ExperienceService experienceService;
	@Autowired
	public ExperienceController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Experience>> getAll(){
		return this.experienceService.getall();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Experience experience) {
		return this.experienceService.add(experience);
	}
	@GetMapping("/findByOrderByQuitDate")
	public DataResult<List<Experience>> findByOrderByQuitDate(){
		return this.experienceService.findByOrderByQuitDate();
	}

}
