package oa.bean;

/**
 * 项目表
 */
public class Project {
    private int p_id=-1;
    private String p_managerno;
    private String p_teamno;
    private int p_rate=-1;
    private String p_title;
    private String p_info;
    private int p_statu=-1;

    public Project(int p_id, String p_managerno, String p_teamno,
                   int p_rate, String p_title, String p_info, int p_statu) {
        this.p_id = p_id;
        this.p_managerno = p_managerno;
        this.p_teamno = p_teamno;
        this.p_rate = p_rate;
        this.p_title = p_title;
        this.p_info = p_info;
        this.p_statu = p_statu;
    }

    public Project() {
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_managerno() {
        return p_managerno;
    }

    public void setP_managerno(String p_managerno) {
        this.p_managerno = p_managerno;
    }

    public String getP_teamno() {
        return p_teamno;
    }

    public void setP_teamno(String p_teamno) {
        this.p_teamno = p_teamno;
    }

    public int getP_rate() {
        return p_rate;
    }

    public void setP_rate(int p_rate) {
        this.p_rate = p_rate;
    }

    public String getP_title() {
        return p_title;
    }

    public void setP_title(String p_title) {
        this.p_title = p_title;
    }

    public String getP_info() {
        return p_info;
    }

    public void setP_info(String p_info) {
        this.p_info = p_info;
    }

    public int getP_statu() {
        return p_statu;
    }

    public void setP_statu(int p_statu) {
        this.p_statu = p_statu;
    }

    @Override
    public String toString() {
        return "Project{" +
                "p_id=" + p_id +
                ", p_managerno='" + p_managerno + '\'' +
                ", p_teamno='" + p_teamno + '\'' +
                ", p_rate=" + p_rate +
                ", p_title='" + p_title + '\'' +
                ", p_info='" + p_info + '\'' +
                ", p_statu=" + p_statu +
                '}';
    }
}
