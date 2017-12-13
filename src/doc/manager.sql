/*
Navicat MySQL Data Transfer

Source Server         : demo
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : manager

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-12-12 22:02:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `UUID` varchar(36) NOT NULL COMMENT 'UUID',
  `CUS_NAME` varchar(255) DEFAULT NULL COMMENT '客户名',
  `CUS_BIRTHDAY` date DEFAULT NULL COMMENT '生日',
  `CUS_PHONE` varchar(255) DEFAULT NULL COMMENT '客户电话',
  `CUS_STATUS` varchar(8) DEFAULT NULL COMMENT '停用/启用/待审/',
  `CUS_ADDRESS` varchar(255) DEFAULT NULL COMMENT '客户地址',
  `USER_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `UUID` int(11) NOT NULL,
  `GROUP_NAME` varchar(255) DEFAULT NULL,
  `GROUP_CODE` varchar(255) DEFAULT NULL,
  `PARENT_GROUP_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for group_customer
-- ----------------------------
DROP TABLE IF EXISTS `group_customer`;
CREATE TABLE `group_customer` (
  `UUID` varchar(36) NOT NULL,
  `GROUP_ID` varchar(36) DEFAULT NULL,
  `CUSTOMER_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for plan
-- ----------------------------
DROP TABLE IF EXISTS `plan`;
CREATE TABLE `plan` (
  `UUID` varchar(36) NOT NULL,
  `TITLE` varchar(255) DEFAULT NULL,
  `CONTENT` longtext,
  `CREATE_TIME` datetime DEFAULT NULL,
  `USER_ID` varchar(36) DEFAULT NULL,
  `TYPE` varchar(255) DEFAULT NULL COMMENT '工作计划/工作日志',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_login_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_login_log`;
CREATE TABLE `sys_login_log` (
  `LOG_ID` varchar(36) NOT NULL COMMENT '日志ID',
  `SESSION_ID` varchar(64) DEFAULT NULL COMMENT '会话ID',
  `USER_ID` varchar(36) DEFAULT NULL COMMENT '用户ID',
  `USER_NAME` varchar(36) DEFAULT NULL COMMENT '用户名称',
  `IP` varchar(32) DEFAULT NULL COMMENT '登录IP地址',
  `LASTEST_LOGIN_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近登录时间',
  `LASTEST_LOGOUT_TIME` timestamp NULL DEFAULT NULL COMMENT '最近登出时间',
  `STATE` varchar(20) DEFAULT NULL COMMENT '状态(在线/离线)',
  `CREATE_TIME` timestamp NULL DEFAULT NULL COMMENT '记录创建时间',
  PRIMARY KEY (`LOG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登录日志';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UUID` varchar(36) NOT NULL COMMENT 'UUID',
  `USER_NAME` varchar(255) DEFAULT NULL COMMENT '用户名',
  `PASSWORD` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `USER_SINGAL` varchar(255) DEFAULT NULL COMMENT '个性签名',
  `USER_BIRTHDAY` date DEFAULT NULL COMMENT '生日',
  `USER_PHONE` varchar(255) DEFAULT NULL COMMENT '用户电话',
  `USER_STATUS` varchar(8) DEFAULT NULL COMMENT '离职/在职/',
  `USER_ADDRESS` varchar(255) DEFAULT NULL COMMENT '用户地址',
  `USER_RANK` varchar(255) DEFAULT NULL COMMENT '1-11级',
  `PARENT_USER_ID` varchar(36) DEFAULT NULL COMMENT '上级主管',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
