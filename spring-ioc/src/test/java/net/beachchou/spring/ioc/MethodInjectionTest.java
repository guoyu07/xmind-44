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
public class MethodInjectionTest extends AbstractTest {

    @Test
    public void testDependenciesDetailManager() {
        DependenciesDetailManager dependenciesDetailManager = (DependenciesDetailManager) applicationContext.getBean("dependenciesDetailManager");
        Assert.assertEquals(4, dependenciesDetailManager.process("test"));
    }
}
