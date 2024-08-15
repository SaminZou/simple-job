package com.samin.sj.admin.controller;

import com.samin.admin.bean.*;
import com.samin.sj.admin.bean.JobSaveVo;
import com.samin.sj.admin.bean.JobVo;
import com.samin.sj.admin.service.JobService;
import com.samin.sj.sdk.bean.BaseResp;
import com.samin.sj.sdk.bean.PageReq;
import com.samin.sj.sdk.bean.PageResp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    // TODO 测试入参接收情况
    @GetMapping("/page")
    public BaseResp<PageResp<JobVo>> page(PageReq<Void> req) {
        return BaseResp.success(jobService.page(req));
    }

    @PostMapping("/save")
    public BaseResp<JobSaveVo> save(@RequestBody JobSaveVo req) {
        return BaseResp.success(jobService.save(req));
    }

    @PostMapping("/disable/{id}")
    public BaseResp<Void> disable(@PathVariable Integer id) {
        jobService.disable(id);
        return BaseResp.success();
    }

    @DeleteMapping("/delete/{id}")
    public BaseResp<Void> delete(@PathVariable Integer id) {
        jobService.delete(id);
        return BaseResp.success();
    }
}
