package mao.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Project name(项目名称)：spring_cloud_demo_Gateway
 * Package(包名): mao.gateway.filter
 * Class(类名): AuthorizationGlobalFilter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/18
 * Time(创建时间)： 18:38
 * Version(版本): 1.0
 * Description(描述)： 全局过滤器
 */

//@Order(1)
@Component
public class AuthorizationGlobalFilter implements GlobalFilter , Ordered
{

    /**
     * 过滤器方法
     * @param exchange 请求上下文，里面可以获取Request、Response等信息
     * @param chain 用来把请求委托给下一个过滤器
     * @return 返回标示当前过滤器业务结束
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain)
    {
        //获取请求参数
        MultiValueMap<String, String> queryParams = exchange.getRequest().getQueryParams();
        //获取authorization的值
        String authorization = queryParams.getFirst("authorization");
        //判断是否为空
        if (authorization == null || authorization.equals(""))
        {
            //空，拦截
            //状态码403
            exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
            //结束
            return exchange.getResponse().setComplete();
        }
        //判断是否为admin
        if (!authorization.equals("admin"))
        {
            //拦截
            //状态码403
            exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
            //结束
            return exchange.getResponse().setComplete();
        }
        //放行
        return chain.filter(exchange);
    }

    /**
     * 用于设置优先级别，值越大过滤器越后执行，还可以使用注解@Order(1)
     * @return 优先级
     */
    @Override
    public int getOrder()
    {
        return 1;
    }
}
