package testare.suite;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.categorii.ITesteCuFake;
import testare.categorii.ITesteCuStub;
import testare.categorii.ITesteDeRight;
import testare.test.AgentieTurismTest;
import testare.test.PachetTuristicTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory({ITesteCuFake.class, ITesteCuStub.class})
@Categories.ExcludeCategory(ITesteDeRight.class)

public class SuitaTesteleCareSuntFakeNuRight {
}
