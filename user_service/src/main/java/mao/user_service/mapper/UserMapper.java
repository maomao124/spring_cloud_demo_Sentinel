package mao.user_service.mapper;

import mao.user_service.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Project name(项目名称)：spring_cloud_demo
 * Package(包名): mao.user_service.mapper
 * Interface(接口名): UserMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 13:45
 * Version(版本): 1.0
 * Description(描述)： mybatis mapper接口
 */

@Mapper
public interface UserMapper
{
    @Select("select * from tb_user where id = #{id}")
    User findById(@Param("id") Long id);
}
