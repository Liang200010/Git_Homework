/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : mybatis_study

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 26/11/2020 11:44:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_info2
-- ----------------------------
DROP TABLE IF EXISTS `user_info2`;
CREATE TABLE `user_info2`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `tel` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info2
-- ----------------------------
INSERT INTO `user_info2` VALUES (1, 'user1', 10, '10000000000');
INSERT INTO `user_info2` VALUES (2, 'user2', 20, '18976543210');
INSERT INTO `user_info2` VALUES (3, 'user3', 19, '13332554678');
INSERT INTO `user_info2` VALUES (5, 'user5', 23, '13562156987');
INSERT INTO `user_info2` VALUES (8, 'user8', 25, '18899668578');
INSERT INTO `user_info2` VALUES (9, 'user10', 21, '13809034678');
INSERT INTO `user_info2` VALUES (10, 'stu11', 23, '18666883663');
INSERT INTO `user_info2` VALUES (11, 'user12', 21, '12345678901');
INSERT INTO `user_info2` VALUES (12, 'user13', 21, '12345678901');

SET FOREIGN_KEY_CHECKS = 1;
