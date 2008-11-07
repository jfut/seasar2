create table department(department_id integer not null primary key, department_no integer not null,department_name varchar(20),location varchar(20) default 'tokyo', version integer);
create table address(address_id integer not null primary key, street varchar(20), version integer);
create table employee(employee_id integer not null primary key, employee_no integer not null ,employee_name varchar(20),manager_id integer,hiredate date,salary numeric(7,2),department_id integer,address_id integer,version integer, constraint fk_department_id foreign key(department_id) references department(department_id), constraint fk_address_id foreign key(address_id) references address(address_id));
