
--1员工表
CREATE TABLE oa_user (
  u_id NUMBER(8),
  lead_no VARCHAR2(20),
  u_no VARCHAR2(20),
  u_name VARCHAR2(20),
  u_pwd VARCHAR2(20),
  u_email VARCHAR2(20),
  u_phone VARCHAR2(20),
  u_type NUMBER(1),
  notion_read VARCHAR2(20),
  PRIMARY KEY(u_id)
);

--创建自增ID，名称为：表名_字段名_SEQ
CREATE SEQUENCE oa_user_u_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1 NOCACHE;

-- 为Insert操作创建触发器，无需在SQL语句里写NEXTVAL，名称为表名_INS_TRG
CREATE OR REPLACE TRIGGER oa_user_INS_TRG BEFORE INSERT ON oa_user FOR EACH ROW WHEN(NEW.u_id IS NULL)
  BEGIN
    SELECT oa_user_u_id_SEQ.NEXTVAL INTO :NEW.u_id FROM DUAL;
  END;


--2临时表--申请修改个人信息
CREATE TABLE oa_update_info(
  ui_id NUMBER(8),
  ui_no VARCHAR2(20),
  ui_name VARCHAR2(20),
  ui_pwd VARCHAR2(20),
  ui_phone VARCHAR2(20),
  ui_email VARCHAR2(20),
  ui_statu NUMBER(1),
  ui_ex_userno VARCHAR2(8),
  PRIMARY KEY (ui_id)
);
--创建自增id
CREATE SEQUENCE oa_update_info_ui_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1
NOCACHE;
--为Insert操作创建触发器，无需在sql语句里写nextval
CREATE  OR REPLACE TRIGGER oa_update_info_INS_TRG BEFORE INSERT ON  oa_update_info FOR EACH ROW
WHEN (NEW.ui_id IS NULL)
  BEGIN
    SELECT oa_update_info_ui_id_SEQ.NEXTVAL INTO :NEW.ui_id FROM DUAL;
  END;


--３．签到表：OA_sign
CREATE TABLE OA_sign(
  s_id NUMBER(8),
  u_id NUMBER(8)  REFERENCES oa_user(u_id),
  s_type NUMBER(1),
  s_time DATE ,
  PRIMARY KEY (s_id)
);
--创建自增id
CREATE SEQUENCE OA_sign_s_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1
NOCACHE;
--为Insert操作创建触发器，无需在sql语句里写nextval
CREATE  OR REPLACE TRIGGER OA_sign_INS_TRG BEFORE INSERT ON  OA_sign FOR EACH ROW
WHEN (NEW.s_id IS NULL)
  BEGIN
    SELECT OA_sign_s_id_SEQ.NEXTVAL INTO :NEW.s_id FROM DUAL;
  END;

--4公告表
create table OA_notice (
  N_id      NUMBER(8) PRIMARY KEY,
  U_id      NUMBER(8) REFERENCES OA_user (u_id),
  N_title   VARCHAR2(100),
  N_content VARCHAR2(2000),
  N_time    DATE
);
--创建自增ID，名称为：表名_字段名_SEQ
CREATE SEQUENCE OA_notice_N_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1 NOCACHE;

-- 为Insert操作创建触发器，无需在SQL语句里写NEXTVAL，名称为表名_INS_TRG
CREATE OR REPLACE TRIGGER OA_notice_INS_TRG BEFORE INSERT ON OA_notice FOR EACH ROW WHEN(NEW.N_id IS NULL)
  BEGIN
    SELECT OA_notice_N_id_SEQ.NEXTVAL INTO :NEW.N_id FROM DUAL;
  END;


  --5工作时间表
create table OA_work_time (
  wt_id       NUMBER(8) PRIMARY KEY,
  U_id        NUMBER(8) REFERENCES OA_user (u_id),
  wt_normal   NUMBER(3),
  wt_m_h      NUMBER(3),
  wt_y_h      NUMBER(3),
  wt_i_h      NUMBER(3),
  wt_overtime NUMBER(3)
);
--创建自增ID，名称为：表名_字段名_SEQ
CREATE SEQUENCE OA_work_time_wt_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1 NOCACHE;

-- 为Insert操作创建触发器，无需在SQL语句里写NEXTVAL，名称为表名_INS_TRG
CREATE OR REPLACE TRIGGER OA_work_time_INS_TRG BEFORE INSERT ON OA_work_time FOR EACH ROW WHEN(NEW.wt_id IS NULL)
  BEGIN
    SELECT OA_work_time_wt_id_SEQ.NEXTVAL INTO :NEW.wt_id FROM DUAL;
  END;



