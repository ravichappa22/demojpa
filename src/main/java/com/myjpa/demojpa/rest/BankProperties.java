package com.myjpa.demojpa.rest;

import lombok.Data;

import java.io.Serializable;

@Data
public class BankProperties implements Serializable {
    private String bankcode;
    private String dbhost;
    private String dbport;
    private String dbschema;
    private String dbuser;
    private String dbpassword;
}
