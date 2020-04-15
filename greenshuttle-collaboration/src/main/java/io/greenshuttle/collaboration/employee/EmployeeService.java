package io.greenshuttle.collaboration.employee;

import io.greenshuttle.collaboration.domain.tenant.Tenant;

/**
 * @author yangzifeng
 */
public interface EmployeeService {

    /**
     * 从用户切换为协同上下文的员工
     * @param aTenant 租户值对象
     * @param anIdentity 用户身份
     * @return 员工
     */
    public Employee employeeFrom(Tenant aTenant, String anIdentity);
}
