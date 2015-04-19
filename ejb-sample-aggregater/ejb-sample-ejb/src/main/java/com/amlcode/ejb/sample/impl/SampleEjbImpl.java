/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amlcode.ejb.sample.impl;

import com.amlcode.ejb.sample.stub.SampleEjb;
import javax.ejb.Stateless;

/**
 *
 * @author amal
 * 
 */
@Stateless
public class SampleEjbImpl implements SampleEjb{

    public String sayWelcome() {
        return "Hello from Sampe EJB Code!!!";
    }
    
}
