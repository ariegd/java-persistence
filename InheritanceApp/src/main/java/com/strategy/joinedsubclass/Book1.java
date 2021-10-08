/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy.joinedsubclass;

import com.hierarchystrategy.singletableperclass.Item;
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
@Table(name = "BOOK1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book1.findAll", query = "SELECT b FROM Book1 b"),
    @NamedQuery(name = "Book1.findById", query = "SELECT b FROM Book1 b WHERE b.id = :id"),
    @NamedQuery(name = "Book1.findByIllustrations", query = "SELECT b FROM Book1 b WHERE b.illustrations = :illustrations"),
    @NamedQuery(name = "Book1.findByIsbn", query = "SELECT b FROM Book1 b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Book1.findByNbofpage", query = "SELECT b FROM Book1 b WHERE b.nbofpage = :nbofpage"),
    @NamedQuery(name = "Book1.findByPublisher", query = "SELECT b FROM Book1 b WHERE b.publisher = :publisher")})
public class Book1 extends Item1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ILLUSTRATIONS")
    private Short illustrations;
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "NBOFPAGE")
    private Integer nbofpage;
    @Column(name = "PUBLISHER")
    private String publisher;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Item1 item1;

    public Book1() {
    }

    public Book1(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Short illustrations) {
        this.illustrations = illustrations;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbofpage() {
        return nbofpage;
    }

    public void setNbofpage(Integer nbofpage) {
        this.nbofpage = nbofpage;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
        if (!(object instanceof Book1)) {
            return false;
        }
        Book1 other = (Book1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.strategy.joinedsubclass.Book1[ id=" + id + " ]";
    }
    
}
