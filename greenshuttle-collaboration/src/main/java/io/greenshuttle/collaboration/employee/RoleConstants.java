package io.greenshuttle.collaboration.employee;

/**
 * @author yangzifeng
 */
public enum RoleConstants {

    /**
     * 基本角色，企业员工
     */
    EMPLOYEE("ROLE_EMPLOYEE","企业员工身份"),

    /**
     * 部门管理员
     */
    MANAGER("ROLE_MANAGER", "部门管理员");

    private final String code;

    private final String description;

    RoleConstants(String code, String description) {
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
