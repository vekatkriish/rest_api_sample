package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DeviceFatcsApplicationTests {
	
	@Autowired
    private MockMvc mvc;
    
    @Test
    public void getDetails() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/details").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"name\":\"T-Mobile\",\"imei\":\"353661080003678\",\"location\":\"factoria\",\"msisdn\":\"5106404974\",\"building\":\"NP4\",\"status\":\"success\"}"));
    }
    
    @Test
    public void getRegData() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/regData").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"imei\":\"353661080003678\",\"registered\":\"16-02-2018\",\"location\":\"ohio\",\"expiry\":\"16-02-2020\",\"msisdn\":\"76252453\",\"status\":\"Progress\"}"));
    }

}
