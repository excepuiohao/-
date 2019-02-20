package oa.bean;


import java.util.Date;

/**
 * 调整申请表
 */
public class Apply {
    private int a_id=-1;
    private int u_id=-1;
    private int a_type=-1;
    private String a_info;
    private int a_ex_userno=-1;
    private Date a_start_time;
    private Date a_end_time;
    private int a_day=-1;
    private int a_statu=-1;


    public Apply(int a_id, int u_id, int a_type, String a_info, int a_ex_userno, Date a_start_time, Date a_end_time, int a_day, int a_statu) {
        this.a_id = a_id;
        this.u_id = u_id;
        this.a_type = a_type;
        this.a_info = a_info;
        this.a_ex_userno = a_ex_userno;
        this.a_start_time = a_start_time;
        this.a_end_time = a_end_time;
        this.a_day = a_day;
        this.a_statu = a_statu;
    }
	
    public Apply(int u_id, int a_type, String a_info, int a_ex_userno, Date a_start_time, Date a_end_time, int a_day) {
        this.u_id = u_id;
        this.a_type = a_type;
        this.a_info = a_info;
        this.a_ex_userno = a_ex_userno;
        this.a_start_time = a_start_time;
        this.a_end_time = a_end_time;
        this.a_day = a_day;
    }

    public Apply() {
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getA_type() {
        return a_type;
    }

    public void setA_type(int a_type) {
        this.a_type = a_type;
    }

    public String getA_info() {
        return a_info;
    }

    public void setA_info(String a_info) {
        this.a_info = a_info;
    }

    public int getA_ex_userno() {
        return a_ex_userno;
    }

    public void setA_ex_userno(int a_ex_userno) {
        this.a_ex_userno = a_ex_userno;
    }

    public Date getA_start_time() {
        return a_start_time;
    }

    public void setA_start_time(Date a_start_time) {
        this.a_start_time = a_start_time;
    }

    public Date getA_end_time() {
        return a_end_time;
    }

    public void setA_end_time(Date a_end_time) {
        this.a_end_time = a_end_time;
    }

    public int getA_day() {
        return a_day;
    }

    public void setA_day(int a_day) {
        this.a_day = a_day;
    }

    public int getA_statu() {
        return a_statu;
    }

    public void setA_statu(int a_statu) {
        this.a_statu = a_statu;
    }


    @Override
    public String toString() {
        return "Apply{" +
                "a_id=" + a_id +
                ", u_id=" + u_id +
                ", a_type=" + a_type +
                ", a_info='" + a_info + '\'' +
                ", a_ex_userno=" + a_ex_userno +
                ", a_start_time=" + a_start_time +
                ", a_end_time=" + a_end_time +
                ", a_day=" + a_day +
                ", a_statu=" + a_statu +
                '}';
    }
}
