package com.itheima.jdbctemplate;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JDBCTemplate的最基本用法
 * @author Rosalyn
 * @create 2020-03-14 20:26
 */
public class JdbcTemplateDome4 {
    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IAccountDao accountDao = ac.getBean("accountDao",IAccountDao.class);
        //3.执行操作
        Account account = accountDao.findAccountById(1);
        System.out.println(account);
        account.setMoney(30000f);
        accountDao.updateAccount(account);


    }
}

