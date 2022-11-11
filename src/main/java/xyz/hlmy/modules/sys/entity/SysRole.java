package xyz.hlmy.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色
 * @TableName SYS_ROLE
 */
@TableName(value ="SYS_ROLE")
public class SysRole implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "rid")
    private Long rid;

    /**
     * 角色名称
     */
    @TableField(value = "role_name")
    private String roleName;

    /**
     * 角色父级ID
     */
    @TableField(value = "role_parent_id")
    private Long roleParentId;

    /**
     * 类型(0 分类 1角色)
     */
    @TableField(value = "role_type")
    private Integer roleType;

    /**
     * 备注
     */
    @TableField(value = "role_remark")
    private String roleRemark;

    /**
     * 状态
     */
    @TableField(value = "role_status")
    private Integer roleStatus;

    /**
     * 创建人
     */
    @TableField(value = "role_create_by")
    private String roleCreateBy;

    /**
     * 创建时间
     */
    @TableField(value = "role_create_time")
    private Date roleCreateTime;

    /**
     * 更新人
     */
    @TableField(value = "role_update_by")
    private String roleUpdateBy;

    /**
     * 更新时间
     */
    @TableField(value = "role_update_time")
    private Date roleUpdateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    public Long getRid() {
        return rid;
    }

    /**
     * 主键
     */
    public void setRid(Long rid) {
        this.rid = rid;
    }

    /**
     * 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 角色父级ID
     */
    public Long getRoleParentId() {
        return roleParentId;
    }

    /**
     * 角色父级ID
     */
    public void setRoleParentId(Long roleParentId) {
        this.roleParentId = roleParentId;
    }

    /**
     * 类型(0 分类 1角色)
     */
    public Integer getRoleType() {
        return roleType;
    }

    /**
     * 类型(0 分类 1角色)
     */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    /**
     * 备注
     */
    public String getRoleRemark() {
        return roleRemark;
    }

    /**
     * 备注
     */
    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
    }

    /**
     * 状态
     */
    public Integer getRoleStatus() {
        return roleStatus;
    }

    /**
     * 状态
     */
    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    /**
     * 创建人
     */
    public String getRoleCreateBy() {
        return roleCreateBy;
    }

    /**
     * 创建人
     */
    public void setRoleCreateBy(String roleCreateBy) {
        this.roleCreateBy = roleCreateBy;
    }

    /**
     * 创建时间
     */
    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    /**
     * 创建时间
     */
    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    /**
     * 更新人
     */
    public String getRoleUpdateBy() {
        return roleUpdateBy;
    }

    /**
     * 更新人
     */
    public void setRoleUpdateBy(String roleUpdateBy) {
        this.roleUpdateBy = roleUpdateBy;
    }

    /**
     * 更新时间
     */
    public Date getRoleUpdateTime() {
        return roleUpdateTime;
    }

    /**
     * 更新时间
     */
    public void setRoleUpdateTime(Date roleUpdateTime) {
        this.roleUpdateTime = roleUpdateTime;
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
        SysRole other = (SysRole) that;
        return (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getRoleParentId() == null ? other.getRoleParentId() == null : this.getRoleParentId().equals(other.getRoleParentId()))
            && (this.getRoleType() == null ? other.getRoleType() == null : this.getRoleType().equals(other.getRoleType()))
            && (this.getRoleRemark() == null ? other.getRoleRemark() == null : this.getRoleRemark().equals(other.getRoleRemark()))
            && (this.getRoleStatus() == null ? other.getRoleStatus() == null : this.getRoleStatus().equals(other.getRoleStatus()))
            && (this.getRoleCreateBy() == null ? other.getRoleCreateBy() == null : this.getRoleCreateBy().equals(other.getRoleCreateBy()))
            && (this.getRoleCreateTime() == null ? other.getRoleCreateTime() == null : this.getRoleCreateTime().equals(other.getRoleCreateTime()))
            && (this.getRoleUpdateBy() == null ? other.getRoleUpdateBy() == null : this.getRoleUpdateBy().equals(other.getRoleUpdateBy()))
            && (this.getRoleUpdateTime() == null ? other.getRoleUpdateTime() == null : this.getRoleUpdateTime().equals(other.getRoleUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleParentId() == null) ? 0 : getRoleParentId().hashCode());
        result = prime * result + ((getRoleType() == null) ? 0 : getRoleType().hashCode());
        result = prime * result + ((getRoleRemark() == null) ? 0 : getRoleRemark().hashCode());
        result = prime * result + ((getRoleStatus() == null) ? 0 : getRoleStatus().hashCode());
        result = prime * result + ((getRoleCreateBy() == null) ? 0 : getRoleCreateBy().hashCode());
        result = prime * result + ((getRoleCreateTime() == null) ? 0 : getRoleCreateTime().hashCode());
        result = prime * result + ((getRoleUpdateBy() == null) ? 0 : getRoleUpdateBy().hashCode());
        result = prime * result + ((getRoleUpdateTime() == null) ? 0 : getRoleUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleParentId=").append(roleParentId);
        sb.append(", roleType=").append(roleType);
        sb.append(", roleRemark=").append(roleRemark);
        sb.append(", roleStatus=").append(roleStatus);
        sb.append(", roleCreateBy=").append(roleCreateBy);
        sb.append(", roleCreateTime=").append(roleCreateTime);
        sb.append(", roleUpdateBy=").append(roleUpdateBy);
        sb.append(", roleUpdateTime=").append(roleUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
