/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.uml.actions.model.activity.failuretests;

import java.awt.datatransfer.Clipboard;

import junit.framework.TestCase;

import com.topcoder.uml.actions.model.activity.CopyMergeNodeAction;
import com.topcoder.uml.model.datatypes.PseudostateKind;
import com.topcoder.uml.model.statemachines.Pseudostate;
import com.topcoder.uml.model.statemachines.PseudostateImpl;

/**
 * <p>
 * Failure test for <code>CopyMergeNodeAction</code>.
 * </p>
 *
 * @author restarter
 * @version 1.0
 */
public class CopyMergeNodeActionFailureTest extends TestCase {
    /**
     * <p>
     * The Pseudostate instance created for testing.
     * </p>
     */
    private Pseudostate state;

    /**
     * <p>
     * The Clipboard instance created for testing.
     * </p>
     */
    private Clipboard clipboard;

    /**
     * <p>
     * Set up the environment.
     * </p>
     *
     * @throws Exception to JUnit
     */
    protected void setUp() throws Exception {
        Helper.loadConfig();
        state = new PseudostateImpl();
        clipboard = new Clipboard("name");
    }

    /**
     * <p>
     * Clear the namespace.
     * </p>
     *
     * @throws Exception to JUnit
     */
    protected void tearDown() throws Exception {
        Helper.unloadConfig();
    }

    /**
     * <p>
     * Failure test for
     * <code>CopyMergeNodeAction(Pseudostate state, Clipboard clipboard)</code>.
     * </p>
     * <p>
     * state is null, IllegalArgumentException is expected.
     * </p>
     */
    public void testCopyMergeNodeActionNullState() {
        try {
            new CopyMergeNodeAction(null, clipboard);
            fail("state is null, IllegalArgumentException is expected.");
        } catch (IllegalArgumentException e) {
            // expect
        }
    }

    /**
     * <p>
     * Failure test for
     * <code>CopyMergeNodeAction(Pseudostate state, Clipboard clipboard)</code>.
     * </p>
     * <p>
     * state argument's kind attribute is null, IllegalArgumentException is
     * expected.
     * </p>
     */
    public void testCopyMergeNodeActionInvalidState1() {
        try {
            new CopyMergeNodeAction(state, clipboard);
            fail("state argument's kind attribute is null, IllegalArgumentException is expected.");
        } catch (IllegalArgumentException e) {
            // expect
        }
    }

    /**
     * <p>
     * Failure test for
     * <code>CopyMergeNodeAction(Pseudostate state, Clipboard clipboard)</code>.
     * </p>
     * <p>
     * PseudostateKind is not JUNCTION, IllegalArgumentException is expected.
     * </p>
     */
    public void testCopyMergeNodeActionInvalidState2() {
        try {
            state.setKind(PseudostateKind.CHOICE);
            new CopyMergeNodeAction(state, clipboard);
            fail("PseudostateKind is not FORK, IllegalArgumentException is expected.");
        } catch (IllegalArgumentException e) {
            // expect
        }
    }
}
