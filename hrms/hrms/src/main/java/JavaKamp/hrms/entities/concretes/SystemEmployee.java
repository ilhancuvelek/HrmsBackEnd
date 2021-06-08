package JavaKamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@Entity
@Table(name="system_employees")
@EqualsAndHashCode(callSuper=false) 
@PrimaryKeyJoinColumn(name="user_id")
public class SystemEmployee extends User{
	

	
	@Column(name="workingarea_id")
	private String workingareaId;
	
	@Column(name="systememployee_firstname")
	private String firstName;
	
	@Column(name="systememployee_lastname")
	private String lastName;
	
	

	public SystemEmployee() {
		super();
	}

	public SystemEmployee(int id, String firstName, String lastName,String workingareaId) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.workingareaId=workingareaId;
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
