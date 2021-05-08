package eTicaretÖdev.dataAccess.abstracts;

import java.util.List;

import eTicaretÖdev.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void updatae(User user);
	void delete(int userId);
	List<User> getAll();
	User get(String eMail);
	

}
