package com.atguigu.bookstore.dao;

import com.atguigu.bookstore.domain.User;

public interface UserDAO {

	/**
	 * 
	 * @param username
	 * @return
	 */
	public abstract User getUser(String username);

}

