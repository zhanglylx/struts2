package cn.tedu.action;


/**
 * Struts2 利用Bean属性接收浏览器传递的参数
 * /demo/param?name=tom
 */
public class ParamAction {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() {
        System.out.println(name);
        return "success";
    }

}
