package JavaKamp.hrms.business.concretes;

import java.util.List;


import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.AbilityService;
import JavaKamp.hrms.business.abstracts.CoverLetterService;
import JavaKamp.hrms.business.abstracts.ExperienceService;
import JavaKamp.hrms.business.abstracts.JobSeekerService;
import JavaKamp.hrms.business.abstracts.LanguageService;
import JavaKamp.hrms.business.abstracts.PhotoService;
import JavaKamp.hrms.business.abstracts.SchoolService;
import JavaKamp.hrms.business.abstracts.SocialMediaService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.ErrorResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.JobSeekerDao;
import JavaKamp.hrms.entities.concretes.Ability;
import JavaKamp.hrms.entities.concretes.CoverLetter;
import JavaKamp.hrms.entities.concretes.Experience;
import JavaKamp.hrms.entities.concretes.JobSeeker;
import JavaKamp.hrms.entities.concretes.Language;
import JavaKamp.hrms.entities.concretes.School;

import JavaKamp.hrms.entities.concretes.SocialMedia;
import JavaKamp.hrms.entities.dtos.JobSeekerCVDto;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobseekerDao;
	
	private AbilityService abilityService;
	private CoverLetterService coverLetterService;
	private ExperienceService experienceService;
	private LanguageService languageService;

	private SchoolService schoolService;
	private SocialMediaService socialMediaService;
	private PhotoService photoService;

	

	public JobSeekerManager(JobSeekerDao jobseekerDao, AbilityService abilityService,
			CoverLetterService coverLetterService, ExperienceService experienceService, LanguageService languageService,
			 SchoolService schoolService,
			SocialMediaService socialMediaService,PhotoService photoService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.abilityService = abilityService;
		this.coverLetterService = coverLetterService;
		this.experienceService = experienceService;
		this.languageService = languageService;
		this.schoolService = schoolService;
		this.socialMediaService = socialMediaService;
		this.photoService=photoService;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobseekerDao.findAll(),"iş arayanlar listelendi");
				
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if(getByIdentityNumber(jobSeeker.getIdentityNumber()).getData() != null){
	         return new ErrorResult("Aynı tcno zaten var.");
	    }
	   this.jobseekerDao.save(jobSeeker);
	   return new SuccessResult("İş arayan eklendi");
		
		
	}

	@Override
	public DataResult<JobSeeker> getByIdentityNumber(String identityNumber) {
		
		return new SuccessDataResult<JobSeeker>(this.jobseekerDao.getByIdentityNumber(identityNumber));
	}

	@Override
	public DataResult<JobSeekerCVDto> getJobseekerCVById(int id) {
		JobSeekerCVDto cv = new JobSeekerCVDto();
		cv.experiences =this.experienceService.findAllByJobseeker_Id(id).getData();
		cv.schools = this.schoolService.findAllByJobseeker_Id(id).getData();
		cv.languages =this.languageService.findAllByJobseeker_Id(id).getData();
		cv.socialMedias =this.socialMediaService.findAllByJobseeker_Id(id).getData();
		cv.abilities =this.abilityService.findAllByJobseeker_Id(id).getData();
		cv.photos =this.photoService.getByJobseekerId(id).getData();
		cv.coverLetters = this.coverLetterService.findAllByJobseeker_Id(id).getData();
		return new SuccessDataResult<JobSeekerCVDto>(cv);
		
//		JobSeeker jobseeker = this.jobseekerDao.getById(id);
//		JobSeekerCVDto cv = new JobSeekerCVDto();
//		cv.experiences = jobseeker.getExperiences();
//		cv.languages = jobseeker.getLanguages();
//		cv.coverLetters=jobseeker.getCoverLetters();
//		cv.socialMedias = jobseeker.getSocialMedias();
//		cv.abilities = jobseeker.getAbilities();
//		cv.schools = jobseeker.getSchools();
//		cv.photos=jobseeker.getPhotos();
//		return new SuccessDataResult<JobSeekerCVDto>(cv);
	}

	@Override
	public DataResult<JobSeeker> getById(int id) {
		return new SuccessDataResult<JobSeeker>(this.jobseekerDao.getById(id));
	}

	

}
