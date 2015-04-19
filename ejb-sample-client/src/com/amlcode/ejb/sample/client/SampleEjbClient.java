/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amlcode.ejb.sample.client;

import com.amlcode.ejb.sample.stub.SampleEjb;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;

/**
 *
 * @author amalDD
 */
public class SampleEjbClient {

    public static void main(String[] args) throws NamingException {
        Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        InitialContext context = new InitialContext(jndiProperties);
        SampleEjb sampleEjb = (SampleEjb) context.lookup("ejb:/ejb-sample-ejb/SampleEjbImpl!com.amlcode.ejb.sample.stub.SampleEjb");
        System.out.println(sampleEjb.sayWelcome());
        

    }
}
