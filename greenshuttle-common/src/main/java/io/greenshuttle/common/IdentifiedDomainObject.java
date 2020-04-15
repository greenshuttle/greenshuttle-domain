package io.greenshuttle.common;

import java.util.UUID;

/**
 * @author yangzifeng
 */
public class IdentifiedDomainObject extends AssertionConcern {

    private static final long serialVersionUID = 1L;

    private String id;

    protected IdentifiedDomainObject() {
        super();

        this.setId(UUID.randomUUID().toString());
    }

    protected String id() {
        return this.id;
    }

    private void setId(String anId) {
        this.id = anId;
    }

}
