package eTicaretÖdev.business.abstracts;

import java.util.List;

import eTicaretÖdev.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(int userId);
	User get(String eMail);
	List<User> getAll();
	

}
