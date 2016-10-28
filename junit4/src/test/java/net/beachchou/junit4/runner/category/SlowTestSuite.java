/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.junit4.runner.category;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author beach
 */
@RunWith(Categories.class)
@IncludeCategory(SlowTest.class)
@SuiteClasses({ATest.class, BTest.class})
public class SlowTestSuite {

}
