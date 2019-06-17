drop table employee_info
BEGIN TRANSACTION;

CREATE TABLE employee_info
(
        employee_Number serial,
        Job_Title varchar(64)  not null,
	firstname varchar(64)  not null,
	lastname varchar(64) not null,
	Gender varchar(10),
	Date_of_Birth Date not null,
	 Date_of_Hire Date not null,

	constraint pk_Employee_info primary key (employee_Number),
	CONSTRAINT CHK_Person CHECK (Gender = 'M' OR Gender='F')
);



CREATE TABLE department
(
        Department_Number serial,
	Dep_name varchar(64) not null,
	
	
	constraint pk_Department primary key (Department_Number)
);

CREATE TABLE Project
(
	Project_Number serial,
	projectName varchar(64) not null,
	Start_Date DATE NOT NULL,
	
	constraint pk_Project primary key (Project_Number)
);

CREATE TABLE employee_Department_Project
(
        id serial,
        Employees_id int,
	Project_Number int NOT NULL,
	 Department_Number int NOT NULL,

	constraint employee_Department_Project1 primary key (id),
	constraint fk_Department_employee foreign key (Department_Number) references department (Department_Number),
	constraint fk_Department_Project foreign key (Project_Number) references Project (Project_Number),
	constraint fk_employee_Employees_id foreign key (Employees_id) references employee_info (employee_Number)
);
ROLLBACK 
COMMIT TRANSACTION