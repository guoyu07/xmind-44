/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.junit4.runner.parameterized;

import org.hamcrest.CoreMatchers;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author beach
 */
@RunWith(Parameterized.class)
public class ParameterizedSingleObjectArrayTest {

    @Parameters
    public static Object[] data() {
        return new Object[]{"first test", "second test"};
    }

    private String fInput;

    public ParameterizedSingleObjectArrayTest(String input) {
        fInput = input;
    }

    @Test
    public void test() {
        assertThat(fInput, CoreMatchers.containsString("test"));
    }

}
