package xyz.hlmy.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 菜单
 * @TableName SYS_MENU
 */
@TableName(value ="SYS_MENU")
public class SysMenu implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "menu_id")
    private Long menuId;

    /**
     * 菜单名称
     */
    @TableField(value = "menu_name")
    private String menuName;

    /**
     * 菜单层次
     */
    @TableField(value = "menu_level")
    private Integer menuLevel;

    /**
     * 父级ID
     */
    @TableField(value = "menu_parent_id")
    private Long menuParentId;

    /**
     * 菜单状态
     */
    @TableField(value = "menu_states")
    private Integer menuStates;

    /**
     * 创建人
     */
    @TableField(value = "menu_create_by")
    private String menuCreateBy;

    /**
     * 创建时间
     */
    @TableField(value = "menu_create_time")
    private Date menuCreateTime;

    /**
     * 更新时间
     */
    @TableField(value = "menu_update_time")
    private Date menuUpdateTime;

    /**
     * 更新人
     */
    @TableField(value = "menu_update_by")
    private String menuUpdateBy;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 主键
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 菜单层次
     */
    public Integer getMenuLevel() {
        return menuLevel;
    }

    /**
     * 菜单层次
     */
    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * 父级ID
     */
    public Long getMenuParentId() {
        return menuParentId;
    }

    /**
     * 父级ID
     */
    public void setMenuParentId(Long menuParentId) {
        this.menuParentId = menuParentId;
    }

    /**
     * 菜单状态
     */
    public Integer getMenuStates() {
        return menuStates;
    }

    /**
     * 菜单状态
     */
    public void setMenuStates(Integer menuStates) {
        this.menuStates = menuStates;
    }

    /**
     * 创建人
     */
    public String getMenuCreateBy() {
        return menuCreateBy;
    }

    /**
     * 创建人
     */
    public void setMenuCreateBy(String menuCreateBy) {
        this.menuCreateBy = menuCreateBy;
    }

    /**
     * 创建时间
     */
    public Date getMenuCreateTime() {
        return menuCreateTime;
    }

    /**
     * 创建时间
     */
    public void setMenuCreateTime(Date menuCreateTime) {
        this.menuCreateTime = menuCreateTime;
    }

    /**
     * 更新时间
     */
    public Date getMenuUpdateTime() {
        return menuUpdateTime;
    }

    /**
     * 更新时间
     */
    public void setMenuUpdateTime(Date menuUpdateTime) {
        this.menuUpdateTime = menuUpdateTime;
    }

    /**
     * 更新人
     */
    public String getMenuUpdateBy() {
        return menuUpdateBy;
    }

    /**
     * 更新人
     */
    public void setMenuUpdateBy(String menuUpdateBy) {
        this.menuUpdateBy = menuUpdateBy;
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
        SysMenu other = (SysMenu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getMenuLevel() == null ? other.getMenuLevel() == null : this.getMenuLevel().equals(other.getMenuLevel()))
            && (this.getMenuParentId() == null ? other.getMenuParentId() == null : this.getMenuParentId().equals(other.getMenuParentId()))
            && (this.getMenuStates() == null ? other.getMenuStates() == null : this.getMenuStates().equals(other.getMenuStates()))
            && (this.getMenuCreateBy() == null ? other.getMenuCreateBy() == null : this.getMenuCreateBy().equals(other.getMenuCreateBy()))
            && (this.getMenuCreateTime() == null ? other.getMenuCreateTime() == null : this.getMenuCreateTime().equals(other.getMenuCreateTime()))
            && (this.getMenuUpdateTime() == null ? other.getMenuUpdateTime() == null : this.getMenuUpdateTime().equals(other.getMenuUpdateTime()))
            && (this.getMenuUpdateBy() == null ? other.getMenuUpdateBy() == null : this.getMenuUpdateBy().equals(other.getMenuUpdateBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuLevel() == null) ? 0 : getMenuLevel().hashCode());
        result = prime * result + ((getMenuParentId() == null) ? 0 : getMenuParentId().hashCode());
        result = prime * result + ((getMenuStates() == null) ? 0 : getMenuStates().hashCode());
        result = prime * result + ((getMenuCreateBy() == null) ? 0 : getMenuCreateBy().hashCode());
        result = prime * result + ((getMenuCreateTime() == null) ? 0 : getMenuCreateTime().hashCode());
        result = prime * result + ((getMenuUpdateTime() == null) ? 0 : getMenuUpdateTime().hashCode());
        result = prime * result + ((getMenuUpdateBy() == null) ? 0 : getMenuUpdateBy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuLevel=").append(menuLevel);
        sb.append(", menuParentId=").append(menuParentId);
        sb.append(", menuStates=").append(menuStates);
        sb.append(", menuCreateBy=").append(menuCreateBy);
        sb.append(", menuCreateTime=").append(menuCreateTime);
        sb.append(", menuUpdateTime=").append(menuUpdateTime);
        sb.append(", menuUpdateBy=").append(menuUpdateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
