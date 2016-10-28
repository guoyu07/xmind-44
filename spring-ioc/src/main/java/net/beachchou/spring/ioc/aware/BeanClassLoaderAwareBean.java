/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc.aware;

import org.springframework.beans.factory.BeanClassLoaderAware;

/**
 *
 * @author beach
 */
public class BeanClassLoaderAwareBean implements BeanClassLoaderAware {

    @Override
    public void setBeanClassLoader(ClassLoader cl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
