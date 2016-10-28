/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 *
 * @author beach
 */
public class CustomScope implements Scope {

    private static int i = 0;
    private static Object o;

    @Override
    public Object get(String string, ObjectFactory<?> of) {
        
        i++;
        o = of.getObject();
        if (i % 2 == 0) {
            return of.getObject();
        }else{
            return o;
        }
    }

    @Override
    public Object remove(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registerDestructionCallback(String string, Runnable r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object resolveContextualObject(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getConversationId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
