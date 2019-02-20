package oa.bean;

import java.util.Date;

//签到表的实体
public class Sign {
    private int s_id=-1;
    private int u_id=-1;
    private int s_type=-1;
    private Date s_time;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getS_type() {
        return s_type;
    }

    public void setS_type(int s_type) {
        this.s_type = s_type;
    }

    public Date getS_time() {
        return s_time;
    }

    public void setS_time(Date s_time) {
        this.s_time = s_time;
    }

    public Sign(int u_id){
        this.u_id = u_id;
    }

    public Sign(int u_id, int s_type, Date s_time) {
        this.u_id = u_id;
        this.s_type = s_type;
        this.s_time = s_time;
    }

    public Sign(int s_id, int u_id, int s_type, Date s_time) {
        this.s_id = s_id;
        this.u_id = u_id;
        this.s_type = s_type;
        this.s_time = s_time;
    }

    public Sign() {
    }

    @Override
    public String toString() {
        return "Sign{" +
                "s_id=" + s_id +
                ", u_id=" + u_id +
                ", s_type=" + s_type +
                ", s_time=" + s_time +
                '}';
    }
}
