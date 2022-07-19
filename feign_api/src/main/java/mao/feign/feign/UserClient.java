package mao.feign.feign;


import mao.feign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Project name(项目名称)：spring_cloud_demo_Feign
 * Package(包名): mao.order_service.feign
 * Interface(接口名): UserClient
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/16
 * Time(创建时间)： 21:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@FeignClient(value = "userservice",path = "/user")
public interface UserClient
{
    @GetMapping("/{id}")
    User queryById(@PathVariable("id") Long id);
}
