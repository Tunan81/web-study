package team.tunan.mapper;

import team.tunan.domain.Provider;

import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/8
 */
public interface IProviderMapper {
    List<Provider> findAll();
}
