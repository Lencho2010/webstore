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

 Date: 07/09/2021 11:36:58
*/


-- ----------------------------
-- Table structure for tb_ziptaskinfo
-- ----------------------------
DROP TABLE IF EXISTS "public"."tb_ziptaskinfo";
CREATE TABLE "public"."tb_ziptaskinfo" (
  "f_id" int4 NOT NULL,
  "f_code" varchar(255) COLLATE "pg_catalog"."default",
  "f_name" varchar(255) COLLATE "pg_catalog"."default",
  "f_status" numeric(255),
  "f_progress" numeric(255),
  "f_starttime" date,
  "f_endtime" date
)
;
COMMENT ON COLUMN "public"."tb_ziptaskinfo"."f_code" IS '关联任务主键';
COMMENT ON COLUMN "public"."tb_ziptaskinfo"."f_name" IS '步骤名称';

-- ----------------------------
-- Primary Key structure for table tb_ziptaskinfo
-- ----------------------------
ALTER TABLE "public"."tb_ziptaskinfo" ADD CONSTRAINT "tb_ziptaskinfo_pkey" PRIMARY KEY ("f_id");
