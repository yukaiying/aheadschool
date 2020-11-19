
CREATE TABLE `tab_class_course`  (
  `id` int(0) NOT NULL,
  `course_id` int(0) NULL DEFAULT NULL COMMENT '课程id',
  `class_id` int(0) NULL DEFAULT NULL COMMENT '班级id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `tab_course`  (
  `id` int(0) NOT NULL,
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称',
  `exam_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考试类型',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `create_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `tab_score`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `student_id` int(0) NULL DEFAULT NULL COMMENT '学生id',
  `course_id` int(0) NULL DEFAULT NULL COMMENT '课程id',
  `num` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考号',
  `status` int(0) NULL DEFAULT NULL COMMENT '状态',
  `peacetime_score` double(10, 4) NULL DEFAULT NULL COMMENT '平时成绩',
  `exam_score` double(10, 4) NULL DEFAULT NULL COMMENT '考试成绩',
  `final_score` double(10, 4) NULL DEFAULT NULL COMMENT '最终成绩',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `create_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1441 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

--CREATE TABLE `tab_student`  (
--  `id` int(0) NOT NULL AUTO_INCREMENT,
--  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
--  `num` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
--  `class_id` int(0) NULL DEFAULT NULL COMMENT '班级id',
--  `identity` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份号',
--  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
--  `create_time` datetime(0) NULL DEFAULT NULL,
--  `create_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
--  PRIMARY KEY (`id`) USING BTREE
--) ENGINE = InnoDB AUTO_INCREMENT = 1443 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `tab_grade`;
CREATE TABLE `tab_grade`  (
   `id` int(0) NOT NULL AUTO_INCREMENT,
   `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
   `specialty` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '专业',
   `create_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
   `create_time` date NULL DEFAULT NULL,
   PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;


DROP TABLE IF EXISTS `tab_classes`;
CREATE TABLE `tab_classes`  (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `classes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `grade_id` int(11) NOT NULL,
    `create_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `create_time` date NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
CREATE TABLE `tab_teacher`  (
  `teacher_id` int(255) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`teacher_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

----11/12--郭斌

DROP TABLE IF EXISTS `tab_class`;
CREATE TABLE `tab_class`
------------------

-------11.12 --truth----
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `id` int(4) NOT NULL COMMENT '序号',
  `name` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生名字',
  `sex` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性别',
  `num1` int(20) NULL DEFAULT NULL COMMENT '学号',
  `num2` int(20) NULL DEFAULT NULL COMMENT '考号',
  `identity` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '身份证',
  `class_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '班级',
  `course_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '课程',
  `creat_time` timestamp(6) NULL DEFAULT NULL COMMENT '创建时间',
  `creat_user` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建者',
  `update_time` timestamp(6) NULL DEFAULT NULL COMMENT '修改时间',
  `update_user` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '修改者',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
--------------------------

--------11.19----郭斌------

DROP TABLE IF EXISTS `tab_student_course`;
CREATE TABLE `tab_student_course`  (
  `id` int(11) NOT NULL,
  `student_id` int(11) NULL DEFAULT NULL COMMENT '学生 ID',
  `course_id` int(11) NULL DEFAULT NULL COMMENT '课程ID',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考试后的状态',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `create_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

------------------------------

