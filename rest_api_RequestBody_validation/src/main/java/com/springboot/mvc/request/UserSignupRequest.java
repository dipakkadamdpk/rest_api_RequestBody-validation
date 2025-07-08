package com.springboot.mvc.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserSignupRequest {

	@NotBlank
	@NotNull
	@Size(min = 5, max = 20, message = "username inbetween 5 to 20 chars")
	@NotEmpty
	private String userName;

	@NotBlank
	@NotNull
	//@Size(min = 5, max = 50, message = "PAssword inbetween 5 to 20 chars")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$", message = "Password must be at least 8 characters long and contain at least one uppercase, one lowercase, one digit, and one special character")
	private String password;

	@Email
	private String emailId;


	@Min(value = 18, message = "Min age should be 18")
	@Max(value = 100, message = "Max age should be 100")
	private int age;

	@NotBlank(message = "Gender is required")
	@Pattern(regexp = "Male|Female|Other", message = "Gender must be Male, Female, or Other")
	private String gender;
	
	@NotBlank(message = "City is required")
    @Size(min = 2, max = 50, message = "City name must be between 2 and 50 characters")
	private String city;

	public UserSignupRequest(String userName, String password, String emailId, int age, String gender, String city) {
		super();
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
		this.city = city;
	}

	public UserSignupRequest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserSignupRequest [userName=" + userName + ", password=" + password + ", emailId=" + emailId + ", age="
				+ age + ", gender=" + gender + ", city=" + city + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
