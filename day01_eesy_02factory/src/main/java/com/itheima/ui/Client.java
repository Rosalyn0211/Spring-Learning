package com.itheima.ui;

import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;

/**
 * @author Rosalyn
 * @create 2020-03-06 11:16
 * 模拟表现层调用业务层
 */
public class Client {
    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();
        IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
        as.saveAccount();

    }
}
