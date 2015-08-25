package com.atguigu.bookstore.dao;

import com.atguigu.bookstore.domain.Account;

public interface AccountDAO {

	/**
	 * 
	 * @param accountId
	 * @return
	 */
	public abstract Account get(Integer accountId);

	/**
	 * 
	 * @param accountId
	 * @param amount
	 */
	public abstract void updateBalance(Integer accountId, float amount);

}