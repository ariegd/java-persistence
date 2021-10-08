/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy.joinedsubclass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
@Table(name = "ITEM1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item1.findAll", query = "SELECT i FROM Item1 i"),
    @NamedQuery(name = "Item1.findById", query = "SELECT i FROM Item1 i WHERE i.id = :id"),
    @NamedQuery(name = "Item1.findByDtype", query = "SELECT i FROM Item1 i WHERE i.dtype = :dtype"),
    @NamedQuery(name = "Item1.findByTitle", query = "SELECT i FROM Item1 i WHERE i.title = :title"),
    @NamedQuery(name = "Item1.findByPrice", query = "SELECT i FROM Item1 i WHERE i.price = :price"),
    @NamedQuery(name = "Item1.findByDescription", query = "SELECT i FROM Item1 i WHERE i.description = :description")})
@Inheritance(strategy = InheritanceType.JOINED)
public class Item1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "DTYPE")
    private String dtype;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private double price;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item1")
    private Cd1 cd1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item1")
    private Book1 book1;

    public Item1() {
    }

    public Item1(Long id) {
        this.id = id;
    }

    public Item1(Long id, String title, double price) {
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

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
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

    public Cd1 getCd1() {
        return cd1;
    }

    public void setCd1(Cd1 cd1) {
        this.cd1 = cd1;
    }

    public Book1 getBook1() {
        return book1;
    }

    public void setBook1(Book1 book1) {
        this.book1 = book1;
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
        if (!(object instanceof Item1)) {
            return false;
        }
        Item1 other = (Item1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.strategy.joinedsubclass.Item1[ id=" + id + " ]";
    }
    
}
