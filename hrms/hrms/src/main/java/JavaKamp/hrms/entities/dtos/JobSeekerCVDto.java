package JavaKamp.hrms.entities.dtos;

import java.util.List;

import JavaKamp.hrms.entities.concretes.Ability;
import JavaKamp.hrms.entities.concretes.CoverLetter;
import JavaKamp.hrms.entities.concretes.Experience;
import JavaKamp.hrms.entities.concretes.JobSeeker;
import JavaKamp.hrms.entities.concretes.Language;
import JavaKamp.hrms.entities.concretes.Photo;
import JavaKamp.hrms.entities.concretes.School;

import JavaKamp.hrms.entities.concretes.SocialMedia;

public class JobSeekerCVDto {
	
	public JobSeeker jobSeeker;
	public List<CoverLetter> coverLetters;
	public List<School> schools;

	public List<Ability> abilities;
	public List<Language> languages;
	public List<SocialMedia> socialMedias;
	public List<Experience> experiences;
	public Photo photos;
	
	
	
	
	public JobSeekerCVDto(JobSeeker jobSeeker, List<CoverLetter> coverLetters, List<School> schools,
			 List<Ability> abilities, List<Language> languages,
			List<SocialMedia> socialMedias, List<Experience> experiences,Photo photos) {
		super();
		this.jobSeeker = jobSeeker;
		this.coverLetters = coverLetters;
		this.schools = schools;

		this.abilities = abilities;
		this.languages = languages;
		this.socialMedias = socialMedias;
		this.experiences = experiences;
		this.photos=photos;
	}
	
	public Photo getPhotos() {
		return photos;
	}

	public void setPhotos(Photo photos) {
		this.photos = photos;
	}

	public JobSeekerCVDto() {
	super();
}
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	public List<CoverLetter> getCoverLetters() {
		return coverLetters;
	}
	public void setCoverLetters(List<CoverLetter> coverLetters) {
		this.coverLetters = coverLetters;
	}
	public List<School> getSchools() {
		return schools;
	}
	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public List<Ability> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	public List<SocialMedia> getSocialMedias() {
		return socialMedias;
	}
	public void setSocialMedias(List<SocialMedia> socialMedias) {
		this.socialMedias = socialMedias;
	}
	public List<Experience> getExperiences() {
		return experiences;
	}
	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}
	
	
	

}
