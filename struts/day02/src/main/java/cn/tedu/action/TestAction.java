package cn.tedu.action;

public class TestAction extends BaseAction {
    public String execute() {
        this.session.put("demo1", "Hello Session");
        this.request.put("demo2", "Hello Request");
        this.application.put("demo3", "Hello Application");
        return SUCCESS;
    }
}
