-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 104.236.240.10    Database: carport
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.04.1

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
  `ItemID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `Length` double NOT NULL,
  `Amount` int(11) NOT NULL,
  PRIMARY KEY (`ItemID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carportitemsprice`
--

LOCK TABLES `carportitemsprice` WRITE;
/*!40000 ALTER TABLE `carportitemsprice` DISABLE KEYS */;
INSERT INTO `carportitemsprice` VALUES (1,'25x200 PT Wood',360,4),(2,'25x200 PT Wood',540,4),(3,'25x125 PT Wood',360,2),(4,'25x125 PT Wood',540,4),(5,'38x73 Lath UT',420,1),(6,'45x95 Reglar UT',270,12),(7,'45x95',240,4),(8,'45x195 Rafters',600,2),(9,'45x195 Rafters',480,1),(10,'45x195, Rafters',600,15),(11,'97x97 PT pole',300,11),(12,'19x100 PT Wood',210,200),(13,'19x100 PT Wood',540,4),(14,'19x100 PT Wood',360,2),(15,'Plastmo Ecolite',600,6),(16,'Plastmo Ecolite',360,6),(17,'Plastmo bottom screws',0,3),(18,'perforated band 1x20 mm. 10 mtr',0,2),(19,'universal 190',0,15),(20,'4,5x60 Screws',0,1),(21,'4,0x50 Bracket screws',0,3),(22,'Carriage Bolt 10x120',0,18),(23,'square slices 40x40x11',0,12),(24,'4,5x70 Screws',0,2),(25,'4,5x50 Screws',0,2),(26,'farmgate grip 50x75',0,1),(27,'t hinge 390',0,2),(28,'Angle bracket',0,32);
/*!40000 ALTER TABLE `carportitemsprice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `zip` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=211 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'test@gmail.com','123456','John','Doe','Strangegade','5555','456-789'),(5,'test','test','test','test','test','test','test'),(6,'2','test2','test2','test2','tes2t','test2','test2'),(7,'test3','test3','test3','test3','tes3','test3','test3'),(8,'test4','test3','test3','test3','tes3','test3','test3'),(9,'test5','test5','test5','test5','test5','test5','test5'),(10,'test5','test5','test5','test5','test5','test5','test5'),(11,'test6','test3','test3','test3','tes3','test3','test3'),(12,'7','test','testt','test','test','test','test'),(13,'8','test','testt','test','test','test','test'),(14,'8','test','testt','test','test','test','test'),(15,'8','test','testt','test','test','test','test'),(16,'8','test','testt','test','test','test','test'),(17,'test11','test','testt','test','test','test','test'),(18,'something','test','testt','test','test','test','test'),(19,'something','test','testt','test','test','test','test'),(20,'something','test','testt','test','test','test','test'),(21,'sdfsdfsdfsdfsdf','test','testt','test','test','test','test'),(22,'phone','phone','phone','phone','phone','phone','phone'),(23,'phone','phone','phone','phone','phone','phone','phone'),(24,'RegistrationTest','RegistrationTest','RegistrationTest','RegistrationTest','RegistrationTest','RegistrationTest','v'),(25,'todayTest','todayTest','todayTest','todayTest','todayTest','todayTest','todayTest'),(26,'y','y','y','y','y','2','1'),(27,'y','y','y','y','y','2','1'),(28,'y','y','y','y','y','2','1'),(29,'y','y','y','y','y','2','1'),(30,'y','y','y','','y','y','y'),(31,'y','y','y','','y','y','y'),(32,'y','y','y','','y','y','y'),(33,'test','test','test','test','test','test','test'),(34,'test','test','test','test','test','test','test'),(35,'test','test','test','test','test','test','test'),(36,'y','y','y','y','y','y','y'),(37,'y','y','y','y','y','y','y'),(38,'y','y','y','y','y','y','y'),(39,'yolanda.owiso.yo@gmail.com','y','Felesiah yolanda','KrÃ¸ier','Ã?stbanegade','y','y'),(40,'yolanda.owiso.yo@gmail.com','y','Felesiah yolanda','KrÃ¸ier','Ã?stbanegade','y','y'),(41,'yolanda.owiso.yo@gmail.com','y','Felesiah yolanda','KrÃ¸ier','Ã?stbanegade','y','y'),(42,'yolanda.owiso.yo@gmail.com','y','Felesiah yolanda','KrÃ¸ier','Ã?stbanegade','y','y'),(43,'yolanda.owiso.yo@gmail.com','y','y','KrÃ¸ier','Ã?stbanegade','y','y'),(44,'','','','','','',''),(45,'','','','','','',''),(46,'yol','yol','yol','yol','yol','yol','yol'),(47,'yol','yol','yol','yol','yol','yol','yol'),(48,'yol','yol','yol','yol','yol','yol','yol'),(49,'yol','yol','yol','yol','yol','yol','yol'),(50,'yol','yol','yol','yol','yol','yol','yol'),(51,'yo','yo','yo','yo','yo','yo','yol'),(52,'yo','yo','yo','yo','yo','yo','yol'),(53,'yo','yo','yo','yo','yo','yo','yol'),(54,'yo','yo','yo','yo','yo','yo','yol'),(55,'yo','yo','yo','yo','yo','yo','yol'),(56,'yolly','yolly','yolly','yolly','yolly','yolly','yolly'),(57,'yolly','yolly','yolly','yolly','yolly','yolly','yolly'),(58,'yolly','yolly','yolly','yolly','yolly','yolly','yolly'),(59,'yolly','yolly','yolly','yolly','yolly','yolly','yolly'),(60,'yolly','yolly','yolly','yolly','yolly','yolly','yolly'),(61,'yolly','yolly','yolly','yolly','yolly','yolly','yolly'),(62,'yolly','yolly','yolly','yolly','yolly','yolly','yolly'),(63,'yolly','yolly','yolly','yolly','yolly','yolly','yolly'),(64,'yolly','yolly','yolly','yolly','yolly','yolly','yolly'),(65,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(66,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(67,'Q','','','','','',''),(68,'23','234`1`','Q','Q','Q','Q','Q'),(69,'A','','','','','',''),(70,'a','','','','','',''),(71,'das','','','','','',''),(72,'55','','','','','',''),(73,'alabala@gmail.com','212919212KKsa9','Tester','Tester','Test Avenue 123','1234','219219332121321'),(74,'amazeballs','test','test','test','test','test','test'),(75,'k','k','k','kk','k','k','k'),(76,'k','k','k','k','k','k','k'),(77,'','','','','','',''),(78,'java@gmail.com','12218182818128k','java','java','Adresslane Something','1234','129219921912921'),(79,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(80,'mkopoi3@abv.bg','1994','tsvetomir','batinov','ivan ivanov 12','2323','1231231232132'),(81,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(82,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(83,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(84,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(85,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(86,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(87,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(88,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(89,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(90,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(91,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(92,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(93,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(94,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(95,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(96,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(97,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(98,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(99,'1','1','1','1','','',''),(100,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(101,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(102,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(103,'yolanda.owiso.yo@gmail.com','lol','Felesiah ','KrÃ¸ier','Ã?stbanegade','2100','555555555'),(104,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(105,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(106,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(107,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(108,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(109,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(110,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(111,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(112,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(113,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(114,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(115,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(116,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(117,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(118,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(119,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(120,'yolanda.owiso.yo@gmail.com','yolanda','Felesiah ','KrÃ¸ier','Ã?stbanegade ','2100','123455'),(121,'yolanda.owiso.yo@gmail.com','yolanda','Felesiah ','KrÃ¸ier','Ã?stbanegade ','2100','123455'),(122,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(123,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(124,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(125,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(126,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(127,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(128,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(129,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(130,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(131,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(132,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(133,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(134,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(135,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(136,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(137,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(138,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(139,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(140,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(141,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(142,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(143,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(144,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(145,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(146,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(147,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(148,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(149,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(150,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(151,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(152,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(153,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(154,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(155,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(156,'ivan@avcn.com','123123','ivan','inva','ivan','2222','123123123'),(157,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(158,'ivan@avcn.com','123','Ivan','Ivanov','ivan ivanov 1','123123','12312312312'),(159,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(160,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(161,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(162,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(163,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(164,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(165,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(166,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(167,'','','','','','',''),(168,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(169,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(170,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(171,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(172,'q','a','z','d','x','z','c'),(173,'asdf','asdf','dfasdf','asdfasdf','asdfasdf','asdfas','dfasd'),(174,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(175,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(176,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(177,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(178,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(179,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(180,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(181,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(182,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(183,'a@gmail.com','a','aa','aa','1234567','234567','8766543'),(184,'ww','w','3e','e','rt','re','f'),(185,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(186,'x','x','v','h','j','t','f'),(187,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(188,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(189,'w','w','w','w','w','w','w'),(190,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(191,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(192,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(193,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(194,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(195,'tsbatinov@gmail.com','12345678','Tsvetomir','Batinov','MorbÃ¦rhaven 20 - 62','2620','53620606'),(196,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(197,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(198,'asdf','sdf','','','','',''),(199,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(200,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(201,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(202,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(203,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(204,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(205,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(206,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(207,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(208,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(209,'y','yolly','yolly','yolly','yolly','yolly','yolly'),(210,'y','yolly','yolly','yolly','yolly','yolly','yolly');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `list`
--

DROP TABLE IF EXISTS `list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `list` (
  `id` int(11) NOT NULL,
  `parts` int(11) NOT NULL,
  `customerid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `customerid_idx` (`customerid`),
  CONSTRAINT `customerid` FOREIGN KEY (`customerid`) REFERENCES `order` (`customerid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list`
--

LOCK TABLES `list` WRITE;
/*!40000 ALTER TABLE `list` DISABLE KEYS */;
INSERT INTO `list` VALUES (1,1,1),(2,2,1),(3,3,1),(4,4,1),(5,5,1),(6,6,1),(7,7,1),(8,8,1);
/*!40000 ALTER TABLE `list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `idOrder` int(11) NOT NULL,
  `payment` varchar(45) NOT NULL,
  `date` date NOT NULL,
  `customerid` int(11) NOT NULL,
  PRIMARY KEY (`customerid`),
  KEY `customerid_idx` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,'200','2023-03-17',1);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-29 21:07:35
