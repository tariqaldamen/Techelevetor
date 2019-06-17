BEGIN TRANSACTION

INSERT INTO employee_info(job_title,firstname, lastname,gender,date_of_birth,date_of_hire)
VALUES ('Accountant','Tariq', 'Aldamen','M','03/7/1992','03/07/2016')
;
INSERT INTO employee_info(job_title,firstname, lastname,gender,date_of_birth,date_of_hire)
VALUES ('Manager','Joy', 'Aldaer','F','03/05/1999','01/08/2015')
;
INSERT INTO employee_info(job_title,firstname, lastname,gender,date_of_birth,date_of_hire)
VALUES ('Developer','Tariq', 'Adam','M','04/07/1995','03/08/2017')
;
INSERT INTO employee_info(job_title,firstname, lastname,gender,date_of_birth,date_of_hire)
VALUES ('HR','Sarah', 'Nadee','F','01/09/1992','02/09/2016')
;
INSERT INTO employee_info(job_title,firstname, lastname,gender,date_of_birth,date_of_hire)
VALUES ('Accountant','kah', 'Aser','M','03/7/1998','03/02/2016')
;
INSERT INTO employee_info(job_title,firstname, lastname,gender,date_of_birth,date_of_hire)
VALUES ('Manager','Jash', 'tyen','M','04/7/1989','02/07/2019')
;
INSERT INTO employee_info(job_title,firstname, lastname,gender,date_of_birth,date_of_hire)
VALUES ('Accountant','zach', 'tyur','M','07/08/1998','01/08/2017')
;
INSERT INTO employee_info(job_title,firstname, lastname,gender,date_of_birth,date_of_hire)
VALUES ('HR','Tariq', 'Aldamen','M','04/09/1995','08/03/2012')
;


INSERT INTO department(dep_name)
VALUES ('production and quality assurance ')
;
INSERT INTO department(dep_name)
VALUES ('finance')
;
INSERT INTO department(dep_name)
VALUES ('service')
;
INSERT INTO department(dep_name)
VALUES ('management')
;



INSERT INTO project(projectname ,start_date )
VALUES ('Test','03/02/2015')
;
INSERT INTO project(projectname ,start_date )
VALUES ('ATM','05/02/2017')
;
INSERT INTO project(projectname ,start_date )
VALUES ('car','05/04/2018')
;
INSERT INTO project(projectname ,start_date )
VALUES ('calculator','08/09/2019')
;



INSERT INTO employee_department_project(employees_id ,project_number,department_number )
VALUES ('1','1','1')
;
INSERT INTO employee_department_project(employees_id ,project_number,department_number )
VALUES ('2','2','1')
;
INSERT INTO employee_department_project(employees_id ,project_number,department_number )
VALUES ('3','3','2')
;
INSERT INTO employee_department_project(employees_id ,project_number,department_number )
VALUES ('4','4','2')
;
INSERT INTO employee_department_project(employees_id ,project_number,department_number )
VALUES ('7','2','3')
;
INSERT INTO employee_department_project(employees_id ,project_number,department_number )
VALUES ('5','2','3')
;
INSERT INTO employee_department_project(employees_id ,project_number,department_number )
VALUES ('6','1','4')
;
INSERT INTO employee_department_project(employees_id ,project_number,department_number )
VALUES ('3','3','4')
;

ROLLBACK 
COMMIT TRANSACTION