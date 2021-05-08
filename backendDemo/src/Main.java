import backendDemo.business.abstracts.AuthService;
import backendDemo.business.abstracts.UserService;
import backendDemo.business.concretes.AuthManager;
import backendDemo.business.concretes.UserManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.UserForLoginDto;
import entities.concretes.UserForRegisterDto;


public class Main {

	public static void main(final String[] args) throws Exception {
			final UserDao userDao = new HibernateUserDao();
			final UserService userService = new UserManager(userDao);
			final AuthService authService = new AuthManager(userService);
		
			

		final UserForRegisterDto userForRegisterDto = new UserForRegisterDto("mislina1aydn@outlook.com", "mis12332", "Mislina", "Aydýn");
			authService.register(userForRegisterDto);
				
			final UserForLoginDto userForLoginDto = new UserForLoginDto("mislina1aydn@outlook.com", "1234567");
		authService.login(userForLoginDto);
				
		}

}

