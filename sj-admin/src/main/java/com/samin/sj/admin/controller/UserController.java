package com.samin.sj.admin.controller;

import com.samin.sj.admin.bean.UserVo;
import com.samin.sj.admin.service.UserService;
import com.samin.sj.sdk.bean.BaseResp;
import com.samin.sj.sdk.bean.PageReq;
import com.samin.sj.sdk.bean.PageResp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/page")
    public BaseResp<PageResp<UserVo>> page(PageReq<Void> req) {
        return BaseResp.success(userService.page(req));
    }

    @PostMapping("/disable/{id}")
    public BaseResp<Void> disable(@PathVariable Integer id) {
        userService.disable(id);
        return BaseResp.success();
    }
}