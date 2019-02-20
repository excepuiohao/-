package oa.bean;

import java.util.Date;

/**
 * 项目进度
 */
public class Rate {
    private int r_id=-1;
    private int p_id=-1;
    private int u_id=-1;
    private int r_rate=-1;
    private Date r_date;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }



    public int getR_rate() {
        return r_rate;
    }

    public void setR_rate(int r_rate) {
        this.r_rate = r_rate;
    }

    public Date getR_date() {
        return r_date;
    }

    public void setR_date(Date r_date) {
        this.r_date = r_date;
    }

    public Rate(int r_id, int p_id, int u_id, int r_rate, Date r_date) {
        this.r_id = r_id;
        this.p_id = p_id;
        this.u_id = u_id;
        this.r_rate = r_rate;
        this.r_date = r_date;
    }

    public Rate() {
    }

    @Override
    public String toString() {
        return "Rate{" +
                "r_id=" + r_id +
                ", p_id=" + p_id +
                ", u_id='" + u_id + '\'' +
                ", r_rate=" + r_rate +
                ", r_date=" + r_date +
                '}';
    }
}
