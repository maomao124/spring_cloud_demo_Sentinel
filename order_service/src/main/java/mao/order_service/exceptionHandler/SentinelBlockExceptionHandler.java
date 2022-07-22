package mao.order_service.exceptionHandler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Project name(项目名称)：spring_cloud_demo_Sentinel
 * Package(包名): mao.order_service.exceptionHandler
 * Class(类名): SentinelBlockExceptionHandler
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/22
 * Time(创建时间)： 13:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component
public class SentinelBlockExceptionHandler implements BlockExceptionHandler
{


    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e)
            throws Exception
    {
        String msg = "未知异常";
        int status = 429;
        if (e instanceof FlowException)
        {
            msg = "请求被限流了！";
        }
        else if (e instanceof DegradeException)
        {
            msg = "请求被降级了！";
        }
        else if (e instanceof ParamFlowException)
        {
            msg = "热点参数限流！";
        }
        else if (e instanceof AuthorityException)
        {
            msg = "请求没有权限！";
            status = 401;
        }

        //设置返回的类型为json
        httpServletResponse.setContentType("application/json;charset=utf-8");
        //设置响应状态码
        httpServletResponse.setStatus(status);
        //写
        httpServletResponse.getWriter().write("{\"message\": \"" + msg + "\" , \"status\": " + status + "}");

    }
}
