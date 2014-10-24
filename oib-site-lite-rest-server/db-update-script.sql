ALTER TABLE `profilesdbprod`.`resource_profiles` 
ADD COLUMN `ggg` VARCHAR(255) NULL AFTER `image_url`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `profilesdbprod`.`resource_profiles_utf8` AS select `profilesdbprod`.`resource_profiles`.`id` AS `id`,`profilesdbprod`.`resource_profiles`.`name` AS `name`,`profilesdbprod`.`resource_profiles`.`version` AS `version`,`profilesdbprod`.`resource_profiles`.`published` AS `published`,`profilesdbprod`.`resource_profiles`.`image_url` AS `image_url`,`profilesdbprod`.`resource_profiles`.`status` AS `status`,if((`profilesdbprod`.`resource_profiles`.`status` = 1),'Active',if((`profilesdbprod`.`resource_profiles`.`status` = 2),'Testing','Inactive')) AS `status_dsc`,convert(`profilesdbprod`.`resource_profiles`.`content` using utf8) AS `content_utf8` from `profilesdbprod`.`resource_profiles`;
