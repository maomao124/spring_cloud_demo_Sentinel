package mao.order_service.config;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project name(项目名称)：spring_cloud_demo_eureka
 * Package(包名): mao.order_service.config
 * Class(类名): RibbonConfig
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/11
 * Time(创建时间)： 20:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Configuration
public class RibbonConfig
{
    /**
     * 配置Ribbon负载均衡规则
     *
     * @return RandomRule
     */
    @Bean
    public IRule nacosRule()
    {
        return new NacosRule();
    }
}
