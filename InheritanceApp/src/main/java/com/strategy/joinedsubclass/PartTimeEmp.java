/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy.joinedsubclass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
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
@Table(name = "PART_TIME_EMP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PartTimeEmp.findAll", query = "SELECT p FROM PartTimeEmp p"),
    @NamedQuery(name = "PartTimeEmp.findById", query = "SELECT p FROM PartTimeEmp p WHERE p.id = :id"),
    @NamedQuery(name = "PartTimeEmp.findByHourlyrate", query = "SELECT p FROM PartTimeEmp p WHERE p.hourlyrate = :hourlyrate")})
@DiscriminatorValue("P")
public class PartTimeEmp extends Employee implements Serializable {

    @Column(name = "HOURLYRATE")
    private Integer hourlyrate;

    public PartTimeEmp() {
    }

    public Integer getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(Integer hourlyrate) {
        this.hourlyrate = hourlyrate;
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
        if (!(object instanceof PartTimeEmp)) {
            return false;
        }
        PartTimeEmp other = (PartTimeEmp) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.strategy.joinedsubclass.PartTimeEmp[ id=" + this.getId() + " ]";
    }
    
}
