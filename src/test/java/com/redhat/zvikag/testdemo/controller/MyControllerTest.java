package com.redhat.zvikag.testdemo.controller;

import com.redhat.zvikag.testdemo.data.Datasource;
import com.redhat.zvikag.testdemo.service.MyService;
import jdk.jfr.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
class MyControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private MyService myService;

    private Datasource datasource;



    @BeforeEach
    void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new MyController(myService)).build();
        datasource = new Datasource();
        myService.setDatasource(datasource);
    }

    @Test
    void testController() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/my/private/{age}",5))
                .andExpect(status().isOk());

    }
}