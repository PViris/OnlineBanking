package com.userfront.domain.security;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * @author punit.gautam
 *
 */
@Entity
public class Role implements Serializable{

	private static final long serialVersionUID = 5535028424447510521L;

	@Id
    private int roleId;

    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UserRole> userRoles = new HashSet<>();

    public Role() { //NOSONAR
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }


}
