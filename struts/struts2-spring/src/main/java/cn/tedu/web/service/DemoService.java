package cn.tedu.web.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String test() {
        System.out.println(Thread.currentThread().getId());
        return "Hello World!";
    }
}
