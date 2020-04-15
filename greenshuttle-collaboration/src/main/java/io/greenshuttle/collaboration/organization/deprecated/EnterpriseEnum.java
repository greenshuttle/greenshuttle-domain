package io.greenshuttle.collaboration.organization.deprecated;

/**
 * @author yangzifeng
 */

public enum EnterpriseEnum {

    /**
     * 公司
     */
    COMPANY("company", "公司"),
    /**
     * 部门
     */
    DEPARTMENT("department", "部门");

    private String code;

    private String description;

    EnterpriseEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
