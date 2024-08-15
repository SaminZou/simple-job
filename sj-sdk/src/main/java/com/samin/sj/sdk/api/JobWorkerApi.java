package com.samin.sj.sdk.api;

import com.samin.sj.sdk.bean.BaseResp;
import com.samin.sj.sdk.bean.JobWorkerRegisterDto;

// TODO 注册工作节点
public interface JobWorkerApi {

    BaseResp<Boolean> register(JobWorkerRegisterDto dto);
}
