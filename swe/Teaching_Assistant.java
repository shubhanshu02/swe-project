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
 * Source Class: Teaching_Assistant <br>
 * @version generated on Tue Mar 29 22:00:16 IST 2022 by shubh
 */

public interface Teaching_Assistant extends Teaching_Staff {

    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#assigned_to
     */
     
    /**
     * Gets all property values for the assigned_to property.<p>
     * 
     * @returns a collection of values for the assigned_to property.
     */
    Collection<? extends Student_Group> getAssigned_to();

    /**
     * Checks if the class has a assigned_to property value.<p>
     * 
     * @return true if there is a assigned_to property value.
     */
    boolean hasAssigned_to();

    /**
     * Adds a assigned_to property value.<p>
     * 
     * @param newAssigned_to the assigned_to property value to be added
     */
    void addAssigned_to(Student_Group newAssigned_to);

    /**
     * Removes a assigned_to property value.<p>
     * 
     * @param oldAssigned_to the assigned_to property value to be removed.
     */
    void removeAssigned_to(Student_Group oldAssigned_to);


    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#assists
     */
     
    /**
     * Gets all property values for the assists property.<p>
     * 
     * @returns a collection of values for the assists property.
     */
    Collection<? extends Course> getAssists();

    /**
     * Checks if the class has a assists property value.<p>
     * 
     * @return true if there is a assists property value.
     */
    boolean hasAssists();

    /**
     * Adds a assists property value.<p>
     * 
     * @param newAssists the assists property value to be added
     */
    void addAssists(Course newAssists);

    /**
     * Removes a assists property value.<p>
     * 
     * @param oldAssists the assists property value to be removed.
     */
    void removeAssists(Course oldAssists);


    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#belongs_to
     */
     
    /**
     * Gets all property values for the belongs_to property.<p>
     * 
     * @returns a collection of values for the belongs_to property.
     */
    Collection<? extends Department> getBelongs_to();

    /**
     * Checks if the class has a belongs_to property value.<p>
     * 
     * @return true if there is a belongs_to property value.
     */
    boolean hasBelongs_to();

    /**
     * Adds a belongs_to property value.<p>
     * 
     * @param newBelongs_to the belongs_to property value to be added
     */
    void addBelongs_to(Department newBelongs_to);

    /**
     * Removes a belongs_to property value.<p>
     * 
     * @param oldBelongs_to the belongs_to property value to be removed.
     */
    void removeBelongs_to(Department oldBelongs_to);


    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#posted_by
     */
     
    /**
     * Gets all property values for the posted_by property.<p>
     * 
     * @returns a collection of values for the posted_by property.
     */
    Collection<? extends Comment> getPosted_by();

    /**
     * Checks if the class has a posted_by property value.<p>
     * 
     * @return true if there is a posted_by property value.
     */
    boolean hasPosted_by();

    /**
     * Adds a posted_by property value.<p>
     * 
     * @param newPosted_by the posted_by property value to be added
     */
    void addPosted_by(Comment newPosted_by);

    /**
     * Removes a posted_by property value.<p>
     * 
     * @param oldPosted_by the posted_by property value to be removed.
     */
    void removePosted_by(Comment oldPosted_by);


    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#person_email
     */
     
    /**
     * Gets all property values for the person_email property.<p>
     * 
     * @returns a collection of values for the person_email property.
     */
    Collection<? extends String> getPerson_email();

    /**
     * Checks if the class has a person_email property value.<p>
     * 
     * @return true if there is a person_email property value.
     */
    boolean hasPerson_email();

    /**
     * Adds a person_email property value.<p>
     * 
     * @param newPerson_email the person_email property value to be added
     */
    void addPerson_email(String newPerson_email);

    /**
     * Removes a person_email property value.<p>
     * 
     * @param oldPerson_email the person_email property value to be removed.
     */
    void removePerson_email(String oldPerson_email);



    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#person_name
     */
     
    /**
     * Gets all property values for the person_name property.<p>
     * 
     * @returns a collection of values for the person_name property.
     */
    Collection<? extends String> getPerson_name();

    /**
     * Checks if the class has a person_name property value.<p>
     * 
     * @return true if there is a person_name property value.
     */
    boolean hasPerson_name();

    /**
     * Adds a person_name property value.<p>
     * 
     * @param newPerson_name the person_name property value to be added
     */
    void addPerson_name(String newPerson_name);

    /**
     * Removes a person_name property value.<p>
     * 
     * @param oldPerson_name the person_name property value to be removed.
     */
    void removePerson_name(String oldPerson_name);



    /* ***************************************************
     * Property http://www.semanticweb.org/shubh/ontologies/2022/2/untitled-ontology-4#person_password
     */
     
    /**
     * Gets all property values for the person_password property.<p>
     * 
     * @returns a collection of values for the person_password property.
     */
    Collection<? extends String> getPerson_password();

    /**
     * Checks if the class has a person_password property value.<p>
     * 
     * @return true if there is a person_password property value.
     */
    boolean hasPerson_password();

    /**
     * Adds a person_password property value.<p>
     * 
     * @param newPerson_password the person_password property value to be added
     */
    void addPerson_password(String newPerson_password);

    /**
     * Removes a person_password property value.<p>
     * 
     * @param oldPerson_password the person_password property value to be removed.
     */
    void removePerson_password(String oldPerson_password);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}