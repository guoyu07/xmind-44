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
public class ScopeTest extends AbstractTest {

    @Test
    public void testScopeSingleton() {
        Assert.assertSame(applicationContext.getBean("scopeSingleton"), applicationContext.getBean("scopeSingleton"));
    }

    @Test
    public void testScopePrototype() {
        Assert.assertNotSame(applicationContext.getBean("scopePrototype"), applicationContext.getBean("scopePrototype"));
    }

    @Test
    public void testScopeCustom() {
        Object A = applicationContext.getBean("scopeCustom");
        Object B = applicationContext.getBean("scopeCustom");
        Object C = applicationContext.getBean("scopeCustom");
        Assert.assertSame(A, B);
        Assert.assertNotSame(B, C);
    }

}
