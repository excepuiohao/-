package oa.bean;

import java.util.Date;

//公告表的实体
public class Notice {
    private int n_id=-1;
    private int u_id=-1;
    private String n_title;
    private String n_content;
    private Date n_time;

    public int getN_id() {
        return n_id;
    }

    public void setN_id(int n_id) {
        this.n_id = n_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getN_title() {
        return n_title;
    }

    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    public String getN_content() {
        return n_content;
    }

    public void setN_content(String n_content) {
        this.n_content = n_content;
    }

    public Date getN_time() {
        return n_time;
    }

    public void setN_time(Date n_time) {
        this.n_time = n_time;
    }

    public Notice() {
    }

    public Notice(int n_id, int u_id, String n_title, String n_content, Date n_time) {
        this.n_id = n_id;
        this.u_id = u_id;
        this.n_title = n_title;
        this.n_content = n_content;
        this.n_time = n_time;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "n_id=" + n_id +
                ", u_id=" + u_id +
                ", n_title='" + n_title + '\'' +
                ", n_content='" + n_content + '\'' +
                ", n_time=" + n_time +
                '}';
    }
}
