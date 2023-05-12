/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 10.4.24-MariaDB : Database - driving_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`driving_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `driving_db`;

/*Table structure for table `enrollment` */

DROP TABLE IF EXISTS `enrollment`;

CREATE TABLE `enrollment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `instructor` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `schedule_code` varchar(255) DEFAULT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `instructor_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;

/*Data for the table `enrollment` */

insert  into `enrollment`(`id`,`instructor`,`remarks`,`schedule_code`,`student_name`,`instructor_name`) values 
(20,NULL,'ok','SCHD-1101','John Ray Bernales Fornias','Jek'),
(21,NULL,'ok','SCHD-1102','John Ray Bernales Fornias','Jek'),
(22,NULL,'ok','SCHD-1102','John Ray Bernales Fornias','Jek');

/*Table structure for table `instructor` */

DROP TABLE IF EXISTS `instructor`;

CREATE TABLE `instructor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `driving_experience` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `instructor_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `account_status` varchar(255) DEFAULT NULL,
  `photo` varchar(64) DEFAULT NULL,
  `birth_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

/*Data for the table `instructor` */

insert  into `instructor`(`id`,`address`,`contact`,`created_at`,`driving_experience`,`email`,`gender`,`instructor_name`,`password`,`updated_at`,`username`,`account_status`,`photo`,`birth_date`) values 
(6,'Quezon City','12345',NULL,'1','ddarkzane@gmail.com','Male','Jek',NULL,'2022-12-26 11:44:44.000000',NULL,'Not Active','avatar.jpg','2022-12-06 00:00:00.000000'),
(7,'Bulacan','12345',NULL,'2','jfornias9@gmail.com','Female','JayR',NULL,'2022-12-26 11:45:01.000000',NULL,'Active','MIW.jpg','2022-12-25 00:00:00.000000');

/*Table structure for table `payment` */

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `amount` float NOT NULL,
  `date_of_payment` datetime(6) DEFAULT NULL,
  `reference_number` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `payment` */

insert  into `payment`(`id`,`amount`,`date_of_payment`,`reference_number`,`remarks`,`student_name`) values 
(2,700,'2022-12-28 00:00:00.000000','P01102','Not Fully paid','Jaya Blanco Bote'),
(3,100,'2023-01-10 00:00:00.000000','P01101','ok','Jaya Blanco Fornias');

/*Table structure for table `schedule` */

DROP TABLE IF EXISTS `schedule`;

CREATE TABLE `schedule` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `amount` float NOT NULL,
  `instructor_name` varchar(255) DEFAULT NULL,
  `number_of_slots` int(11) NOT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `schedule_code` varchar(255) DEFAULT NULL,
  `schedule_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `schedule` */

insert  into `schedule`(`id`,`amount`,`instructor_name`,`number_of_slots`,`remarks`,`schedule_code`,`schedule_date`) values 
(3,2000,'Jek',4,'paid','SCHD-1102','2022-12-28 00:00:00.000000'),
(4,3000,'JayR',3,'paid','SCHD-1101','2022-12-29 00:00:00.000000');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `birth_date` datetime(6) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `middle_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

/*Data for the table `student` */

insert  into `student`(`id`,`address`,`birth_date`,`contact`,`email`,`first_name`,`gender`,`last_name`,`middle_name`,`password`,`username`) values 
(7,'Bulacan','2022-12-28 00:00:00.000000','12345456','jfornias9@gmail.com','Jaya','Male','Bote','Blanco','jaya123','jaya'),
(8,'Manila','2022-12-27 00:00:00.000000','12345','jfornias9@gmail.com','Jaya','Male','Bote','Blanco','admin','admins'),
(9,'Manila','2022-12-28 00:00:00.000000','12345','jfornias9@gmail.com','John Ray','Male','Fornias','Bernales','admin','johnray100'),
(10,'Manila','2022-12-28 00:00:00.000000','12345','ddarkzane@yahoo.com','Jaya','Female','Fornias','Blanco','admin','admin');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `users` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
