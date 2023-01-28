package pers.tunan.dao.impl;

import pers.tunan.dao.BookDao;

import java.awt.print.Book;

/**
 * @author Tunan
 * @version 1.0
 */
public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;

    public void save() {
        System.out.println("book dao save ...");
    }
}
