package solera.task.java.custom.task.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




@Entity
@Table(name = "client")
@Getter
@Setter
@ToString
public class CustomTableHeisuSilviu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstName;

	private String lastName;


	private String phoneNumber;

	@Email
	private String email;

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	private void setPhoneNumber(String phoneNumber) {
		if(isNumeric(phoneNumber)==true) {
			this.phoneNumber=phoneNumber;
		}
	}
	
		public CustomTableHeisuSilviu() {
		super();
	}
		public CustomTableHeisuSilviu(String firstName, String lastName, String phoneNumber,String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			setPhoneNumber(phoneNumber);
		
			this.email = email;
		}
}