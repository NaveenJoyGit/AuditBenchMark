package com.auditbenchmark.auditbenchmark;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.auditbenchmark.auditbenchmark"})
@SpringBootTest
@AutoConfigureMockMvc
class ControllerTest {
	
	@Autowired
	private MockMvc mvc;

	@Test
	void testResponse() throws Exception {
		
		mvc.perform( MockMvcRequestBuilders
			      .get("/AuditBenchmark")
			      .accept(MediaType.APPLICATION_JSON))
			      .andDo(print())
			      .andExpect(status().isOk())
			      .andExpect(MockMvcResultMatchers.jsonPath("$[0].score").value(3))
			      .andExpect(MockMvcResultMatchers.jsonPath("$[1].score").value(1));;
		
	}

}
