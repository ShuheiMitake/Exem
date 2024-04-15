CREATE TABLE `test` (
	`student_no` VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`subject_cd` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`school_cd` CHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`no` INT(10) NOT NULL,
	`point` INT(10) DEFAULT NULL,
	`class_num` VARCHAR(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
	PRIMARY KEY (`student_no`,`subject_cd`,`school_cd`,`no`)
);