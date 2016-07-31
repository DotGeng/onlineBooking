/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : onlinebooking

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2016-07-30 23:37:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for classroom
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom` (
  `classroomID` int(11) NOT NULL AUTO_INCREMENT,
  `classroomName` varchar(50) NOT NULL,
  `maxSize` int(11) NOT NULL,
  PRIMARY KEY (`classroomID`),
  UNIQUE KEY `classroomName` (`classroomName`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for classroombooking
-- ----------------------------
DROP TABLE IF EXISTS `classroombooking`;
CREATE TABLE `classroombooking` (
  `classroomBookingID` int(11) NOT NULL AUTO_INCREMENT,
  `roomID` int(11) NOT NULL,
  `batch` int(11) NOT NULL,
  `week` int(11) NOT NULL,
  `periodID` int(11) NOT NULL,
  `state` int(4) NOT NULL DEFAULT '0',
  `teacherID` int(11) DEFAULT '-1',
  PRIMARY KEY (`classroomBookingID`,`roomID`,`batch`,`week`,`periodID`),
  KEY `romID` (`roomID`),
  KEY `periodID` (`periodID`),
  CONSTRAINT `periodID` FOREIGN KEY (`periodID`) REFERENCES `period` (`periodID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `romID` FOREIGN KEY (`roomID`) REFERENCES `classroom` (`classroomID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for databackup
-- ----------------------------
DROP TABLE IF EXISTS `databackup`;
CREATE TABLE `databackup` (
  `studentNO` varchar(255) NOT NULL,
  `studentName` varchar(255) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `colledge` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `studentClass` varchar(255) DEFAULT NULL,
  `year` varchar(255) NOT NULL,
  `upOrDownYear` int(11) NOT NULL,
  `week` int(11) NOT NULL,
  `day` varchar(255) NOT NULL,
  `period` varchar(255) NOT NULL,
  `examinationRoom` varchar(255) DEFAULT NULL,
  `examTimes` int(11) DEFAULT NULL,
  PRIMARY KEY (`studentNO`,`year`,`upOrDownYear`,`week`,`day`,`period`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for period
-- ----------------------------
DROP TABLE IF EXISTS `period`;
CREATE TABLE `period` (
  `periodID` int(11) NOT NULL AUTO_INCREMENT,
  `periodNum` int(11) NOT NULL DEFAULT '0',
  `periodname` varchar(50) NOT NULL,
  `periodContext` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`periodID`,`periodNum`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for proctor
-- ----------------------------
DROP TABLE IF EXISTS `proctor`;
CREATE TABLE `proctor` (
  `examID` int(11) NOT NULL AUTO_INCREMENT,
  `teacherID` int(11) NOT NULL,
  `examRoomID` int(11) NOT NULL,
  `batch` int(11) NOT NULL,
  `week` int(11) NOT NULL,
  `periodID` int(11) NOT NULL,
  `year` varchar(255) DEFAULT NULL,
  `upOrDownYear` varchar(255) DEFAULT NULL,
  `ifFinished` int(255) DEFAULT '0',
  PRIMARY KEY (`examID`),
  KEY `teacherID` (`teacherID`),
  KEY `period` (`periodID`),
  KEY `examroomID` (`examRoomID`),
  CONSTRAINT `examroomID` FOREIGN KEY (`examRoomID`) REFERENCES `classroom` (`classroomID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `period` FOREIGN KEY (`periodID`) REFERENCES `period` (`periodID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `teacherID` FOREIGN KEY (`teacherID`) REFERENCES `teacher` (`teacherID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `studentNO` varchar(255) NOT NULL,
  `studentName` varchar(255) DEFAULT NULL,
  `score` int(11) DEFAULT '0',
  `colledge` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `studClass` varchar(255) DEFAULT NULL,
  `year` varchar(255) NOT NULL DEFAULT '2016',
  `upOrDownYear` int(11) DEFAULT NULL,
  `week` int(11) DEFAULT '1',
  `day` varchar(255) DEFAULT '星期一',
  `period` varchar(255) DEFAULT '1',
  `examinationRoom` varchar(255) DEFAULT NULL,
  `examtimes` int(4) DEFAULT '0',
  PRIMARY KEY (`studentNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for seat
-- ----------------------------
DROP TABLE IF EXISTS `seat`;
CREATE TABLE `seat` (
  `seatID` int(11) NOT NULL AUTO_INCREMENT,
  `seatNO` int(11) DEFAULT NULL,
  `seatName` varchar(50) NOT NULL,
  `roomID` int(11) NOT NULL,
  PRIMARY KEY (`seatID`),
  KEY `roomID` (`roomID`),
  CONSTRAINT `roomID` FOREIGN KEY (`roomID`) REFERENCES `classroom` (`classroomID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `studentID` int(11) NOT NULL AUTO_INCREMENT,
  `studentNO` varchar(50) NOT NULL,
  `studClass` varchar(50) DEFAULT NULL,
  `studentName` varchar(50) NOT NULL,
  `studentPw` varchar(50) NOT NULL,
  `major` varchar(50) DEFAULT NULL,
  `colledge` varchar(50) DEFAULT NULL,
  `passed` int(4) DEFAULT NULL,
  `score` int(4) DEFAULT '0',
  `examtimes` int(4) NOT NULL DEFAULT '0',
  `isCheated` int(4) DEFAULT '0',
  PRIMARY KEY (`studentID`,`studentNO`),
  KEY `studentID` (`studentID`),
  KEY `studentNO` (`studentNO`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for studentbooking
-- ----------------------------
DROP TABLE IF EXISTS `studentbooking`;
CREATE TABLE `studentbooking` (
  `studentBookingID` int(11) NOT NULL AUTO_INCREMENT,
  `studentNo` varchar(50) NOT NULL,
  `batch` int(4) DEFAULT '1',
  `classroomID` int(11) NOT NULL,
  `seatID` int(11) DEFAULT '0',
  `bookingTime` datetime DEFAULT NULL,
  `examID` int(11) DEFAULT NULL,
  `examTime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`studentBookingID`),
  KEY `studentNo` (`studentNo`),
  KEY `classroomID` (`classroomID`),
  KEY `seatID` (`seatID`),
  KEY `examID` (`examID`),
  CONSTRAINT `classroomID` FOREIGN KEY (`classroomID`) REFERENCES `classroom` (`classroomID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `examID` FOREIGN KEY (`examID`) REFERENCES `proctor` (`examID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `studentNo` FOREIGN KEY (`studentNo`) REFERENCES `student` (`studentNO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for systemdata
-- ----------------------------
DROP TABLE IF EXISTS `systemdata`;
CREATE TABLE `systemdata` (
  `systemDataID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `systemDataName` varchar(50) NOT NULL,
  `systemDataContent` varchar(225) DEFAULT NULL,
  `dateTime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`systemDataID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacherID` int(11) NOT NULL AUTO_INCREMENT,
  `teacherName` varchar(50) NOT NULL,
  `teacherPw` varchar(255) NOT NULL,
  `teacherRole` int(4) NOT NULL,
  PRIMARY KEY (`teacherID`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
DROP TRIGGER IF EXISTS `tri_proctor_insert`;
DELIMITER ;;
CREATE TRIGGER `tri_proctor_insert` AFTER INSERT ON `proctor` FOR EACH ROW BEGIN
INSERT INTO classroombooking(roomID,batch,week,periodID,state,teacherID) 
VALUES(NEW.examRoomID,NEW.batch,NEW.week,NEW.periodID,1,NEW.teacherID);
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_proctor_update`;
DELIMITER ;;
CREATE TRIGGER `tri_proctor_update` AFTER UPDATE ON `proctor` FOR EACH ROW BEGIN
UPDATE classroombooking 
	SET 
	classroombooking.teacherID=NEW.teacherID
	WHERE roomID=NEW.examRoomID
	AND
	classroombooking.batch=NEW.batch
	AND
	classroombooking.`week`=NEW.week
	AND
	classroombooking.periodID=NEW.periodID;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_proctor_delete`;
DELIMITER ;;
CREATE TRIGGER `tri_proctor_delete` AFTER DELETE ON `proctor` FOR EACH ROW BEGIN
DELETE FROM classroombooking WHERE roomID = OLD.examRoomId and week = OLD.week and batch=OLD.batch and periodID=OLD.periodID;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_after_insert_to_databackup`;
DELIMITER ;;
CREATE TRIGGER `tri_after_insert_to_databackup` AFTER INSERT ON `score` FOR EACH ROW BEGIN
set @upOrDownYear  = 0;
set @tmp =  (select MONTH(now()));
if @tmp < 8 then
set @upOrDownYear = 0;
else 
set @upOrDownYear = 1;
end if;
set @count  = (select count(studentNO) from databackup where studentNO=NEW.studentNO and studentName=NEW.studentName) ;
if @count = 0 then
insert into databackup(studentNO,studentName,colledge,major,studentClass,score,examtimes,year,upOrDownYear,week,day,period) 
values(NEW.studentNO,NEW.studentName,NEW.colledge,NEW.major,NEW.studClass,NEW.score,NEW.examtimes,YEAR(NOW()),@upOrDownYear,new.week,new.day,new.period);
else 
delete from databackup where studentNO=new.studentNO and studentName=new.studentName;
insert into databackup(studentNO,studentName,colledge,major,studentClass,score,examtimes,year,upOrDownYear,week,day,period) 
values(NEW.studentNO,NEW.studentName,NEW.colledge,NEW.major,NEW.studClass,NEW.score,NEW.examtimes,YEAR(NOW()),@upOrDownYear,new.week,new.day,new.period);
end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_after_updata_updata_databackup`;
DELIMITER ;;
CREATE TRIGGER `tri_after_updata_updata_databackup` AFTER UPDATE ON `score` FOR EACH ROW BEGIN
UPDATE databackup SET databackup.score=NEW.score,
databackup.examTimes=NEW.examTimes,
databackup.week=new.week,
databackup.day=new.day,
databackup.period=new.period
WHERE databackup.studentNo=new.studentNo;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_student`;
DELIMITER ;;
CREATE TRIGGER `tri_student` AFTER INSERT ON `student` FOR EACH ROW BEGIN
insert into score(studentNO,studentName,colledge,major,studClass,score,examtimes) 
values(NEW.studentNO,NEW.studentName,NEW.colledge,NEW.major,NEW.studClass,NEW.score,NEW.examtimes);
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_student_update`;
DELIMITER ;;
CREATE TRIGGER `tri_student_update` AFTER UPDATE ON `student` FOR EACH ROW BEGIN
UPDATE score SET score.score=NEW.score,
score.examTimes=NEW.examTimes,
score.studentName=new.studentName,
score.colledge= new.colledge,
score.major=new.major,
score.studClass=new.studClass
WHERE score.studentNo=new.studentNo;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_student_del`;
DELIMITER ;;
CREATE TRIGGER `tri_student_del` AFTER DELETE ON `student` FOR EACH ROW BEGIN
DELETE FROM score 
WHERE onlinebooking.score.studentNO=OLD.studentNO;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_after_insert_update_score`;
DELIMITER ;;
CREATE TRIGGER `tri_after_insert_update_score` AFTER INSERT ON `studentbooking` FOR EACH ROW BEGIN 
set @batch = (select batch from proctor where examID = new.examID);
set @week = (select week from proctor where examID = new.examID);
set @period = (select periodID from proctor where examID = new.examID);
update score set week=@batch, day=@week,period=@period where studentNO = new.studentNO;
END
;;
DELIMITER ;
