package com.ws.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.ws.test.optimizer.RangeOptimizerTest;
import com.ws.test.utils.RangeUtilsTest;
import com.ws.test.validation.RangeValidatorTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    RangeOptimizerTest.class,
    RangeValidatorTest.class,
    RangeUtilsTest.class,
})
public class ZipOptimizerAppTests {

}
