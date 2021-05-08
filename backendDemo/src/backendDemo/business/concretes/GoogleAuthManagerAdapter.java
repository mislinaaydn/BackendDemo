package backendDemo.business.concretes;

import backendDemo.business.abstracts.AuthService;
import backendDemo.business.abstracts.UserService;
import entities.concretes.User;
import entities.concretes.UserForLoginDto;
import entities.concretes.UserForRegisterDto;
import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{
	private final GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	private final UserService userService;

	public GoogleAuthManagerAdapter(final UserService userService) {
		this.userService = userService;
	}
	@Override
	public void login(UserForLoginDto userForLoginDto) throws Exception {
		final boolean result = googleAuthManager.auth();
		if (!result)
			throw new Exception("Google authorization failed.");
		System.out.println(userForLoginDto.getEmail() + " successfully logged.");
	}

	@Override
	public void register(UserForRegisterDto userForRegisterDto) throws Exception {
		final boolean result = googleAuthManager.auth();
		if (!result)
			throw new Exception("Google authorization failed.");

		final User user = new User(1, userForRegisterDto.getEmail(), userForRegisterDto.getPassword(),
				userForRegisterDto.getFirstName(), userForRegisterDto.getLastName());
		userService.add(user);

		System.out.println(userForRegisterDto.getEmail() + " registered.");
		
	}

}
