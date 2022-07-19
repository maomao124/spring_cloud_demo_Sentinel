package mao.user_service.controller;

import lombok.extern.slf4j.Slf4j;
import mao.user_service.entity.TestConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name(项目名称)：spring_cloud_demo_nacos_configuration_management
 * Package(包名): mao.user_service.controller
 * Class(类名): TestController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/15
 * Time(创建时间)： 21:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Slf4j
@RestController
public class TestController
{

    @Autowired
    private TestConfigurationProperties testConfigurationProperties;

    /**
     * Test test configuration properties.
     *
     * @return the test configuration properties
     */
    @GetMapping("/test")
    public TestConfigurationProperties test()
    {
        log.info(testConfigurationProperties.toString());
        return testConfigurationProperties;
    }
}
