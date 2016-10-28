/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.junit4.runner.suit;

import net.beachchou.junit4.AssertTest;
import net.beachchou.junit4.RunnerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author beach
 */
@RunWith(Suite.class)
@SuiteClasses({AssertTest.class, RunnerTest.class})
public class TestSuite {

}
