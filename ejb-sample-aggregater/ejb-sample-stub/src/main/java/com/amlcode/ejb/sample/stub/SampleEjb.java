/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amlcode.ejb.sample.stub;

import javax.ejb.Remote;

/**
 *
 * @author amal
 */

@Remote
public interface SampleEjb {

    public String sayWelcome();
}
