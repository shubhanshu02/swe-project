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
 * Source Class: DefaultClass_Post_Comment <br>
 * @version generated on Tue Mar 29 22:00:16 IST 2022 by shubh
 */
public class DefaultClass_Post_Comment extends WrappedIndividualImpl implements Class_Post_Comment {

    public DefaultClass_Post_Comment(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#comment_posted_on
     */
     
    public Collection<? extends Class_Post> getComment_posted_on() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_COMMENT_POSTED_ON,
                                               DefaultClass_Post.class);
    }

    public boolean hasComment_posted_on() {
	   return !getComment_posted_on().isEmpty();
    }

    public void addComment_posted_on(Class_Post newComment_posted_on) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_COMMENT_POSTED_ON,
                                       newComment_posted_on);
    }

    public void removeComment_posted_on(Class_Post oldComment_posted_on) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_COMMENT_POSTED_ON,
                                          oldComment_posted_on);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#comment_message
     */
     
    public Collection<? extends String> getComment_message() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMMENT_MESSAGE, String.class);
    }

    public boolean hasComment_message() {
		return !getComment_message().isEmpty();
    }

    public void addComment_message(String newComment_message) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMMENT_MESSAGE, newComment_message);
    }

    public void removeComment_message(String oldComment_message) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMMENT_MESSAGE, oldComment_message);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#comment_timestamp
     */
     
    public Collection<? extends Object> getComment_timestamp() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMMENT_TIMESTAMP, Object.class);
    }

    public boolean hasComment_timestamp() {
		return !getComment_timestamp().isEmpty();
    }

    public void addComment_timestamp(Object newComment_timestamp) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMMENT_TIMESTAMP, newComment_timestamp);
    }

    public void removeComment_timestamp(Object oldComment_timestamp) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMMENT_TIMESTAMP, oldComment_timestamp);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#comment_visibility
     */
     
    public Collection<? extends Boolean> getComment_visibility() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMMENT_VISIBILITY, Boolean.class);
    }

    public boolean hasComment_visibility() {
		return !getComment_visibility().isEmpty();
    }

    public void addComment_visibility(Boolean newComment_visibility) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMMENT_VISIBILITY, newComment_visibility);
    }

    public void removeComment_visibility(Boolean oldComment_visibility) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_COMMENT_VISIBILITY, oldComment_visibility);
    }


}
