package com.samin.sj.admin.repository;

import com.samin.sj.admin.entity.JobWorkerGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JobWorkerGroupRepository extends JpaRepository<JobWorkerGroup, Integer> {

    Optional<JobWorkerGroup> findByAppCode(String appCode);
}