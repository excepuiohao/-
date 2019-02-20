package oa.bean;

/**
 * 辞职申请
 */
public class Resign {
    private int r_id=-1;
    private int u_id=-1;
    private String r_info;
    private String r_ex_userno;
    private int r_statu=-1;

    public Resign(int r_id, int u_id, String r_info, String r_ex_userno, int r_statu) {
        this.r_id = r_id;
        this.u_id = u_id;
        this.r_info = r_info;
        this.r_ex_userno = r_ex_userno;
        this.r_statu = r_statu;
    }

    public Resign(int u_id, String r_info, String r_ex_userno) {
        this.u_id = u_id;
        this.r_info = r_info;
        this.r_ex_userno = r_ex_userno;
    }

    public Resign() {
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getR_info() {
        return r_info;
    }

    public void setR_info(String r_info) {
        this.r_info = r_info;
    }

    public String getR_ex_userno() {
        return r_ex_userno;
    }

    public void setR_ex_userno(String r_ex_userno) {
        this.r_ex_userno = r_ex_userno;
    }

    public int getR_statu() {
        return r_statu;
    }

    public void setR_statu(int r_statu) {
        this.r_statu = r_statu;
    }

    @Override
    public String toString() {
        return "Resign{" +
                "r_id=" + r_id +
                ", u_id=" + u_id +
                ", r_info='" + r_info + '\'' +
                ", r_ex_userno='" + r_ex_userno + '\'' +
                ", r_statu=" + r_statu +
                '}';
    }
}
