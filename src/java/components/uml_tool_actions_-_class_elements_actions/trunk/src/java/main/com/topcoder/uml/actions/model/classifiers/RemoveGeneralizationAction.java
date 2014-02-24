/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.uml.actions.model.classifiers;

import com.topcoder.uml.model.core.relationships.Generalization;

/**
 * <p>
 * This class extends from RemoveAction and used for removing Generalization
 * instance from model or namespace. Its methods provide only proper
 * configuration and presentation of action. All logic represent into its super
 * class.
 * </p>
 * <p>
 * Thread-safety: Class is not thread safety because it extends from mutable
 * class.
 * </p>
 *
 * @author tushak, TCSDEVELOPER
 * @version 1.0
 */
public class RemoveGeneralizationAction extends RemoveAction {

    /**
     * <p>
     * Represent human readable description of action.
     * </p>
     */
    private static final String PRESENTATION_NAME = "Remove Generalization";

    /**
     * <p>
     * Constructor which provides configuration for current action.
     * </p>
     *
     * @param generalization
     *            Generalization instance, null impossible
     * @throws IllegalArgumentException
     *             when parameter is null
     */
    public RemoveGeneralizationAction(Generalization generalization) {
        super(generalization, new GeneralizationUtil());
    }

    /**
     * <p>
     * Return PRESENTATION_NAME attribute - human readable description of
     * action.
     * </p>
     *
     * @return PRESENTATION_NAME attribute
     */
    public String getPresentationName() {
        return PRESENTATION_NAME;
    }
}