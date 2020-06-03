package cn.tedu.action;

public class LoginAction2 {
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
        if ("tom".equals(user.getName())
                && "123".equals(user.getPassword())) {
            message = "欢迎TOM";
            return "success";
        }
        message = "用户名或密码错误！";
        return "error";
    }
}
