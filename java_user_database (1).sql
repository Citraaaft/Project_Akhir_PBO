-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2024 at 03:57 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_user_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb`
--

CREATE TABLE `tb` (
  `No` int(11) NOT NULL,
  `Items` varchar(30) NOT NULL,
  `Qty` int(11) NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb`
--

INSERT INTO `tb` (`No`, `Items`, `Qty`, `Price`) VALUES
(27, 'French Fries', 2, 30000),
(28, 'Spaghetti', 1, 35000),
(29, 'Pancake', 1, 20000),
(30, 'Rice Bowl', 1, 25000),
(31, 'Hot Latte', 1, 22000),
(32, 'Hot Black Coffee', 1, 20000),
(33, 'Hot Frappucino', 1, 25000),
(34, 'Hot Cappucino', 1, 22000),
(35, 'Iced Matcha Latte', 1, 18000),
(36, 'Iced Vanilla', 1, 18000),
(37, 'Iced Lemontea', 1, 11000),
(38, 'Iced Chocolate', 1, 12000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `full_name` varchar(127) NOT NULL,
  `email` varchar(127) NOT NULL,
  `password` varchar(127) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `full_name`, `email`, `password`) VALUES
(21, 'Citra Fatika', 'citrafatika@gmail.com', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb`
--
ALTER TABLE `tb`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb`
--
ALTER TABLE `tb`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
