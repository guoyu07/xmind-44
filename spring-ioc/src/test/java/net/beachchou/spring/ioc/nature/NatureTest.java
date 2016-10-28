/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc.nature;

import net.beachchou.spring.ioc.AbstractTest;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author beach
 */
public class NatureTest extends AbstractTest {

    @Test
    public void testCallBack() {
        Assert.assertNotNull(applicationContext.getBean("callBack"));
    }
}
