/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy.tableperconcreteclass;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Zodd
 */
@Entity
@Table(name = "BOOK2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book2.findAll", query = "SELECT b FROM Book2 b"),
    @NamedQuery(name = "Book2.findById", query = "SELECT b FROM Book2 b WHERE b.id = :id"),
    @NamedQuery(name = "Book2.findByTitle", query = "SELECT b FROM Book2 b WHERE b.title = :title"),
    @NamedQuery(name = "Book2.findByPrice", query = "SELECT b FROM Book2 b WHERE b.price = :price"),
    @NamedQuery(name = "Book2.findByIllustrations", query = "SELECT b FROM Book2 b WHERE b.illustrations = :illustrations"),
    @NamedQuery(name = "Book2.findByDescription", query = "SELECT b FROM Book2 b WHERE b.description = :description"),
    @NamedQuery(name = "Book2.findByIsbn", query = "SELECT b FROM Book2 b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Book2.findByNbofpage", query = "SELECT b FROM Book2 b WHERE b.nbofpage = :nbofpage"),
    @NamedQuery(name = "Book2.findByPublisher", query = "SELECT b FROM Book2 b WHERE b.publisher = :publisher")})
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "book_id")),
    @AttributeOverride(name = "title", column = @Column(name = "book_title")),
    @AttributeOverride(name = "description", column = @Column(name = "book_description"))
})

public class Book2 extends Item2 implements Serializable {

    @Column(name = "ILLUSTRATIONS")
    private Short illustrations;
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "NBOFPAGE")
    private Integer nbofpage;
    @Column(name = "PUBLISHER")
    private String publisher;

    public Book2() {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getId() != null ? this.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book2)) {
            return false;
        }
        Book2 other = (Book2) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.strategy.tableperconcreteclass.Book2[ id=" + this.getId() + " ]";
    }
    
}
