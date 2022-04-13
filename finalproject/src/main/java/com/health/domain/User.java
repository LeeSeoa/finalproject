package com.health.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {
	
	private static final long serialVersionUID = 5177294317961485740L;

	private int m_num;
	private String m_mail;
    private String m_pw;
    private String m_name;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isEnabled;   
    private Collection<? extends GrantedAuthority> authorities;    
    private String m_hp;
    private String m_add;    
    private String m_date;
    
    
    @Override
    public String getUsername() {
    	return m_mail;
    }
    
    @Override
    public String getPassword() {
         return m_pw;
    }    

    @Override
    public boolean isAccountNonExpired() {
         return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
         return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
         return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
         return isEnabled;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
         return authorities;
    }
    
    
    
    
    public int getM_num() {
        return m_num;
    }

    public void setM_num(int m_num) {
        this.m_num = m_num;
	}    
    
    public String getM_name() {
         return m_name;
    }

    public void setM_name(String m_name) {
         this.m_name = m_name;
    }

    public void setUsername(String m_mail) {
         this.m_mail = m_mail;
    }

    public void setPassword(String m_pw) {
         this.m_pw = m_pw;
    }

    public void setAccountNonExpired(boolean isAccountNonExpired) {
         this.isAccountNonExpired = isAccountNonExpired;
    }

    public void setAccountNonLocked(boolean isAccountNonLocked) {
         this.isAccountNonLocked = isAccountNonLocked;
    }

    public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
         this.isCredentialsNonExpired = isCredentialsNonExpired;
    }

    public void setEnabled(boolean isEnabled) {
         this.isEnabled = isEnabled;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
         this.authorities = authorities;
    }

	@Override
	public String toString() {
		return "User [username=" + m_mail + ", password=" + m_pw + ", name=" + m_name + ", isAccountNonExpired="
				+ isAccountNonExpired + ", isAccountNonLocked=" + isAccountNonLocked + ", isCredentialsNonExpired="
				+ isCredentialsNonExpired + ", isEnabled=" + isEnabled + "]";
	}

	public User(String m_mail, String m_pw, String m_name, boolean isAccountNonExpired, boolean isAccountNonLocked,
			boolean isCredentialsNonExpired, boolean isEnabled) {
		super();
		this.m_mail = m_mail;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.isAccountNonExpired = isAccountNonExpired;
		this.isAccountNonLocked = isAccountNonLocked;
		this.isCredentialsNonExpired = isCredentialsNonExpired;
		this.isEnabled = isEnabled;
	}
	
	public String getM_hp() {
        return m_hp;
    }

    public void setM_hp(String m_hp) {
        this.m_hp = m_hp;
	}
	
    
    public String getM_add() {
        return m_add;
    }

    public void setM_add(String m_add) {
        this.m_add = m_add;
	}

	public String getM_date() {
		return m_date;
	}

	public void setM_date(String m_date) {
		this.m_date = m_date;
	}   	
    
}