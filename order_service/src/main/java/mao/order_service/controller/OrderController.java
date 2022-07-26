package mao.order_service.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import mao.order_service.entity.Order;
import mao.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name(项目名称)：spring_cloud_demo
 * Package(包名): mao.order_service.controller
 * Class(类名): OrderController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 13:59
 * Version(版本): 1.0
 * Description(描述)： OrderController
 */

@RestController
@RequestMapping("order")
public class OrderController
{
    @Autowired
    private OrderService orderService;


    /**
     * 获取订单数据
     *
     * @param orderId 订单的id
     * @return Order
     */
    @SentinelResource("order_hot")
    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId)
    {
        return orderService.queryOrderById(orderId);
    }

    /**
     * 模拟查询订单
     *
     * @return query
     */
    @GetMapping("/query")
    public String query()
    {
        //return "query";
        return "query" + orderService.queryGoods();
    }

    /**
     * 模拟
     *
     * @return update
     */
    @GetMapping("/update")
    public String update()
    {
        return "update";
    }

    /**
     * 模拟创建订单
     *
     * @return save
     */
    @GetMapping("/save")
    public String save()
    {
        return "save" + orderService.queryGoods();
    }
}
