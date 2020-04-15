package io.greenshuttle.collaboration.organization;

import java.util.Objects;
import java.util.Set;

/**
 * @author yangzifeng
 */
public class Organization {

    private String id;

    private String name;

    private Set<Organization> children;

    private OrganizationId organizationId;

    void addChildren(Organization organization) {
        this.children.add(organization);
    }

    public boolean isRoot() {
        return false;
    }

    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Organization that = (Organization) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String name() {
        return name;
    }

    public void children(Set<Organization> children) {
        this.children = children;
    }
}
