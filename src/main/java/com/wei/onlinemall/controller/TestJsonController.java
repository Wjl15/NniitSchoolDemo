package com.wei.onlinemall.controller;

import com.wei.onlinemall.pogo.Person;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author WeiJinLong
 * @Date 2022-09-15 15:41
 */

@RestController
@RequestMapping("/json")

public class TestJsonController {
//   @PostMapping("/test")
//   public Person testJson(@RequestBody Person user){
//       System.out.println(user.toString());


@GetMapping("/test")
    public List<Map<String, Object>> testJson(@RequestBody(required = false) Person user){
        System.out.println(user.toString());
        List<Map<String, Object>> person = new ArrayList<>();
        Map<String ,Object> map = new HashMap<>();
        map.put("pname","张三");
        map.put("password","123456");
        map.put("page", 20);
        person.add(map);

        Map<String ,Object> map1 = new HashMap<>();
        map1.put("pname","李四");
        map1.put("password","123456");
        map1.put("page", 20);
        person.add(map1);

        Map<String ,Object> map2 = new HashMap<>();
        map2.put("pname","王五");
        map2.put("password","123456");
        map2.put("page", 20);
        person.add(map2);

        return person;

//        return user;

    }
}
