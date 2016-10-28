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
public class BeanNamingTest extends AbstractTest {

    @Test
    public void testNamingByDefault() {
        Assert.assertNotNull(applicationContext.getBean("net.beachchou.spring.ioc.Bean"));
    }

    @Test
    public void testNamingById() {
        Assert.assertNotNull(applicationContext.getBean("namingById"));
    }

    @Test
    public void testNamingByName() {
        Assert.assertNotNull(applicationContext.getBean("namingByName"));
        Assert.assertNotNull(applicationContext.getBean("namingByNameA"));
        Assert.assertNotNull(applicationContext.getBean("namingByNameB"));
        Assert.assertNotNull(applicationContext.getBean("namingByNameC"));
    }

    @Test
    public void testNamingByAlias() {
        Assert.assertNotNull(applicationContext.getBean("namingByAlias"));
    }

}
