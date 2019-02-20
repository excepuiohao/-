package oa.bean;
//工作时间表的实体
public class Work_time {
    private int wt_id=-1;
    private int u_id=-1;
    private int wt_normal=-1;
    private int wt_m_h=-1;
    private int wt_y_h=-1;
    private int wt_i_h=-1;
    private int wt_overtime=-1;

    public int getWt_id() {
        return wt_id;
    }

    public void setWt_id(int wt_id) {
        this.wt_id = wt_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getWt_normal() {
        return wt_normal;
    }

    public void setWt_normal(int wt_normal) {
        this.wt_normal = wt_normal;
    }

    public int getWt_m_h() {
        return wt_m_h;
    }

    public void setWt_m_h(int wt_m_h) {
        this.wt_m_h = wt_m_h;
    }

    public int getWt_y_h() {
        return wt_y_h;
    }

    public void setWt_y_h(int wt_y_h) {
        this.wt_y_h = wt_y_h;
    }

    public int getWt_i_h() {
        return wt_i_h;
    }

    public void setWt_i_h(int wt_i_h) {
        this.wt_i_h = wt_i_h;
    }

    public int getWt_overtime() {
        return wt_overtime;
    }

    public void setWt_overtime(int wt_overtime) {
        this.wt_overtime = wt_overtime;
    }

    public Work_time(int wt_id, int u_id, int wt_normal, int wt_m_h, int wt_y_h, int wt_i_h, int wt_overtime) {
        this.wt_id = wt_id;
        this.u_id = u_id;
        this.wt_normal = wt_normal;
        this.wt_m_h = wt_m_h;
        this.wt_y_h = wt_y_h;
        this.wt_i_h = wt_i_h;
        this.wt_overtime = wt_overtime;
    }

    public Work_time() {
    }

    @Override
    public String toString() {
        return "Work_time{" +
                "wt_id=" + wt_id +
                ", u_id=" + u_id +
                ", wt_normal=" + wt_normal +
                ", wt_m_h=" + wt_m_h +
                ", wt_y_h=" + wt_y_h +
                ", wt_i_h=" + wt_i_h +
                ", wt_overtime=" + wt_overtime +
                '}';
    }
}
