package com.samin.sj.admin.controller;

import com.samin.sj.sdk.bean.BaseResp;
import com.samin.sj.admin.bean.JobLogVo;
import com.samin.sj.sdk.bean.PageReq;
import com.samin.sj.sdk.bean.PageResp;
import com.samin.sj.admin.service.JobLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobLog")
@RequiredArgsConstructor
public class JobLogController {

    private final JobLogService jobLogService;

    @GetMapping("/page")
    public BaseResp<PageResp<JobLogVo>> page(PageReq<Void> req) {
        return BaseResp.success(jobLogService.page(req));
    }
}
