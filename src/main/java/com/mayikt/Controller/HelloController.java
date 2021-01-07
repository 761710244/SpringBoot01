package com.mayikt.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 加上该注解，该类中所有SpringMVCUrl中接口映射都是反馈json格式
 * 该注解是由SpringMVC提供，而不是由Spring提供
 * RestController返回的是json，即返回的内容可以被浏览器识别
 * Controller返回的只是页面的跳转，若单纯返回字符串无法被浏览器识别
 */

/**
 * @EnableAutoConfiguration 只是当前类被扫到，可以加@ComponentScan新包的范围
 */
@RestController
@RequestMapping("/water")
public class HelloController {

    @Value("${x-username}")
    private String name;
    @Value("${x-age}")
    private String age;

    @Value("${mayikt.name}")
    private String username;
    @Value("${mayikt.age}")
    private String userAge;

    @GetMapping("/getUser")
    public String getUser() {
        return name + "--" + age;
    }

    @GetMapping("/getAns")
    public String getAns() {
        return "1123";
    }

    @GetMapping("/getProperty")
    public String getProperty() {
        return username + "--" + userAge;
    }
}
