package mao.user_service.controller;

import lombok.extern.slf4j.Slf4j;

import mao.user_service.entity.User;
import mao.user_service.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Project name(项目名称)：spring_cloud_demo
 * Package(包名): mao.user_service.controller
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 13:51
 * Version(版本): 1.0
 * Description(描述)： UserController
 */

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController
{
    @Resource
    private UserService userService;

    /**
     * 获取用户信息
     *
     * @param id 用户的id
     * @return User
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id, @RequestHeader("key1") String key1)
    {
        //log.debug("user被访问了："+id);
        log.info("请求头key1：" + key1);
        return userService.queryById(id);
    }
}
