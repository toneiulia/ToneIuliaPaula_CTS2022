package testare.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.categorii.ITesteCuFake;
import testare.test.PachetTuristicTest;
import testare.test.AgentieTurismTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(ITesteCuFake.class)

public class SuitaTesteCuFake {

}