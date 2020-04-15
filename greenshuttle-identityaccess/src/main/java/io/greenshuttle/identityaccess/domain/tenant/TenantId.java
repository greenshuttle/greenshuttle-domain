package io.greenshuttle.identityaccess.domain.tenant;

/**
 * @author yangzifeng
 */
public final class TenantId {

    private static final long serialVersionUID = 1L;

    private String id;

    public TenantId(String anId) {
        this.id = anId;
    }

    protected TenantId() {
        super();
    }

}
