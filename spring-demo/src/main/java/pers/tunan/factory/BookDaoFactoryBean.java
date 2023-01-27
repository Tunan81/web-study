package pers.tunan.factory;

import org.springframework.beans.factory.FactoryBean;
import pers.tunan.dao.BookDao;
import pers.tunan.dao.impl.BookDaoImpl;

/**
 * @author Tunan
 * @version 1.0
 */
public class BookDaoFactoryBean implements FactoryBean<BookDao> {

    //代替原始工厂中创建对象的方法
    @Override
    public BookDao getObject() throws Exception {
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }

    //false:表示非单例
    //true:表示单例
    public boolean isSingleton(){
        return false;
    }

}
