package cn.tedu.web;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * 所有控制器的基类，用于封装常用的session,
 * request等，用于提供给子类进行复用
 * ActionSupport是Struts2提供了Action基础类
 * 用于复用公共代码的类
 */
public abstract class BaseAction extends ActionSupport implements SessionAware
        , ApplicationAware
        , RequestAware {
    protected Map<String, Object> session;
    protected Map<String, Object> application;
    protected Map<String, Object> request;

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.application = map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }
}
