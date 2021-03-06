package com.itheima.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Rosalyn
 * @create 2020-03-06 11:21
 * 一个创建Bean对象的工厂
 * Bean：可重用组件
 * JavaBean > 实体类
 * 创建service和dao对象
 * 1.需要一个配置文件来配置我们的service和dao，配置的内容：唯一标识= 全限定类名
 * 2.读取配置文件，反射创建对象
 * 3.配置文件可以是xml或properties
 */
public class BeanFactory {
    //定义一个Properties对象
    private static Properties props;
    //定义一个Map，用于存放我们创建的对象，我们称之为容器。
    private static Map<String,Object> beans;
    //使用静态代码块为Properties对象赋值
    static {
        try {
            //实例化对象
            props = new Properties();
            //获取properties文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            //实例化我们的容器
            beans = new HashMap<String, Object>();
            //取出配置文件中所有的KEY
            Enumeration keys = props.keys();
            //遍历枚举
            while (keys.hasMoreElements()){
                //取出每个key
                String key = keys.nextElement().toString();
                //根据KEY获取value
                String beanPath = props.getProperty(key);
                //反射创建对象
                Object value = Class.forName(beanPath).newInstance();
                //把key和value存入容器中
                beans.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败！");
        }
    }

    /**
     * 根据bean的名称获取对象
     * @param beanName
     * @return
     */

    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

    /**
     * 根据Bean的名称获取bean对象
     */

//    public static Object getBean(String beanName){
//        Object bean = null;
//        try {
//            String beanPath = props.getProperty(beanName);
//            System.out.println(beanPath);
//            bean = Class.forName(beanPath).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return bean;
//
//    }


}

