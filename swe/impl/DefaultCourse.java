package swe.impl;

import swe.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultCourse <br>
 * @version generated on Tue Mar 29 22:00:16 IST 2022 by shubh
 */
public class DefaultCourse extends WrappedIndividualImpl implements Course {

    public DefaultCourse(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#has_assignment
     */
     
    public Collection<? extends Assignment> getHas_assignment() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ASSIGNMENT,
                                               DefaultAssignment.class);
    }

    public boolean hasHas_assignment() {
	   return !getHas_assignment().isEmpty();
    }

    public void addHas_assignment(Assignment newHas_assignment) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ASSIGNMENT,
                                       newHas_assignment);
    }

    public void removeHas_assignment(Assignment oldHas_assignment) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ASSIGNMENT,
                                          oldHas_assignment);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#offered_by
     */
     
    public Collection<? extends Department> getOffered_by() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_OFFERED_BY,
                                               DefaultDepartment.class);
    }

    public boolean hasOffered_by() {
	   return !getOffered_by().isEmpty();
    }

    public void addOffered_by(Department newOffered_by) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_OFFERED_BY,
                                       newOffered_by);
    }

    public void removeOffered_by(Department oldOffered_by) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_OFFERED_BY,
                                          oldOffered_by);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#course_joining_code
     */
     
    public Collection<? extends String> getCourse_joining_code() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COURSE_JOINING_CODE, String.class);
    }

    public boolean hasCourse_joining_code() {
		return !getCourse_joining_code().isEmpty();
    }

    public void addCourse_joining_code(String newCourse_joining_code) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COURSE_JOINING_CODE, newCourse_joining_code);
    }

    public void removeCourse_joining_code(String oldCourse_joining_code) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COURSE_JOINING_CODE, oldCourse_joining_code);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#course_name
     */
     
    public Collection<? extends String> getCourse_name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COURSE_NAME, String.class);
    }

    public boolean hasCourse_name() {
		return !getCourse_name().isEmpty();
    }

    public void addCourse_name(String newCourse_name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COURSE_NAME, newCourse_name);
    }

    public void removeCourse_name(String oldCourse_name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COURSE_NAME, oldCourse_name);
    }


}