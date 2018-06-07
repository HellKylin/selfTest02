package cn.itcast.domain;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 实现序列化接口，生成版本号
	 */
	private static final long serialVersionUID = -166812645863203329L;
	/* uid VARCHAR(32) PRIMARY KEY,
	 username VARCHAR(100) UNIQUE,
	 PASSWORD VARCHAR(100),
	 email VARCHAR(100),
	 NAME VARCHAR(100),
	 sex VARCHAR(10)*/
	private String uid;
	private String username;
	private String password;
	private String email;
	private String name;
	private String sex;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uid, String username, String password, String email, String name, String sex) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
		this.sex = sex;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", email=" + email + ", name="
				+ name + ", sex=" + sex + "]";
	}
	
}
