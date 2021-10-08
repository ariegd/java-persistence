/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy.tableperconcreteclass;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Zodd
 */
@Entity
@Table(name = "CD2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cd2.findAll", query = "SELECT c FROM Cd2 c"),
    @NamedQuery(name = "Cd2.findById", query = "SELECT c FROM Cd2 c WHERE c.id = :id"),
    @NamedQuery(name = "Cd2.findByMusiccompany", query = "SELECT c FROM Cd2 c WHERE c.musiccompany = :musiccompany"),
    @NamedQuery(name = "Cd2.findByNumberofcds", query = "SELECT c FROM Cd2 c WHERE c.numberofcds = :numberofcds"),
    @NamedQuery(name = "Cd2.findByTitle", query = "SELECT c FROM Cd2 c WHERE c.title = :title"),
    @NamedQuery(name = "Cd2.findByPrice", query = "SELECT c FROM Cd2 c WHERE c.price = :price"),
    @NamedQuery(name = "Cd2.findByTotalduration", query = "SELECT c FROM Cd2 c WHERE c.totalduration = :totalduration"),
    @NamedQuery(name = "Cd2.findByDescription", query = "SELECT c FROM Cd2 c WHERE c.description = :description"),
    @NamedQuery(name = "Cd2.findByGender", query = "SELECT c FROM Cd2 c WHERE c.gender = :gender")})
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "cd_id")),
    @AttributeOverride(name = "title", column = @Column(name = "cd_title")),
    @AttributeOverride(name = "description", column = @Column(name = "cd_description"))
})
public class Cd2 extends Item2 implements Serializable {
    
    @Column(name = "MUSICCOMPANY")
    private String musiccompany;
    @Column(name = "NUMBEROFCDS")
    private Integer numberofcds;
    @Column(name = "TOTALDURATION")
    private Double totalduration;
    @Column(name = "GENDER")
    private String gender;

    public Cd2() {
    }

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
        hash += (this.getId() != null ? this.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cd2)) {
            return false;
        }
        Cd2 other = (Cd2) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.strategy.tableperconcreteclass.Cd2[ id=" + this.getId() + " ]";
    }
    
}
