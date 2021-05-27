package JavaKamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="system_employees")
@PrimaryKeyJoinColumn(name="systememployee_id")
public class SystemEmployee extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="systememployee_id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="workingarea_id")
	private String workingareaId;
	
	@Column(name="systememployee_firstname")
	private String firstName;
	
	@Column(name="systememployee_lastname")
	private String lastName;
	
	

	public SystemEmployee() {
		super();
	}

	public SystemEmployee(int id, int userId, String firstName, String lastName,String workingareaId) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingareaId=workingareaId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getWorkingareaId() {
		return workingareaId;
	}

	public void setWorkingareaId(String workingareaId) {
		this.workingareaId = workingareaId;
	}
	

}
