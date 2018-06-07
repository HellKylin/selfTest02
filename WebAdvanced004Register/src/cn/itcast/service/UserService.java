package cn.itcast.service;

import java.sql.SQLException;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

public class UserService {
	public boolean register(User user) throws SQLException {
		UserDao userDao = new UserDao();
		boolean flag = userDao.find(user);
		if(flag) {
			return false;
		}else {
			userDao.save(user);
			return true;
		}
	}
}
