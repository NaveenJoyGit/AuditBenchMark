package com.auditbenchmark.auditbenchmark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auditbenchmark.auditbenchmark.model.Benchmark;
import com.auditbenchmark.auditbenchmark.service.Benchservice;

@RestController
public class Benchcontroller {
	@Autowired 
	Benchservice bs;
	
	@RequestMapping(value="/AuditBenchmark" ,method=RequestMethod.GET)
	public List<Benchmark> audit() {
	return bs.getallBenchmarks();
	}
}
