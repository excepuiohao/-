package oa.bean;

/**
 * 用户
 */
public class User {

    private int u_id=-1;

    private String lead_no;

    private String u_no;

    private String u_name;

    private String u_pwd;

    private String u_email;

    private String u_phone;

    private int u_type=-1;

    private String notion_read;

    public User() {
    }

    public User(int u_id, String lead_no, String u_no, String u_name, String u_pwd, String u_email, String u_phone, int u_type, String notion_read) {
        this.u_id = u_id;
        this.lead_no = lead_no;
        this.u_no = u_no;
        this.u_name = u_name;
        this.u_pwd = u_pwd;
        this.u_email = u_email;
        this.u_phone = u_phone;
        this.u_type = u_type;
        this.notion_read = notion_read;
    }

    public User(int u_id) {
        this.u_id = u_id;
    }

    public User(String u_no) {

        this.u_no = u_no;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getLead_no() {
        return lead_no;
    }

    public void setLead_no(String lead_no) {
        this.lead_no = lead_no;
    }

    public String getU_no() {
        return u_no;
    }

    public void setU_no(String u_no) {
        this.u_no = u_no;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public int getU_type() {
        return u_type;
    }

    public void setU_type(int u_type) {
        this.u_type = u_type;
    }

    public String getNotion_read() {
        return notion_read;
    }

    public void setNotion_read(String notion_read) {
        this.notion_read = notion_read;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", lead_no='" + lead_no + '\'' +
                ", u_no='" + u_no + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_pwd='" + u_pwd + '\'' +
                ", u_email='" + u_email + '\'' +
                ", u_phone='" + u_phone + '\'' +
                ", u_type=" + u_type +
                ", notion_read='" + notion_read + '\'' +
                '}';
    }
}