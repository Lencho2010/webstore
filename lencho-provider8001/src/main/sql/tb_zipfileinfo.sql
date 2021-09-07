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

 Date: 07/09/2021 11:36:47
*/


-- ----------------------------
-- Table structure for tb_zipfileinfo
-- ----------------------------
DROP TABLE IF EXISTS "public"."tb_zipfileinfo";
CREATE TABLE "public"."tb_zipfileinfo" (
  "f_oid" int8 NOT NULL,
  "f_filename" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "f_filepath" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "f_ishandle" int8 NOT NULL,
  "f_note" text COLLATE "pg_catalog"."default",
  "f_json" text COLLATE "pg_catalog"."default",
  "f_starttime" timestamp(6),
  "f_endtime" timestamp(6),
  "f_progress" int4,
  "f_status" int2
)
;
COMMENT ON COLUMN "public"."tb_zipfileinfo"."f_progress" IS '进度展示';
COMMENT ON COLUMN "public"."tb_zipfileinfo"."f_status" IS '状态值';

-- ----------------------------
-- Uniques structure for table tb_zipfileinfo
-- ----------------------------
ALTER TABLE "public"."tb_zipfileinfo" ADD CONSTRAINT "TB_ZIPFILEINFO_KEY" UNIQUE ("f_oid");
