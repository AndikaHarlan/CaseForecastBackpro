-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 05 Jun 2017 pada 15.52
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penyakit`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `demam`
--

CREATE TABLE `demam` (
  `tahun` int(11) NOT NULL,
  `bulan` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `demam`
--

INSERT INTO `demam` (`tahun`, `bulan`, `jumlah`) VALUES
(2012, 1, 31),
(2012, 2, 46),
(2012, 3, 30),
(2012, 4, 29),
(2012, 5, 19),
(2012, 6, 6),
(2012, 7, 26),
(2012, 8, 36),
(2012, 9, 87),
(2012, 10, 1),
(2012, 11, 75),
(2012, 12, 0),
(2013, 1, 11),
(2013, 2, 0),
(2013, 3, 13),
(2013, 4, 4),
(2013, 5, 7),
(2013, 6, 19),
(2013, 7, 37),
(2013, 8, 23),
(2013, 9, 51),
(2013, 10, 21),
(2013, 11, 43),
(2013, 12, 42),
(2014, 1, 67),
(2014, 2, 89),
(2014, 3, 54),
(2014, 4, 17),
(2014, 5, 39),
(2014, 6, 22),
(2014, 7, 16),
(2014, 8, 27),
(2014, 9, 13),
(2014, 10, 21),
(2014, 11, 44),
(2014, 12, 20),
(2015, 1, 61),
(2015, 2, 60),
(2015, 3, 37),
(2015, 4, 24),
(2015, 5, 16),
(2015, 6, 11),
(2015, 7, 7),
(2015, 8, 7),
(2015, 9, 8),
(2015, 10, 15),
(2015, 11, 33),
(2015, 12, 20),
(2016, 1, 33),
(2016, 2, 42),
(2016, 3, 43),
(2016, 4, 46),
(2016, 5, 38),
(2016, 6, 19),
(2016, 7, 16),
(2016, 8, 21),
(2016, 9, 10),
(2016, 10, 25),
(2016, 11, 9),
(2016, 12, 25);

-- --------------------------------------------------------

--
-- Struktur dari tabel `nesofaring`
--

CREATE TABLE `nesofaring` (
  `tahun` int(11) NOT NULL,
  `bulan` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `nesofaring`
--

INSERT INTO `nesofaring` (`tahun`, `bulan`, `jumlah`) VALUES
(2012, 1, 229),
(2012, 2, 307),
(2012, 3, 192),
(2012, 4, 481),
(2012, 5, 77),
(2012, 6, 69),
(2012, 7, 107),
(2012, 8, 58),
(2012, 9, 325),
(2012, 10, 191),
(2012, 11, 142),
(2012, 12, 274),
(2013, 1, 190),
(2013, 2, 0),
(2013, 3, 233),
(2013, 4, 146),
(2013, 5, 157),
(2013, 6, 231),
(2013, 7, 121),
(2013, 8, 231),
(2013, 9, 115),
(2013, 10, 146),
(2013, 11, 187),
(2013, 12, 133),
(2014, 1, 171),
(2014, 2, 216),
(2014, 3, 183),
(2014, 4, 28),
(2014, 5, 103),
(2014, 6, 1),
(2014, 7, 2),
(2014, 8, 32),
(2014, 9, 125),
(2014, 10, 55),
(2014, 11, 141),
(2014, 12, 22),
(2015, 1, 103),
(2015, 2, 118),
(2015, 3, 1),
(2015, 4, 3),
(2015, 5, 21),
(2015, 6, 32),
(2015, 7, 102),
(2015, 8, 155),
(2015, 9, 70),
(2015, 10, 63),
(2015, 11, 178),
(2015, 12, 44),
(2016, 1, 62),
(2016, 2, 77),
(2016, 3, 416),
(2016, 4, 86),
(2016, 5, 73),
(2016, 6, 47),
(2016, 7, 34),
(2016, 8, 51),
(2016, 9, 46),
(2016, 10, 60),
(2016, 11, 37),
(2016, 12, 69);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `demam`
--
ALTER TABLE `demam`
  ADD PRIMARY KEY (`tahun`,`bulan`);

--
-- Indexes for table `nesofaring`
--
ALTER TABLE `nesofaring`
  ADD PRIMARY KEY (`tahun`,`bulan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
