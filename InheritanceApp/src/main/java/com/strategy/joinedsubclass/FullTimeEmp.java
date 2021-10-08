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
import javax.persistence.MapsId;
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
@Table(name = "FULL_TIME_EMP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FullTimeEmp.findAll", query = "SELECT f FROM FullTimeEmp f"),
    @NamedQuery(name = "FullTimeEmp.findById", query = "SELECT f FROM FullTimeEmp f WHERE f.id = :id"),
    @NamedQuery(name = "FullTimeEmp.findBySalary", query = "SELECT f FROM FullTimeEmp f WHERE f.salary = :salary")})
@DiscriminatorValue("F")
public class FullTimeEmp extends Employee implements Serializable {

    @Column(name = "SALARY")
    private Integer salary;

    public FullTimeEmp() {
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
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
        if (!(object instanceof FullTimeEmp)) {
            return false;
        }
        FullTimeEmp other = (FullTimeEmp) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.strategy.joinedsubclass.FullTimeEmp[ id=" + this.getId() + " ]";
    }
    
}
