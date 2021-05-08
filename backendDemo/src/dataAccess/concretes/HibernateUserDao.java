package dataAccess.concretes;




import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(" Kullanýcý Hibernate ile eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(" Kullanýcý Hibernate ile silindi");
		
	}

	@Override
	public User get(int id) {
		System.out.println(" Kullanýcý Hibernate ile return edildi");
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println(" Kullanýcý Hibernate ile listelendi");
		return null;
	}

	@Override
	public void update(User user) {
		System.out.println(" Kullanýcý Hibernate ile güncellendi");
		
	}

}
