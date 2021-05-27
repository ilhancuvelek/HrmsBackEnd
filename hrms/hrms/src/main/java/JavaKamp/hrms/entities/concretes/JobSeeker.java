package JavaKamp.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="job_seekers")
@PrimaryKeyJoinColumn(name = "jobseeker_id")
public class JobSeeker extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="jobseeker_id")
	private int id;
	
	@Column(name="workingarea_id")
	private int workingareaId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="jobseeker_firstname")
	private String firstName;
	
	@Column(name="jobseeker_lastname")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	
	
	public JobSeeker() {
		super();
	}

	public JobSeeker(int id, int workingareaId, int userId, String firstName, String lastName, String identityNumber,
			Date dateOfBirth) {
		super();
		this.id = id;
		this.workingareaId = workingareaId;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWorkingareaId() {
		return workingareaId;
	}

	public void setWorkingareaId(int workingareaId) {
		this.workingareaId = workingareaId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	

}
