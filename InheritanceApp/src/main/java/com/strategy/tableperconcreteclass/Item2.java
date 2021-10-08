/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy.tableperconcreteclass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Zodd
 */
@Entity
@Table(name = "ITEM2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item2.findAll", query = "SELECT i FROM Item2 i"),
    @NamedQuery(name = "Item2.findById", query = "SELECT i FROM Item2 i WHERE i.id = :id"),
    @NamedQuery(name = "Item2.findByTitle", query = "SELECT i FROM Item2 i WHERE i.title = :title"),
    @NamedQuery(name = "Item2.findByPrice", query = "SELECT i FROM Item2 i WHERE i.price = :price"),
    @NamedQuery(name = "Item2.findByDescription", query = "SELECT i FROM Item2 i WHERE i.description = :description")})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Item2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private double price;
    @Column(name = "DESCRIPTION")
    private String description;

    public Item2() {
    }

    public Item2(Long id) {
        this.id = id;
    }

    public Item2(Long id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof Item2)) {
            return false;
        }
        Item2 other = (Item2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.strategy.tableperconcreteclass.Item2[ id=" + id + " ]";
    }
    
}
