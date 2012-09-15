/**
 * 
 */
package com.ylsq.frame.sh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ylsq.frame.model.common.SecuRole;
import com.ylsq.frame.model.common.SecuUser;
import com.ylsq.frame.service.common.SecuRoleService;
import com.ylsq.frame.service.common.SecuUserService;

/**
 * @author hopper
 *
 */
@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Resource
	private SecuUserService secuUserService;
	@Resource
	private SecuRoleService secuRoleService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final SecuUser user = secuUserService.getUserByUsername(username);
		final List<SecuRole> roleList = secuRoleService.findListByUsername(username);
		return new UserDetails() {
			private static final long serialVersionUID = 8798678819478712457L;
			@Override
			public boolean isEnabled() {
				return true;
			}
			@Override
			public boolean isCredentialsNonExpired() {
				return true;
			}
			@Override
			public boolean isAccountNonLocked() {
				return true;
			}
			@Override
			public boolean isAccountNonExpired() {
				return true;
			}
			@Override
			public String getUsername() {
				return user.getUsername();
			}
			@Override
			public String getPassword() {
				return user.getPassword();
			}
			@Override
			public Collection<GrantedAuthority> getAuthorities() {
				return new ArrayList<GrantedAuthority>(roleList);
			}
		};
	}
}
