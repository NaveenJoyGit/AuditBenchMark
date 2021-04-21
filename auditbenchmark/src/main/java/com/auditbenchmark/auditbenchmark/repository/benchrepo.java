package com.auditbenchmark.auditbenchmark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auditbenchmark.auditbenchmark.model.Benchmark;
@Repository
public interface benchrepo extends JpaRepository<Benchmark,Integer>{

}
