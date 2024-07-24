--1. Display the result of 5 multiply by 30.
SELECT 5*30
--2. Find out the absolute value of -25, 25, -50 and 50.
SELECT ABS(-25),ABS(25),ABS(-50)
--3. Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2.
SELECT CEILING(25.2),CEILING(25.7),CEILING(-25.2)
--4. Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2.
SELECT FLOOR(25.2),FLOOR(25.7),FLOOR(-25.2)
--5. Find out remainder of 5 divided 2 and 5 divided by 3.
SELECT (5%2),(5%3)
--6. Find out value of 3 raised to 2nd power and 4 raised 3rd power.
SELECT POWER(3,2),POWER(4,3)
--7. Find out the square root of 25, 30 and 50.
SELECT SQRT(25),SQRT(30),SQRT(50)
--8. Find out the square of 5, 15, and 25.
SELECT SQUARE(5),SQUARE(15),SQUARE(25)
--9. Find out the value of PI.
SELECT PI()

--10. Find out round value of 157.732 for 2, 0 and -2 decimal points.
SELECT ROUND(157.732,2),ROUND(157.732,0),ROUND(157.732,-2)

--11. Find out exponential value of 2 and 3.
SELECT EXP(2),EXP(3)
--12. Find out logarithm having base e of 10 and 2.
SELECT LEN(10),LEN(2)
--13. Find out logarithm having base b having value 10 of 5 and 100.
SELECT LEN(5)/LEN(10),LEN(100)/LEN(10)
--14. Find sine, cosine and tangent of 3.1415.
SELECT SIN(3.1415),COS(32.1415),TAN(3.1415)
--15. Find sign of -25, 0 and 25.
SELECT SIGN(-25),SIGN(0),SIGN(25)
--16. Generate random number using function.
SELECT RAND()


------------PART-A(STRING FUN)-------
--1. Find the length of following. (I) NULL (II) � hello � (III) Blank
SELECT 
--2. Display your name in lower & upper case.
SELECT LOWER('RENISH'),UPPER('RENISH')
--3. Display first three characters of your name.
SELECT SUBSTRING('RENISH',0,3)
--4. Display 3rd to 10th character of your name.
SELECT SUBSTRING('RENISHaNDANI',3,8)
--5. Write a query to convert �abc123efg� to �abcXYZefg� & �abcabcabc� to �ab5ab5ab5� using REPLACE.
SELECT REPLACE('ABC123EFG','123','XYZ'),REPLACE('ABCABCABC','C','5')
--6. Write a query to display ASCII code for �a�,�A�,�z�,�Z�, 0, 9.
SELECT ASCII('A'),ASCII('a'),ASCII('Z'),ASCII('z')
--7. Write a query to display character based on number 97, 65,122,90,48,57.
SELECT CHAR(97),CHAR(65),CHAR(122),CHAR(90),CHAR(48),CHAR(57)
--8. Write a query to remove spaces from left of a given string �hello world �.
SELECT LTRIM('HELLO WORLD  ')
--9. Write a query to remove spaces from right of a given string � hello world �.
SELECT RTRIM('    HELLO WORLD  ')
--10. Write a query to display first 4 & Last 5 characters of �SQL Server�.
SELECT SUBSTRING('SQL SERVER',0,4),SUBSTRING('SQL SERVER',LEN('SQL SERVER')-4,5)
--11. Write a query to convert a string �1234.56� to number (Use cast and convert function).
SELECT CONVERT(DECIMAL(6,2),'1234.56')
--12. Write a query to convert a float 10.58 to integer (Use cast and convert function).
SELECT CONVERT(FLOAT,10.58)
--13. Put 10 space before your name using function.
SELECT SPACE(10) + 'RENISH'
--14. Combine two strings using + sign as well as CONCAT ().
SELECT 'A'+'B',CONCAT_WS('','A','B')
--15. Find reverse of �Darshan�.
SELECT REVERSE('DARSHAN')
--16. Repeat your name 3 times.
SELECT REPLICATE('RENISH',3)
