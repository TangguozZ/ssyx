package com.atguigu.ssyx.acl.controller;


import com.atguigu.ssyx.common.result.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：tangzhiqiang
 * @Date：2023/6/26 23:35
 * @Filename：IndexController
 */
@RestController
@RequestMapping("/admin/acl/index")
public class IndexController {


    @PostMapping("/login")
    public Result login() {
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("token", "token-admin");
        return Result.ok(resMap);
    }

    @PostMapping("/info")
    public Result info() {
        Map<String, Object> infoMap = new HashMap<>();
        infoMap.put("name", "admin");
        infoMap.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(infoMap);
    }

    @PostMapping("/logout")
    public Result logout() {
        return Result.ok(null);
    }

}
