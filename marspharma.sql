-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2023 at 06:48 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `marspharma`
--

-- --------------------------------------------------------

--
-- Table structure for table `appuser`
--

CREATE TABLE `appuser` (
  `appuser_pk` int(11) NOT NULL,
  `userRole` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `dob` varchar(50) DEFAULT NULL,
  `mobileNumber` varchar(50) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `username` varchar(200) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appuser`
--

INSERT INTO `appuser` (`appuser_pk`, `userRole`, `name`, `dob`, `mobileNumber`, `email`, `username`, `password`, `address`) VALUES
(1, 'Admin', 'Admin', '28-11-2001', '01800000000', 'admin@gmail.com', 'admin', 'admin', 'Mirpur, Dhaka'),
(2, 'Pharmacist', 'Pharmacist', '28-11-2001', '01700000000', 'pharma@gmail.com', 'pharma', 'pharma', 'Mirpur, Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `bill_pk` int(11) NOT NULL,
  `billId` varchar(200) DEFAULT NULL,
  `billDate` varchar(50) DEFAULT NULL,
  `totalPaid` bigint(20) DEFAULT NULL,
  `generatedBy` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`bill_pk`, `billId`, `billDate`, `totalPaid`, `generatedBy`) VALUES
(25, 'MPBL742064728061600', '19-05-2023', 1650, 'pharma'),
(26, 'MPBL742135952049200', '19-05-2023', 1500, 'pharma'),
(27, 'MPBL742277040156300', '19-05-2023', 555, 'pharmaRitu'),
(28, 'MPBL775852368764000', '19-05-2023', 300, 'pharma'),
(29, 'MPBL781600308691200', '19-05-2023', 6, 'pharma');

-- --------------------------------------------------------

--
-- Table structure for table `medicine`
--

CREATE TABLE `medicine` (
  `medicine_pk` int(11) NOT NULL,
  `uniqueId` varchar(200) DEFAULT NULL,
  `brandName` varchar(200) DEFAULT NULL,
  `genName` varchar(200) DEFAULT NULL,
  `company` varchar(200) DEFAULT NULL,
  `quantity` bigint(20) DEFAULT NULL,
  `price` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medicine`
--

INSERT INTO `medicine` (`medicine_pk`, `uniqueId`, `brandName`, `genName`, `company`, `quantity`, `price`) VALUES
(1, '001', 'Napa (Syrup)', 'Paracetamol', 'Beximco Pharmaceuticals Ltd.', 96, 30),
(2, '002', 'Alatrol ', 'Cetirizine Hydrochloride', 'Square Pharmaceuticals Ltd.', 449, 3),
(3, '003', 'Flexi', 'Aceclofenac', 'Square Pharmaceuticals Ltd.', 424, 5),
(4, '004', 'Ecosprin', 'Aspirin', 'ACME Laboratories Ltd.', 106, 1),
(5, '005', 'Carvista', 'Carvedilol', 'Incepta Pharmaceuticals Ltd.', 332, 5),
(6, '006', 'Tyclav', 'Amoxicillin+Clavulanic Acid', 'Beximco Pharmaceutical Ltd.', 345, 32),
(7, '007', 'Pantonix', 'Pantoprazole Sodium Sqsquihydrate', 'Incepta Pharmaceuticals Ltd.', 420, 7),
(8, '008', 'Stafen', 'Ketotifen Fumarate', 'Aristopharma Ltd.', 148, 3),
(9, '009', 'Provair', 'Montelkast Sodium', 'UniMed UniHealth Pharmaceuticals Ltd.', 340, 18),
(10, '010', 'Sulprex (Inhaler)', 'Salbutamol+Ipratropium', 'Square Pharmaceutical Ltd.', 17, 250),
(11, '011', 'Ticamet (Inhaler)', 'Salmeterol+Fluticasone Propionate', 'Square Pharmaceutical Ltd.', 8, 800);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appuser`
--
ALTER TABLE `appuser`
  ADD PRIMARY KEY (`appuser_pk`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`bill_pk`);

--
-- Indexes for table `medicine`
--
ALTER TABLE `medicine`
  ADD PRIMARY KEY (`medicine_pk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appuser`
--
ALTER TABLE `appuser`
  MODIFY `appuser_pk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `bill`
--
ALTER TABLE `bill`
  MODIFY `bill_pk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `medicine`
--
ALTER TABLE `medicine`
  MODIFY `medicine_pk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;