package xyz.hlmy.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName SYS_MESSAGE
 */
@TableName(value ="SYS_MESSAGE")
public class SysMessage implements Serializable {
    /**
     * code
     */
    @TableId(value = "code")
    private Integer code;

    /**
     * 内容
     */
    @TableField(value = "msg_doc")
    private String msgDoc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 内容
     */
    public String getMsgDoc() {
        return msgDoc;
    }

    /**
     * 内容
     */
    public void setMsgDoc(String msgDoc) {
        this.msgDoc = msgDoc;
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
        SysMessage other = (SysMessage) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getMsgDoc() == null ? other.getMsgDoc() == null : this.getMsgDoc().equals(other.getMsgDoc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getMsgDoc() == null) ? 0 : getMsgDoc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", msgDoc=").append(msgDoc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
