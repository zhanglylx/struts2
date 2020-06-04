package cn.tedu.web;

import cn.tedu.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class WebAction extends BaseAction {
    //    注入业务层组件
    @Autowired
    private DemoService demoService;

    public String execute() {
        System.out.println("Web Action");
        this.request.put("message", "I am from Spring!");
//        控制器访问业务层，调用业务层组件方法
        String str = this.demoService.test();
        this.session.put("session", str);
        return SUCCESS;
    }
}
