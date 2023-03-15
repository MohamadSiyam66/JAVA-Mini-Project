CREATE DATABASE  IF NOT EXISTS `lms-java` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `lms-java`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: lms-java
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `Ad_id` int NOT NULL AUTO_INCREMENT,
  `Pno` int DEFAULT NULL,
  `Password` varchar(100) NOT NULL,
  `Fname` varchar(100) DEFAULT NULL,
  `Lname` varchar(100) DEFAULT NULL,
  `Sex` char(1) DEFAULT NULL,
  `DOB` datetime DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Ad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,774060315,'123456','Mohamad','Siyam','m','2000-06-06 00:00:00','mhmdsiyam66@gmail.com');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance` (
  `Attend_id` int NOT NULL,
  `Lec_id` int DEFAULT NULL,
  `Std_id` varchar(45) DEFAULT NULL,
  `Course_code` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`Attend_id`),
  KEY `Course_code` (`Course_code`),
  KEY `Lec_id` (`Lec_id`),
  KEY `Std_id` (`Std_id`),
  CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`Course_code`) REFERENCES `course` (`Subject_code`),
  CONSTRAINT `attendance_ibfk_2` FOREIGN KEY (`Lec_id`) REFERENCES `lecturer` (`Lec_id`),
  CONSTRAINT `attendance_ibfk_3` FOREIGN KEY (`Std_id`) REFERENCES `student` (`Std_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `Lec_id` int DEFAULT NULL,
  `Subject_code` varchar(45) NOT NULL,
  `Course_name` varchar(45) DEFAULT NULL,
  `Ad_id` int DEFAULT NULL,
  PRIMARY KEY (`Subject_code`),
  KEY `Ad_id` (`Ad_id`),
  KEY `Lec_id` (`Lec_id`),
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`Ad_id`) REFERENCES `admin` (`Ad_id`),
  CONSTRAINT `course_ibfk_2` FOREIGN KEY (`Lec_id`) REFERENCES `lecturer` (`Lec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (2,'ICT01','Web developping',1),(3,'ICT02','Information system',1),(5,'ICT03','Introduction to ICT',1),(1,'ICT04','Network',1);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exam` (
  `Acadamic_year` int DEFAULT NULL,
  `Exam_no` int NOT NULL,
  `Course_name` varchar(45) DEFAULT NULL,
  `Course_code` varchar(45) DEFAULT NULL,
  `Std_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Exam_no`),
  KEY `Std_id` (`Std_id`),
  CONSTRAINT `exam_ibfk_1` FOREIGN KEY (`Std_id`) REFERENCES `student` (`Std_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecturer`
--

DROP TABLE IF EXISTS `lecturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lecturer` (
  `Lec_id` int NOT NULL,
  `Fname` varchar(100) DEFAULT NULL,
  `Lname` varchar(100) DEFAULT NULL,
  `Sex` char(1) DEFAULT NULL,
  `Pno` int DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Lec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturer`
--

LOCK TABLES `lecturer` WRITE;
/*!40000 ALTER TABLE `lecturer` DISABLE KEYS */;
INSERT INTO `lecturer` VALUES (1,'Mohamad','Jamseeth','m',767373653,'mrjamsee@gmail.com','123456','1999-08-29','jamseeth'),(2,'mohamad','Fayas','m',757938337,'fayas0821@gmail.com','123456','2000-08-21','fayas'),(3,'Praveen','Ramakrishnan','m',712323231,'pravenn@gmail.com','123456','1999-08-03','praveen'),(4,'Thiyagarajan','Madhusha','f',762260045,'madhusha2000@gmail.com','123456','2000-06-09','madhusha'),(5,'Asama','Amanulla','f',775862366,'asamaamanullah@gmail.com','123456','2000-06-27','asama');
/*!40000 ALTER TABLE `lecturer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
  `Std_id` varchar(45) DEFAULT NULL,
  `Course_code` varchar(45) DEFAULT NULL,
  `Mid_term` float DEFAULT NULL,
  `Final_theory` float DEFAULT NULL,
  `Final_practical` float DEFAULT NULL,
  `GPA` decimal(3,0) DEFAULT NULL,
  `Grade` varchar(45) DEFAULT NULL,
  `Assesment01` float DEFAULT NULL,
  `Assesment02` float DEFAULT NULL,
  `TotalQuizMarks` float DEFAULT NULL,
  `Quiz01` float DEFAULT NULL,
  `Quiz02` float DEFAULT NULL,
  `Quiz03` float DEFAULT NULL,
  `Quiz04` float DEFAULT NULL,
  KEY `Std_id` (`Std_id`),
  CONSTRAINT `marks_ibfk_2` FOREIGN KEY (`Std_id`) REFERENCES `student` (`Std_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks`
--

LOCK TABLES `marks` WRITE;
/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
INSERT INTO `marks` VALUES ('TG100','ICT01',89,93,70,NULL,NULL,NULL,NULL,NULL,67,68,69,NULL),('TG100','ICT01',89,93,70,NULL,NULL,NULL,NULL,NULL,78,68,73,NULL),('TG101','ICT01',69,73,79,NULL,NULL,NULL,NULL,NULL,67,68,83,NULL),('TG102','ICT01',59,90,68,NULL,NULL,NULL,NULL,NULL,57,68,69,NULL),('TG103','ICT01',82,93,63,NULL,NULL,NULL,NULL,NULL,83,78,60,NULL),('TG104','ICT01',91,95,77,NULL,NULL,NULL,NULL,NULL,67,66,69,NULL),('TG105','ICT01',90,53,69,NULL,NULL,NULL,NULL,NULL,67,83,78,NULL),('TG106','ICT01',88,76,67,NULL,NULL,NULL,NULL,NULL,73,68,69,NULL),('TG107','ICT01',89,77,70,NULL,NULL,NULL,NULL,NULL,66,68,83,NULL),('TG108','ICT01',69,96,68,NULL,NULL,NULL,NULL,NULL,77,78,78,NULL),('TG109','ICT01',67,57,90,NULL,NULL,NULL,NULL,NULL,69,68,69,NULL),('TG110','ICT01',81,90,78,NULL,NULL,NULL,NULL,NULL,78,68,69,NULL),('TG100','ICT02',65,76,NULL,NULL,NULL,78,69,NULL,93,86,59,91),('TG100','ICT02',65,66,NULL,NULL,NULL,59,99,NULL,93,66,59,91),('TG101','ICT02',73,69,NULL,NULL,NULL,78,63,NULL,93,86,91,86),('TG102','ICT02',90,76,NULL,NULL,NULL,93,91,NULL,86,76,59,91),('TG103','ICT02',67,78,NULL,NULL,NULL,80,69,NULL,91,66,86,78),('TG104','ICT02',75,93,NULL,NULL,NULL,78,80,NULL,93,63,59,91),('TG105','ICT02',80,94,NULL,NULL,NULL,63,69,NULL,86,59,86,78),('TG106','ICT02',85,91,NULL,NULL,NULL,79,83,NULL,93,60,78,91),('TG107','ICT02',69,76,NULL,NULL,NULL,93,85,NULL,93,66,59,91),('TG108','ICT02',59,59,NULL,NULL,NULL,80,90,NULL,91,73,86,86),('TG109','ICT02',77,67,NULL,NULL,NULL,68,89,NULL,86,59,59,91),('TG110','ICT02',66,76,NULL,NULL,NULL,75,93,NULL,93,86,59,86),('TG100','ICT03',NULL,90,73,NULL,NULL,75,81,NULL,60,91,78,NULL),('TG100','ICT03',NULL,90,73,NULL,NULL,75,60,NULL,60,91,78,NULL),('TG101','ICT03',NULL,73,91,NULL,NULL,63,81,NULL,63,70,73,NULL),('TG102','ICT03',NULL,75,73,NULL,NULL,81,78,NULL,81,61,91,NULL),('TG103','ICT03',NULL,60,75,NULL,NULL,78,91,NULL,70,78,81,NULL),('TG104','ICT03',NULL,91,60,NULL,NULL,85,95,NULL,65,91,73,NULL),('TG105','ICT03',NULL,78,69,NULL,NULL,59,85,NULL,90,65,68,NULL),('TG106','ICT03',NULL,81,74,NULL,NULL,95,63,NULL,88,91,93,NULL),('TG107','ICT03',NULL,75,79,NULL,NULL,69,81,NULL,95,93,98,NULL),('TG108','ICT03',NULL,79,83,NULL,NULL,88,88,NULL,78,91,48,NULL),('TG109','ICT03',NULL,93,90,NULL,NULL,60,75,NULL,81,88,67,NULL),('TG110','ICT03',NULL,60,63,NULL,NULL,79,81,NULL,60,91,78,NULL),('TG100','ICT04',NULL,63,76,NULL,NULL,97,59,NULL,65,92,83,NULL),('TG100','ICT04',NULL,63,76,NULL,NULL,53,83,NULL,65,92,73,NULL),('TG101','ICT04',NULL,76,94,NULL,NULL,94,59,NULL,93,65,80,NULL),('TG102','ICT04',NULL,97,53,NULL,NULL,63,94,NULL,95,83,93,NULL),('TG103','ICT04',NULL,59,83,NULL,NULL,59,73,NULL,76,76,87,NULL),('TG104','ICT04',NULL,63,60,NULL,NULL,90,75,NULL,59,83,67,NULL),('TG105','ICT04',NULL,92,75,NULL,NULL,73,50,NULL,60,60,73,NULL),('TG106','ICT04',NULL,66,62,NULL,NULL,95,59,NULL,73,90,93,NULL),('TG107','ICT04',NULL,83,65,NULL,NULL,59,76,NULL,92,72,83,NULL),('TG108','ICT04',NULL,77,76,NULL,NULL,65,66,NULL,65,62,82,NULL),('TG109','ICT04',NULL,90,83,NULL,NULL,97,70,NULL,59,52,83,NULL),('TG110','ICT04',NULL,53,76,NULL,NULL,83,45,NULL,95,42,83,NULL);
/*!40000 ALTER TABLE `marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medical`
--

DROP TABLE IF EXISTS `medical`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical` (
  `Med_id` int NOT NULL,
  `Date` datetime DEFAULT NULL,
  `Reason` varchar(100) DEFAULT NULL,
  `Std_id` varchar(45) DEFAULT NULL,
  `course_code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Med_id`),
  KEY `Std_id` (`Std_id`),
  KEY `course_code` (`course_code`),
  CONSTRAINT `medical_ibfk_1` FOREIGN KEY (`Std_id`) REFERENCES `student` (`Std_id`),
  CONSTRAINT `medical_ibfk_2` FOREIGN KEY (`course_code`) REFERENCES `course` (`Subject_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical`
--

LOCK TABLES `medical` WRITE;
/*!40000 ALTER TABLE `medical` DISABLE KEYS */;
/*!40000 ALTER TABLE `medical` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notice` (
  `Notice_no` int NOT NULL AUTO_INCREMENT,
  `Details` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Ad_id` int DEFAULT NULL,
  PRIMARY KEY (`Notice_no`),
  KEY `Ad_id` (`Ad_id`),
  CONSTRAINT `notice_ibfk_1` FOREIGN KEY (`Ad_id`) REFERENCES `admin` (`Ad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `Std_id` varchar(45) NOT NULL,
  `Pno` int DEFAULT NULL,
  `Fname` varchar(100) NOT NULL,
  `Lname` varchar(100) DEFAULT NULL,
  `Sex` char(4) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  PRIMARY KEY (`Std_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('TG100',77406792,'Ashen ','kavidu','m','ashen@gmail.com','123456','2000-08-09'),('TG101',774009722,'namal ','kumar','m','namal@gmail.com','123456','2000-07-19'),('TG102',774546792,'botheju ','bimsara','m','botheju@gmail.com','123456','2000-10-23'),('TG103',714065722,'nirmani ','kumari','f','nirmani@gmail.com','123456','2000-02-19'),('TG104',714066722,'nilal ','kumar','m','nilal@gmail.com','123456','2000-06-09'),('TG105',714036722,'chathu ','isuri','f','chathu@gmail.com','123456','2001-06-09'),('TG106',714766722,'pathum ','danajaya','m','pathum@gmail.com','123456','2001-12-09'),('TG107',714046722,'dilshani ','kumari','f','dilshani@gmail.com','123456','2001-09-09'),('TG108',754046722,'jeni ','jenifer','f','geni@gmail.com','123456','2001-09-28'),('TG109',714146722,'nilmi ','perera','f','nilmi@gmail.com','123456','2001-02-01'),('TG110',714076722,'dilshan ','sriyan','m','dilshani@gmail.com','123456','1999-03-09');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `technical officer`
--

DROP TABLE IF EXISTS `technical officer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `technical officer` (
  `Tec_id` int NOT NULL,
  `Fname` varchar(100) NOT NULL,
  `Lname` varchar(100) DEFAULT NULL,
  `Sex` char(1) DEFAULT NULL,
  `Pno` int DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  PRIMARY KEY (`Tec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `technical officer`
--

LOCK TABLES `technical officer` WRITE;
/*!40000 ALTER TABLE `technical officer` DISABLE KEYS */;
INSERT INTO `technical officer` VALUES (10,'Nizath','Ahamed','m',774545123,'nizath@gmail.com','123456','1999-02-03'),(11,'madhusan','perera','m',711002334,'madusan@gmail.com','123456','1999-02-23');
/*!40000 ALTER TABLE `technical officer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timetable`
--

DROP TABLE IF EXISTS `timetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `timetable` (
  `TT_id` int NOT NULL AUTO_INCREMENT,
  `Date` datetime DEFAULT NULL,
  `Ad_id` int DEFAULT NULL,
  `Course_code` varchar(45) DEFAULT NULL,
  `Hall_no` varchar(45) DEFAULT NULL,
  `Course_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TT_id`),
  KEY `Ad_id` (`Ad_id`),
  CONSTRAINT `timetable_ibfk_1` FOREIGN KEY (`Ad_id`) REFERENCES `admin` (`Ad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetable`
--

LOCK TABLES `timetable` WRITE;
/*!40000 ALTER TABLE `timetable` DISABLE KEYS */;
/*!40000 ALTER TABLE `timetable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-16  0:07:44
