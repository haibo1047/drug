package com.ylsq.frame.model.common;

import java.io.Serializable;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class SecuRole implements PK,GrantedAuthority,Serializable{
	private static final long serialVersionUID = -1253928700830039748L;

	private Long id;

    private String authority;

    private String roleDesc;

    private String roleName;
    
    private List<String> selected;
	private List<String> unselect;

    public List<String> getSelected() {
		return selected;
	}
	public void setSelected(List<String> selected) {
		this.selected = selected;
	}

	public List<String> getUnselect() {
		return unselect;
	}
	public void setUnselect(List<String> unselect) {
		this.unselect = unselect;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}