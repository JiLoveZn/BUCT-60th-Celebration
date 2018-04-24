# BUCT-60th-Celebration
A WeChat applet  for Beijing University of Chemical Technology 60th celebration

buct_mini_program存放的为后端代码


###创建数据库及其表格的mysql指令：
```sql
CREATE DATABASE IF NOT EXISTS my_db default charset utf8 COLLATE utf8_general_ci; 
USE my_db;
/*--------Alum，校友类--------*/
CREATE TABLE `tb_alum`(
  `wx_id` varchar(200) NOT NULL,
  `alum_name` varchar(200) NOT NULL,
  `start_year` int(11) NOT NULL,
  `department` varchar(100) NOT NULL,
  `class_no` varchar(50) NOT NULL,
  `photo_url` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`wx_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;
INSERT INTO
tb_alum(wx_id, alum_name, start_year, 
        department, class_no)
VALUES
("cyd", "陈禹东", 2014, "计算机系", "42班");
/*--------Comment，祝福评论类--------*/
CREATE TABLE `tb_comment`(
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `wx_id` varchar(200) NOT NULL,
  `content` varchar(1000) NOT NULL, /*500字够不够？*/
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;
INSERT INTO
tb_comment(c_id, wx_id, content)
VALUES
(1, "cyd", "祝福母校60周年华诞！");
/*--------Announcement，公告类--------*/
CREATE TABLE `tb_annc`(
  `an_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(300) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `author` varchar(200) NOT NULL,
  `content` varchar(6000) NOT NULL, /*3000字够不够？*/
  PRIMARY KEY (`an_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;
INSERT INTO
tb_annc(title, author, content)
VALUES
("欢迎回家", "cyd", "欢迎各位校友回家！");
/*--------Information，资讯类--------*/
CREATE TABLE `tb_info`(
  `in_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(300) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `author` varchar(200) NOT NULL,
  `content` varchar(6000) NOT NULL, /*3000字够不够？*/
  PRIMARY KEY (`in_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;
INSERT INTO
tb_info(title, author, content)
VALUES
("资讯测试1", "cyd", "这是一条资讯。");
/*--------ReservationInformation，预约信息类--------*/
CREATE TABLE `tb_resv`(
  `re_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `back_time` datetime NOT NULL,
  `back_mode` varchar(200) NOT NULL,
  `group_size` int(11) NOT NULL,
  `need_classroom` tinyint(1) NOT NULL,
  `need_teacher` tinyint(1) NOT NULL,
  `teacher_name` varchar(200) DEFAULT NULL,
  `principal` varchar(200) NOT NULL,
  `principal_phone` varchar(15) NOT NULL, 
  PRIMARY KEY (`re_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;
INSERT INTO
tb_resv(name, back_time, back_mode, group_size, need_classroom,
       need_teacher, teacher_name, principal, principal_phone)
VALUES
("陈禹东", "2018-04-24 09:00:00", "校巴", 4, 0,
1, "李华", "陈禹东", "18601234567");
```
###创建完所有实体类
