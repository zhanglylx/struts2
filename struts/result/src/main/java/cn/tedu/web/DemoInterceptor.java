package cn.tedu.web;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.springframework.stereotype.Component;

/**
 * 拦截器
 */
@Component
public class DemoInterceptor implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("开始");
        String val = "success";
        val = actionInvocation.invoke();//调用后续的控制器
        System.out.println("结束");
        return val;
    }
}
