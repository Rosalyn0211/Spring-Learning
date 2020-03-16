package com.itheima.service.impl;

import com.itheima.service.IAccountService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Date;

/**
 * @author Rosalyn
 * @create 2020-03-04 11:38
 * 账户业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    //如果时经常变化的数据并不适用于注入的方式
    private String name;
    private Integer age;
    private Date birthday;


    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount(){
        System.out.println("service中的saveAccount方法执行了" + name + "," + age + "," + birthday);

    }

}
