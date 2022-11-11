package xyz.hlmy.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * @TableName SYS_USER
 */
@TableName(value ="SYS_USER")
public class SysUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "uid")
    private Long uid;

    /**
     * 账号
     */
    @TableField(value = "user_account")
    private String userAccount;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 性别(0男,1女)
     */
    @TableField(value = "user_sex")
    private Integer userSex;

    /**
     * 密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 头像
     */
    @TableField(value = "user_avatar")
    private String userAvatar;

    /**
     * 状态(0:正常,1:禁用,2:踢下线)
     */
    @TableField(value = "user_status")
    private Integer userStatus;

    /**
     * 创建人
     */
    @TableField(value = "user_create_by")
    private String userCreateBy;

    /**
     * 创建时间
     */
    @TableField(value = "user_create_time")
    private Date userCreateTime;

    /**
     * 更新人
     */
    @TableField(value = "user_update_by")
    private String userUpdateBy;

    /**
     * 更新时间
     */
    @TableField(value = "user_update_time")
    private Date userUpdateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    public Long getUid() {
        return uid;
    }

    /**
     * 主键
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 性别(0男,1女)
     */
    public Integer getUserSex() {
        return userSex;
    }

    /**
     * 性别(0男,1女)
     */
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    /**
     * 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 头像
     */
    public String getUserAvatar() {
        return userAvatar;
    }

    /**
     * 头像
     */
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    /**
     * 状态(0:正常,1:禁用,2:踢下线)
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 状态(0:正常,1:禁用,2:踢下线)
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 创建人
     */
    public String getUserCreateBy() {
        return userCreateBy;
    }

    /**
     * 创建人
     */
    public void setUserCreateBy(String userCreateBy) {
        this.userCreateBy = userCreateBy;
    }

    /**
     * 创建时间
     */
    public Date getUserCreateTime() {
        return userCreateTime;
    }

    /**
     * 创建时间
     */
    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    /**
     * 更新人
     */
    public String getUserUpdateBy() {
        return userUpdateBy;
    }

    /**
     * 更新人
     */
    public void setUserUpdateBy(String userUpdateBy) {
        this.userUpdateBy = userUpdateBy;
    }

    /**
     * 更新时间
     */
    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    /**
     * 更新时间
     */
    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
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
        SysUser other = (SysUser) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserAvatar() == null ? other.getUserAvatar() == null : this.getUserAvatar().equals(other.getUserAvatar()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserCreateBy() == null ? other.getUserCreateBy() == null : this.getUserCreateBy().equals(other.getUserCreateBy()))
            && (this.getUserCreateTime() == null ? other.getUserCreateTime() == null : this.getUserCreateTime().equals(other.getUserCreateTime()))
            && (this.getUserUpdateBy() == null ? other.getUserUpdateBy() == null : this.getUserUpdateBy().equals(other.getUserUpdateBy()))
            && (this.getUserUpdateTime() == null ? other.getUserUpdateTime() == null : this.getUserUpdateTime().equals(other.getUserUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserAvatar() == null) ? 0 : getUserAvatar().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserCreateBy() == null) ? 0 : getUserCreateBy().hashCode());
        result = prime * result + ((getUserCreateTime() == null) ? 0 : getUserCreateTime().hashCode());
        result = prime * result + ((getUserUpdateBy() == null) ? 0 : getUserUpdateBy().hashCode());
        result = prime * result + ((getUserUpdateTime() == null) ? 0 : getUserUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", userName=").append(userName);
        sb.append(", userSex=").append(userSex);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userAvatar=").append(userAvatar);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userCreateBy=").append(userCreateBy);
        sb.append(", userCreateTime=").append(userCreateTime);
        sb.append(", userUpdateBy=").append(userUpdateBy);
        sb.append(", userUpdateTime=").append(userUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
