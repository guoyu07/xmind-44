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
public class AutowiringTest extends AbstractTest {

    @Test
    public void testNoAutowire() {
        Assert.assertNotNull(applicationContext.getBean("noAutowire"));
    }
    
    @Test
    public void testAutowiringByType() {
        Assert.assertNotNull(applicationContext.getBean("autowiringByType"));
    }
    @Test
    public void testAutowiringByName() {
        Assert.assertNotNull(applicationContext.getBean("autowiringByName"));
    }
    @Test
    public void testAutowiringByConstructor() {
        Assert.assertNotNull(applicationContext.getBean("autowiringByConstructor"));
    }
}
