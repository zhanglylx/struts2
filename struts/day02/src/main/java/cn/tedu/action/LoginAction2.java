package cn.tedu.action;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Struts2可以将session注入到实现SessionAware接口的Action对象中
 *
 * 定义一个Action的抽象父类，封装session等公共的方法。
 * 子类只需要继承抽象父类就可以获取这些公共方法。
 */
public class LoginAction2 implements SessionAware {
    //    利用UserInfo封装表单信息
    private UserInfo user;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public String execute() {
        /*
        ActionContext 在Struts2中代表当前Struts2环境相关信息,第一中方式
         */
//        ActionContext ctx = ActionContext.getContext();
        /*
          Map类型的session不依赖于Servlet API
          HttpSession（与Servlet API 耦合性低）
           就可以进行与容器无关的测试等离线操作
           离线：脱离Web容器单独使用！比如进行JUnit测试
           在底层Struts2容器会将map session中的信息同步
           到HttpSession中
         */
//        Map<String, Object> session = ctx.getSession();
        this.session.put("loginName", "  ActionContext 在Struts2中代表当前Struts2环境相关信息");
        if ("tom".equals(user.getName())
                && "123".equals(user.getPassword())) {
            message = "欢迎TOM";
            return "success";
        }
        message = "用户名或密码错误！";
        return "error";
    }

    private Map<String, Object> session;

    /**
     * 第二种方式
     *
     * @param map
     */
    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
