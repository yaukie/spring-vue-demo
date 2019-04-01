CREATE DATABASE TEST ;

CREATE TABLE `user` (
  `user_id` varchar(50) DEFAULT NULL,
  `user_name` varchar(200) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF-8;

INSERT INTO test.`user`
(user_id, user_name, password, created_time, update_time)
VALUES('zhangsan', 'zhangsan', '123', NULL, NULL);
