/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bridgedb.ws.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Christian
 */
@XmlRootElement(name="Statistics")
public class OverallStatisticsBean {
    private int numberOfMappings;
    private int numberOfProvenances;
    private int numberOfSourceDataSources;
    private int numberOfPredicates;
    private int numberOfTargetDataSources;

    /**
     * @return the numberOfMappings
     */
    public int getNumberOfMappings() {
        return numberOfMappings;
    }

    /**
     * @param numberOfMappings the numberOfMappings to set
     */
    public void setNumberOfMappings(int numberOfMappings) {
        this.numberOfMappings = numberOfMappings;
    }

    /**
     * @return the numberOfProvenances
     */
    public int getNumberOfProvenances() {
        return numberOfProvenances;
    }

    /**
     * @param numberOfProvenances the numberOfProvenances to set
     */
    public void setNumberOfProvenances(int numberOfProvenances) {
        this.numberOfProvenances = numberOfProvenances;
    }

    /**
     * @return the numberOfSourceDataSources
     */
    public int getNumberOfSourceDataSources() {
        return numberOfSourceDataSources;
    }

    /**
     * @param numberOfSourceDataSources the numberOfSourceDataSources to set
     */
    public void setNumberOfSourceDataSources(int numberOfSourceDataSources) {
        this.numberOfSourceDataSources = numberOfSourceDataSources;
    }

    /**
     * @return the numberOfTargetDataSources
     */
    public int getNumberOfTargetDataSources() {
        return numberOfTargetDataSources;
    }

    /**
     * @param numberOfTargetDataSources the numberOfTargetDataSources to set
     */
    public void setNumberOfTargetDataSources(int numberOfTargetDataSources) {
        this.numberOfTargetDataSources = numberOfTargetDataSources;
    }

    /**
     * @return the numberOfPredicates
     */
    public int getNumberOfPredicates() {
        return numberOfPredicates;
    }

    /**
     * @param numberOfPredicates the numberOfPredicates to set
     */
    public void setNumberOfPredicates(int numberOfPredicates) {
        this.numberOfPredicates = numberOfPredicates;
    }

}