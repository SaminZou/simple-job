package com.samin.sj.sdk.itf;

import com.samin.sj.sdk.exception.JobException;

public interface JobWorker {

    void action(String param) throws JobException;
}
