package mao.order_service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Project name(项目名称)：spring_cloud_demo_implement_remote_invocation_of_microservices
 * Package(包名): mao.order_service.config
 * Class(类名): RestTemplateConfig
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/9
 * Time(创建时间)： 20:08
 * Version(版本): 1.0
 * Description(描述)： RestTemplate的配置类，位于子项目order_service
 */

@Configuration
public class RestTemplateConfig
{

    /**
     * 注入RestTemplate到spring容器
     *
     * @return restTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
