/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 *
 * @author beach
 */
public class ResourceLoaderAwareBean implements ResourceLoaderAware {

    @Override
    public void setResourceLoader(ResourceLoader rl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
