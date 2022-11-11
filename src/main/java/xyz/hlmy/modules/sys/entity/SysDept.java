package xyz.hlmy.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 部门
 * @TableName SYS_DEPT
 */
@TableName(value ="SYS_DEPT")
public class SysDept implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "dept_id")
    private Long deptId;

    /**
     * 部门名称
     */
    @TableField(value = "dept_name")
    private String deptName;

    /**
     * 父级ID
     */
    @TableField(value = "dept_parent_id")
    private Long deptParentId;

    /**
     * 类型
     */
    @TableField(value = "dept_type")
    private Integer deptType;

    /**
     * 上级部门ID
     */
    @TableField(value = "dept_superior_id")
    private Long deptSuperiorId;

    /**
     * 排序值
     */
    @TableField(value = "dept_sort")
    private Integer deptSort;

    /**
     * 状态
     */
    @TableField(value = "dept_status")
    private Integer deptStatus;

    /**
     * 创建人
     */
    @TableField(value = "dept_create_by")
    private String deptCreateBy;

    /**
     * 创建时间
     */
    @TableField(value = "dept_create_time")
    private Date deptCreateTime;

    /**
     * 更新人
     */
    @TableField(value = "dept_update_by")
    private String deptUpdateBy;

    /**
     * 更新时间
     */
    @TableField(value = "dept_update_time")
    private Date deptUpdateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 主键
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 父级ID
     */
    public Long getDeptParentId() {
        return deptParentId;
    }

    /**
     * 父级ID
     */
    public void setDeptParentId(Long deptParentId) {
        this.deptParentId = deptParentId;
    }

    /**
     * 类型
     */
    public Integer getDeptType() {
        return deptType;
    }

    /**
     * 类型
     */
    public void setDeptType(Integer deptType) {
        this.deptType = deptType;
    }

    /**
     * 上级部门ID
     */
    public Long getDeptSuperiorId() {
        return deptSuperiorId;
    }

    /**
     * 上级部门ID
     */
    public void setDeptSuperiorId(Long deptSuperiorId) {
        this.deptSuperiorId = deptSuperiorId;
    }

    /**
     * 排序值
     */
    public Integer getDeptSort() {
        return deptSort;
    }

    /**
     * 排序值
     */
    public void setDeptSort(Integer deptSort) {
        this.deptSort = deptSort;
    }

    /**
     * 状态
     */
    public Integer getDeptStatus() {
        return deptStatus;
    }

    /**
     * 状态
     */
    public void setDeptStatus(Integer deptStatus) {
        this.deptStatus = deptStatus;
    }

    /**
     * 创建人
     */
    public String getDeptCreateBy() {
        return deptCreateBy;
    }

    /**
     * 创建人
     */
    public void setDeptCreateBy(String deptCreateBy) {
        this.deptCreateBy = deptCreateBy;
    }

    /**
     * 创建时间
     */
    public Date getDeptCreateTime() {
        return deptCreateTime;
    }

    /**
     * 创建时间
     */
    public void setDeptCreateTime(Date deptCreateTime) {
        this.deptCreateTime = deptCreateTime;
    }

    /**
     * 更新人
     */
    public String getDeptUpdateBy() {
        return deptUpdateBy;
    }

    /**
     * 更新人
     */
    public void setDeptUpdateBy(String deptUpdateBy) {
        this.deptUpdateBy = deptUpdateBy;
    }

    /**
     * 更新时间
     */
    public Date getDeptUpdateTime() {
        return deptUpdateTime;
    }

    /**
     * 更新时间
     */
    public void setDeptUpdateTime(Date deptUpdateTime) {
        this.deptUpdateTime = deptUpdateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysDept other = (SysDept) that;
        return (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getDeptParentId() == null ? other.getDeptParentId() == null : this.getDeptParentId().equals(other.getDeptParentId()))
            && (this.getDeptType() == null ? other.getDeptType() == null : this.getDeptType().equals(other.getDeptType()))
            && (this.getDeptSuperiorId() == null ? other.getDeptSuperiorId() == null : this.getDeptSuperiorId().equals(other.getDeptSuperiorId()))
            && (this.getDeptSort() == null ? other.getDeptSort() == null : this.getDeptSort().equals(other.getDeptSort()))
            && (this.getDeptStatus() == null ? other.getDeptStatus() == null : this.getDeptStatus().equals(other.getDeptStatus()))
            && (this.getDeptCreateBy() == null ? other.getDeptCreateBy() == null : this.getDeptCreateBy().equals(other.getDeptCreateBy()))
            && (this.getDeptCreateTime() == null ? other.getDeptCreateTime() == null : this.getDeptCreateTime().equals(other.getDeptCreateTime()))
            && (this.getDeptUpdateBy() == null ? other.getDeptUpdateBy() == null : this.getDeptUpdateBy().equals(other.getDeptUpdateBy()))
            && (this.getDeptUpdateTime() == null ? other.getDeptUpdateTime() == null : this.getDeptUpdateTime().equals(other.getDeptUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getDeptParentId() == null) ? 0 : getDeptParentId().hashCode());
        result = prime * result + ((getDeptType() == null) ? 0 : getDeptType().hashCode());
        result = prime * result + ((getDeptSuperiorId() == null) ? 0 : getDeptSuperiorId().hashCode());
        result = prime * result + ((getDeptSort() == null) ? 0 : getDeptSort().hashCode());
        result = prime * result + ((getDeptStatus() == null) ? 0 : getDeptStatus().hashCode());
        result = prime * result + ((getDeptCreateBy() == null) ? 0 : getDeptCreateBy().hashCode());
        result = prime * result + ((getDeptCreateTime() == null) ? 0 : getDeptCreateTime().hashCode());
        result = prime * result + ((getDeptUpdateBy() == null) ? 0 : getDeptUpdateBy().hashCode());
        result = prime * result + ((getDeptUpdateTime() == null) ? 0 : getDeptUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptId=").append(deptId);
        sb.append(", deptName=").append(deptName);
        sb.append(", deptParentId=").append(deptParentId);
        sb.append(", deptType=").append(deptType);
        sb.append(", deptSuperiorId=").append(deptSuperiorId);
        sb.append(", deptSort=").append(deptSort);
        sb.append(", deptStatus=").append(deptStatus);
        sb.append(", deptCreateBy=").append(deptCreateBy);
        sb.append(", deptCreateTime=").append(deptCreateTime);
        sb.append(", deptUpdateBy=").append(deptUpdateBy);
        sb.append(", deptUpdateTime=").append(deptUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
