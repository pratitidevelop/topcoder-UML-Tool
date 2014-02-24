/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.uml.actions.model.sequence;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.topcoder.uml.model.collaborations.collaborationinteractions.Collaboration;
import com.topcoder.uml.model.collaborations.collaborationinteractions.CollaborationImpl;
import com.topcoder.uml.model.commonbehavior.instances.Stimulus;
import com.topcoder.uml.modelmanager.UMLModelManager;

/**
 * <p>
 * This Junit Test suite contains the accuracy and failure test cases for {@link AddSendSignalMessageAction}
 * class. The accuracy test cases gives all valid inputs to the methods/constructors and checks for
 * inconsistencies The failure test cases gives all invalid inputs to the methods/constructors and checks for
 * expected exceptions
 * </p>
 *
 * @author evilisneo
 * @version 1.0
 */
public class AddSendSignalMessageActionUnitTest extends TestCase {
    /**
     * AddSendSignalMessageAction instance to be used for the testing.
     */
    private AddSendSignalMessageAction addSendSignalMessageAction = null;

    /**
     * Stimulus instance to be used for the testing.
     */
    private Stimulus stimulus = null;

    /**
     * Collaboration instance to be used for the testing.
     */
    private Collaboration collaboration = null;

    /**
     * UMLModelManager instance to be used for the testing.
     */
    private UMLModelManager modelManager = null;

    /**
     * <p>
     * Sets up the environment for the TestCase.
     * </p>
     *
     * @throws Exception
     *             throw exception to JUnit.
     */
    protected void setUp() throws Exception {
        TestHelper.loadConfig();
        stimulus = TestHelper.getSendSignalMessage();
        collaboration = new CollaborationImpl();
        modelManager = new UMLModelManager();
        addSendSignalMessageAction = new AddSendSignalMessageAction(stimulus, collaboration, modelManager);
    }

    /**
     * <p>
     * Tears down the environment after the TestCase.
     * </p>
     *
     * @throws Exception
     *             throw exception to JUnit.
     */
    protected void tearDown() throws Exception {
        TestHelper.releaseConfig();
        addSendSignalMessageAction = null;
        modelManager = null;
        collaboration = null;
        stimulus = null;
    }

    /**
     * <p>
     * Aggregates all tests in this class.
     * </p>
     *
     * @return Test suite aggregating all tests.
     */
    public static Test suite() {
        return new TestSuite(AddSendSignalMessageActionUnitTest.class);
    }

    /**
     * <p>
     * Accuracy test for
     * {@link AddSendSignalMessageAction#AddSendSignalMessageAction(Stimulus, Collaboration, UMLModelManager)}
     * constructor.
     * </p>
     * <p>
     * Creates an instance and checks its instantiation and the variable initialization.
     * </p>
     *
     * @throws Exception
     *             throw exception to JUnit.
     */
    public void test_accuracy_AddSendSignalMessageAction() throws Exception {
        // check for null
        assertNotNull("AddSendSignalMessageAction creation failed", addSendSignalMessageAction);
        // check for the variable initialization.
        assertEquals("AddSendSignalMessageAction creation failed", stimulus, addSendSignalMessageAction
            .getStimulus());
        assertEquals("AddSendSignalMessageAction creation failed", collaboration, stimulus.getNamespace());

    }

    /**
     * <p>
     * Failure test for
     * {@link AddSendSignalMessageAction#AddSendSignalMessageAction(Stimulus, Collaboration, UMLModelManager)}
     * constructor.
     * </p>
     * <p>
     * For the following inputs:
     * </p>
     *
     * <pre>
     *        Input
     *             Stimulus stimulus : null value
     *             Collaboration collaboration : Valid value
     *             UMLModelManager manager : Valid value
     * </pre>
     *
     * <p>
     * Expected {@link IllegalArgumentException}.
     * </p>
     *
     * @throws Exception
     *             throw exception to JUnit.
     */
    public void test_failure_AddSendSignalMessageAction() throws Exception {
        try {
            new AddSendSignalMessageAction(null, collaboration, modelManager);
            fail("IllegalArgumentException Expected.");
        } catch (IllegalArgumentException e) {
            // as expected
        }
    }

    /**
     * <p>
     * Failure test for
     * {@link AddSendSignalMessageAction#AddSendSignalMessageAction(Stimulus, Collaboration, UMLModelManager)}
     * constructor.
     * </p>
     * <p>
     * For the following inputs:
     * </p>
     *
     * <pre>
     *        Input
     *             Stimulus stimulus : Valid value
     *             Collaboration collaboration : null value
     *             UMLModelManager manager : Valid value
     * </pre>
     *
     * <p>
     * Expected {@link IllegalArgumentException}.
     * </p>
     *
     * @throws Exception
     *             throw exception to JUnit.
     */
    public void test_failure_AddSendSignalMessageAction1() throws Exception {
        try {
            new AddSendSignalMessageAction(stimulus, null, modelManager);
            fail("IllegalArgumentException Expected.");
        } catch (IllegalArgumentException e) {
            // as expected
        }
    }

    /**
     * <p>
     * Failure test for
     * {@link AddSendSignalMessageAction#AddSendSignalMessageAction(Stimulus, Collaboration, UMLModelManager)}
     * constructor.
     * </p>
     * <p>
     * For the following inputs:
     * </p>
     *
     * <pre>
     *        Input
     *             Stimulus stimulus : Valid value
     *             Collaboration collaboration : Valid value
     *             UMLModelManager manager : null value
     * </pre>
     *
     * <p>
     * Expected {@link IllegalArgumentException}.
     * </p>
     *
     * @throws Exception
     *             throw exception to JUnit.
     */
    public void test_failure_AddSendSignalMessageAction2() throws Exception {
        try {
            new AddSendSignalMessageAction(stimulus, collaboration, null);
            fail("IllegalArgumentException Expected.");
        } catch (IllegalArgumentException e) {
            // as expected
        }
    }

    /**
     * <p>
     * Failure test for
     * {@link AddSendSignalMessageAction#AddSendSignalMessageAction(Stimulus, Collaboration, UMLModelManager)}
     * constructor.
     * </p>
     * <p>
     * For the following inputs:
     * </p>
     *
     * <pre>
     *        Input
     *             Stimulus stimulus : Valid Value
     *             Collaboration collaboration : Valid Value
     *             UMLModelManager manager : Valid Value
     * </pre>
     *
     * <p>
     * The stimulus is not of the correct type.
     * </p>
     * <p>
     * Expected {@link SequenceConfigurationException}.
     * </p>
     *
     * @throws Exception
     *             throw exception to JUnit.
     */
    public void test_failure_AddSendSignalMessageAction3() throws Exception {
        try {
            new AddSendSignalMessageAction(TestHelper.getCreateMessage(), collaboration, modelManager);
            fail("SequenceConfigurationException Expected.");
        } catch (SequenceConfigurationException e) {
            // As expected
        }
    }

    /**
     * <p>
     * Accuracy test for {@link AddSendSignalMessageAction#getPresentationName()} method.
     * </p>
     * <p>
     * checks whether the presentation name is correct.
     * </p>
     *
     * @throws Exception
     *             throw exception to JUnit.
     */
    public void test_accuracy_getPresentationName() throws Exception {
        assertEquals("getPresentationName failed", addSendSignalMessageAction.getPresentationName(),
            "Add Send Signal Message");
    }
}
