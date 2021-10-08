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
public class Book extends Item implements Serializable {
    
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "PUBLISHER")
    private String publisher;
    @Column(name = "NBOFPAGE")
    private Integer nbofpage;
    @Column(name = "ILLUSTRATIONS")
    private Short illustrations;

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
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hierarchystrategy.singletableperclass.Book[ isbn=" + isbn + " ]";
    }
    
}
