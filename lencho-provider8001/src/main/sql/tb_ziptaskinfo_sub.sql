/*
 Navicat Premium Data Transfer

 Source Server         : postgresql@docker
 Source Server Type    : PostgreSQL
 Source Server Version : 120001
 Source Host           : hadoop104:5432
 Source Catalog        : db2021
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 120001
 File Encoding         : 65001

 Date: 07/09/2021 11:37:09
*/


-- ----------------------------
-- Table structure for tb_ziptaskinfo_sub
-- ----------------------------
DROP TABLE IF EXISTS "public"."tb_ziptaskinfo_sub";
CREATE TABLE "public"."tb_ziptaskinfo_sub" (
  "f_id" int4 NOT NULL,
  "f_stepcode" varchar(255) COLLATE "pg_catalog"."default",
  "f_name" varchar(255) COLLATE "pg_catalog"."default",
  "f_status" numeric(255),
  "f_log" text COLLATE "pg_catalog"."default",
  "f_starttime" date,
  "f_endtime" date
)
;
COMMENT ON COLUMN "public"."tb_ziptaskinfo_sub"."f_stepcode" IS '步骤id';

-- ----------------------------
-- Primary Key structure for table tb_ziptaskinfo_sub
-- ----------------------------
ALTER TABLE "public"."tb_ziptaskinfo_sub" ADD CONSTRAINT "tb_zipfileinfo_sub_pkey" PRIMARY KEY ("f_id");
