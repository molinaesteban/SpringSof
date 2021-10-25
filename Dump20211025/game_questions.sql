-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: game
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `idQuestions` int NOT NULL AUTO_INCREMENT,
  `Category` varchar(50) DEFAULT NULL,
  `Question` varchar(200) DEFAULT NULL,
  `Answer` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idQuestions`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (21,'Entretrainment','En que pais nacio carlos vives','Colombia'),(22,'Entertainment','Que tipo de musica cantaba diomedes diaz','Vallenato'),(23,'Entertainment','Cuantos grammys tiene calle 13','22'),(24,'Entertainment','Como se llama el profesor de la casa de papel','Sergio'),(25,'Entertainment','Cuando murio  Freddie Mercury','1991'),(26,'sports','Cada cuanto tiempo se juega el mundial de futbol ','4 años'),(27,'sports','Cuantos torneos nba gano Michel Jordan','6'),(28,'sports','Cuantas champions gano cristriano ronaldo','5'),(29,'sports','Cual es el atleta con mas medallas olimpicas','Michael Phelps'),(30,'sports','Quien gano el mundial de futbol de 2014','Alemania '),(31,'Geography','Cual es el rio más largo del mundo','Amazonas'),(32,'Geography','Donde esta Transilvania','Rumania'),(33,'Geography','Cual es el oceano mas grande del mundo','Pacifico'),(34,'Geography','En que pais esta la Universidad de Harvard','Estados unidos '),(35,'Geography','Cual es la ciudad mas poblada del mundo','Tokio'),(36,'History','En que año cayo el muro de Berlin','1989'),(37,'History','Quien ideo las leyes de la herencia genetica','Gregor Mendel'),(38,'History','Cual es la videoconsola mas vendida de la historia','play2'),(39,'History','Cuando llego el hombre a la luna','1969'),(40,'History','Quien es el fundador de Facebook ','Mark Zuckerberg'),(41,'Science','Que gas liberan las plantas al hacer la fotosintesis','oxigeno'),(42,'Science','Cuantos dientes tiene un humano','32'),(43,'Science','Cual es el primer elemento de la tabla periodica','hidrogeno'),(44,'Science','Que pigmento da color a nuestra piel',' melanina'),(45,'Science','Cual es el planeta mas grande del Sistema Solar','jupiter');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-25 11:34:43
