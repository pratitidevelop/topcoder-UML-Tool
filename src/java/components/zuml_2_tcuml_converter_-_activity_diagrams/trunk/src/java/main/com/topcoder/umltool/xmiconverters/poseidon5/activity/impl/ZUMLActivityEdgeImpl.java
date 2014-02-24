/*
 * Copyright (C) 2007 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.umltool.xmiconverters.poseidon5.activity.impl;

import com.topcoder.uml.model.core.ModelElement;


/**
 * <p>
 * This class represents an UML2:ActivityEdge element. It will be used by the XMI Reader and
 * its plugins to create an object representation of the read zuml data. It implements the
 * convertToTCUML() method returning the converted tcuml object that can be used in the internal
 * uml tool model.
 * </p>
 *
 * <p>
 * In order to prevent there are many converted instances of one element, the convertTCUML()
 * will always return the same instance.
 * </p>
 *
 * <p>
 * <strong>Thread safety:</strong>
 * This class is mutable and not thread safe.
 * </p>
 *
 * @author Rica, zhengjuyu
 * @version 1.0
 */
public class ZUMLActivityEdgeImpl extends AbstractZUMLActivityEdge {
    /**
     * <p>Serial version uid for the Serializable class.</p>
     */
    private static final long serialVersionUID = -8953155873076697632L;

    /**
     * <p>
     * This field represents the converted instance of this element. If it
     * is not null, it will be returned directly in the convertToTCUML(). This
     * will prevents one element being converted many times.
     * </p>
     */
    private ModelElement transformed;

    /**
     * <p>Empty constructor. Call super() default constructor.</p>
     */
    public ZUMLActivityEdgeImpl() {
        super();
    }

    /**
     * <p>
     * This method converts the current ZUMLActivityEdgeImpl representation of an
     * UML2:AcivityEdge zuml element into the equivalent tcuml instance.
     * </p>
     *
     * <p>
     * This method will always return the same instance of converted element. This will
     * prevent there are many converted elements in the diagram of one original element.
     * </p>
     *
     * @return the equivalent tcuml ModelElement
     */
    public ModelElement convertToTCUML() {
        if (transformed == null) {
            transformed = Helper.convertEdgeToTCUML(this);
        }

        return transformed;
    }
}
