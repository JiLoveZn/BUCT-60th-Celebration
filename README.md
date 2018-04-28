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
/*--------Reservation，预约信息类--------*/
CREATE TABLE `tb_resv`(
  `re_id` int(11) NOT NULL AUTO_INCREMENT,
  `my_name` varchar(200) NOT NULL,
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
tb_resv(my_name, back_time, back_mode, group_size, need_classroom,
       need_teacher, teacher_name, principal, principal_phone)
VALUES
("陈禹东", "2018-04-24 09:00:00", "校巴", 4, 0,
1, "李华", "陈禹东", "18601234567");
```
###当前进度

- 4月23日：创建完所有实体类
- 4月24日：并完成Spring后端相应“增删改查”Dao-Service-Web层开发


###Url接口与Json格式

```json
PREFIX = 域名+":"+端口+"/demo/superadmin/"

/*================= Alum校友信息类 ==================*/
/*注册个人信息（上传）*/
url: PREFIX + "addalum"
method: 'POST'
data: {
    "wxId": 微信Id(String),
    "alumName": 校友姓名(String),
    "startYear": 入学年份(Integer),
    "department": 院系(String),
    "classNo": 班级(String),
}
关于照片：上传照片文件（1~2张），存入后台固定路径下，后台负责将此路径存入photoUrl中，用';'分隔两个图片的url。

/*修改个人信息（下载，获取原有信息）*/
url: PREFIX + "getalumbywxid"
method: 'GET'
data: {
    "wxId": 微信Id(String),
}
success: function(res) {
    res.data.alum: {
        "wxId": 微信Id(String),
        "alumName": 校友姓名(String),
        "startYear": 入学年份(Integer),
        "department": 院系(String),
        "classNo": 班级(String),
        "photoUrl": 照片的url路径(String，两个url用';'分隔)
    }
}
【TODO：修改信息界面的原有照片应该如何显示？】

/*修改个人信息（上传）*/
url: PREFIX + "modifyalum"
method: 'POST'
data: {
    "wxId": 微信Id(String),
    "alumName": 校友姓名(String),
    "startYear": 入学年份(Integer),
    "department": 院系(String),
    "classNo": 班级(String),
}
关于照片：后台需要更新photoUrl。

```

