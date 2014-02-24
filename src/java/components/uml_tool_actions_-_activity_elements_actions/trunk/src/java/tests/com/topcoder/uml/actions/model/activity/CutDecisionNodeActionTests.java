/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.uml.actions.model.activity;

import java.awt.datatransfer.Clipboard;

import com.topcoder.uml.model.datatypes.PseudostateKind;
import com.topcoder.uml.model.statemachines.CompositeState;
import com.topcoder.uml.model.statemachines.CompositeStateImpl;
import com.topcoder.uml.model.statemachines.Pseudostate;
import com.topcoder.uml.model.statemachines.PseudostateImpl;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;

/**
 * <p>
 * Unit test cases for CutDecisionNodeAction.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class CutDecisionNodeActionTests extends TestCase {

    /**
     * <p>
     * The CutDecisionNodeAction instance for testing.
     * </p>
     */
    private CutDecisionNodeAction action;

    /**
     * <p>
     * The Pseudostate instance for testing.
     * </p>
     */
    private Pseudostate state;

    /**
     * <p>
     * The Clipboard instance for testing.
     * </p>
     */
    private Clipboard clipboard;

    /**
     * <p>
     * Setup test environment.
     * </p>
     *
     * @throws Exception to JUnit
     *
     */
    protected void setUp() throws Exception {
        TestHelper.loadSingleXMLConfig(TestHelper.LOG_NAMESPACE, TestHelper.LOG_CONFIGFILE);

        state = new PseudostateImpl();
        CompositeState container = new CompositeStateImpl();

        state.setKind(PseudostateKind.CHOICE);
        state.setContainer(container);

        clipboard = new Clipboard("Test");
        action = new CutDecisionNodeAction(state, clipboard);
    }

    /**
     * <p>
     * Tears down test environment.
     * </p>
     *
     * @throws Exception to JUnit
     *
     */
    protected void tearDown() throws Exception {
        action = null;
        clipboard = null;
        state = null;

        TestHelper.clearConfigFile(TestHelper.LOG_NAMESPACE);
    }

    /**
     * <p>
     * Return all tests.
     * </p>
     *
     * @return all tests
     */
    public static Test suite() {
        return new TestSuite(CutDecisionNodeActionTests.class);
    }

    /**
     * <p>
     * Tests ctor CutDecisionNodeAction#CutDecisionNodeAction(Pseudostate,Clipboard) for accuracy.
     * </p>
     *
     * <p>
     * Verify : the newly created CutDecisionNodeAction instance should not be null.
     * </p>
     */
    public void testCtor() {
        assertNotNull("Failed to create a new CutDecisionNodeAction instance.", action);
    }

    /**
     * <p>
     * Tests ctor CutDecisionNodeAction#CutDecisionNodeAction(Pseudostate,Clipboard) for accuracy.
     * </p>
     *
     * <p>
     * Verify : the newly created CutDecisionNodeAction instance should not be null when the clipboard is null.
     * </p>
     */
    public void testCtor_NullClipboard() {
        assertNotNull("Failed to create a new CutDecisionNodeAction instance.", new CutDecisionNodeAction(state,
            clipboard));
    }

    /**
     * <p>
     * Tests ctor CutDecisionNodeAction#CutDecisionNodeAction(Pseudostate,Clipboard) for failure.
     * </p>
     *
     * <p>
     * It tests the case that when state is null and expects IllegalArgumentException.
     * </p>
     */
    public void testCtor_NullState() {
        try {
            new CutDecisionNodeAction(null, clipboard);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>
     * Tests ctor CutDecisionNodeAction#CutDecisionNodeAction(Pseudostate,Clipboard) for failure.
     * </p>
     *
     * <p>
     * It tests the case that when the state kind attribute doesn't equal to
     * PseudostateKind.CHOICE and expects IllegalArgumentException.
     * </p>
     */
    public void testCtor_WrongKind() {
        state = new PseudostateImpl();
        try {
            new CutDecisionNodeAction(state, clipboard);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>
     * Tests ctor CutDecisionNodeAction#CutDecisionNodeAction(Pseudostate,Clipboard) for failure.
     * </p>
     *
     * <p>
     * It tests the case that when state is not set the container
     * and expects IllegalArgumentException.
     * </p>
     */
    public void testCtor_NullContainer() {
        state = new PseudostateImpl();
        try {
            new CutDecisionNodeAction(state, clipboard);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

}