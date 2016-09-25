-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 24, 2016 at 08:28 PM
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `elektrovojvodina`
--
CREATE DATABASE IF NOT EXISTS `elektrovojvodina` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `elektrovojvodina`;

-- --------------------------------------------------------

--
-- Table structure for table `aktivnost`
--

DROP TABLE IF EXISTS `aktivnost`;
CREATE TABLE IF NOT EXISTS `aktivnost` (
  `id_aktivnosti` int(11) NOT NULL,
  `naziv_aktivnosti` varchar(20) NOT NULL,
  `id_sablona` int(11) NOT NULL,
  PRIMARY KEY (`id_aktivnosti`),
  KEY `FK4B3E0899DB031F3D` (`id_sablona`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dodela`
--

DROP TABLE IF EXISTS `dodela`;
CREATE TABLE IF NOT EXISTS `dodela` (
  `id_uloge` int(11) NOT NULL,
  `id_radnika` int(11) NOT NULL,
  `id_rn` int(11) NOT NULL,
  `odgovorno_lice` varchar(20) NOT NULL,
  `datum_od` date NOT NULL,
  `datum_do` date NOT NULL,
  PRIMARY KEY (`id_uloge`,`id_radnika`,`id_rn`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `element`
--

DROP TABLE IF EXISTS `element`;
CREATE TABLE IF NOT EXISTS `element` (
  `id_elementa` int(11) NOT NULL,
  `lokacija` varchar(20) NOT NULL,
  `koordinate` int(11) NOT NULL,
  `opis` varchar(20) NOT NULL,
  `id_tipaelementa` int(11) NOT NULL,
  PRIMARY KEY (`id_elementa`),
  KEY `FK9CE31EFCB6F34A0C` (`id_tipaelementa`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kalendar_odrzavanja`
--

DROP TABLE IF EXISTS `kalendar_odrzavanja`;
CREATE TABLE IF NOT EXISTS `kalendar_odrzavanja` (
  `id_kalendara` int(11) NOT NULL,
  `status` varchar(20) NOT NULL,
  `datum_kreiranja` date NOT NULL,
  `tip_aktivnosti` varchar(20) NOT NULL,
  `grupa_aktivnosti` varchar(20) NOT NULL,
  `id_plana_odrzavanja` int(11) NOT NULL,
  PRIMARY KEY (`id_kalendara`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `knjiga_odrzavanja`
--

DROP TABLE IF EXISTS `knjiga_odrzavanja`;
CREATE TABLE IF NOT EXISTS `knjiga_odrzavanja` (
  `id_knjige` int(11) NOT NULL,
  `redni_broj` int(11) NOT NULL,
  `datum_kreiranja` date NOT NULL,
  PRIMARY KEY (`id_knjige`,`redni_broj`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `korak`
--

DROP TABLE IF EXISTS `korak`;
CREATE TABLE IF NOT EXISTS `korak` (
  `id_koraka` int(11) NOT NULL,
  `naziv_koraka` varchar(20) NOT NULL,
  `id_aktivnosti` int(11) NOT NULL,
  `naziiv_koraka` varchar(255) DEFAULT NULL,
  KEY `FK6180038244495FC` (`id_aktivnosti`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `korisnik`
--

DROP TABLE IF EXISTS `korisnik`;
CREATE TABLE IF NOT EXISTS `korisnik` (
  `korisnikID` int(11) NOT NULL,
  `Ime` varchar(20) NOT NULL,
  `Prezime` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` int(11) NOT NULL,
  PRIMARY KEY (`korisnikID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `korisnik`
--

INSERT INTO `korisnik` (`korisnikID`, `Ime`, `Prezime`, `username`, `password`) VALUES
(1, 'Bane', 'Stevanovic', 'bstev', 123);

-- --------------------------------------------------------

--
-- Table structure for table `lista_odrzavanja`
--

DROP TABLE IF EXISTS `lista_odrzavanja`;
CREATE TABLE IF NOT EXISTS `lista_odrzavanja` (
  `id_sablona` int(11) NOT NULL,
  `id_liste` int(11) NOT NULL,
  `stanje` varchar(20) NOT NULL,
  `radnik_koji_je_zatvorio_listu` int(11) NOT NULL,
  `datum_kreiranja` date NOT NULL,
  `datum_dodele_korisniku` date NOT NULL,
  `planirani_datum_izvrsenja` date NOT NULL,
  `datum_zatvaranja` date NOT NULL,
  `datum_revizije` date NOT NULL,
  `id_kalendara` int(11) NOT NULL,
  `id_stavke_rn` int(11) NOT NULL,
  `id_rn` int(11) NOT NULL,
  PRIMARY KEY (`id_sablona`,`id_liste`),
  KEY `FKB47AFF32DB031F3D` (`id_sablona`),
  KEY `FKB47AFF32EAA19B2C` (`id_kalendara`),
  KEY `FKB47AFF32F6C665AD` (`radnik_koji_je_zatvorio_listu`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `radnik`
--

DROP TABLE IF EXISTS `radnik`;
CREATE TABLE IF NOT EXISTS `radnik` (
  `id_radnika` int(11) NOT NULL,
  `jmbg` int(11) NOT NULL,
  `strucnost` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL,
  `ime` varchar(20) NOT NULL,
  `prezime` varchar(20) NOT NULL,
  PRIMARY KEY (`id_radnika`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `radnik`
--

INSERT INTO `radnik` (`id_radnika`, `jmbg`, `strucnost`, `status`, `ime`, `prezime`) VALUES
(1, 1234567, 's', 'f', 'marija', 'milica');

-- --------------------------------------------------------

--
-- Table structure for table `radni_nalog`
--

DROP TABLE IF EXISTS `radni_nalog`;
CREATE TABLE IF NOT EXISTS `radni_nalog` (
  `id_rn` int(11) NOT NULL,
  `datum_otvaranja` date NOT NULL,
  `datum_zatvaranja` date NOT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`id_rn`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sablon`
--

DROP TABLE IF EXISTS `sablon`;
CREATE TABLE IF NOT EXISTS `sablon` (
  `id_sablona` int(11) NOT NULL,
  `oznaka_sablona` varchar(20) NOT NULL,
  `naziv_sablona` varchar(20) NOT NULL,
  `vremenske_oznake` varchar(50) NOT NULL,
  `mesto` varchar(20) NOT NULL,
  `datum` date NOT NULL,
  `odgovorni_rukovodilac` varchar(20) NOT NULL,
  `odgovorno_lice_za_eeo` varchar(20) NOT NULL,
  `tip_opreme_id` int(11) NOT NULL,
  `stanje_sablona` varchar(50) NOT NULL,
  PRIMARY KEY (`id_sablona`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stavka_knjige`
--

DROP TABLE IF EXISTS `stavka_knjige`;
CREATE TABLE IF NOT EXISTS `stavka_knjige` (
  `id_knjige` int(11) NOT NULL,
  `redni_broj` int(11) NOT NULL,
  `datum_kreiranja` date NOT NULL,
  `napomena` varchar(50) NOT NULL,
  `id_sablona` int(11) NOT NULL,
  `id_liste` int(11) NOT NULL,
  PRIMARY KEY (`id_knjige`,`redni_broj`),
  KEY `FK590F87B3871467C8` (`id_liste`),
  KEY `FK590F87B3DB031F3D` (`id_sablona`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stavka_rn`
--

DROP TABLE IF EXISTS `stavka_rn`;
CREATE TABLE IF NOT EXISTS `stavka_rn` (
  `id_stavke_rn` int(11) NOT NULL,
  `id_rn` int(11) NOT NULL,
  `status` varchar(20) NOT NULL,
  `redni_broj` int(11) NOT NULL,
  PRIMARY KEY (`id_stavke_rn`,`id_rn`),
  KEY `FK876FDD2F803EEB64` (`id_rn`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tip_elementa`
--

DROP TABLE IF EXISTS `tip_elementa`;
CREATE TABLE IF NOT EXISTS `tip_elementa` (
  `id_tipa_elementa` int(11) NOT NULL,
  `opis_tipa` varchar(20) NOT NULL,
  `id_sablona` int(11) NOT NULL,
  `typeID` int(11) NOT NULL,
  PRIMARY KEY (`id_tipa_elementa`),
  KEY `FK7353B009DB031F3D` (`id_sablona`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tip_tima`
--

DROP TABLE IF EXISTS `tip_tima`;
CREATE TABLE IF NOT EXISTS `tip_tima` (
  `id_tima` int(11) NOT NULL,
  `id_uloge` int(11) NOT NULL,
  `id_tipaelementa` int(11) NOT NULL,
  PRIMARY KEY (`id_tima`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `uloga`
--

DROP TABLE IF EXISTS `uloga`;
CREATE TABLE IF NOT EXISTS `uloga` (
  `id_uloge` int(11) NOT NULL,
  `naziv_uloge` varchar(20) NOT NULL,
  PRIMARY KEY (`id_uloge`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
