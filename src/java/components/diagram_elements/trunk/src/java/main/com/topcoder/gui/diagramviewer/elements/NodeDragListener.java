/*
 * Copyright (C) 2007 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.gui.diagramviewer.elements;

import java.util.EventListener;

/**
 * <p>
 * This interface defines the contract that every node drag event listener must follow.
 * </p>
 * <p>
 * It contains only one method to process the node dragged event with a single <code>LocationEvent</code> parameter.
 * </p>
 * <p>
 * <b>Thread Safety:</b> Implementations of this interface are not required thread safe. As it is an event listener, it
 * will be used in a thread safe manner.
 * </p>
 *
 * @author maone, TCSDEVELOPER
 * @version 1.0
 */
public interface NodeDragListener extends EventListener {

    /**
     * <p>
     * Processes the edge dragged event.
     * </p>
     *
     * @param event
     *            a <code>LocationEvent</code> instance used to indicate the node drag event
     */
    void nodeDragged(LocationEvent event);
}
