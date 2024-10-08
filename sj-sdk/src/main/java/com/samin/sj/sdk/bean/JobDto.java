package com.samin.sj.sdk.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JobDto {

    private Integer logId;

    private LocalDateTime processTime;

    private String actionCode;

    private String paramJson;
}
