/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

/**
 *
 * @author beach
 */
public class ReplacementSetS implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] os) throws Throwable {
        return method.getName();
    }

}
