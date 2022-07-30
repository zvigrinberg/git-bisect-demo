package controller;

import data.Datasource;
import service.MyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

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