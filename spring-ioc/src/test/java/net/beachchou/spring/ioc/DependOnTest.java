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
public class DependOnTest extends AbstractTest {

    @Test
    public void testInstantiatingByConstructor() {
        Assert.assertNotNull(applicationContext.getBean("dependOn"));
    }
}
