package cn.tedu.action;

/**
 * Struts 控制器的默认控制器方法 execute(执行)
 */
public class DemoAction {

    /**
     * 控制器方法，控制方法返回值是视图的ID
     *
     * @return
     */
    public String execute() {
        System.out.println("Hello World!");
        return "msg";
    }
1:23
    public String test(){
        System.out.println("test");
        return "success";
    }
}
