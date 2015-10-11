package org.our.note.dao.user; 

import java.util.List;

import org.our.note.dao.BaseDao;
import org.our.note.model.user.User;
import org.springframework.stereotype.Repository;


@Repository(value="userDao")
public class UserDao  extends BaseDao{

	@Override
	protected Class<?> entityClass() {
		return User.class;
	}

	public List<User> getAll(){
		return super.list();
	}
	
	public User add(User user) {
        return super.add(user);
    }
}
 