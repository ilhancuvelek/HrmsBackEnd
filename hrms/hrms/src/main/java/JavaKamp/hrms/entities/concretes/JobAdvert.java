package JavaKamp.hrms.entities.concretes;

import java.time.LocalDate;

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
@Table(name="job_adverts")
public class JobAdvert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_advert_id")
	private int jodAdvertId;
	
	@Column(name="workingarea_id",insertable = false,updatable = false)
	private int workingareaId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="city_id",insertable = false,updatable = false)
	private int cityId;
	
	@Column(name="employer_id",insertable = false,updatable = false)
	private int employerId;
	
	@Column(name="open_position_count")
	private int openPositionId;
	
	@Column(name="is_active")
	@JsonIgnore
	private boolean isActive;
	

	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="is_open")
	@JsonIgnore
	private boolean isOpen;
	
	@Column(name="published_date")
	private LocalDate publishedDate;
	
	@Column(name="is_deleted")
	@JsonIgnore
	private boolean isDeleted;
	
	
	
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	@JsonIgnore
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	@JsonIgnore
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "workingarea_id")
	@JsonIgnore
	private WorkingArea workingArea;
	
	

	public JobAdvert() {
		super();
	}



	



	public JobAdvert(int jodAdvertId, int workingareaId, String description, int cityId, int employerId,
			int openPositionId, boolean isActive, int minSalary, int maxSalary, LocalDate deadline, boolean isOpen,
			LocalDate publishedDate, boolean isDeleted, City city, Employer employer, WorkingArea workingArea) {
		super();
		this.jodAdvertId = jodAdvertId;
		this.workingareaId = workingareaId;
		this.description = description;
		this.cityId = cityId;
		this.employerId = employerId;
		this.openPositionId = openPositionId;
		this.isActive = isActive;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.deadline = deadline;
		this.isOpen = isOpen;
		this.publishedDate = publishedDate;
		this.isDeleted = isDeleted;
		this.city = city;
		this.employer = employer;
		this.workingArea = workingArea;
	}







	public int getJodAdvertId() {
		return jodAdvertId;
	}







	public void setJodAdvertId(int jodAdvertId) {
		this.jodAdvertId = jodAdvertId;
	}







	public int getWorkingareaId() {
		return workingareaId;
	}







	public void setWorkingareaId(int workingareaId) {
		this.workingareaId = workingareaId;
	}







	public String getDescription() {
		return description;
	}







	public void setDescription(String description) {
		this.description = description;
	}







	public int getCityId() {
		return cityId;
	}







	public void setCityId(int cityId) {
		this.cityId = cityId;
	}







	public int getEmployerId() {
		return employerId;
	}







	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}







	public int getOpenPositionId() {
		return openPositionId;
	}







	public void setOpenPositionId(int openPositionId) {
		this.openPositionId = openPositionId;
	}







	public boolean isActive() {
		return isActive;
	}







	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}







	public int getMinSalary() {
		return minSalary;
	}







	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}







	public int getMaxSalary() {
		return maxSalary;
	}







	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}







	public LocalDate getDeadline() {
		return deadline;
	}







	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}







	public boolean isOpen() {
		return isOpen;
	}







	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}







	public LocalDate getPublishedDate() {
		return publishedDate;
	}







	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}







	public boolean isDeleted() {
		return isDeleted;
	}







	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}







	public City getCity() {
		return city;
	}







	public void setCity(City city) {
		this.city = city;
	}







	public Employer getEmployer() {
		return employer;
	}







	public void setEmployer(Employer employer) {
		this.employer = employer;
	}







	public WorkingArea getWorkingArea() {
		return workingArea;
	}







	public void setWorkingArea(WorkingArea workingArea) {
		this.workingArea = workingArea;
	}







	
	
	

}
