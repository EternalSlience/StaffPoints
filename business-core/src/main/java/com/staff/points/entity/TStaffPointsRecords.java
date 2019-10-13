package com.staff.points.entity;

import java.io.Serializable;
import java.util.Date;

public class TStaffPointsRecords implements Serializable {
    private Integer id;

    private String operator_id;

    private String operated_id;

    private String point_type;

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

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id == null ? null : operator_id.trim();
    }

    public String getOperated_id() {
        return operated_id;
    }

    public void setOperated_id(String operated_id) {
        this.operated_id = operated_id == null ? null : operated_id.trim();
    }

    public String getPoint_type() {
        return point_type;
    }

    public void setPoint_type(String point_type) {
        this.point_type = point_type == null ? null : point_type.trim();
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
        sb.append(", operator_id=").append(operator_id);
        sb.append(", operated_id=").append(operated_id);
        sb.append(", point_type=").append(point_type);
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