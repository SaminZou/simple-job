package com.samin.sj.server.repository;

import com.samin.sj.server.entity.JobLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobLogRepository extends JpaRepository<JobLog, Integer> {

}