/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc.aware;

import org.springframework.context.ApplicationEventPublisher;

/**
 *
 * @author beach
 */
public class ApplicationEventPublisherAwareBean implements org.springframework.context.ApplicationEventPublisherAware {

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher aep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
