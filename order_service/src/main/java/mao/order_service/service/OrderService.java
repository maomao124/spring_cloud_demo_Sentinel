package mao.order_service.service;

import mao.feign.entity.User;
import mao.feign.feign.UserClient;
import mao.order_service.entity.Order;

import mao.order_service.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Project name(项目名称)：spring_cloud_demo
 * Package(包名): mao.order_service.service
 * Class(类名): OrderService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 13:57
 * Version(版本): 1.0
 * Description(描述)： OrderService
 */

@Service
public class OrderService
{
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    /**
     * 获取订单数据
     *
     * @param orderId 订单的id
     * @return Order
     */
    public Order queryOrderById(Long orderId)
    {
        // 根据orderId获取订单数据
        Order order = orderMapper.findById(orderId);
        //获得用户的id
        Long userId = order.getUserId();
        //发起远程调用
        //url
        //String url = "http://userservice/user/" + userId;
        //User user = restTemplate.getForObject(url, User.class);
        //使用feign发起远程调用
        User user = userClient.queryById(userId);
        //放入order里
        order.setUser(user);
        //返回数据
        return order;
    }
}
