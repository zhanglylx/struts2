package cn.tedu.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class DemoAction {
    public String execute() {
        System.out.println("DemoAction");
        return "success";
    }
}
