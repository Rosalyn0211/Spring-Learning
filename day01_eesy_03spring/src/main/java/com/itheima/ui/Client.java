package com.itheima.ui;


import com.itheima.dao.IAccountDao;
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
     * 获取spring的Ioc核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类：
     *      ClassPathXmlApplicationContext:加载lei路径下的配置文件，要求配置文件必须在类路径下，不在的话，无法加载
     *      FileSystemApplicationContext：加载磁盘任意路径下的配置文件（必须有访问权限）
     *      AnnotationConfigApplicationContext:用于读取注解创建容器
     *
     * 核心容器的两个接口引发出的问题：
     * ApplicationContext：单例对象时使用
     *      它在构建核心容器时，创建对象采取的策略是采用立即加载的方式，读取配置文件后马上创建配置文件中配置的对象
     * BeanFactory：多例对象时使用
     *      它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式，什么时候id获取对象，什么时候创建对象
     * @param args
     */

    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);
//        as.saveAccount();

    }
}
