CREATE TABLE `class_num` (
	`school_cd` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`class_num` VARCHAR(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	PRIMARY KEY (`school_cd`,`class_num`)
);