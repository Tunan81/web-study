package pers.tunan.dao.impl;

import pers.tunan.dao.BookDao;

/**
 * @author Tunan
 * @version 1.0
 */
public class BookDaoImpl implements BookDao {
    private final String databaseName;
    private final int connectionNum;

    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    public void save() {
        System.out.println("book dao save ..." + databaseName + "--"+ connectionNum);
    }
}
