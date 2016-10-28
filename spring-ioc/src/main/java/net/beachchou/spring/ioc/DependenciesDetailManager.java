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
public abstract class DependenciesDetailManager {

    public int process(String str) {
        DependenciesDetail dd = createDependenciesDetail();
        dd.setI(str.length());
        return dd.getI();
    }

    protected abstract DependenciesDetail createDependenciesDetail();
}
