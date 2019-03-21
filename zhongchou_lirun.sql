--------------------------------------------------------
--  文件已创建 - 星期一-三月-18-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table USERINFFO
--------------------------------------------------------

  CREATE TABLE "ZHONGCHOU_LIRUN"."USERINFFO" 
   (	"USERID" NUMBER, 
	"ACCOUNT" VARCHAR2(255 BYTE), 
	"USERNAME" VARCHAR2(255 BYTE), 
	"EMAIL" VARCHAR2(255 BYTE), 
	"PASSWORD" VARCHAR2(255 BYTE), 
	"STATUS" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index USERINFFO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZHONGCHOU_LIRUN"."USERINFFO_PK" ON "ZHONGCHOU_LIRUN"."USERINFFO" ("USERID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table USERINFFO
--------------------------------------------------------

  ALTER TABLE "ZHONGCHOU_LIRUN"."USERINFFO" MODIFY ("USERID" NOT NULL ENABLE);
 
  ALTER TABLE "ZHONGCHOU_LIRUN"."USERINFFO" ADD CONSTRAINT "USERINFFO_PK" PRIMARY KEY ("USERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
  
  
  
INSERT INTO "ZHONGCHOU_LIRUN"."USERINFFO" (USERID, ACCOUNT, USERNAME, EMAIL, PASSWORD, STATUS) VALUES ('1', '李润', '李润', 'lirun@qq.com', '123', 'normal');
INSERT INTO "ZHONGCHOU_LIRUN"."USERINFFO" (USERID, ACCOUNT, USERNAME, EMAIL, PASSWORD, STATUS) VALUES ('2', '张珂', '张珂', 'zhangke@qq.com', '123', 'freeze ');


select * from MENU where menuid in(SELECT menuid FROM ROLE_MENU where roleid in(select ROLEID from  USERINFO_ROLEINFO where USERID=1));
