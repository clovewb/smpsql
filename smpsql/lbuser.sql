/*
 Navicat Premium Data Transfer

 Source Server         : PSQL_LocalHost
 Source Server Type    : PostgreSQL
 Source Server Version : 90619
 Source Host           : localhost:5432
 Source Catalog        : lb
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 90619
 File Encoding         : 65001

 Date: 18/08/2020 00:47:33
*/


-- ----------------------------
-- Table structure for lbuser
-- ----------------------------
DROP TABLE IF EXISTS "public"."lbuser";
CREATE TABLE "public"."lbuser" (
  "id" int4 NOT NULL DEFAULT nextval('lbuser_id_seq'::regclass),
  "username" varchar(20) COLLATE "pg_catalog"."default",
  "password" varchar(20) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of lbuser
-- ----------------------------
INSERT INTO "public"."lbuser" VALUES (1, '张三', '123456');
INSERT INTO "public"."lbuser" VALUES (2, '李四', '123456');

-- ----------------------------
-- Primary Key structure for table lbuser
-- ----------------------------
ALTER TABLE "public"."lbuser" ADD CONSTRAINT "lbuser_pkey" PRIMARY KEY ("id");
