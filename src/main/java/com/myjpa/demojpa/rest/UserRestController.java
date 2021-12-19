package com.myjpa.demojpa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRestController {

    @Autowired
    private SpWorkFlowService spWorkFlowService;

    @PostMapping("/api/spwf/{bankcode}/start")
    public String returnName(@PathVariable String bankcode, @RequestBody BankProperties bankProperties) {
        System.out.println("got bank properties = " + bankProperties.getDbhost());
        spWorkFlowService.processBankFile(bankcode);
        return "Hello ".concat(bankcode);
    }


}
