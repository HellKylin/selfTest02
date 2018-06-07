package cn.itcast.demo;

import java.util.Arrays;

public class Person {
	private String username;
	private String password;
	private String[] aihao;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, String password, String[] aihao) {
		super();
		this.username = username;
		this.password = password;
		this.aihao = aihao;
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
	public String[] getAihao() {
		return aihao;
	}
	public void setAihao(String[] aihao) {
		this.aihao = aihao;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", password=" + password + ", aihao=" + Arrays.toString(aihao) + "]";
	}
	
	
}
