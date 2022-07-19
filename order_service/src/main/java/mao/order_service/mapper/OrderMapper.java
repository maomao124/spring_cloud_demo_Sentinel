package mao.order_service.mapper;

import mao.order_service.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Project name(项目名称)：spring_cloud_demo
 * Package(包名): mao.order_service.mapper
 * Interface(接口名): OrderMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 13:54
 * Version(版本): 1.0
 * Description(描述)： Mapper接口
 */

@Mapper
public interface OrderMapper
{
    @Select("select * from tb_order where id = #{id}")
    Order findById(Long id);
}
