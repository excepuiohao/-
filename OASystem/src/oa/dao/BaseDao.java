package oa.dao;

import cn.itcast.jdbc.TxQueryRunner;
import oa.Utils.out;
import oa.bean.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by WangNing
 * on 2017-10-09.
 */
public abstract class BaseDao<T> {


    private static QueryRunner qr = new TxQueryRunner();

    public static QueryRunner getQr() {
        return qr;
    }

    public List<T> query(T t){
            List<T> tlist = null;
            try {
                out.print(getQuerySql(t));
                tlist =  qr.query(getQuerySql(t),new BeanListHandler<T>((Class<T>) t.getClass()));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return tlist;
    }

    public  boolean insert(T t){
        return update(getInsertSql(t));
    }

    public boolean update(String sql){
        boolean flag = false;
        try {
            int index = getQr().update(sql);
            if(index >0){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    protected abstract boolean update(T t);

    public boolean updateAll(T t){
        return update(getUpdateSql(t));
    }

    public  boolean delete(T t){
        return update(getDeleteSql(t));
    }

    public String getUpdateSql(T t){
        String sql = "UPDATE  "+ getTable()+" SET ";
        Class<T> clazz = (Class<T>) t.getClass();
        Field[] fields  = clazz.getDeclaredFields();
        boolean flag = true;
        for (int i = 1; i <fields.length ; i++) {
            try {
                fields[i].setAccessible(true);
                String name = fields[i].getName();
                Object value =  fields[i].get(t);
                if(value != null&&!String.valueOf(value).equals("0.0")&&!String.valueOf(value).equals("-1.0")&&!String.valueOf(value).equals("-1")){
                   if(i != fields.length-1){
                       if(value instanceof Date){
                           sql += name+"="+"to_date('"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(value)+"','yyyy-MM-dd hh:mi:ss'),";
                       }else {
                           sql+= name+"='"+value+"',";
                       }
                   }else {
                       if(value instanceof Date){
                           sql += name+"="+"to_date('"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(value)+"','yyyy-MM-dd hh:mi:ss')";
                       }else {
                           sql+= name+"='"+value+"'";
                       }
                   }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(sql.lastIndexOf(",")==sql.length()-1){
            fields[0].setAccessible(true);
            sql = sql.substring(0,sql.length()-1);
        }
        try {
            fields[0].setAccessible(true);
            sql+=" WHERE "+fields[0].getName()+"='"+fields[0].get(t)+"'";
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return sql;
    }

    public String getDeleteSql(T t){
        String sql = "DELETE FROM "+ getTable();
        Class<T> clazz = (Class<T>) t.getClass();
        Field[] fields  = clazz.getDeclaredFields();
        boolean flag = true;
        for (int i = 0; i <fields.length ; i++) {
            try {
                fields[i].setAccessible(true);
                String name = fields[i].getName();
                Object value =  fields[i].get(t);
                if(value != null&&!String.valueOf(value).equals("0.0")&&!String.valueOf(value).equals("-1.0")&&!String.valueOf(value).equals("-1")){
                    String eq = "=";
                    if(String.valueOf(value).contains("%")){
                        eq = " LIKE ";
                    }
                    if(flag){
                        flag = false;
                        if(value instanceof Date){
                            sql = sql +" WHERE "+name+""+eq+""+"to_date('"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(value)+"','yyyy-MM-dd hh:mi:ss')";
                        }else {
                            sql = sql +" WHERE "+name+""+eq+"'"+value+"'";
                        }
                    }else {
                        if(value instanceof Date){
                            sql = sql +" AND "+name+""+eq+""+"to_date('"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(value)+"','yyyy-MM-dd hh:mi:ss')";
                        }else {
                            sql = sql +" AND "+name+""+eq+"'"+value+"'";
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sql;
    }

    public String getInsertSql(T t){
        String sql = "INSERT INTO "+getTable();
        String param = "";
        String values = "";
        Class<T> clazz = (Class<T>) t.getClass();
        Field[] fields  = clazz.getDeclaredFields();
        boolean flag = true;
        for (int i = 1; i <fields.length ; i++) {
            try {
                fields[i].setAccessible(true);
                String name = fields[i].getName();
                Object value =  fields[i].get(t);
                if(i != fields.length-1){
                    param+=name+",";
                    if(value==null){
                        values+="null,";
                    }else {
                        if(value instanceof Date){
                            values += "to_date('"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(value)+"','yyyy-MM-dd hh:mi:ss'),";
                        }else {
                            values+="'"+value+"',";
                        }

                    }

                }else {
                    param+=name+"";
                    if(value instanceof Date){
                        values += "to_date('"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(value)+"','yyyy-MM-dd hh:mi:ss')";
                    }else {
                        values+="'"+value+"'";
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sql += "("+param+") VALUES("+values+")";
        return sql;
    }

    public String getQuerySql(T t){
        String sql = "SELECT * FROM "+ getTable();
        Class<T> clazz = (Class<T>) t.getClass();
        Field[] fields  = clazz.getDeclaredFields();
        boolean flag = true;
        for (int i = 0; i <fields.length ; i++) {
            try {
                fields[i].setAccessible(true);
                String name = fields[i].getName();
                Object value =  fields[i].get(t);
                if(value != null&&value!="%null%"&&!String.valueOf(value).equals("0.0")&&!String.valueOf(value).equals("-1.0")&&!String.valueOf(value).equals("-1")){
                    String eq = "=";
                    if(String.valueOf(value).contains("%")){
                        eq = " LIKE ";
                    }
                    if(flag){
                        flag = false;
                        sql = sql +" WHERE "+name+""+eq+"'"+value+"'";
                    }else {
                        sql = sql + " AND "+name+""+eq+"'"+value+"'";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sql;
    }

    protected abstract String getTable();

}
