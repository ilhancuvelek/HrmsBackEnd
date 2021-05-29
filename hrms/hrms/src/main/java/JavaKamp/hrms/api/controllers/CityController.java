package JavaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaKamp.hrms.business.abstracts.CityService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/city")
public class CityController {
	
	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	@GetMapping("/getall")
	public DataResult<List<City>> getAll(){
		return this.cityService.getAll();
	}

}
