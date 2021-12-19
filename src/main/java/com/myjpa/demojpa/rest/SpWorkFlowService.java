package com.myjpa.demojpa.rest;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SpWorkFlowService {

    @PostConstruct
    public void postContruct() {
        //initcontext
    }

    public String processBankFile(String bankccode) {
        //thread for work flow---> 1,2,3
        return "success";
    }
}
