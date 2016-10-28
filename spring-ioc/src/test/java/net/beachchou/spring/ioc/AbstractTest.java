/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc;

import org.junit.Before;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author beach
 */
public abstract class AbstractTest {

    private static final String XML_FILE = "net/beachchou/spring/ioc/applicationContext.xml";

    protected ApplicationContext applicationContext;

    @Before
    public void setup() {
//        XmlWebApplicationContext
//        applicationContext = new ClassPathXmlApplicationContext(XML_FILE);
        applicationContext = new FileSystemXmlApplicationContext("src/main/resources/" + XML_FILE);
    }

}
