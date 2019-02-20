package oa.bean;
//临时表的实体
public class Update_info {
    private int ui_id=-1;
    private String ui_no;
    private String ui_name;
    private String ui_pwd;
    private String ui_email;
    private String ui_phone;
    private int ui_statu=-1;
    private String ui_ex_userno;

    public int getUi_id() {
        return ui_id;
    }

    public void setUi_id(int ui_id) {
        this.ui_id = ui_id;
    }

    public String getUi_no() {
        return ui_no;
    }

    public void setUi_no(String ui_no) {
        this.ui_no = ui_no;
    }

    public String getUi_name() {
        return ui_name;
    }

    public void setUi_name(String ui_name) {
        this.ui_name = ui_name;
    }

    public String getUi_pwd() {
        return ui_pwd;
    }

    public void setUi_pwd(String ui_pwd) {
        this.ui_pwd = ui_pwd;
    }

    public String getUi_email() {
        return ui_email;
    }

    public void setUi_email(String ui_email) {
        this.ui_email = ui_email;
    }

    public String getUi_phone() {
        return ui_phone;
    }

    public void setUi_phone(String ui_phone) {
        this.ui_phone = ui_phone;
    }

    public int getUi_statu() {
        return ui_statu;
    }

    public void setUi_statu(int ui_statu) {
        this.ui_statu = ui_statu;
    }

    public String getUi_ex_userno() {
        return ui_ex_userno;
    }

    public void setUi_ex_userno(String ui_ex_userno) {
        this.ui_ex_userno = ui_ex_userno;
    }

    public Update_info(int ui_id, String ui_no, String ui_name, String ui_pwd, String ui_email, String ui_phone, int ui_statu, String ui_ex_userno) {
        this.ui_id = ui_id;
        this.ui_no = ui_no;
        this.ui_name = ui_name;
        this.ui_pwd = ui_pwd;
        this.ui_email = ui_email;
        this.ui_phone = ui_phone;
        this.ui_statu = ui_statu;
        this.ui_ex_userno = ui_ex_userno;
    }

    public Update_info(String ui_no, String ui_name, String ui_email, String ui_phone,String ui_ex_userno) {
        this.ui_no = ui_no;
        this.ui_name = ui_name;
        this.ui_email = ui_email;
        this.ui_phone = ui_phone;
        this.ui_ex_userno = ui_ex_userno;
    }

    public Update_info() {
    }

    @Override
    public String toString() {
        return "Update_info{" +
                "ui_id=" + ui_id +
                ", ui_no='" + ui_no + '\'' +
                ", ui_name='" + ui_name + '\'' +
                ", ui_pwd='" + ui_pwd + '\'' +
                ", ui_email='" + ui_email + '\'' +
                ", ui_phone='" + ui_phone + '\'' +
                ", ui_statu=" + ui_statu +
                ", ui_ex_userno='" + ui_ex_userno + '\'' +
                '}';
    }
}
