package entities.concretes;

import entities.abstracts.Dto.IDto;

public class UserForRegisterDto implements IDto {
	private String password;
	private String firstName;
	private String lastName;
	private String email;

	public UserForRegisterDto(final String password, final String firstName, final String lastName,
			final String email) {

		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}
}
