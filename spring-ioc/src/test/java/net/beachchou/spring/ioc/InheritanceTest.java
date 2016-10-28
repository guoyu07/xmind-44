/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc;

import net.beachchou.spring.ioc.bean.SimpleBean;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author beach
 */
public class InheritanceTest {

    ApplicationContext ac = new ClassPathXmlApplicationContext("net/beachchou/spring/ioc/inheritance.xml");

    @Test
    public void testParent() {
        SimpleBean parent = ac.getBean("parent", SimpleBean.class);
        assertNotNull(parent);
        assertEquals("parent", parent.getStr());
        assertEquals(1, parent.getI());
        assertEquals(0, parent.getL());

        SimpleBean child = ac.getBean("child", SimpleBean.class);
        assertNotNull(child);
        assertEquals("child", child.getStr());
        assertEquals(1, child.getI());
        assertEquals(1, child.getL());
    }

    @Test
    public void testAbstractParent() {
        SimpleBean child = ac.getBean("simpleChild", SimpleBean.class);
        assertNotNull(child);
        assertEquals("child", child.getStr());
        assertEquals(1, child.getI());
        assertEquals(1, child.getL());
    }

    @Test
    public void testTemplateParent() {
        SimpleBean child = ac.getBean("simple", SimpleBean.class);
        assertNotNull(child);
        assertEquals("child", child.getStr());
        assertEquals(1, child.getI());
        assertEquals(1, child.getL());
    }

}
