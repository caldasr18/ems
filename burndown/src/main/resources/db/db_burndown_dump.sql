-- phpMyAdmin SQL Dump
-- version 3.2.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 28, 2013 at 05:35 PM
-- Server version: 5.1.44
-- PHP Version: 5.3.2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `burndown`
--

-- --------------------------------------------------------

--
-- Table structure for table `burndown`
--

CREATE TABLE IF NOT EXISTS `burndown` (
  `sprint` varchar(255) NOT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `current_sprint_day` varchar(255) NOT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`sprint`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `burndown`
--

INSERT INTO `burndown` VALUES('49', 1, '2', '2013-06-02 22:12:40');
INSERT INTO `burndown` VALUES('50', 1, '4', '2013-06-03 21:27:38');
INSERT INTO `burndown` VALUES('51', 1, '2', '2013-06-14 10:42:22');
INSERT INTO `burndown` VALUES('52', 1, '2', '2013-06-28 01:56:59');
INSERT INTO `burndown` VALUES('54', 1, '1', '2013-07-26 00:12:01');

-- --------------------------------------------------------

--
-- Table structure for table `daily_work`
--

CREATE TABLE IF NOT EXISTS `daily_work` (
  `daily_work_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime DEFAULT NULL,
  `day` int(11) NOT NULL,
  `estimated` decimal(19,2) DEFAULT NULL,
  `found` decimal(19,2) DEFAULT NULL,
  `remaining` decimal(19,2) NOT NULL,
  `work_done` decimal(19,2) DEFAULT NULL,
  `burndown_sprint` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`daily_work_id`),
  KEY `FK5B0789772D390533` (`burndown_sprint`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `daily_work`
--

INSERT INTO `daily_work` VALUES(1, '2013-06-02 22:10:33', 1, 133.50, 23.50, 123.50, 10.00, '49');
INSERT INTO `daily_work` VALUES(2, '2013-07-27 21:38:47', 2, 275.00, 0.00, 273.50, 3.50, '54');
INSERT INTO `daily_work` VALUES(3, '2013-06-03 21:09:49', 1, 187.00, 0.00, 187.00, 0.00, '50');
INSERT INTO `daily_work` VALUES(4, '2013-07-01 09:15:00', 3, 275.00, 0.00, 247.00, 20.00, '52');
INSERT INTO `daily_work` VALUES(5, '2013-07-01 22:22:25', 4, 275.00, 2.00, 227.59, 22.41, '52');
INSERT INTO `daily_work` VALUES(6, '2013-07-02 19:44:46', 5, 275.00, 5.00, 199.84, 30.50, '52');
INSERT INTO `daily_work` VALUES(7, '2013-07-04 00:20:34', 6, 275.00, 6.25, 185.34, 15.60, '52');
INSERT INTO `daily_work` VALUES(8, '2013-07-07 21:47:41', 7, 275.00, 8.52, 179.06, 22.00, '52');
INSERT INTO `daily_work` VALUES(9, '2013-07-07 21:51:13', 8, 275.00, 8.52, 153.06, 23.54, '52');
INSERT INTO `daily_work` VALUES(10, '2013-06-11 00:42:46', 9, 190.00, 27.50, 57.67, 27.50, '50');
INSERT INTO `daily_work` VALUES(11, '2013-06-14 10:38:48', 1, 172.10, 0.00, 172.10, 0.00, '51');
INSERT INTO `daily_work` VALUES(12, '2013-06-28 01:56:16', 1, 275.00, 0.00, 275.00, 0.00, '52');
INSERT INTO `daily_work` VALUES(13, '2013-07-26 00:08:15', 1, 278.00, 0.00, 277.00, 1.00, '54');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE IF NOT EXISTS `item` (
  `item_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `assignee` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `estimated` decimal(19,2) DEFAULT NULL,
  `found` decimal(19,2) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `remaining` decimal(19,2) DEFAULT NULL,
  `sprint` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `work_done` decimal(19,2) DEFAULT NULL,
  `dailyWork_daily_work_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `FK317B13ABB672FE` (`dailyWork_daily_work_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `item`
--

