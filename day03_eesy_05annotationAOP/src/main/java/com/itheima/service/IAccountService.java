package com.itheima.service;

/**
 * 账户的业务层接口
 * @author Rosalyn
 * @create 2020-03-14 10:53
 */
public interface IAccountService {
    /**
     * 模拟保存账户
     */
    void saveAccount();

    /**
     * 模拟更新账户
     */
    void updateAccount(int i);

    /**
     * 删除账户
     * @return
     */
    int deleteAccount();
}
