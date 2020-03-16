package com.itheima.domain;

import java.io.Serializable;

/**
 * 账户的实体类
 * @author Rosalyn
 * @create 2020-03-09 11:56
 */
public class Account implements Serializable{
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    private Float money;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getMoney() {
        return money;
    }
}
