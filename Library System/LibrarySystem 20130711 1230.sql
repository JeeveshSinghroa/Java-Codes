-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.32


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema library
--

CREATE DATABASE IF NOT EXISTS library;
USE library;

--
-- Definition of table `clerk`
--

DROP TABLE IF EXISTS `clerk`;
CREATE TABLE `clerk` (
  `cid` int(11) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clerk`
--

/*!40000 ALTER TABLE `clerk` DISABLE KEYS */;
INSERT INTO `clerk` (`cid`,`pwd`) VALUES 
 (1,'james'),
 (2,'josh');
/*!40000 ALTER TABLE `clerk` ENABLE KEYS */;


--
-- Definition of table `issue`
--

DROP TABLE IF EXISTS `issue`;
CREATE TABLE `issue` (
  `bid` int(11) DEFAULT NULL,
  `bname` varchar(20) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `mname` varchar(20) DEFAULT NULL,
  `cat` varchar(20) DEFAULT NULL,
  `issue_date` varchar(20) DEFAULT NULL,
  `return_date` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issue`
--

/*!40000 ALTER TABLE `issue` DISABLE KEYS */;
/*!40000 ALTER TABLE `issue` ENABLE KEYS */;


--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `uname` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  `utype` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`uname`,`pwd`,`utype`) VALUES 
 ('jeevesh','ymca','Admin'),
 ('sunil','mca','Clerk'),
 ('hitesh','mca','Clerk');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Definition of table `master_tbl_book`
--

DROP TABLE IF EXISTS `master_tbl_book`;
CREATE TABLE `master_tbl_book` (
  `bid` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  `ref` varchar(30) DEFAULT NULL,
  `cat` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_tbl_book`
--

/*!40000 ALTER TABLE `master_tbl_book` DISABLE KEYS */;
INSERT INTO `master_tbl_book` (`bid`,`name`,`author`,`ref`,`cat`) VALUES 
 (1,'java','hb','no','java'),
 (2,'revolution2020','chetan bhagat','no','c');
/*!40000 ALTER TABLE `master_tbl_book` ENABLE KEYS */;


--
-- Definition of table `master_tbl_book_cat`
--

DROP TABLE IF EXISTS `master_tbl_book_cat`;
CREATE TABLE `master_tbl_book_cat` (
  `cname` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_tbl_book_cat`
--

/*!40000 ALTER TABLE `master_tbl_book_cat` DISABLE KEYS */;
INSERT INTO `master_tbl_book_cat` (`cname`) VALUES 
 ('java'),
 ('c++'),
 ('c');
/*!40000 ALTER TABLE `master_tbl_book_cat` ENABLE KEYS */;


--
-- Definition of table `master_tbl_member`
--

DROP TABLE IF EXISTS `master_tbl_member`;
CREATE TABLE `master_tbl_member` (
  `mid` int(11) DEFAULT NULL,
  `mname` varchar(30) DEFAULT NULL,
  `catagory` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_tbl_member`
--

/*!40000 ALTER TABLE `master_tbl_member` DISABLE KEYS */;
INSERT INTO `master_tbl_member` (`mid`,`mname`,`catagory`) VALUES 
 (1,'james','student'),
 (2,'jacky','student');
/*!40000 ALTER TABLE `master_tbl_member` ENABLE KEYS */;


--
-- Definition of table `master_tbl_member_cat`
--

DROP TABLE IF EXISTS `master_tbl_member_cat`;
CREATE TABLE `master_tbl_member_cat` (
  `cname` varchar(30) DEFAULT NULL,
  `days` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_tbl_member_cat`
--

/*!40000 ALTER TABLE `master_tbl_member_cat` DISABLE KEYS */;
INSERT INTO `master_tbl_member_cat` (`cname`,`days`) VALUES 
 ('student',12),
 ('non-teaching',30);
/*!40000 ALTER TABLE `master_tbl_member_cat` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
