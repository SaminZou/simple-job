package com.samin.sj.server.repository;

import com.samin.sj.server.entity.JobWorker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JobWorkerRepository extends JpaRepository<JobWorker, Integer> {

    Optional<JobWorker> findByAddress(String address);
}