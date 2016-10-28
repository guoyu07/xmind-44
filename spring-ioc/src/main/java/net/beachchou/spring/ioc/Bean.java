/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc;

/**
 *
 * @author beach
 */
public class Bean {

    public static class InnerClassBean {

    }

    public static Bean createInstance() {
        return new Bean();
    }

    public Bean createBean() {
        return new Bean();
    }

}
