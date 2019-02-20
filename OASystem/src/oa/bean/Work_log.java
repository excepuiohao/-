package oa.bean;

import java.sql.Blob;

/**
 * 工作日志
 */
public class Work_log {
    private int wl_id=-1;
    private Blob wl_info;

    public int getWl_id() {
        return wl_id;
    }

    public void setWl_id(int wl_id) {
        this.wl_id = wl_id;
    }

    public Blob getWl_info() {
        return wl_info;
    }

    public void setWl_info(Blob wl_info) {
        this.wl_info = wl_info;
    }

    public Work_log(int wl_id, Blob wl_info) {
        this.wl_id = wl_id;
        this.wl_info = wl_info;
    }

    public Work_log() {
    }

    @Override
    public String toString() {
        return "Work_log{" +
                "wl_id=" + wl_id +
                ", wl_info=" + wl_info +
                '}';
    }
}
