/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Zodd
 * Created: 22/09/2021
 */

/*create table ITEM (
    ID BIGINT not null,
    DTYPE VARCHAR(31),
    TITLE VARCHAR(255) not null,
    PRICE DOUBLE not null,
    DESCRIPTION VARCHAR(255),
    ILLUSTRATIONS SMALLINT,
    ISBN VARCHAR(255),
    NBOFPAGE INTEGER,
    PUBLISHER VARCHAR(255),
    MUSICCOMPANY VARCHAR(255),
    NUMBEROFCDS INTEGER,
    TOTALDURATION DOUBLE,
    GENDER VARCHAR(255),
    primary key (ID)
);

create table ITEM1 (
    ID BIGINT not null,
    DTYPE VARCHAR(31),
    TITLE VARCHAR(255) not null,
    PRICE DOUBLE not null,
    DESCRIPTION VARCHAR(255),
    primary key (ID)
);

create table BOOK1 (
    ID BIGINT not null,
    ILLUSTRATIONS SMALLINT,
    ISBN VARCHAR(255),
    NBOFPAGE INTEGER,
    PUBLISHER VARCHAR(255),
    primary key (ID),
    foreign key (ID) references ITEM1(ID)
);

create table CD1 (
    ID BIGINT not null,
    MUSICCOMPANY VARCHAR(255),
    NUMBEROFCDS INTEGER,
    TOTALDURATION DOUBLE,
    GENDER VARCHAR(255),
    primary key (ID),
    foreign key (ID) references ITEM1(ID)
);

create table EMPLOYEE (
    ID BIGINT not null,
    NAME1 VARCHAR(31),
    EMP_TYPE VARCHAR(255),
    primary key (ID)
);

create table FULL_TIME_EMP (
    ID BIGINT not null,
    SALARY INTEGER,
    primary key (ID),
    foreign key (ID) references EMPLOYEE(ID)
);

create table PART_TIME_EMP (
    ID BIGINT not null,
    HOURLYRATE INTEGER,
    primary key (ID),
    foreign key (ID) references EMPLOYEE(ID)
);*/

create table ITEM2 (
    ID BIGINT not null,
    TITLE VARCHAR(255) not null,
    PRICE DOUBLE not null,
    DESCRIPTION VARCHAR(255),
    primary key (ID)
);

create table BOOK2 (
    ID BIGINT not null,
    TITLE VARCHAR(255),
    PRICE DOUBLE,
    ILLUSTRATIONS SMALLINT,
    DESCRIPTION VARCHAR(255),
    ISBN VARCHAR(255),
    NBOFPAGE INTEGER,
    PUBLISHER VARCHAR(255),
    primary key (ID)
);

create table CD2 (
    ID BIGINT not null,
    MUSICCOMPANY VARCHAR(255),
    NUMBEROFCDS INTEGER,
    TITLE VARCHAR(255),
    PRICE DOUBLE,
    TOTALDURATION DOUBLE,
    DESCRIPTION VARCHAR(255),
    GENDER VARCHAR(255),
    primary key (ID)
);