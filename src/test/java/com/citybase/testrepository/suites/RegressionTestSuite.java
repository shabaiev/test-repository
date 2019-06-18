package com.citybase.testrepository.suites;

import com.citybase.testrepository.NavigationTest;
import com.citybase.testrepository.PerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        PerformanceTest.class,
        NavigationTest.class})
public class RegressionTestSuite {
}
