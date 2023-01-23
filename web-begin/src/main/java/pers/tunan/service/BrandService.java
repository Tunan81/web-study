package pers.tunan.service;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pers.tunan.mapper.BrandMapper;
import pers.tunan.pojo.Brand;
import pers.tunan.util.MapperConfig;

import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 */
public class BrandService {
    private SqlSession session;

    public BrandService(){
        session = MapperConfig.getSession();
    }

    /**
     * 查询所有
     * @return
     */
    public List<Brand> selectAll(){
        BrandMapper mapper = session.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        MapperConfig.closeSession(session);
        return brands;
    }
}
