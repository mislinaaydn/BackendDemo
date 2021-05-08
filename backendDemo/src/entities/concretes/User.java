package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String lastName;
	private String firstName;
	private String email;
	private String password;

	public User(final int id, final String lastName, final String firstName, final String email,
			final String password) {

		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
