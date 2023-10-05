package team.tunan;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import team.tunan.domain.Provider;
import team.tunan.domain.User;
import team.tunan.mapper.IProviderMapper;
import team.tunan.mapper.IUserMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/7
 */
public class MybatisTest {
    @Test
    public void testFindAll(){
        // 1.读取配置文件
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("MybatisConfig.xml");
            // 2.创建SqlSessionFactory工厂
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            // 3.使用工厂生产SqlSession对象
            SqlSession session = factory.openSession();
            // 4.使用SqlSession创建Dao接口的代理对象
            IProviderMapper mapper = session.getMapper(IProviderMapper.class);
            // 5.使用代理对象执行方法
            List<Provider> providers = mapper.findAll();
            for (Provider provider : providers) {
                System.out.println(provider);
            }
            // 6.释放资源
            session.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
