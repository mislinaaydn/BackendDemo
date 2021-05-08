package backendDemo.business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void add(User user)throws Exception;;

	void updated(User user)throws Exception;;

	void deleted(User user)throws Exception;;

	User get(int id)throws Exception;;

	List<User> getall()throws Exception;;

}
