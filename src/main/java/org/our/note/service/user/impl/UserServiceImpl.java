package org.our.note.service.user.impl; 

import java.util.Date;
import java.util.List;

import org.our.note.dao.user.UserDao;
import org.our.note.model.user.User;
import org.our.note.service.user.UserServices;
import org.our.note.util.md5.MD5Util;
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

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = java.lang.RuntimeException.class)
    public User add(User user) {
        Date now = new Date();
        user.setEnable(true);
        user.setRegTime(now);
        user.setPassword(MD5Util.digest(user.getPassword()));
        return userDao.add(user);
    }
	
	

}
 