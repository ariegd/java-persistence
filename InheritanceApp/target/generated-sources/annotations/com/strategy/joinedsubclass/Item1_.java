package com.strategy.joinedsubclass;

import com.strategy.joinedsubclass.Book1;
import com.strategy.joinedsubclass.Cd1;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-27T12:53:32")
@StaticMetamodel(Item1.class)
public class Item1_ { 

    public static volatile SingularAttribute<Item1, Cd1> cd1;
    public static volatile SingularAttribute<Item1, Book1> book1;
    public static volatile SingularAttribute<Item1, Double> price;
    public static volatile SingularAttribute<Item1, String> dtype;
    public static volatile SingularAttribute<Item1, String> description;
    public static volatile SingularAttribute<Item1, Long> id;
    public static volatile SingularAttribute<Item1, String> title;

}