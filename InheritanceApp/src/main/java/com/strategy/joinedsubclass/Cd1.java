/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy.joinedsubclass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Zodd
 */
@Entity
@Table(name = "CD1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cd1.findAll", query = "SELECT c FROM Cd1 c"),
    @NamedQuery(name = "Cd1.findById", query = "SELECT c FROM Cd1 c WHERE c.id = :id"),
    @NamedQuery(name = "Cd1.findByMusiccompany", query = "SELECT c FROM Cd1 c WHERE c.musiccompany = :musiccompany"),
    @NamedQuery(name = "Cd1.findByNumberofcds", query = "SELECT c FROM Cd1 c WHERE c.numberofcds = :numberofcds"),
    @NamedQuery(name = "Cd1.findByTotalduration", query = "SELECT c FROM Cd1 c WHERE c.totalduration = :totalduration"),
    @NamedQuery(name = "Cd1.findByGender", query = "SELECT c FROM Cd1 c WHERE c.gender = :gender")})
public class Cd1 extends Item1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "MUSICCOMPANY")
    private String musiccompany;
    @Column(name = "NUMBEROFCDS")
    private Integer numberofcds;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTALDURATION")
    private Double totalduration;
    @Column(name = "GENDER")
    private String gender;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Item1 item1;

    public Cd1() {
    }

    public Cd1(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Item1 getItem1() {
        return item1;
    }

    public void setItem1(Item1 item1) {
        this.item1 = item1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cd1)) {
            return false;
        }
        Cd1 other = (Cd1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.strategy.joinedsubclass.Cd1[ id=" + id + " ]";
    }
    
}
