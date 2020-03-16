package com.itheima.ui;



import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rosalyn
 * @create 2020-03-06 11:16
 * 模拟表现层调用业务层
 */
public class Client {
    /**
     * @param args
     */

    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
//        IAccountService as = (IAccountService)ac.getBean("accountService");
//        as.saveAccount();
//        IAccountService as = (IAccountService)ac.getBean("accountService2");
//        as.saveAccount();
        IAccountService as = (IAccountService)ac.getBean("accountService3");
        as.saveAccount();


    }
}
