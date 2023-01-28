package pers.tunan.domain;

import java.io.Serializable;

/**
 * @author Tunan
 * @version 1.0
 */

@SuppressWarnings("all")
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;

    public Account() {
    }

    public Account(Integer id, String name, Double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return money
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    public String toString() {
        return "Account{id = " + id + ", name = " + name + ", money = " + money + "}";
    }
}
