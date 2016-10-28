/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 *
 * @author beach
 */
public class MessageSourceAwareBean implements MessageSourceAware {

    @Override
    public void setMessageSource(MessageSource ms) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
