package com.samin.sj.sdk.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JobCallbackDto {

    private Integer logId;

    private Boolean result;

    private String errorMsg;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}