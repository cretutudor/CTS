package ro.ase.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.testCategories.TestsGetPromovabilitate;
import ro.ase.cts.testCategories.UrgentTests;

@RunWith(Categories.class)
@SuiteClasses({ GrupaTests.class, GrupaMockTests.class })
@IncludeCategory(TestsGetPromovabilitate.class)
@ExcludeCategory(UrgentTests.class)
public class CustomSuite {

}
