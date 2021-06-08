package JavaKamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="languages")

public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="language_id")
	private int id;
	
	@Column(name="language_name")
	private String languageName;
	
	
	@Column(name="language_level")
	private int languageLevel;
	
	@Column(name="jobseeker_id")
	private int jobSeekerId;

	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id", insertable = false, updatable = false)
	@JsonIgnore
	private JobSeeker jobseeker;



	public Language() {
		super();
	}



	public Language(int id, String languageName, int languageLevel, JobSeeker jobseeker,int jobSeekerId) {
		super();
		this.id = id;
		this.languageName = languageName;
		this.languageLevel = languageLevel;
		this.jobSeekerId=jobSeekerId;
		this.jobseeker.setId(jobSeekerId);
		this.jobseeker=jobseeker;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLanguageName() {
		return languageName;
	}



	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}



	public int getLanguageLevel() {
		return languageLevel;
	}



	public void setLanguageLevel(int languageLevel) {
		this.languageLevel = languageLevel;
	}



	public JobSeeker getJobseeker() {
		return jobseeker;
	}



	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}



	public int getJobSeekerId() {
		return jobSeekerId;
	}



	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	

	



	

}
