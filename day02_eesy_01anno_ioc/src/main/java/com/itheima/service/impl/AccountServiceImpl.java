package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Rosalyn
 * @create 2020-03-04 11:38
 * 账户业务层实现类
 * XML配置
 * <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl"
 *      scope="" init-method="" destroy-method="" >
 *      <property name="" value="" / ref=""></property>
 * </bean>
 *
 * 用于创建对象的
 *      他们的作用就和在xml配置文件中编写一个<bean>标签实现的功能是一样的
 *      @Component:
 *          作用:用于把当前类对象存入spring容器中
 *          属性:
 *              value:用于指定bean的id,当我们不写时它的默认值是当前类名,且首字母改为小写
 *      @Controller:一般用于表现层
 *      @Service:一般用于业务层
 *      @Repository:一般用于持久层
 *      以上三个注解他们的作用和属性与Component是一样的
 *      他们三个是spring框架为我们提供的明确的三层使用的注释,使我们的三层对象更加清晰
 *
 * 用于注入数据的
 *      他们的作用就和在xml配置文件中的bean标签中写一个<property>标签的作用是一样的
 *      @Autowired
 *          作用:自动按照类型注入,只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配,就可以注入成功
 *              如果ioc容器中没有任何bean和要注入的类匹配,则注入失败
 *          出现位置:
 *              可以是变量上,也可以是方法上
 *          细节:
 *              在使用注解注入时,set方法就不是必须的了
 *       @Qualifier:
 *          作用:在按照类中注入的基础之上再按照名称注入,再给类成员注入时不饿能单独使用,但是在给方法参数注入式可以单独是使用
 *       @Resource:
 *          作用:直接按照bean的id注入,可独立使用
 *          属性:
 *              name:用于指定bean的id
 *       以上三个注入都只能注入其他bean类型的数据,而基本数据和String类型无法使用上述注解实现
 *       另外,集合类型的注入只能通过XML来实现
 *
 *       @Value:
 *          作用:用于注入基本类型和string类型的数据
 *          属性:
 *              value:用于指定数据的值.它可以使用spring中SpEL(也就是spring的el表达式)
 *                      SpEL的写法:${表达式}
 * 用于改变作用范围的
 *      他们的作用就和在bean标签中使用scope中实现的功能是一样的
 *      @Scope:
 *          作用:用于指定bean的作用范围
 *          属性:
 *              value:指定范围的取值,常用取值:singleton prototype
 *
 * 和生命周期相关
 *      他们的作用就和在bean标签中使用init-method和destroy-method是一样的
*        @PostConstruct
 *        指定初始化方法
 *       @PreDestroy
 *        指定销毁方法
 */

@Service(value = "accountService")
public class AccountServiceImpl implements IAccountService {

//    @Autowired
//    @Qualifier
    @Resource(name = "accountDao")
    private IAccountDao accountDao;

    public void saveAccount(){
        accountDao.saveAccount();

    }

}
