package com.auditbenchmark.auditbenchmark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditbenchmark.auditbenchmark.model.Benchmark;
import com.auditbenchmark.auditbenchmark.repository.benchrepo;

@Service
public class Benchservice {
	
	@Autowired
	benchrepo benchrepo;

	public List<Benchmark> getallBenchmarks() {
		return benchrepo.findAll();
	}
}
