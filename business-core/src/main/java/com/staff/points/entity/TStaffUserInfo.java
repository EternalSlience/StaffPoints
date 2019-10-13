package com.staff.points.entity;

import java.io.Serializable;
import java.util.Date;

public class TStaffUserInfo implements Serializable {
    private Integer id;

    private String user_id;

    private String name;

    private String certificate_no;

    private String certificate_type;

    private String team_name;

    private String work_type;

    private String gender;

    private String age;

    private Date brith_date;

    private String status;

    private String point;

    private String created_by;

    private Date created_time;

    private String updated_by;

    private Date updated_time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCertificate_no() {
        return certificate_no;
    }

    public void setCertificate_no(String certificate_no) {
        this.certificate_no = certificate_no == null ? null : certificate_no.trim();
    }

    public String getCertificate_type() {
        return certificate_type;
    }

    public void setCertificate_type(String certificate_type) {
        this.certificate_type = certificate_type == null ? null : certificate_type.trim();
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name == null ? null : team_name.trim();
    }

    public String getWork_type() {
        return work_type;
    }

    public void setWork_type(String work_type) {
        this.work_type = work_type == null ? null : work_type.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public Date getBrith_date() {
        return brith_date;
    }

    public void setBrith_date(Date brith_date) {
        this.brith_date = brith_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by == null ? null : created_by.trim();
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by == null ? null : updated_by.trim();
    }

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", name=").append(name);
        sb.append(", certificate_no=").append(certificate_no);
        sb.append(", certificate_type=").append(certificate_type);
        sb.append(", team_name=").append(team_name);
        sb.append(", work_type=").append(work_type);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", brith_date=").append(brith_date);
        sb.append(", status=").append(status);
        sb.append(", point=").append(point);
        sb.append(", created_by=").append(created_by);
        sb.append(", created_time=").append(created_time);
        sb.append(", updated_by=").append(updated_by);
        sb.append(", updated_time=").append(updated_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}