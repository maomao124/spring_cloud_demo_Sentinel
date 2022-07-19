package mao.order_service.service;

import mao.order_service.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_cloud_demo
 * Package(包名): mao.order_service.service
 * Class(测试类名): OrderServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 14:20
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class OrderServiceTest
{

    @Resource
    private OrderService orderService;

    @Test
    void queryOrderById()
    {
        Order order = orderService.queryOrderById(101L);
        System.out.println(order);
    }
}