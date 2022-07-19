package mao.user_service.service;

import mao.user_service.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_cloud_demo
 * Package(包名): mao.user_service.service
 * Class(测试类名): UserServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 14:17
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class UserServiceTest
{

    @Resource
    private UserService userService;

    @Test
    void queryById()
    {
        User user = userService.queryById(1L);
        System.out.println(user);
    }
}