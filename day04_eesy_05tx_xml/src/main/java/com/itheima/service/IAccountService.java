package com.itheima.service;

import com.itheima.domain.Account;

/**
 * 账户的业务层接口
 * @author Rosalyn
 * @create 2020-03-16 12:13
 */
public interface IAccountService {

    /**
     * 根据id查询账户信息
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 转账
     * @param sourceName
     * @param targetName
     * @param money
     */
    void transfer(String sourceName,String targetName,Float money);

}
