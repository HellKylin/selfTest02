package cn.itcast.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.itcast.domain.User;
import cn.itcast.utils.C3P0Utils;

public class UserDao {
	/**
	 * 
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public boolean find(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT * FROM USER WHERE username = ?;";
		User userData = qr.query(sql, new BeanHandler<>(User.class), user.getUsername());
		return userData != null;
	}

	public void save(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "INSERT INTO USER VALUES (?,?,?,?,?,?);";
		Object[] params = { user.getUid(), user.getUsername(), user.getPassword(), user.getEmail(), user.getName(),
				user.getSex() };
		qr.update(sql, params);
	}
}