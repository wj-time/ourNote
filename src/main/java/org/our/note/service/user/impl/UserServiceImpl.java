package org.our.note.service.user.impl; 

import java.util.List;

import org.our.note.dao.user.UserDao;
import org.our.note.model.user.User;
import org.our.note.service.user.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserServiceImpl implements UserServices{

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<User> getAll() {
		return userDao.getAll();
	}

}
 