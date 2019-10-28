package top.liujingyanghui.assignmentupload.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * security需要的UserDetails实现类
 */
@Data
public class JwtUser implements UserDetails {
    private static final long serialVersionUID = -4959252432107932674L;
    private final long id;
    private final String username;
    private final String password;
    private final String role;
    private final String name;
    /** 权限类.*/
    private final Collection<? extends GrantedAuthority> authorities;

    /**
     * 在createJwtFactory里注入
     */
    public JwtUser(long id,
                   String email,
                   String password,
                   String role,
                   Collection<? extends GrantedAuthority> authorities,
                   String name) {
        this.id = id;
        this.username = email;
        this.password = password;
        this.role = role;
        this.authorities = authorities;
        this.name = name;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
