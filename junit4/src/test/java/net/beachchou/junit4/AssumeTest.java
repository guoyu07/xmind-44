/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.junit4;

import java.io.File;
import static java.util.Date.parse;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;
import org.junit.Test;

/**
 *
 * @author beach
 */
public class AssumeTest {

    @Test
    public void filenameIncludesUsername() {
        assumeThat(File.separatorChar, is('/'));
        Assert.assertTrue(true);
    }

    @Test
    public void correctBehaviorWhenFilenameIsNull() {
        assumeTrue(true);
        Assert.assertTrue(true);
    }

}
