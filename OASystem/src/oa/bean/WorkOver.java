package oa.bean;

import java.util.Date;

//加班实体
public class WorkOver {
    private int wa_id=-1;
    private int u_id=-1;
    private Date wa_start_time;
    private Date wa_end_time;
    private int wa_day=-1;
    private String wa_info;
    private int wa_ex_userno=-1;
    private int wa_statu=-1;

    public int getWa_id() {
        return wa_id;
    }

    public void setWa_id(int wa_id) {
        this.wa_id = wa_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public Date getWa_start_time() {
        return wa_start_time;
    }

    public void setWa_start_time(Date wa_start_time) {
        this.wa_start_time = wa_start_time;
    }

    public Date getWa_end_time() {
        return wa_end_time;
    }

    public void setWa_end_time(Date wa_end_time) {
        this.wa_end_time = wa_end_time;
    }

    public int getWa_day() {
        return wa_day;
    }

    public void setWa_day(int wa_day) {
        this.wa_day = wa_day;
    }

    public String getWa_info() {
        return wa_info;
    }

    public void setWa_info(String wa_info) {
        this.wa_info = wa_info;
    }

    public int getWa_ex_userno() {
        return wa_ex_userno;
    }

    public void setWa_ex_userno(int wa_ex_userno) {
        this.wa_ex_userno = wa_ex_userno;
    }

    public int getWa_statu() {
        return wa_statu;
    }

    public void setWa_statu(int wa_statu) {
        this.wa_statu = wa_statu;
    }

    public WorkOver() {
    }

    public WorkOver(int wa_id, int u_id, Date wa_start_time, Date wa_end_time, int wa_day, String wa_info, int wa_ex_userno, int wa_statu) {
        this.wa_id = wa_id;
        this.u_id = u_id;
        this.wa_start_time = wa_start_time;
        this.wa_end_time = wa_end_time;
        this.wa_day = wa_day;
        this.wa_info = wa_info;
        this.wa_ex_userno = wa_ex_userno;
        this.wa_statu = wa_statu;
    }

    public WorkOver(int u_id, Date wa_start_time, Date wa_end_time, int wa_day, String wa_info, int wa_ex_userno) {
        this.u_id = u_id;
        this.wa_start_time = wa_start_time;
        this.wa_end_time = wa_end_time;
        this.wa_day = wa_day;
        this.wa_info = wa_info;
        this.wa_ex_userno = wa_ex_userno;
    }

    @Override
    public String toString() {
        return "WorkOver{" +
                "wa_id=" + wa_id +
                ", u_id=" + u_id +
                ", wa_start_time=" + wa_start_time +
                ", wa_end_time=" + wa_end_time +
                ", wa_day=" + wa_day +
                ", wa_info='" + wa_info + '\'' +
                ", wa_ex_userno=" + wa_ex_userno +
                ", wa_statu=" + wa_statu +
                '}';
    }
}
