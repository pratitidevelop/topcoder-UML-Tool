/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.uml.actions.diagram.elements.compartmentextraction;

import com.topcoder.diagraminterchange.DiagramElement;
import com.topcoder.diagraminterchange.GraphElement;
import com.topcoder.diagraminterchange.GraphNode;

/**
 * <p>
 * This class extends AbstractCompartmentExtractor class and so implements CompartmentExtractor interface.
 * </p>
 *
 * <p>
 * This class is responsible to extract and update from the given GraphNode the following compartments:
 * <ul type="disc">
 * <li>name</li>
 * <li>namespace</li>
 * <li>stereotype</li>
 * </ul>
 * </p>
 *
 * <p>
 * This class can be used for GraphNode that follows the structure:
 * </p>
 *
 * <p>
 * <pre>
 * Uml1SemanticModelBridge.element = &lt;UML:xxx&gt;
 *     SimpleSemanticModelElement.typeInfo = &quot;NameCompartment&quot;
 *         SimpleSemanticModelElement.typeInfo = &quot;StereotypeCompartment&quot;
 *         SimpleSemanticModelElement.typeInfo = &quot;Name&quot;
 *         SimpleSemanticModelElement.typeInfo = &quot;NamespaceCompartment&quot;
 * </pre>
 * Such structure corresponds to the following type:
 * <ul type="disc">
 * <li>Package</li>
 * <li>Subsystem</li>
 * <li>Actor</li>
 * <li>Use Case</li>
 * </ul>
 * </p>
 *
 * <p>
 * Thread Safety : This class is not thread safe as element is mutable, in addition it depends
 * on the thread safety of implementation of diagram interchange component.
 * </p>
 *
 * @author bramandia, TCSDEVELOPER
 * @version 1.0
 */
public class DefaultNodeCompartmentExtractor extends AbstractCompartmentExtractor {
    /**
     * <p>
     * StructureCompartmentExtractor instance for extracting and updating name compartment.
     * </p>
     *
     * <p>
     * It is set in the constructor and setElement() method.
     * </p>
     */
    private StructureCompartmentExtractor nameExtractor;

    /**
     * <p>
     * StructureCompartmentExtractor instance for extracting and updating namespace compartment.
     * </p>
     *
     * <p>
     * It is set in the constructor and setElement() method.
     * </p>
     */
    private StructureCompartmentExtractor namespaceExtractor;

    /**
     * <p>
     * StructureCompartmentExtractor instance for extracting and updating stereotype compartment.
     * </p>
     *
     * <p>
     * It is set in the constructor and setElement() method.
     * </p>
     */
    private StructureCompartmentExtractor stereotypeExtractor;

    /**
     * <p>
     * Create DefaultNodeCompartmentExtractor with the element set to the given GraphNode.
     * </p>
     *
     * @param node the graph node in which the compartment is to be extracted
     *
     * @throws IllegalArgumentException if the argument is null
     */
    public DefaultNodeCompartmentExtractor(GraphNode node) {
        super(node);

        this.nameExtractor = this.getExtractorForName();
        this.namespaceExtractor = this.getExtractorForNamespace();
        this.stereotypeExtractor = this.getExtractorForStereotype();
    }

    /**
     * <p>
     * Extract the name compartment from the element and return the GraphElement
     * representing name compartment.
     * </p>
     *
     * @return the graph element representing name compartment
     *
     * @throws CompartmentNotFoundException if the compartment is supported but it does not exist in the element
     * @throws CompartmentMalformedException if the element contains malformed compartment
     */
    public GraphElement extractName() throws CompartmentMalformedException, CompartmentNotFoundException {
        return nameExtractor.extract();
    }

    /**
     * <p>
     * Update the name compartment of the element to the new value.
     * </p>
     *
     * @param newElement the graph element representing name compartment
     *
     * @throws IllegalArgumentException if newElement is null
     * @throws CompartmentNotFoundException if the compartment is supported but it does not exist in the element
     * @throws CompartmentMalformedException if the element contains malformed compartment
     */
    public void updateName(GraphElement newElement) throws CompartmentMalformedException, CompartmentNotFoundException {
        nameExtractor.update(newElement);
    }

    /**
     * <p>
     * Extract the namespace compartment from the element and return the
     * GraphElement representing namespace compartment.
     * </p>
     *
     * @return the graph element representing namespace compartment
     *
     * @throws CompartmentNotFoundException if the compartment is supported but it does not exist in the element
     * @throws CompartmentMalformedException if the element contains malformed compartment
     */
    public GraphElement extractNamespace() throws CompartmentMalformedException, CompartmentNotFoundException {
        return namespaceExtractor.extract();
    }

