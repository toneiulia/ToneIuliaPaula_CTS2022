package testare.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.test.AgentieTurismTest;
import testare.test.PachetTuristicTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
public class SuitaTesteComplete {
}

// doar la Strat Madalina