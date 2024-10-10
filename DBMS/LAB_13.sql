CREATE TABLE CITY (
    CITYID INT PRIMARY KEY,
    NAME VARCHAR(100) UNIQUE,
    PINCODE INT NOT NULL,
    REMARKS VARCHAR(255)
);

CREATE TABLE VILLAGE (
    VID INT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL,
    CITYID INT,
    FOREIGN KEY (CITYID) REFERENCES CITY(CITYID)
);

INSERT INTO CITY (CITYID, NAME, PINCODE, REMARKS) VALUES
(1, 'RAJKOT', 360005, 'GOOD'),
(2, 'SURAT', 335009, 'VERY GOOD'),
(3, 'BARODA', 390001, 'AWESOME'),
(4, 'JAMNAGAR', 361003, 'SMART'),
(5, 'JUNAGADH', 362229, 'HISTORIC'),
(6, 'MORVI', 363641, 'CERAMIC');

INSERT INTO VILLAGE (VID, NAME, CITYID) VALUES
(101, 'RAIYA', 1),
(102, 'MADHAPAR', 1),
(103, 'DODKA', 3),
(104, 'FALLA', 4),
(105, 'BHESAN', 5),
(106, 'DHORAJI', 5);

------------------PART-A------------------

--1. Display all the villages of Rajkot city.
SELECT V.NAME FROM CITY C
JOIN VILLAGE V
ON C.CITYID = V.CITYID
WHERE C.NAME = 'RAJKOT'

--2. Display city along with their villages & pin code.
SELECT C.NAME,V.NAME,C.PINCODE FROM CITY C
JOIN VILLAGE V
ON C.CITYID = V.CITYID

--3. Display the city having more than one village.
SELECT C.NAME FROM CITY C
JOIN VILLAGE V
ON C.CITYID = V.CITYID
GROUP BY C.NAME
HAVING COUNT(V.CITYID) >1

--4. Display the city having no village.
SELECT C.NAME FROM CITY C
LEFT JOIN VILLAGE V
ON C.CITYID = V.CITYID
GROUP BY C.NAME
HAVING COUNT(V.CITYID) = 0

--5. Count the total number of villages in each city.
SELECT C.NAME,COUNT(V.CITYID) FROM CITY C
LEFT JOIN VILLAGE V
ON C.CITYID = V.CITYID
GROUP BY C.NAME

--6. Count the number of cities having more than one village.
SELECT COUNT(*) FROM CITY C
WHERE C.NAME IN (SELECT C.NAME FROM CITY C JOIN VILLAGE V ON C.CITYID = V.CITYID GROUP BY C.NAME HAVING COUNT(V.CITYID)>1)


CREATE TABLE STUMASTER(
RNO INT PRIMARY KEY,
NMAE VARCHAR(100),
BRANCH VARCHAR(100) DEFAULT 'GENRAL',
SPI DECIMAL(4,2) CHECK (SPI<=10) ,
BACKLOG INT CHECK (BACKLOG>=0)
);

---------------PART-B------------

