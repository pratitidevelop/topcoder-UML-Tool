/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.uml.model.modelmanagement.accuracytests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * <p>
 * This test case aggregates all Accuracy test cases.
 * </p>
 *
 * @author King_Bette
 * @version 1.0
 */
public class AccuracyTests extends TestCase {
    /**
     * Aggregates all tests in this class.
     *
     * @return Test suite aggregating all tests.
     */
    public static Test suite() {
        final TestSuite suite = new TestSuite();
        suite.addTest(ElementImportImplAccuracyTest.suite());
        suite.addTest(ModelImplAccuracyTest.suite());
        suite.addTest(PackageImplAccuracyTest.suite());
        suite.addTest(SubsystemImplAccuracyTest.suite());
        return suite;
    }

}
