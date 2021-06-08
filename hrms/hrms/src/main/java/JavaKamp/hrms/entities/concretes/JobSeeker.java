package JavaKamp.hrms.entities.concretes;

import java.sql.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;



import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;


@Entity
@Table(name="job_seekers")
@EqualsAndHashCode(callSuper=false) 
@PrimaryKeyJoinColumn(name = "user_id")
public class JobSeeker extends User{
	

	
	@Column(name="workingarea_id")
	private int  workingareaId;
	

	@Column(name="jobseeker_firstname")
	private String firstName;
	
	@Column(name="jobseeker_lastname")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	

	
	
	@OneToMany(mappedBy = "jobseeker")
	@JsonIgnore
	private List<Language> languages;
	
	@JsonIgnore
	@OneToOne(mappedBy = "jobseeker", optional=false, fetch=FetchType.LAZY)
	private Photo photos;
	
	
	@OneToMany(mappedBy = "jobseeker")
	@JsonIgnore
	private List<SocialMedia> socialMedias;
	
	
	@OneToMany(mappedBy = "jobseeker")
	@JsonIgnore
	private List<Experience> experiences;
	
	
	@OneToMany(mappedBy = "jobseeker")
	@JsonIgnore
	private List<School> schools;

	
	@OneToMany(mappedBy = "jobseeker")
	@JsonIgnore
	private List<CoverLetter> coverLetters;
	
	
	@OneToMany(mappedBy = "jobseeker")
	@JsonIgnore
	private List<Ability> abilities;
	
	

	
	public JobSeeker() {
		super();
	}


	public JobSeeker(int workingareaId, String firstName, String lastName, String identityNumber,
			Date dateOfBirth, List<Language> languages, List<SocialMedia> socialMedias,
			List<Experience> experiences, List<School> schools,  List<CoverLetter> coverLetters,
			List<Ability> abilities,Photo photos) {
		super();
		this.workingareaId = workingareaId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;


		this.languages = languages;
		this.socialMedias = socialMedias;
		this.experiences = experiences;
		this.schools = schools;
		this.photos = photos;
		this.coverLetters = coverLetters;
		this.abilities = abilities;
	}



	public Photo getPhotos() {
		return photos;
	}


	public void setPhotos(Photo photos) {
		this.photos = photos;
	}




	public int getWorkingareaId() {
		return workingareaId;
	}


	public void setWorkingareaId(int workingareaId) {
		this.workingareaId = workingareaId;
	}



	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIdentityNumber() {
		return identityNumber;
	}


	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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


	public List<School> getSchools() {
		return schools;
	}


	public void setSchools(List<School> schools) {
		this.schools = schools;
	}



	public List<CoverLetter> getCoverLetters() {
		return coverLetters;
	}


	public void setCoverLetters(List<CoverLetter> coverLetters) {
		this.coverLetters = coverLetters;
	}


	public List<Ability> getAbilities() {
		return abilities;
	}


	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}





	
	

}
