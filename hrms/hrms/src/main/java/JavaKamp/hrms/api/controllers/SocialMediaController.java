package JavaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaKamp.hrms.business.abstracts.SocialMediaService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.SocialMedia;

@RestController
@RequestMapping("/api/socialmedias")
public class SocialMediaController {
	
	private SocialMediaService service;
	@Autowired
	public SocialMediaController(SocialMediaService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SocialMedia>> getall(){
		return this.service.getall();
		
	}

	@PostMapping("/add")
	public Result add(@RequestBody SocialMedia socialMedia) {
		return this.service.add(socialMedia);
	}
}
