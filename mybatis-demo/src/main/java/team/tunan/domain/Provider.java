package team.tunan.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/8
 */
@Data
public class Provider {
    /**
     * 供应商id
     */
    private Long id;
    /**
     * 供应商编码
     */
    private String proCode;
    /**
     * 供应商名称
     */
    private String proName;
    /**
     * 供应商详细描述
     */
    private String proDesc;
    /**
     * 供应商联系人
     */
    private String proContact;
    /**
     * 联系电话
     */
    private String proPhone;
    /**
     * 地址
     */
    private String proAddress;
    /**
     * 传真
     */
    private String proFax;
    /**
     * 创建者
     */
    private Long createdBy;
    /**
     * 创建时间
     */
    private Date creationDate;
    /**
     * 更新时间
     */
    private Date modifyDate;
    /**
     * 更新者
     */
    private Long modifyBy;
}
