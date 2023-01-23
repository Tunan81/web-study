package pers.tunan.mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import pers.tunan.pojo.Brand;

import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 */
public interface BrandMapper {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from tb_brand")
    @ResultMap("BrandMap")
    List<Brand> selectAll();
}
