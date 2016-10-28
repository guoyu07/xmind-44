/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.junit4.runner.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 *
 * @author beach
 */
@Category({SlowTest.class, FastTest.class})
public class BTest {

    @Test
    public void testC() {

    }

}
