package com.myjpa.demojpa.rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.AssertionErrors;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class SpWorkFlowServiceTest {

   @Autowired
   private SpWorkFlowService spWorkFlowService;

    @Test
    void testserviceTest() {
        int count = 0;
        for(int i=0; i<40; i++){
            spWorkFlowService.processBankFile("bancode "+i);
            count ++;
        }
        System.out.println("validating Assertion");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(40,count);

    }
}