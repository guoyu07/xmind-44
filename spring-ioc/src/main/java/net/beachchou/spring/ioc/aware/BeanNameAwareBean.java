/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 *
 * @author beach
 */
public class BeanNameAwareBean implements BeanNameAware {

    @Override
    public void setBeanName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
