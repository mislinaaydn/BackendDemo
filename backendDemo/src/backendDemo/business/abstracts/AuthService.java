package backendDemo.business.abstracts;

import entities.concretes.UserForLoginDto;
import entities.concretes.UserForRegisterDto;

public interface AuthService {
void login (UserForLoginDto userForLoginDto)throws Exception;
void register(UserForRegisterDto userForRegisterDto)throws Exception;
}
