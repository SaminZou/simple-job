package com.samin.sj.admin.repository;

import com.samin.sj.admin.entity.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JobRepository extends JpaRepository<Job, Integer> {

    Page<Job> findByIsDeleteAndIsEnable(Pageable pageable, Integer isDelete, Integer isEnable);

    Optional<Job> findByNameAndIsDelete(String name, Integer isDelete);
}