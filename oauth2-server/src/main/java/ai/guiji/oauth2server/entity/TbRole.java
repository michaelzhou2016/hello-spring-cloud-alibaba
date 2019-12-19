package ai.guiji.oauth2server.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbRole)实体类
 *
 * @author makejava
 * @since 2019-12-18 19:55:43
 */
public class TbRole implements Serializable {
    private static final long serialVersionUID = 826173861148047062L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 父类ID
    */
    private Long parentId;
    /**
    * 角色名字
    */
    private String name;
    /**
    * 角色名字
    */
    private String ename;
    /**
    * 描述
    */
    private String description;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}