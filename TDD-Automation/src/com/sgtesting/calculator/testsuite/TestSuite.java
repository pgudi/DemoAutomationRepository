package com.sgtesting.calculator.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({com.sgtesting.calculator.tests.AdditionIntegerTestCases.class,
	com.sgtesting.calculator.tests.SubstractionIntegerTestCases.class})
public class TestSuite {

}
