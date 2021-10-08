package com.hierarchystrategy.singletableperclass;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-27T12:53:32")
@StaticMetamodel(Book.class)
public class Book_ extends Item_ {

    public static volatile SingularAttribute<Book, Short> illustrations;
    public static volatile SingularAttribute<Book, Integer> nbofpage;
    public static volatile SingularAttribute<Book, String> isbn;
    public static volatile SingularAttribute<Book, String> publisher;

}