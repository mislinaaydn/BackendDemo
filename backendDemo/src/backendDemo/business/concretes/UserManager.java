package backendDemo.business.concretes;

import java.util.List;

import backendDemo.business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{

	private final UserDao userDao;

	public UserManager(final UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void add(User user) throws Exception {
		userDao.add(user);
		
	}

	@Override
	public void updated(User user) throws Exception {
		userDao.update(user);
		
	}

	@Override
	public void deleted(User user) throws Exception {
		userDao.delete(user);
	}

	@Override
	public User get(int id) throws Exception {
		return userDao.get(id);
		
	}

	@Override
	public List<User> getall() throws Exception {
		return userDao.getAll();
	}

	
}
