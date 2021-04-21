package com.auditbenchmark.auditbenchmark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.auditbenchmark.auditbenchmark.model.Benchmark;
import com.auditbenchmark.auditbenchmark.repository.benchrepo;

@Component
public class MyRunner implements CommandLineRunner{
	@Autowired
	benchrepo br;
	
	@Override
	public void run(String... args)throws Exception{
		Benchmark b= new Benchmark();
		b.setId(01);
		b.setAudit_type("Internal");
		b.setScore(3);
		br.save(b);
		
		b.setId(02);
		b.setAudit_type("SOX");
		b.setScore(1);
		br.save(b);
	}

}
