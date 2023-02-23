insert into USER_DETAILS(ID,BIRTH_DATE,NAME)
values(1,current_date(), 'John'),
(2,current_date(), 'Mitsos'),
(3,current_date(), 'Lilios');

insert into POST(ID,DESCRIPTION, USER_ID)
values(11,'Hi', 1),
(22,'My', 2),
(33,'Name',3);