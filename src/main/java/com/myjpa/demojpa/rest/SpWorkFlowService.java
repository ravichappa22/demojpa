package com.myjpa.demojpa.rest;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.Future;

@Service
public class SpWorkFlowService {

    @PostConstruct
    public void postContruct() {
        //initcontext
    }

    @Async
    public String processBankFile(String bankccode) {
        //no need to manage thread - thread for work flow---> 1,2,3
        System.out.println("success "+ bankccode + " " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success"+ bankccode;
    }
}
