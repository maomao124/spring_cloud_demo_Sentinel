package mao.order_service.originParser;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Project name(项目名称)：spring_cloud_demo_Sentinel
 * Package(包名): mao.order_service.originParser
 * Class(类名): HeaderOriginParser
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/22
 * Time(创建时间)： 13:10
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Component
public class HeaderOriginParser implements RequestOriginParser
{

    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest)
    {
        //获取头origin的信息
        String origin = httpServletRequest.getHeader("origin");
        //判断是否为空
        if (origin==null||origin.equals(""))
        {
            return "no";
        }
        return origin;
    }
}
