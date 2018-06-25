-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: definitivao
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.28-MariaDB

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
-- Table structure for table `cardapio`
--

DROP TABLE IF EXISTS `cardapio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cardapio` (
  `id` int(11) NOT NULL,
  `carne1` int(11) DEFAULT NULL,
  `carne2` int(11) DEFAULT NULL,
  `carneVeg` int(11) DEFAULT NULL,
  `guarn1` int(11) DEFAULT NULL,
  `guarn2` int(11) DEFAULT NULL,
  `guarn3` int(11) DEFAULT NULL,
  `fruta` int(11) DEFAULT NULL,
  `doce` int(11) DEFAULT NULL,
  `suco` int(11) DEFAULT NULL,
  `salada` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_carne1` (`carne1`),
  KEY `fk_carne2` (`carne2`),
  KEY `fk_carneVeg` (`carneVeg`),
  KEY `fk_guarn1` (`guarn1`),
  KEY `fk_guarn2` (`guarn2`),
  KEY `fk_guarn3` (`guarn3`),
  KEY `fk_fruta` (`fruta`),
  KEY `fk_doce` (`doce`),
  KEY `fk_suco` (`suco`),
  KEY `fk_salada` (`salada`),
  CONSTRAINT `fk_carne1` FOREIGN KEY (`carne1`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_carne2` FOREIGN KEY (`carne2`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_carneVeg` FOREIGN KEY (`carneVeg`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_doce` FOREIGN KEY (`doce`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_fruta` FOREIGN KEY (`fruta`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_guarn1` FOREIGN KEY (`guarn1`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_guarn2` FOREIGN KEY (`guarn2`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_guarn3` FOREIGN KEY (`guarn3`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_salada` FOREIGN KEY (`salada`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_suco` FOREIGN KEY (`suco`) REFERENCES `item` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardapio`
--

LOCK TABLES `cardapio` WRITE;
/*!40000 ALTER TABLE `cardapio` DISABLE KEYS */;
/*!40000 ALTER TABLE `cardapio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cardapiosem`
--

DROP TABLE IF EXISTS `cardapiosem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cardapiosem` (
  `id` int(11) NOT NULL,
  `id_card` int(11) DEFAULT NULL,
  `turno` varchar(1) DEFAULT NULL,
  `datar` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_idCard` (`id_card`),
  CONSTRAINT `fk_idCard` FOREIGN KEY (`id_card`) REFERENCES `cardapio` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardapiosem`
--

LOCK TABLES `cardapiosem` WRITE;
/*!40000 ALTER TABLE `cardapiosem` DISABLE KEYS */;
/*!40000 ALTER TABLE `cardapiosem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `id` int(11) NOT NULL,
  `nome` varchar(48) DEFAULT NULL,
  `categoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'bife ao molho',1),(2,'frango assado',1),(3,'panqueca de soja',1),(4,'arroz',2),(5,'arroz integral',2),(6,'macarrao',2),(7,'fafora',2),(8,'pirao',2),(9,'pure de batata',2),(10,'banana',3),(11,'laranja',3),(12,'acabaxi',3),(13,'mamao',3),(14,'maca',3),(15,'melao',3),(16,'melancia',3),(17,'quebra queixo',3),(18,'doce de leite',3),(19,'tijolinho',3),(20,'cocada',3),(21,'pacoquita',3),(22,'suco de maracuja',5),(23,'suco de manga',5),(24,'salada verao',4);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preco`
--

DROP TABLE IF EXISTS `preco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `preco` (
  `id` int(11) NOT NULL,
  `valor` float DEFAULT NULL,
  `nivelUsu` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preco`
--

LOCK TABLES `preco` WRITE;
/*!40000 ALTER TABLE `preco` DISABLE KEYS */;
INSERT INTO `preco` VALUES (1,1.1,1),(2,7,2),(3,5.5,3);
/*!40000 ALTER TABLE `preco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `nome` varchar(120) DEFAULT NULL,
  `matricula` int(11) NOT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `login` varchar(16) DEFAULT NULL,
  `senha` varchar(16) DEFAULT NULL,
  `quantTic` int(11) DEFAULT NULL,
  `nivelAcesso` int(11) DEFAULT NULL,
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('leonh',385402,'42783532867','leogago','leonhbb',0,1),('daniel',385403,'60019348193','dandan','danielzim',0,1),('joao vitor',385404,'85384769807','jovitone','dotinhagod',0,1),('cintia',385405,'97856751657','cintiazinha','marcelog',0,2),('haroldo',385406,'87189351256','salsitox','melhormid',0,3),('paulo',385407,'10081332130','paulocu','lixo',0,4);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda` (
  `id` int(11) NOT NULL,
  `quantTic` int(11) DEFAULT NULL,
  `id_Usu_c` int(11) DEFAULT NULL,
  `id_Usu_v` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_idC` (`id_Usu_c`),
  KEY `fk_idV` (`id_Usu_v`),
  CONSTRAINT `fk_idC` FOREIGN KEY (`id_Usu_c`) REFERENCES `usuario` (`matricula`),
  CONSTRAINT `fk_idV` FOREIGN KEY (`id_Usu_v`) REFERENCES `usuario` (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-24 15:38:39
