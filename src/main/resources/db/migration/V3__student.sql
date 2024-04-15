CREATE TABLE `student` (
	`no` VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`name` VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
	`ent_year` INT(10) DEFAULT NULL,
	`class_num` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
	`is_attend` BOOLEAN DEFAULT NULL,
	`school_cd` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
	PRIMARY KEY (`no`)
);