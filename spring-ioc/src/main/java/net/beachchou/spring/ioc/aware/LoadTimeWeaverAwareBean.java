/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc.aware;

import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.instrument.classloading.LoadTimeWeaver;

/**
 *
 * @author beach
 */
public class LoadTimeWeaverAwareBean implements LoadTimeWeaverAware{

    @Override
    public void setLoadTimeWeaver(LoadTimeWeaver ltw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
