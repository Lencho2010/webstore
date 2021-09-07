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

 Date: 07/09/2021 11:37:49
*/


-- ----------------------------
-- Table structure for tbsys_syspara
-- ----------------------------
DROP TABLE IF EXISTS "public"."tbsys_syspara";
CREATE TABLE "public"."tbsys_syspara" (
  "f_id" numeric NOT NULL,
  "f_name" text COLLATE "pg_catalog"."default",
  "f_key" text COLLATE "pg_catalog"."default",
  "f_value1" text COLLATE "pg_catalog"."default",
  "f_value2" bytea,
  "f_desc" text COLLATE "pg_catalog"."default",
  "f_group" text COLLATE "pg_catalog"."default",
  "f_userid" numeric,
  "f_type" numeric(255)
)
;

-- ----------------------------
-- Primary Key structure for table tbsys_syspara
-- ----------------------------
ALTER TABLE "public"."tbsys_syspara" ADD CONSTRAINT "tbsys_syspara_pkey" PRIMARY KEY ("f_id");
