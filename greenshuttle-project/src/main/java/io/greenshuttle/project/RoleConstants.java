package io.greenshuttle.project;

/**
 * @author yangzifeng
 */
public enum RoleConstants {

    /**
     * 基本角色，项目成员
     */
    PROJECT_MEMBER("ROLE_PROJECT_MEMBER","项目成员身份");

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
