CREATE SCHEMA IF NOT EXISTS OPRISKLIB;
USE OPRISKLIB;
CREATE TABLE IF NOT EXISTS `OPRISKLIB`.`OPRISK_BOOK_BORROW_HIST` (
  `OPRISK_BOOK_BORROW_HIST_ID` INT NOT NULL AUTO_INCREMENT,
  `OPRISK_USER_INFO_ID` INT NULL,
  `OPRISK_BOOK_STORE_ID` INT NOT NULL,
  `WX_USER_ID` VARCHAR(45) NULL,
  `BORROW_DATE` DATETIME NULL,
  `RETURN_DATE` DATETIME NULL,
  `DESCRIPTION` VARCHAR(2000) NULL,
  `CREATED_BY` VARCHAR(45) NULL,
  `CREATED_DATE` TIMESTAMP NULL DEFAULT NOW(),
  PRIMARY KEY (`OPRISK_BOOK_BORROW_HIST_ID`));


CREATE TABLE IF NOT EXISTS `OPRISKLIB`.`OPRISK_BOOK_COMMENTS` (
  `OPRISK_BOOK_COMMENTS` int(11) NOT NULL AUTO_INCREMENT,
  `OPRISK_BOOK_STORE_ID` int(11) NOT NULL,
  `COMMENTS` varchar(2000) DEFAULT NULL,
  `COMMENTS_BY` varchar(45) DEFAULT NULL,
  `COMMENTS_DATE` date DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  `CREATED_DATE` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`OPRISK_BOOK_COMMENTS`)
) ;

CREATE TABLE IF NOT EXISTS `OPRISKLIB`.`OPRISK_BOOK_STORE` (
  `OPRISK_BOOK_STORE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(200) DEFAULT 'test file',
  `AUTHOR` varchar(100) DEFAULT NULL,
  `PUBLISH_DATE` varchar(12) DEFAULT NULL,
  `SUB_TITLE` varchar(200) DEFAULT NULL,
  `ORIGIN_TITLE` varchar(200) DEFAULT NULL,
  `IMAGE` varchar(100) DEFAULT NULL,
  `TRANSLATOR` varchar(100) DEFAULT NULL,
  `PAGES` int(11) DEFAULT NULL,
  `PRICE` varchar(10) DEFAULT NULL,
  `PUBLISHER` varchar(100) DEFAULT NULL,
  `ISBN_10` varchar(20) DEFAULT NULL,
  `ISBN_13` varchar(20) DEFAULT NULL,
  `AUTHOR_INTRO` varchar(4000) DEFAULT NULL,
  `SUMMARY` varchar(4000) DEFAULT NULL,
  `BOOK_OWNER` varchar(45) DEFAULT NULL,
  `IS_IN_LIBRARY` varchar(1) DEFAULT 'Y',
  `IS_ACTIVE` varchar(1) DEFAULT 'Y',
  `DESCRIPTION` varchar(2000) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  `CREATED_DATE` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`OPRISK_BOOK_STORE_ID`)
);

CREATE TABLE IF NOT EXISTS `OPRISKLIB`.`OPRISK_USER_INFO` (
  `OPRISK_USER_INFO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(45) DEFAULT NULL,
  `SOEID` varchar(10) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  `CREATED_DATE` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`OPRISK_USER_INFO_ID`)
);

CREATE TABLE IF NOT EXISTS `OPRISKLIB`.`OPRISK_WX_CONFIG` (
  `OPRISK_WX_CONFIG_ID` int(11) NOT NULL AUTO_INCREMENT,
  `TOKEN` varchar(100) DEFAULT NULL,
  `CORP_ID` varchar(45) DEFAULT NULL,
  `ENCODING_AES_KEY` varchar(100) DEFAULT NULL,
  `IS_ACTIVE` varchar(1) DEFAULT NULL,
  `DESCRIPTION` varchar(1000) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  `CREATED_DATE` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`OPRISK_WX_CONFIG_ID`)
);

CREATE TABLE IF NOT EXISTS `OPRISKLIB`.`OPRISK_WX_GROUP_SECRET` (
  `OPRISK_WX_GROUP_SECRET_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CORP_ID` varchar(45) DEFAULT NULL,
  `CORP_SECRET` varchar(100) DEFAULT NULL,
  `ACCESS_TOKEN_URL` varchar(100) DEFAULT NULL,
  `WX_GROUP` varchar(100) DEFAULT NULL,
  `DESCRIPTION` varchar(1000) DEFAULT NULL,
  `IS_ACTIVE` varchar(1) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  `CREATED_DATE` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`OPRISK_WX_GROUP_SECRET_ID`)
) ;


CREATE TABLE IF NOT EXISTS `OPRISKLIB`.`OPRISK_WX_MESSAGE` (
  `OPRISK_WX_MESSAGE_ID` INT NOT NULL AUTO_INCREMENT,
  `TO_USER_NAME` VARCHAR(50) NULL,
  `FROM_USER_NAME` VARCHAR(50) NULL,
  `CREATE_TIME` INT NULL,
  `MSG_TYPE` VARCHAR(50) NULL,
  `MSG_ID` INT NULL,
  `EVENT` VARCHAR(45) NULL,
  `EVENT_KEY` VARCHAR(45) NULL,
  `TICKET` VARCHAR(100) NULL,
  `LATITUDE` VARCHAR(10) NULL,
  `LONGITUDE` VARCHAR(10) NULL,
  `PRECISION` VARCHAR(45) NULL,
  `PIC_URL` VARCHAR(100) NULL,
  `TITLE` VARCHAR(100) NULL,
  `DESCRIPTION` VARCHAR(1000) NULL,
  `URL` VARCHAR(100) NULL,
  `LOCATION_X` VARCHAR(10) NULL,
  `LOCATION_Y` VARCHAR(10) NULL,
  `SCALE` VARCHAR(45) NULL,
  `LABEL` VARCHAR(45) NULL,
  `CONTENT` VARCHAR(4000) NULL,
  `FORMAT` VARCHAR(45) NULL,
  `SCAN_CODE_INFO` VARCHAR(45) NULL,
  `SCAN_RESULLT` VARCHAR(45) NULL,
  `AGENT_ID` INT NULL,
  `CREATED_DATE` TIMESTAMP NULL DEFAULT NOW(),
  PRIMARY KEY (`OPRISK_WX_MESSAGE_ID`));
  
  
  
  