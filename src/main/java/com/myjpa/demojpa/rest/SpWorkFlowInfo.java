package com.myjpa.demojpa.rest;

import lombok.Data;

@Data
public class SpWorkFlowInfo {
    private Long sysLogID;
    private SpFileInfo spFileInfo;
    private MultitenantBankProperties multitenantBankProperties;

}
