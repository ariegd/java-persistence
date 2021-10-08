package com.strategy.joinedsubclass;

import com.strategy.joinedsubclass.Item1;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-27T12:53:32")
@StaticMetamodel(Book1.class)
public class Book1_ extends Item1_ {

    public static volatile SingularAttribute<Book1, Short> illustrations;
    public static volatile SingularAttribute<Book1, Item1> item1;
    public static volatile SingularAttribute<Book1, Integer> nbofpage;
    public static volatile SingularAttribute<Book1, String> isbn;
    public static volatile SingularAttribute<Book1, String> publisher;

}