# BUCT-60th-Celebration
A WeChat applet  for Beijing University of Chemical Technology 60th celebration

buct_mini_program存放的为后端代码


###创建数据库及其表格的mysql指令：
```sql
CREATE DATABASE IF NOT EXISTS my_db default charset utf8 COLLATE utf8_general_ci; 
USE my_db;
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
("cyd", "陈禹东", 2014, "计算机系", "42班")
```