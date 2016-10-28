/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.junit4;

import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 *
 * @author beach
 */
public class TimeOutTest {

    @Test(timeout = 1000)
    public void testWithTimeout() {
        
    }

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10); // 10 seconds max per method tested

    @Test
    public void testSleepForTooLong() throws Exception {
        TimeUnit.SECONDS.sleep(1); // sleep for 100 seconds
    }

    @Test
    public void testBlockForever() throws Exception {
        Object o = new Object();
        o.wait(1);// will block
    }

}
