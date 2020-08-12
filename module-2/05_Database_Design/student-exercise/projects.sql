BEGIN;

CREATE TABLE job_title
(
jobID serial,
title varchar(200) NOT NULL,

CONSTRAINT pk_job_title PRIMARY KEY (jobID)
);

CREATE TABLE employee
(
employeeID serial,
job_id_title integer NOT NULL,
first_name varchar(64) NOT NULL,
last_name varchar(64) NOT NULL,
gender varchar (20)NOT NULL,
birthday date NOT NULL,
hire_date date NOT NULL,


CONSTRAINT pk__employee PRIMARY KEY (employeeID),
CONSTRAINT fk_employee_job_title FOREIGN KEY (job_id_title) REFERENCES job_title(jobID)
);









CREATE TABLE department
(
departmentID serial,
name varchar(128) NOT NULL,

CONSTRAINT pk_department PRIMARY KEY(departmentID)
);





CREATE TABLE project
(
projectID serial,
name varchar(128) NOT NULL,
start_date date NOT NULL,

CONSTRAINT pk_project PRIMARY KEY(projectID)
);





CREATE TABLE employee_project
(
employeeID integer NOT NULL,
projectID integer NOT NULL,

CONSTRAINT pk_employeeID PRIMARY KEY (employeeID, projectID),
CONSTRAINT fk_employee_project_employee FOREIGN KEY (employeeID) REFERENCES employee(employeeID),
CONSTRAINT fk_employee_project_project FOREIGN KEY (projectID) REFERENCES project(projectID)
);



CREATE TABLE employee_department
(
employeeID integer NOT NULL,
departmentID integer NOT NULL,

CONSTRAINT pk_employeeID_departmentID PRIMARY KEY (employeeID, departmentID),
CONSTRAINT fk_employee_department_employee FOREIGN KEY (employeeID) REFERENCES employee(employeeID),
CONSTRAINT fk_employee_department_department FOREIGN KEY (departmentID) REFERENCES department(departmentID)
);


--Insertions

INSERT INTO department (departmentID, name) VALUES (1, 'Human Resources');
INSERT INTO department (departmentID, name) VALUES (2, 'Information Technology');
INSERT INTO department (departmentID, name) VALUES (3, 'Sales');

INSERT INTO project (projectID, name, start_date) VALUES (1, 'Project Red', '2020-01-01');
INSERT INTO project (projectID, name, start_date) VALUES (2, 'Project Green', '2020-01-02');
INSERT INTO project (projectID, name, start_date) VALUES (3, 'Project Blue', '2020-01-03');
INSERT INTO project (projectID, name, start_date) VALUES (4, 'Project Purple', '2020-01-04');

INSERT INTO job_title (jobID, title) VALUES (1, 'HR Rep');
INSERT INTO job_title (jobID, title) VALUES (2, 'Sales Rep');
INSERT INTO job_title (jobID, title) VALUES (3, 'Developer');

INSERT INTO employee (employeeID, job_id_title, first_name, last_name, gender, birthday, hire_date) VALUES (1, 1, 'JOHN', 'SMITH', 'MALE', '1990-01-01', '2007-01-10');
INSERT INTO employee (employeeID, job_id_title, first_name, last_name, gender, birthday, hire_date) VALUES (2, 2, 'JOHN', 'WEST', 'MALE', '1979-01-01', '2007-01-10');
INSERT INTO employee (employeeID, job_id_title, first_name, last_name, gender, birthday, hire_date) VALUES (3, 1, 'LORI', 'SMITH', 'MALE', '1988-01-01', '2007-01-10');
INSERT INTO employee (employeeID, job_id_title, first_name, last_name, gender, birthday, hire_date) VALUES (4, 2, 'BRAD', 'FISH', 'MALE', '1987-01-01', '2007-01-10');
INSERT INTO employee (employeeID, job_id_title, first_name, last_name, gender, birthday, hire_date) VALUES (5, 3, 'BRI', 'SMYTH', 'MALE', '1991-01-01', '2007-01-10');
INSERT INTO employee (employeeID, job_id_title, first_name, last_name, gender, birthday, hire_date) VALUES (6, 3, 'BRANDON', 'HARRIS', 'MALE', '1969-01-01', '2007-01-10');
INSERT INTO employee (employeeID, job_id_title, first_name, last_name, gender, birthday, hire_date) VALUES (7, 3, 'MARK', 'MASTERS', 'MALE', '1987-01-01', '2007-01-10');
INSERT INTO employee (employeeID, job_id_title, first_name, last_name, gender, birthday, hire_date) VALUES (8, 3, 'MICKEY', 'MOUSE', 'MALE', '1928-11-18', '2007-01-10');

INSERT INTO employee_project (employeeID, projectID) VALUES (5, 1);
INSERT INTO employee_project (employeeID, projectID) VALUES (6, 2);
INSERT INTO employee_project (employeeID, projectID) VALUES (7, 3);
INSERT INTO employee_project (employeeID, projectID) VALUES (8, 4);

INSERT INTO employee_department (employeeID, departmentID) VALUES (1, 1);
INSERT INTO employee_department (employeeID, departmentID) VALUES (2, 3);
INSERT INTO employee_department (employeeID, departmentID) VALUES (3, 1);
INSERT INTO employee_department (employeeID, departmentID) VALUES (4, 3);
INSERT INTO employee_department (employeeID, departmentID) VALUES (5, 2);
INSERT INTO employee_department (employeeID, departmentID) VALUES (6, 2);
INSERT INTO employee_department (employeeID, departmentID) VALUES (7, 2);
INSERT INTO employee_department (employeeID, departmentID) VALUES (8, 2);

COMMIT;