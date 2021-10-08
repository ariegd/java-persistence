/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hierarchystrategy.singletableperclass;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Zodd
 */
@Entity
public class CD extends Item implements Serializable {
    
    @Column(name = "MUSICCOMPANY")
    private String musiccompany;
    @Column(name = "NUMBEROFCDS")
    private Integer numberofcds;    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTALDURATION")
    private Double totalduration;
    @Column(name = "GENDER")
    private String gender;
    
        public String getMusiccompany() {
        return musiccompany;
    }

    public void setMusiccompany(String musiccompany) {
        this.musiccompany = musiccompany;
    }

    public Integer getNumberofcds() {
        return numberofcds;
    }

    public void setNumberofcds(Integer numberofcds) {
        this.numberofcds = numberofcds;
    }

    public Double getTotalduration() {
        return totalduration;
    }

    public void setTotalduration(Double totalduration) {
        this.totalduration = totalduration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numberofcds != null ? numberofcds.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CD)) {
            return false;
        }
        CD other = (CD) object;
        if ((this.numberofcds == null && other.numberofcds != null) || (this.numberofcds != null && !this.numberofcds.equals(other.numberofcds))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hierarchystrategy.singletableperclass.CD[ numberofcds=" + numberofcds + " ]";
    }
    
}
