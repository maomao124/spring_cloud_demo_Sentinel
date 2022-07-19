package mao.user_service.service;

import mao.user_service.entity.User;
import mao.user_service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project name(项目名称)：spring_cloud_demo
 * Package(包名): mao.user_service.service
 * Class(类名): UserService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 13:49
 * Version(版本): 1.0
 * Description(描述)： service层，不想写接口再实现接口
 */

@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;

    /**
     * 从数据库里查询用户信息
     *
     * @param id 用户的id
     * @return User
     */
    public User queryById(Long id)
    {
        return userMapper.findById(id);
    }
}
