/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author beach
 */
public class DependenciesDetailTest extends AbstractTest {

    @Test
    public void testInjectionValueByAttribute() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionValueByAttribute");
        assertNotNull(dd);
        assertEquals(true, dd.isBool());
        assertEquals(1, dd.getB());
        assertEquals('1', dd.getCh());
        assertEquals(1, dd.getS());
        assertEquals(1, dd.getI());
        assertEquals(1, dd.getL());
        assertEquals(1, dd.getF(), 0.1);
        assertEquals(1, dd.getD(), 0.1);
        assertEquals("1", dd.getStr());
    }

    @Test
    public void testInjectionValueByElement() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionValueByElement");
        assertNotNull(dd);
        assertEquals(true, dd.isBool());
        assertEquals(1, dd.getB());
        assertEquals('1', dd.getCh());
        assertEquals(1, dd.getS());
        assertEquals(1, dd.getI());
        assertEquals(1, dd.getL());
        assertEquals(1, dd.getF(), 0.1);
        assertEquals(1, dd.getD(), 0.1);
        assertEquals("1", dd.getStr());
    }

    @Test
    public void testInjectionPropertiesByValueElement() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionPropertiesByValueElement");
        assertNotNull(dd);
        assertNotNull(dd.getP());
        assertEquals("com.mysql.jdbc.Driver", dd.getP().getProperty("jdbc.driver.className"));
        assertEquals("jdbc:mysql://localhost:3306/mydb", dd.getP().getProperty("jdbc.url"));
    }

    @Test
    public void testInjectionValueByIdref() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionValueByIdref");
        assertNotNull(dd);
        assertEquals("injectionValueByAttribute", dd.getStr());
    }

    @Test
    public void testInjectionRefByBean() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionRefByBean");
        assertNotNull(dd);
        assertEquals("", dd.getStr());
    }

//    @Test
//    public void testInjectionRefByParent() {
//        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionRefByParent");
//        assertNotNull(dd);
//        assertEquals("", dd.getStr());
//    }
    @Test
    public void testInjectionInnerBean() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionInnerBean");
        assertNotNull(dd);
        assertEquals("", dd.getStr());
    }

    @Test
    public void testInjectionProperties() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionProperties");
        assertNotNull(dd);
        assertNotNull(dd.getP());
        assertEquals("com.mysql.jdbc.Driver", dd.getP().getProperty("jdbc.driver.className"));
        assertEquals("jdbc:mysql://localhost:3306/mydb", dd.getP().getProperty("jdbc.url"));
    }

    @Test
    public void testInjectionList() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionList");
        assertNotNull(dd);
        assertNotNull(dd.getList());
        assertEquals("1", dd.getList().get(0));
        assertEquals("", dd.getList().get(1));
    }

    @Test
    public void testInjectionMap() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionMap");
        assertNotNull(dd);
        assertNotNull(dd.getMap());
        assertEquals("1", dd.getMap().get("value"));
        assertEquals("", dd.getMap().get("ref"));
    }

    @Test
    public void testInjectionSet() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionSet");
        assertNotNull(dd);
        assertNotNull(dd.getSet());
        assertEquals(2, dd.getSet().size());
    }

    @Test
    public void testInjectionPropertiesMerging() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionPropertiesMerging");
        assertNotNull(dd);
        assertNotNull(dd.getP());
        assertEquals("com.mysql.jdbc.Driver", dd.getP().getProperty("jdbc.driver.className"));
        assertEquals("jdbc:mysql://localhost:3306/child", dd.getP().getProperty("jdbc.url"));
        assertEquals("username", dd.getP().getProperty("jdbc.username"));
        assertEquals("password", dd.getP().getProperty("jdbc.password"));
    }

    @Test
    public void testInjectionListMerging() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionListMerging");
        assertNotNull(dd);
        assertNotNull(dd.getList());
        assertEquals("1", dd.getList().get(0));
        assertEquals("", dd.getList().get(1));
        assertEquals("1", dd.getList().get(2));
        assertEquals("2", dd.getList().get(3));
    }

    @Test
    public void testInjectionMapMerging() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionMapMerging");
        assertNotNull(dd);
        assertNotNull(dd.getMap());
        assertEquals("2", dd.getMap().get("value"));
        assertEquals("", dd.getMap().get("ref"));
        assertEquals("3", dd.getMap().get("new"));
    }

    @Test
    public void testInjectionSetMerging() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionSetMerging");
        assertNotNull(dd);
        assertNotNull(dd.getSet());
        assertEquals(3, dd.getSet().size());
    }

    @Test
    public void testInjectionNull() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionNull");
        assertNotNull(dd);
        assertNull(dd.getStr());
    }

    @Test
    public void testInjectionValueWithPName() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionValueWithPName");
        assertNotNull(dd);
        assertEquals("", dd.getStr());
        assertEquals(1, dd.getI());
    }

    @Test
    public void testInjectionValueWithCName() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionValueWithCName");
        assertNotNull(dd);
        assertEquals("", dd.getStr());
        assertEquals(1, dd.getI());
    }

    @Test
    public void testInjectionValueWithCIndex() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionValueWithCIndex");
        assertNotNull(dd);
        assertEquals("", dd.getStr());
        assertEquals(1, dd.getI());
    }

    @Test
    public void testInjectionByConstructorType() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionByConstructorType");
        assertNotNull(dd);
        assertEquals("1", dd.getStr());
        assertEquals(1, dd.getI());
    }

    @Test
    public void testInjectionByConstructorName() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionByConstructorName");
        assertNotNull(dd);
        assertEquals("1", dd.getStr());
        assertEquals(1, dd.getI());
    }

    @Test
    public void testInjectionByConstructorIndex() {
        DependenciesDetail dd = (DependenciesDetail) applicationContext.getBean("injectionByConstructorIndex");
        assertNotNull(dd);
        assertEquals("1", dd.getStr());
        assertEquals(1, dd.getI());
    }
}
