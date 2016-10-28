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
public class MethodReplaceTest extends AbstractTest {

    @Test
    public void testInstantiatingByConstructor() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("dependenciesDetailReplacement");
        Assert.assertEquals("getStr", dd.getStr());
    }
}
