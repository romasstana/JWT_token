package com.example.solidbankapp;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
@NoArgsConstructor
public class CustomUserDetails implements UserDetails {
    @Autowired
    private static RoleEntityRepository roleEntityRepository;
    private String login;
    private String password;
    private Collection<? extends GrantedAuthority> grantedAuthorities;



    public static CustomUserDetails fromUserEntityToCustomUserDetails(UserEntity userEntity) {
        CustomUserDetails c = new CustomUserDetails();
        c.login = userEntity.getUsername();
        c.password = userEntity.getPassword();
        c.grantedAuthorities = Collections.singletonList(new SimpleGrantedAuthority(roleEntityRepository.findRoleEntityById(userEntity.getRole_id()).getName()));
        return c;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
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