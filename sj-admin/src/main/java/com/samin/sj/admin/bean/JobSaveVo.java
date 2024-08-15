package com.samin.sj.admin.bean;

import lombok.Data;

@Data
public class JobSaveVo {

    private Integer id;

    private String name;

    private String description;

    private String appCode;

    private String actionCode;

    private String cron;

    private String paramJson;
}
