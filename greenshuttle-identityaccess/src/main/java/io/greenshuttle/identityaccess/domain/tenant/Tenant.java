package io.greenshuttle.identityaccess.domain.tenant;

/**
 * @author yangzifeng
 */
public class Tenant {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String description;

    private boolean active;

    private TenantId tenantId;

    public Tenant(TenantId aTenantId, String aName, String aDescription, boolean anActive) {
        this.setActive(anActive);
        this.setDescription(aDescription);
        this.setName(aName);
        this.setTenantId(aTenantId);
    }

    protected void setActive(boolean anActive) {
        this.active = anActive;
    }

    protected void setDescription(String aDescription) {
        this.description = aDescription;
    }

    protected void setName(String aName) {
        this.name = aName;
    }

    protected void setTenantId(TenantId aTenantId) {
        this.tenantId = aTenantId;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public boolean isActive() {
        return active;
    }

    public TenantId getTenantId() {
        return tenantId;
    }
}
