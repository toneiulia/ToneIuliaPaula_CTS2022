package testare.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.categorii.ITesteCuFake;
import testare.categorii.ITesteCuStub;
import testare.categorii.ITesteDeRight;
import testare.test.PachetTuristicTest;
import testare.test.AgentieTurismTest;

//Suite ruleaza toate testele, daca avem Categories ruleaza pe categorii
//Foarte important - daca punem Suite.class nu mai tine cont de include si exclude si ruleaza toate testele

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory({ITesteCuFake.class, ITesteCuStub.class})
@Categories.ExcludeCategory(ITesteDeRight.class)

public class SuitaPentruTesteleCareSuntFakeFaraRight {

}

//class SuitaDaFakeNuRight
//class SuitaTesteCuStubDarNuDeRight
