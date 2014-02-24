/*
 * Copyright (C) 2007 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.swing.imageexporter.failuretests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * <p>
 * This test case aggregates all Failure test cases.
 * </p>
 *
 * @author iamajia
 * @version 1.0
 */
public class FailureTests extends TestCase {
    /**
     * Aggregates all tests in this class.
     *
     * @return Test suite aggregating all tests.
     */
    public static Test suite() {
        final TestSuite suite = new TestSuite();
        suite.addTest(DefaultVisibleMakerFailureTest.suite());
        suite.addTest(ImageExporterFailureTest.suite());
        suite.addTest(ImageManipulationImageExporterFailureTest.suite());
        return suite;
    }

}
