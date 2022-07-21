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
    public User queryById(@PathVariable("id") Long id, @RequestHeader(name = "key1", required = false) String key1)
    {
        //log.debug("user被访问了："+id);
        log.info("请求头key1：" + key1);
        if (id == 1)
        {
            //慢调用
            //一定概率触发
            if (Math.random() < 0.3)
            {
                try
                {
                    //100毫秒，大于50毫秒
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
        else if (id == 2)
        {
            //异常
            //一定概率触发
            if (Math.random() < 0.5)
            {
                throw new RuntimeException("熔断策略-异常比例");
            }
        }
        else if (id == 3)
        {
            //异常
            //一定触发
            throw new RuntimeException("熔断策略-异常数");
        }
        return userService.queryById(id);
    }
}
