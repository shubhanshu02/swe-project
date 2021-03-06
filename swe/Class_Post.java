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
 * Source Class: Class_Post <br>
 * @version generated on Tue Mar 29 22:00:16 IST 2022 by shubh
 */

public interface Class_Post extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#post_of_class
     */
     
    /**
     * Gets all property values for the post_of_class property.<p>
     * 
     * @returns a collection of values for the post_of_class property.
     */
    Collection<? extends Course> getPost_of_class();

    /**
     * Checks if the class has a post_of_class property value.<p>
     * 
     * @return true if there is a post_of_class property value.
     */
    boolean hasPost_of_class();

    /**
     * Adds a post_of_class property value.<p>
     * 
     * @param newPost_of_class the post_of_class property value to be added
     */
    void addPost_of_class(Course newPost_of_class);

    /**
     * Removes a post_of_class property value.<p>
     * 
     * @param oldPost_of_class the post_of_class property value to be removed.
     */
    void removePost_of_class(Course oldPost_of_class);


    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#class_post_description
     */
     
    /**
     * Gets all property values for the class_post_description property.<p>
     * 
     * @returns a collection of values for the class_post_description property.
     */
    Collection<? extends String> getClass_post_description();

    /**
     * Checks if the class has a class_post_description property value.<p>
     * 
     * @return true if there is a class_post_description property value.
     */
    boolean hasClass_post_description();

    /**
     * Adds a class_post_description property value.<p>
     * 
     * @param newClass_post_description the class_post_description property value to be added
     */
    void addClass_post_description(String newClass_post_description);

    /**
     * Removes a class_post_description property value.<p>
     * 
     * @param oldClass_post_description the class_post_description property value to be removed.
     */
    void removeClass_post_description(String oldClass_post_description);



    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#class_post_id
     */
     
    /**
     * Gets all property values for the class_post_id property.<p>
     * 
     * @returns a collection of values for the class_post_id property.
     */
    Collection<? extends Integer> getClass_post_id();

    /**
     * Checks if the class has a class_post_id property value.<p>
     * 
     * @return true if there is a class_post_id property value.
     */
    boolean hasClass_post_id();

    /**
     * Adds a class_post_id property value.<p>
     * 
     * @param newClass_post_id the class_post_id property value to be added
     */
    void addClass_post_id(Integer newClass_post_id);

    /**
     * Removes a class_post_id property value.<p>
     * 
     * @param oldClass_post_id the class_post_id property value to be removed.
     */
    void removeClass_post_id(Integer oldClass_post_id);



    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#class_post_timestamp
     */
     
    /**
     * Gets all property values for the class_post_timestamp property.<p>
     * 
     * @returns a collection of values for the class_post_timestamp property.
     */
    Collection<? extends Object> getClass_post_timestamp();

    /**
     * Checks if the class has a class_post_timestamp property value.<p>
     * 
     * @return true if there is a class_post_timestamp property value.
     */
    boolean hasClass_post_timestamp();

    /**
     * Adds a class_post_timestamp property value.<p>
     * 
     * @param newClass_post_timestamp the class_post_timestamp property value to be added
     */
    void addClass_post_timestamp(Object newClass_post_timestamp);

    /**
     * Removes a class_post_timestamp property value.<p>
     * 
     * @param oldClass_post_timestamp the class_post_timestamp property value to be removed.
     */
    void removeClass_post_timestamp(Object oldClass_post_timestamp);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
