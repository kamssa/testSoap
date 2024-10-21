//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.10.10 à 08:39:05 PM CEST 
//


package kamssa.guides.web_service;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kamssa.guides.web_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kamssa.guides.web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCountryRequest }
     * 
     */
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }

    /**
     * Create an instance of {@link GetCountryResponse }
     * 
     */
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

}
