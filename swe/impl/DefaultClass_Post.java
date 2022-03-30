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
 * Source Class: DefaultClass_Post <br>
 * @version generated on Tue Mar 29 22:00:16 IST 2022 by shubh
 */
public class DefaultClass_Post extends WrappedIndividualImpl implements Class_Post {

    public DefaultClass_Post(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#post_of_class
     */
     
    public Collection<? extends Course> getPost_of_class() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_POST_OF_CLASS,
                                               DefaultCourse.class);
    }

    public boolean hasPost_of_class() {
	   return !getPost_of_class().isEmpty();
    }

    public void addPost_of_class(Course newPost_of_class) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_POST_OF_CLASS,
                                       newPost_of_class);
    }

    public void removePost_of_class(Course oldPost_of_class) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_POST_OF_CLASS,
                                          oldPost_of_class);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#class_post_description
     */
     
    public Collection<? extends String> getClass_post_description() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS_POST_DESCRIPTION, String.class);
    }

    public boolean hasClass_post_description() {
		return !getClass_post_description().isEmpty();
    }

    public void addClass_post_description(String newClass_post_description) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS_POST_DESCRIPTION, newClass_post_description);
    }

    public void removeClass_post_description(String oldClass_post_description) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS_POST_DESCRIPTION, oldClass_post_description);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#class_post_id
     */
     
    public Collection<? extends Integer> getClass_post_id() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS_POST_ID, Integer.class);
    }

    public boolean hasClass_post_id() {
		return !getClass_post_id().isEmpty();
    }

    public void addClass_post_id(Integer newClass_post_id) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS_POST_ID, newClass_post_id);
    }

    public void removeClass_post_id(Integer oldClass_post_id) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS_POST_ID, oldClass_post_id);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#class_post_timestamp
     */
     
    public Collection<? extends Object> getClass_post_timestamp() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS_POST_TIMESTAMP, Object.class);
    }

    public boolean hasClass_post_timestamp() {
		return !getClass_post_timestamp().isEmpty();
    }

    public void addClass_post_timestamp(Object newClass_post_timestamp) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS_POST_TIMESTAMP, newClass_post_timestamp);
    }

    public void removeClass_post_timestamp(Object oldClass_post_timestamp) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CLASS_POST_TIMESTAMP, oldClass_post_timestamp);
    }


}
