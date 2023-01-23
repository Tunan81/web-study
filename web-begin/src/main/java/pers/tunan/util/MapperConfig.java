package pers.tunan.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Tunan
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapperConfig {
    private static SqlSessionFactory factory;

    //static初始化就加载
    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        try {
            //获取SqlSessionFactory对象
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            factory = builder.build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取SqlSessionFactory对象后，获得sqlsession实例
    public static SqlSession getSession() {
        //自动提交事务
        return factory.openSession(true);
    }

    //关闭SqlSession
    public static void closeSession(SqlSession session) {
        if (session != null) {
            session.close();
        }
    }

/*    private MapperConfig() {

    }*/
}
