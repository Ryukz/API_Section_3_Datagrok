-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Jul 22, 2020 at 05:27 PM
-- Server version: 8.0.18
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datagrokr`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
CREATE TABLE IF NOT EXISTS `customers` (
  `customerid` int(11) NOT NULL DEFAULT '1',
  `address` varchar(60) DEFAULT NULL,
  `city` varchar(15) DEFAULT NULL,
  `company_name` varchar(40) NOT NULL,
  `contact_name` varchar(30) DEFAULT NULL,
  `contact_title` varchar(30) DEFAULT NULL,
  `country` varchar(15) DEFAULT NULL,
  `fax` varchar(24) DEFAULT NULL,
  `phone` varchar(24) DEFAULT NULL,
  `postal_code` varchar(10) DEFAULT NULL,
  `region` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`customerid`, `address`, `city`, `company_name`, `contact_name`, `contact_title`, `country`, `fax`, `phone`, `postal_code`, `region`) VALUES
(1, 'ABC', 'Delhi', 'Datagrok', '1234560', 'Title', 'India', '2564656E', '56446564', '12315', 'Haryana'),
(2, 'RTX ', 'Pune', 'OYO', '5648646', 'Tile1', 'China', '5646Eer5', '5645648646', '45646', 'Italy');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(6);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `productid` int(11) NOT NULL,
  `categoryid` int(11) DEFAULT NULL,
  `discontinued` bit(1) NOT NULL,
  `product_name` varchar(40) NOT NULL,
  `quantity_per_unit` varchar(20) DEFAULT NULL,
  `recorder_level` smallint(2) DEFAULT NULL,
  `supplierid` int(11) DEFAULT NULL,
  `unit_price` decimal(10,4) DEFAULT NULL,
  `units_in_order` smallint(2) DEFAULT NULL,
  `units_in_stock` smallint(2) DEFAULT NULL,
  `units_on_order` smallint(2) DEFAULT NULL,
  PRIMARY KEY (`productid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`productid`, `categoryid`, `discontinued`, `product_name`, `quantity_per_unit`, `recorder_level`, `supplierid`, `unit_price`, `units_in_order`, `units_in_stock`, `units_on_order`) VALUES
(2, 12, b'1', 'Hello', '2', 2, 123, '12.7800', 5, 6, 45),
(3, 12, b'1', 'asds', '2', 2, 123, '12.7800', 5, 6, 78),
(4, 12, b'1', 'rin', '2', 2, 123, '12.7800', 5, 6, 20),
(5, 12, b'1', 'RTXX', '2', 2, 123, '12.7800', 5, 6, 20);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
