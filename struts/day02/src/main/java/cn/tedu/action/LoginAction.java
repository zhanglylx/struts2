package cn.tedu.action;

public class LoginAction {
    //    接收两个参数
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //    接收参数的Bean属性必须与界面控件的name属性一致
    public String execute() {
        if ("tom".equalsIgnoreCase(username) && "123".equals(password)){
            message = "tom欢迎回来";
            return "success";
        }
        error = "用户名或密码错误!";
        return "login";
    }
}
