package entities.concretes;

import entities.abstracts.Dto.IDto;

public class UserForVerificationDto implements IDto {

	private String email;
	private String verificationCode;
	
	public UserForVerificationDto(final String email,final String verificationCode) {
		this.email=email;
		this.verificationCode=verificationCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
}
