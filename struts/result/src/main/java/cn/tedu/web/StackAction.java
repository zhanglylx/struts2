package cn.tedu.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
public class StackAction {
    private String message;
    private Map<String, Object> map;
    private Map<String, Object>[] data;
    private String texts;
    private List<User> list;

    public String getTexts() {
        return texts;
    }

    public void setTexts(String texts) {
        this.texts = texts;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, Object>[] getData() {
        return data;
    }

    public void setData(Map<String, Object>[] data) {
        this.data = data;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String execute() {
        System.out.println("StackAction");
        this.message = "Hello World!";
        this.map = new HashMap<>();
        this.map.put("name", "Tom");
        this.map.put("age", 20);
        this.map.put("user.address", "北京");
        this.map.put("001", "狗狗");
        this.data = new Map[2];
        this.data[0] = new HashMap<>();
        this.data[1] = new HashMap<>();
        this.data[0].put("name", "Tom");
        this.data[0].put("age", 20);
        this.data[1].put("name", "Jerry");
        this.data[1].put("age", 18);
        this.list = new ArrayList<>();
        this.list.add(new User("Andy", 10));
        this.list.add(new User("John", 15));
        return "success";
    }
}
