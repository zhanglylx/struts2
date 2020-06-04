package cn.tedu.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class WebAction extends BaseAction {
    public String execute() {
        System.out.println("Web Action");
        this.request.put("message", "I am from Spring!");
        return SUCCESS;
    }
}