--6调整申请表
  CREATE TABLE oa_apply(
    a_id NUMBER(8) PRIMARY KEY ,
    u_id NUMBER(8) REFERENCES oa_user(u_id),
    a_type NUMBER(1),
    a_info VARCHAR2(1000),
    a_ex_userno NUMBER(8),
    a_start_time DATE,
    a_end_time DATE,
    a_day NUMBER(3),
    a_statu NUMBER(1)
  );
--创建自增ID，名称为：表名_字段名_SEQ
CREATE SEQUENCE oa_apply_a_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1 NOCACHE;

-- 为Insert操作创建触发器，无需在SQL语句里写NEXTVAL，名称为表名_INS_TRG
CREATE OR REPLACE TRIGGER oa_apply_INS_TRG BEFORE INSERT ON oa_apply FOR EACH ROW WHEN(NEW.a_id IS NULL)
  BEGIN
    SELECT oa_apply_a_id_SEQ.NEXTVAL INTO :NEW.a_id FROM DUAL;
  END;


--7辞职申请
CREATE TABLE oa_resign (
  r_id NUMBER(8) PRIMARY KEY,
  u_id NUMBER(8)  REFERENCES OA_USER(U_id),
  r_info VARCHAR2(20),
  r_ex_userno VARCHAR2(8),
  r_statu NUMBER(1)
);


--创建自增ID，名称为：表名_字段名_SEQ
CREATE SEQUENCE oa_resign_r_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1 NOCACHE;

-- 为Insert操作创建触发器，无需在SQL语句里写NEXTVAL，名称为表名_INS_TRG
CREATE OR REPLACE TRIGGER oa_resign_INS_TRG BEFORE INSERT ON oa_resign FOR EACH ROW WHEN(NEW.r_id IS NULL)
  BEGIN
    SELECT oa_resign_r_id_SEQ.NEXTVAL INTO :NEW.r_id FROM DUAL;
  END;




--8项目表
  CREATE TABLE oa_project(
    p_id NUMBER(8) PRIMARY KEY ,
    p_managerno VARCHAR2(20) ,
    p_teamno VARCHAR2(200),
    p_rate NUMBER(3),
    p_title VARCHAR2(300),
    p_info VARCHAR2(2000),
    p_statu NUMBER(1)
  );
--创建自增ID，名称为：表名_字段名_SEQ
CREATE SEQUENCE oa_project_p_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1 NOCACHE;

-- 为Insert操作创建触发器，无需在SQL语句里写NEXTVAL，名称为表名_INS_TRG
CREATE OR REPLACE TRIGGER oa_project_INS_TRG BEFORE INSERT ON oa_project FOR EACH ROW WHEN(NEW.p_id IS NULL)
  BEGIN
    SELECT oa_project_p_id_SEQ.NEXTVAL INTO :NEW.p_id FROM DUAL;
  END;


--9项目表
CREATE TABLE oa_rate(
  r_id NUMBER(8) PRIMARY KEY,
  p_id NUMBER(8) REFERENCES oa_project(p_id),
  u_id NUMBER(8) REFERENCES OA_USER(u_id),
  r_rate NUMBER(3),
  r_date DATE
);

--创建自增ID，名称为：表名_字段名_SEQ
CREATE SEQUENCE oa_rate_r_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1 NOCACHE;

-- 为Insert操作创建触发器，无需在SQL语句里写NEXTVAL，名称为表名_INS_TRG
CREATE OR REPLACE TRIGGER oa_rate_INS_TRG BEFORE INSERT ON oa_rate FOR EACH ROW WHEN(NEW.r_id IS NULL)
  BEGIN
    SELECT oa_project_p_id_SEQ.NEXTVAL INTO :NEW.r_id FROM DUAL;
  END;

--１０．工作日志表oa_work_log
CREATE TABLE oa_work_log(
  WI_id NUMBER(8),
  WI_info BLOB,
  PRIMARY KEY (WI_id)
);
--创建自增id
CREATE SEQUENCE oa_work_log_WI_id_SEQ MINVALUE 1 NOMAXVALUE INCREMENT BY 1 START WITH 1
NOCACHE;
--为Insert操作创建触发器，无需在sql语句里写nextval
CREATE  OR REPLACE TRIGGER oa_work_log_INS_TRG BEFORE INSERT ON  oa_work_log FOR EACH ROW
WHEN (NEW.WI_id IS NULL)
  BEGIN
    SELECT oa_work_log_WI_id_SEQ.NEXTVAL INTO :NEW.WI_id FROM DUAL;
  END;