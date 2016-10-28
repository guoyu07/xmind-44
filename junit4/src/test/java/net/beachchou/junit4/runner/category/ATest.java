/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.junit4.runner.category;

import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 *
 * @author beach
 */
public class ATest {

    @Category(FastTest.class)
    @Test
    public void testA() {
    }

    @Category(SlowTest.class)
    @Test
    public void testB() {
    }

}
