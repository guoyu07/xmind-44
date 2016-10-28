/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author beach
 */
public class BeanInstantiating extends AbstractTest {

    @Test
    public void testInstantiatingByConstructor() {
        Assert.assertNotNull(applicationContext.getBean("instantiatingByConstructor"));
    }

    @Test
    public void testInstantiatingByInnerClassConstructor() {
        Assert.assertNotNull(applicationContext.getBean("instantiatingByInnerClassConstructor"));
    }

    @Test
    public void testInstantiatingByStaticFactory() {
        Assert.assertNotNull(applicationContext.getBean("instantiatingByStaticFactory"));
    }

    @Test
    public void testInstantiatingByInstanceFactory() {
        Assert.assertNotNull(applicationContext.getBean("instantiatingByInstanceFactory"));
    }
}
