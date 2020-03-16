package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;

/**
 * @author Rosalyn
 * @create 2020-03-06 11:06
 * 账户的持久层实现类
 *
 */
public class AccountDaoImpl implements IAccountDao{
    public void saveAccount(){
        System.out.println("保存了账户");
    }
}
