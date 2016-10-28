/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.junit4;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 * @author beach
 */
@RunWith(JUnit4.class)
public class RunnerTest {
//    SpringJUnit4ClassRunner
//MockitoJUnitRunner
//HierarchicalContextRunner
//Avh4's Nested
//NitorCreation's NestedRunner

    @Test
    public void testUsingRunnerByJavaCode() {
        Result result = JUnitCore.runClasses(AssertTest.class);
//        java org.junit.runner.JUnitCore TestClass1 [...other test classes...] run from command line
        assertEquals("run count not equals",12, result.getRunCount());
    }

}
