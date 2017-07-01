-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: carportfog1
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carportitemsprice`
--

DROP TABLE IF EXISTS `carportitemsprice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carportitemsprice` (
  `25x200 mm. PT. Wood-piece(360,4)` varchar(45) NOT NULL COMMENT 'Wood for the front and back (Carport)',
  `25x200 mm. PT.  Wood-piece(540,4)` varchar(45) DEFAULT NULL,
  `25x125mm. PT.  Wood-piece(360,2)` varchar(45) DEFAULT NULL COMMENT 'Wood for the front',
  `25x125mm. PT.  Wood-piece(540,4)` varchar(45) DEFAULT NULL,
  `38x73 mm. Lath UT(420,1)` varchar(45) DEFAULT NULL COMMENT 'for z on the back of the door',
  `45x95 mm. Reglar UT(270,12)` varchar(45) DEFAULT NULL,
  `45x95 mm. Reglar UT(240,4)` varchar(45) DEFAULT NULL,
  `45x195 mm. Rafters UT(600,2)` varchar(45) DEFAULT NULL,
  `45x195 mm. Rafters UT(480,1)` varchar(45) DEFAULT NULL COMMENT 'Straps in the sides, saddles into the uprights ( Shed part, devided)',
  `45x195 mm. Rafters UT(600,15)` varchar(45) DEFAULT NULL,
  `97x97 mm. PT. Pole(300,11)` varchar(45) DEFAULT NULL,
  `19x100 mm. PT.  Wood-piece(210,200)` varchar(45) DEFAULT NULL,
  `19x100 mm. PT.  Wood-piece(540,4)` varchar(45) DEFAULT NULL,
  `19x100 mm. PT.  Wood-piece(360,2)` varchar(45) DEFAULT NULL,
  `Plastmo Ecolite bluetoned(600,6)` varchar(45) DEFAULT NULL,
  `Plastmo Ecolite bluetoned(360,6)` varchar(45) DEFAULT NULL,
  `Plastmo bottom screws 200 Pcs(0,3)` varchar(45) DEFAULT NULL,
  `Perforated band 1x20 mm. 10 mtr(0,2)` varchar(45) DEFAULT NULL,
  `Universal 190 mm RIGHT(0,15)` varchar(45) DEFAULT NULL,
  `Universal 190 mm LEFT(0,15)` varchar(45) DEFAULT NULL,
  `4,5 x 60 mm. Screws 200 pcs(0,1)` varchar(45) DEFAULT NULL,
  `4,0 x 50 mm bracket screws 250 pcs(0,3)` varchar(45) DEFAULT NULL,
  `Carriage bolt 10 x 120 mm(0,18)` varchar(45) DEFAULT NULL,
  `Square slices  40x40x11mm(0,12)` varchar(45) DEFAULT NULL,
  `4,5 x 70 mm. Screws 400 pcs(0,2)` varchar(45) DEFAULT NULL,
  `4,5 x 50 mm. Screws 300 pcs(0,2)` varchar(45) DEFAULT NULL,
  `Farmgate grip  50x75(0,1)` varchar(45) DEFAULT NULL,
  `T hinge 390 mm(0,2)` varchar(45) DEFAULT NULL,
  `Angle bracket 35(0,32)` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`25x200 mm. PT. Wood-piece(360,4)`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carportitemsprice`
--

LOCK TABLES `carportitemsprice` WRITE;
/*!40000 ALTER TABLE `carportitemsprice` DISABLE KEYS */;
/*!40000 ALTER TABLE `carportitemsprice` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-03 11:33:07
