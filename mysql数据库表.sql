drop database if exists cook;
create database cook;
use cook;

create table User(
id int auto_increment primary key,
name varchar(20) not null,
identify int not null,
username varchar(20) not null,
password varchar(20) not null
);

create table Restaurant(
id int auto_increment primary key,
userid int not null,
name varchar(20) not null,
address varchar(40) not null,
foreign key (userid) references User(id) on delete restrict on update restrict
);

create table Type(
id int auto_increment primary key,
name varchar(20) not null,
rid int not null,
foreign key (rid) references Restaurant(id) on delete restrict on update restrict
);

create table Appraise(
uid int,
rid int,
primary key(uid,rid),
about varchar(40),
foreign key (uid) references User(id) on delete restrict on update restrict,
foreign key (rid) references Restaurant(id) on delete restrict on update restrict
);

create table Menu(
id int auto_increment primary key,
name varchar(20) not null,
price int not null,
rid int not null,
mdescribe varchar(40) not null,
type int not null,
stock int not null,
foreign key (rid) references Restaurant(id) on delete restrict on update restrict,
foreign key (type) references Type(id) on delete restrict on update restrict
);

create table Trade(
id int auto_increment primary key,
userid int not null,
usertele varchar(20),
rid int not null,
status varchar(20) not null,
address varchar(40),
money int default -1,
foreign key (rid) references Restaurant(id) on delete restrict on update restrict,
foreign key (userid) references User(id) on delete restrict on update restrict
);

create table Car(
id int auto_increment primary key,
menuid int not null,
num int not null,
tid int not null,
foreign key (menuid) references Menu(id) on delete restrict on update restrict,
foreign key (tid) references Trade(id) on delete restrict on update restrict
);

