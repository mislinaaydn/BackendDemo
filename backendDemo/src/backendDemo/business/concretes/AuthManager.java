package backendDemo.business.concretes;

import backendDemo.business.abstracts.AuthService;
import backendDemo.business.abstracts.UserService;
import entities.concretes.User;
import entities.concretes.UserForLoginDto;
import entities.concretes.UserForRegisterDto;
import utils.Email;
import utils.Validation;

public class AuthManager implements AuthService{

	private final UserService userService;
	

	public AuthManager(final UserService userService) {
		this.userService = userService;
	
	}
	public void checkFirstNameAndLastName(String firstName, String lastName) throws Exception {
		final boolean result = firstName.length() >= 2 && lastName.length() >= 2;
		if (!result)
			throw new Exception("---En az iki karakter giriniz---");
	}

	@Override
	public void login(UserForLoginDto userForLoginDto) throws Exception {
		Validation.validateFieldsEmpty(userForLoginDto.getEmail(), userForLoginDto.getPassword());

		System.out.println(userForLoginDto.getEmail() + "---Giriþ yapýldý---");
		
	}

	@Override
	public void register(UserForRegisterDto userForRegisterDto) throws Exception {
		
		checkFirstNameAndLastName(userForRegisterDto.getFirstName(), userForRegisterDto.getLastName());
		Validation.validateEmail(userForRegisterDto.getEmail());
		checkUserExists(userForRegisterDto.getEmail());
		checkPasswordStrong(userForRegisterDto.getPassword());

		sendVerificationEmail(userForRegisterDto.getEmail());

		final User user = new User(1, userForRegisterDto.getEmail(), userForRegisterDto.getPassword(),
				userForRegisterDto.getFirstName(), userForRegisterDto.getLastName());
		userService.add(user);

		System.out.println(userForRegisterDto.getEmail() + "---Kayýt olundu---");
	
	}

	public void sendVerificationEmail(final String email) {
		Email.send(email, "---Doðrulama kodu : 123 ---" );
		System.out.println("---Doðrulama kodu gönderildi " + email + ".---");
		
	}

	public void checkPasswordStrong( final String password) throws Exception {
		final boolean result = password.length() >= 6;
		if (!result)
			throw new Exception("--Parola en az 6 karakter olmalý---");
		
	}

	public void checkUserExists(final String email) throws Exception {
		final boolean result = false;
		if (result)
			throw new Exception("---Bu epostaya kayýtlý kullanýcý bulunmaktadýr---");
	}

	
	
	

}
