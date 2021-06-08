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
@Table(name="social_media")
public class SocialMedia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="social_media_id")
	private int id;
	
	@Column(name="linkedln_address")
	private String linkedlnAddress;
	
	@Column(name="github_address")
	private String githubAddress;
	

	
	@Column(name="jobseeker_id")
	private int jobSeekerId;

	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id", insertable = false, updatable = false)
	@JsonIgnore
	private JobSeeker jobseeker;



	public int getJobSeekerId() {
		return jobSeekerId;
	}



	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}



	public SocialMedia() {
		super();
	}



	public SocialMedia(int id, String linkedlnAddress, String githubAddress, JobSeeker jobseeker,int jobSeekerId) {
		super();
		this.id = id;
		this.linkedlnAddress = linkedlnAddress;
		this.githubAddress = githubAddress;
		this.jobSeekerId=jobSeekerId;
		this.jobseeker.setId(jobSeekerId);
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLinkedlnAddress() {
		return linkedlnAddress;
	}



	public void setLinkedlnAddress(String linkedlnAddress) {
		this.linkedlnAddress = linkedlnAddress;
	}



	public String getGithubAddress() {
		return githubAddress;
	}



	public void setGithubAddress(String githubAddress) {
		this.githubAddress = githubAddress;
	}



	public JobSeeker getJobseeker() {
		return jobseeker;
	}



	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}

	


	

}
