/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.uml.actions.model.classifiers;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

import com.topcoder.uml.model.core.relationships.Generalization;
import com.topcoder.uml.model.core.relationships.GeneralizationImpl;

import junit.framework.TestCase;

/**
 * <p>
 * Unit test cases for class CutGeneralizationAction.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class CutGeneralizationActionTest extends TestCase {

    /**
     * The Generalization instance for the test.
     */
    private Generalization generalization = new GeneralizationImpl();

    /**
     * The Clipboard instance for the test.
     */
    private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

    /**
     * Test Constructor(Generalization), with correct generalization.
     */
    public void testCtor1() {
        CutGeneralizationAction cutAction = new CutGeneralizationAction(generalization);

        assertEquals("Should return ModelElement instance.", generalization, cutAction.getModelElement());
    }

    /**
     * Test Constructor(Generalization), with null generalization.
     * IllegalArgumentException is expected.
     */
    public void testCtor1WithNullGeneralization() {
        try {
            new CutGeneralizationAction(null);
            fail("IllegalArgumentException is expected.");
        } catch (IllegalArgumentException iae) {
            // pass
        }
    }

    /**
     * Test Constructor(Generalization, Clipboard), with correct generalization
     * and clipboard.
     */
    public void testCtor2() {
        CutGeneralizationAction cutAction = new CutGeneralizationAction(generalization, clipboard);

        assertEquals("Should return ModelElement instance.", generalization, cutAction.getModelElement());
    }

    /**
     * Test Constructor(Generalization, Clipboard), with null generalization.
     * IllegalArgumentException is expected.
     */
    public void testCtor2WithNullGeneralization() {
        try {
            new CutGeneralizationAction(null, clipboard);
            fail("IllegalArgumentException is expected.");
        } catch (IllegalArgumentException iae) {
            // pass
        }
    }

    /**
     * Test Constructor(Generalization, Clipboard), with null clipboard. Do the
     * same as it is not null, for the constructor will assign the default
     * clipboard.
     */
    public void testCtor2WithNullClipboard() {
        try {
            new CutGeneralizationAction(generalization, null);
            // pass
        } catch (IllegalArgumentException iae) {
            fail("IllegalArgumentException is not expected.");
        }
    }

    /**
     * Test getPresentationName.
     */
    public void testGetPresentationName() {
        CutGeneralizationAction cutAction = new CutGeneralizationAction(generalization);

        assertEquals("Should return PRESENTATION_NAME.", "Cut Generalization", cutAction.getPresentationName());
    }
}