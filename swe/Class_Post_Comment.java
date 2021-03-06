package swe;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Class_Post_Comment <br>
 * @version generated on Tue Mar 29 22:00:16 IST 2022 by shubh
 */

public interface Class_Post_Comment extends Comment {

    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#comment_posted_on
     */
     
    /**
     * Gets all property values for the comment_posted_on property.<p>
     * 
     * @returns a collection of values for the comment_posted_on property.
     */
    Collection<? extends Class_Post> getComment_posted_on();

    /**
     * Checks if the class has a comment_posted_on property value.<p>
     * 
     * @return true if there is a comment_posted_on property value.
     */
    boolean hasComment_posted_on();

    /**
     * Adds a comment_posted_on property value.<p>
     * 
     * @param newComment_posted_on the comment_posted_on property value to be added
     */
    void addComment_posted_on(Class_Post newComment_posted_on);

    /**
     * Removes a comment_posted_on property value.<p>
     * 
     * @param oldComment_posted_on the comment_posted_on property value to be removed.
     */
    void removeComment_posted_on(Class_Post oldComment_posted_on);


    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#comment_message
     */
     
    /**
     * Gets all property values for the comment_message property.<p>
     * 
     * @returns a collection of values for the comment_message property.
     */
    Collection<? extends String> getComment_message();

    /**
     * Checks if the class has a comment_message property value.<p>
     * 
     * @return true if there is a comment_message property value.
     */
    boolean hasComment_message();

    /**
     * Adds a comment_message property value.<p>
     * 
     * @param newComment_message the comment_message property value to be added
     */
    void addComment_message(String newComment_message);

    /**
     * Removes a comment_message property value.<p>
     * 
     * @param oldComment_message the comment_message property value to be removed.
     */
    void removeComment_message(String oldComment_message);



    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#comment_timestamp
     */
     
    /**
     * Gets all property values for the comment_timestamp property.<p>
     * 
     * @returns a collection of values for the comment_timestamp property.
     */
    Collection<? extends Object> getComment_timestamp();

    /**
     * Checks if the class has a comment_timestamp property value.<p>
     * 
     * @return true if there is a comment_timestamp property value.
     */
    boolean hasComment_timestamp();

    /**
     * Adds a comment_timestamp property value.<p>
     * 
     * @param newComment_timestamp the comment_timestamp property value to be added
     */
    void addComment_timestamp(Object newComment_timestamp);

    /**
     * Removes a comment_timestamp property value.<p>
     * 
     * @param oldComment_timestamp the comment_timestamp property value to be removed.
     */
    void removeComment_timestamp(Object oldComment_timestamp);



    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#comment_visibility
     */
     
    /**
     * Gets all property values for the comment_visibility property.<p>
     * 
     * @returns a collection of values for the comment_visibility property.
     */
    Collection<? extends Boolean> getComment_visibility();

    /**
     * Checks if the class has a comment_visibility property value.<p>
     * 
     * @return true if there is a comment_visibility property value.
     */
    boolean hasComment_visibility();

    /**
     * Adds a comment_visibility property value.<p>
     * 
     * @param newComment_visibility the comment_visibility property value to be added
     */
    void addComment_visibility(Boolean newComment_visibility);

    /**
     * Removes a comment_visibility property value.<p>
     * 
     * @param oldComment_visibility the comment_visibility property value to be removed.
     */
    void removeComment_visibility(Boolean oldComment_visibility);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
