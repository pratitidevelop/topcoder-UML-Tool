/*
 * Copyright (C) 2007 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.umltool.deploy.elements;

import com.topcoder.gui.diagramviewer.uml.auxiliaryelements.FreeTextNode;
import com.topcoder.umltool.deploy.DiagramType;

/**
 * <p>
 * Tests for adding, removing, and persistence for free text node.
 * </p>
 * @author ly
 * @version 1.0
 */
public class FreeTextNodeTest extends NodeTest {

    /**
     * <p>
     * Sets up the test environment. The test instance is created.
     * </p>
     * @throws Exception
     *             to junit
     */
    protected void setUp() throws Exception {
        super.setDiagramType(DiagramType.ACTIVITY);
        super.setType(FreeTextNode.class);
        super.setUp();
    }

}
