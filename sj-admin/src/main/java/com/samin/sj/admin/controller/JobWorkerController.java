package com.samin.sj.admin.controller;

import com.samin.sj.admin.bean.JobWorkerVo;
import com.samin.sj.admin.service.JobWorkerService;
import com.samin.sj.sdk.bean.BaseResp;
import com.samin.sj.sdk.bean.JobWorkerRegisterDto;
import com.samin.sj.sdk.bean.PageReq;
import com.samin.sj.sdk.bean.PageResp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobWorker")
@RequiredArgsConstructor
public class JobWorkerController {

    private final JobWorkerService jobWorkerService;

    @GetMapping("/page")
    public BaseResp<PageResp<JobWorkerVo>> page(PageReq<Void> req) {
        return BaseResp.success(jobWorkerService.page(req));
    }

    @PostMapping("/register")
    public BaseResp<Boolean> register(@RequestBody JobWorkerRegisterDto dto) {
        return BaseResp.success(jobWorkerService.register(dto));
    }
}
