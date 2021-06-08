package JavaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaKamp.hrms.business.abstracts.AbilityService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.Ability;

@RestController
@RequestMapping("/api/abilities")
public class AbilityController {
	
	private AbilityService abilityService;

	public AbilityController(AbilityService abilityService) {
		super();
		this.abilityService = abilityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Ability>> getAll(){
		return this.abilityService.getall();
	}
	       
	@PostMapping("/add")
	public Result add(@RequestBody Ability ability) {
		return this.abilityService.add(ability);
	}
	

}
