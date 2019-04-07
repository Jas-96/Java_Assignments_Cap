--1.1 Data Query Language
1. SELECT Staff_Name AS STAFF NAME,Design_code AS DESIGNATION CODE from Staff_Master 
        WHERE HireDate < 01-JAN-2003 AND Staff_sal BETWEEN 12000 AND 25000;

2. SELECT Staff_code,Staff_Name,Dept_code from Staff_Master WHERE ROUND((MONTHS_BETWEEN(SYSTEM,HireDate)/12) >= 18 ORDER BY HireDate;

3. SELECT Staff_code,Staff_Name,Staff_dob,Staf_Address,Staff_sal FROM Staff-Master WHERE Mgr_code IS NULL;

4. SELECT Book_Code,Book_Name,Book_pub_year,Book_pub_author 
        WHERE Book_pub_year BETWEEN 2001 AND 2004 OR Book_Name LIKE '%&%';

5. SELECT Staff_Name FROM Staff_Master WHERE Staff_Name LIKE '%$_%' ESCAPE= '$';


-----2.1 Single row function
1. SELECT Staff_Name,$||LPAD(Staff_sal,15,'') FROM Staff_Master;


2. SELECT Student_Name,TO_CHAR(Student_dob,'MONTH,DD YYY') from Student_Master 
         WHERE (TO_CHAR(Student_dob,'day') IN ('saturday','sunday');

3. SELECT Staff_name, ROUND(MONTHS_BETWEEN(SYSDATE,HireDate))AS Months Worked FROM Staff_Master 
           ORDER BY HireDate;
      
4. SELECT Staff_Name from Staff_Master WHERE EXTRACT(DATE FROM HireDate) < 16 AND EXTRACT(MONTH FROM HireDate ) = 12 ;

5. SELECT Staff_Name,HireDate,Staff_Sal 
   CASE
     WHEN Stff_Sal >=50000    THEN  'A',
     WHEN Staff_Sal >= 25000 AND Staff_Sal <5000 THEN 'B',
	 WHEN Staff_Sal >= 10000 AND Staff_Sal <25000 THEN 'C',
	 WHEN Staff_Sal  10000 THEN 'D'
	END AS GRADE 
	FROM Staff_master;
6. SELECT Staff_Name,HireDate,TO_CHAR(HireDate,'DAY') AS DAY FROM Staff_Master
    ORDER BY next_day(HireDate,'Monday')-HireDate;

7. SELECT INSTR('mississippi','i',1,3) from Dual;

8. SELECT TO_CHAR(NEXT_DAY(
         LAST_DAY(SYSDATE) - INTERVAL '7' DAY,
         'FRIDAY'
       ),'ddthsp "of"  Month,YYYY') AS PAY_DATE FROM DUAL; 

9. SELECT  Student_Code,Student-name,Dept_Code 
   DECODE(Dept_Code,10,'Electricals',20,'Electronics','Others')
  FROM Student_Master;
  
------2.2 Group Functions
1. SELECT ROUND(max(Staff_sal)) AS Maximum,ROUND(Min(Staff_Sal)) AS Minimum,ROUND(Avg(Staff_sal)) AS Average
      FROM Staff_master;

2.  SELECT Deptno,COUNT(deptno) AS Total_Number_of_Managers     
       FROM EMP WHERE JOB IN('MANAGER') GROUP BY Deptno,job;
	
3.  SELECT Deptno,sum(sal) FROM EMP
    WHERE JOB NOT IN('MANAGER')
         GROUP BY Deptno;