    /**
     * <p>
     * Update the namespace compartment of the element to the new value.
     * </p>
     *
     * @param newElement the graph element representing namespace compartment
     *
     * @throws IllegalArgumentException if newElement is null
     * @throws CompartmentNotFoundException if the compartment is supported but it does not exist in the element
     * @throws CompartmentMalformedException if the element contains malformed compartment
     */
    public void updateNamespace(GraphElement newElement) throws CompartmentMalformedException,
        CompartmentNotFoundException {
        namespaceExtractor.update(newElement);
    }

    /**
     * <p>
     * Extract the stereotype compartment from the element and return the
     * GraphElement representing stereotype compartment.
     * </p>
     *
     * @return the graph element representing stereo type compartment
     *
     * @throws CompartmentNotFoundException if the compartment is supported but it does not exist in the element
     * @throws CompartmentMalformedException if the element contains malformed compartment
     */
    public GraphElement extractStereotype() throws CompartmentMalformedException, CompartmentNotFoundException {
        return stereotypeExtractor.extract();
    }

    /**
     * <p>
     * Update the stereotype compartment of the element to the new value.
     * </p>
     *
     * @param newElement the graph element representing stereo type compartment
     *
     * @throws IllegalArgumentException if newElement is null
     * @throws CompartmentNotFoundException if the compartment is supported but it does not exist in the element
     * @throws CompartmentMalformedException if the element contains malformed compartment
     */
    public void updateStereotype(GraphElement newElement) throws CompartmentMalformedException,
        CompartmentNotFoundException {
        stereotypeExtractor.update(newElement);
    }

    /**
     * <p>
     * Update the diagram element to be extracted to a new element.
     * </p>
     *
     * <p>
     * The nameExtractor, namespaceExtractor and stereotypeExtractor are created in this method too.
     * </p>
     *
     * @param element set the graph element to be extracted, can not be null
     *
     * @throws IllegalArgumentException if element is null
     */
    public void setElement(DiagramElement element) {
        super.setElement(element);

        this.nameExtractor = this.getExtractorForName();
        this.namespaceExtractor = this.getExtractorForNamespace();
        this.stereotypeExtractor = this.getExtractorForStereotype();
    }

    /**
     * <p>
     * This method creates a structure compartment extractor for extracting the name compartment for
     * the diagram element in this class and returns it.
     * </p>
     *
     * <p>
     * Note, the layout for extracting name compartment is set up.
     * </p>
     *
     * @return a structure compartment extractor for extracting the name compartment
     */
    private StructureCompartmentExtractor getExtractorForName() {
        StructureCompartmentExtractor extractor = new StructureCompartmentExtractor((GraphElement) this.getElement(),
            null);
        extractor.addNextLevelSemanticModel("NameCompartment", 0);
        extractor.addNextLevelSemanticModel("Name", 1);

        return extractor;
    }

    /**
     * <p>
     * This method creates a structure compartment extractor for extracting the namespace compartment for
     * the diagram element in this class and returns it.
     * </p>
     *
     * <p>
     * Note, the layout for extracting namespace compartment is set up.
     * </p>
     *
     * @return a structure compartment extractor for extracting the namespace compartment
     */
    private StructureCompartmentExtractor getExtractorForNamespace() {
        StructureCompartmentExtractor extractor = new StructureCompartmentExtractor((GraphElement) this.getElement(),
            null);
        extractor.addNextLevelSemanticModel("NameCompartment", 0);
        extractor.addNextLevelSemanticModel("NamespaceCompartment", 2);

        return extractor;
    }

    /**
     * <p>
     * This method creates a structure compartment extractor for extracting the stereotype compartment for
     * the diagram element in this class and returns it.
     * </p>
     *
     * <p>
     * Note, the layout for extracting stereotype compartment is set up.
     * </p>
     *
     * @return a structure compartment extractor for extracting the stereotype compartment
     */
    private StructureCompartmentExtractor getExtractorForStereotype() {
        StructureCompartmentExtractor extractor = new StructureCompartmentExtractor((GraphElement) this.getElement(),
            null);
        extractor.addNextLevelSemanticModel("NameCompartment", 0);
        extractor.addNextLevelSemanticModel("StereotypeCompartment", 0);

        return extractor;
    }
}
