package com.airui.config;

import com.airui.config.bean.Person;
import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
