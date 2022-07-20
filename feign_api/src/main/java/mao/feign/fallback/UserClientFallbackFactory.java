package mao.feign.fallback;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import mao.feign.entity.User;
import mao.feign.feign.UserClient;
import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：spring_cloud_demo_Sentinel
 * Package(包名): mao.feign.fallback
 * Class(类名): UserClientFallbackFactory
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/20
 * Time(创建时间)： 20:11
 * Version(版本): 1.0
 * Description(描述)： 降级逻辑
 */

@Slf4j
public class UserClientFallbackFactory implements FallbackFactory<UserClient>
{

    @Override
    public UserClient create(Throwable throwable)
    {
        return new UserClient()
        {
            @Override
            public User queryById(Long id)
            {
                log.error("查询用户失败！" + throwable.getMessage());
                //返回一个空的用户信息
                return new User();
            }
        };
    }
}
