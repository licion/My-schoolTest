/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.14-log : Database - test01
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test01` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `test01`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id,key',
  `name` varchar(120) COLLATE utf8_unicode_520_ci DEFAULT NULL COMMENT '学生姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(255) COLLATE utf8_unicode_520_ci DEFAULT NULL COMMENT '性别',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `remark` varchar(33) COLLATE utf8_unicode_520_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci ROW_FORMAT=COMPACT;

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`age`,`sex`,`birthday`,`remark`) values (1,'马蓉',20,'女','2023-02-05','靓妹'),(2,'强宝',22,'男','2023-02-04','帅哥一枚'),(3,'jack ma',55,'女','1968-02-02','最不爱钱'),(4,'东哥',33,'男','1977-02-02','不知妻美'),(5,'milky tea',22,'女','2021-01-01','东哥\'s wife'),(6,'Miss Cang',33,'女','1990-01-01','I\'m virgo'),(7,'百合',23,'女','1988-04-04','My husband is Chenyufan');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
