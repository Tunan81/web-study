package pers.tunan.dao.impl;

import pers.tunan.dao.BookDao;

/**
 * @author Tunan
 * @version 1.0
 */
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }

    //表示bean初始化的操作
    public void init(){
        System.out.println("init方法被执行");
    }
    //表示bean销毁前的操作
    public void destory(){
        System.out.println("destory方法被执行");
    }
}
