package com.luohw.springboot;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by luohw on 2018/5/2 0002.
 */
//启动注解，读取spring
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {
//    private MockMvc mvc;
//
//    @Before
//    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
//    }

//    @Test
//    public void getHello() throws Exception {
//        //判断预期值是否为Hello World
//        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalTo("Hello World")));
//
//    }

}
