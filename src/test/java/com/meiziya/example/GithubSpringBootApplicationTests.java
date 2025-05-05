package com.meiziya.example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class GithubSpringBootApplicationTests {

	@Autowired
    private MockMvc mockMvc;

    @Test
    void testGetApiReturnsOk() throws Exception {
        mockMvc.perform(get("/api"))
                .andExpect(status().isOk());
    }
//	@Test
//	void contextLoads() {
//	}
}
