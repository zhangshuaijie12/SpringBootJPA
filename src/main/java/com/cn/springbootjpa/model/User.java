package com.cn.springbootjpa.model;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "username")
    private String username;

	@Column(name = "password")
    private String password;

	@Column(name = "email")
    private String email;  
  
    /**  
     * 是否可用(0禁用,1可用)  
     */
	@Column(name = "useable")
    private Integer useable;  
  
    /**  
     * 创建时间  
     */
	@Column(name = "addtime")
    private String addtime;  
  
    /**  
     * 登陆时间  
     */
	@Column(name = "logintime")
    private String logintime;  
  
    /**  
     * 登陆IP  
     */
	@Column(name = "loginip")
    private String loginip;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getUseable() {
		return useable;
	}

	public void setUseable(Integer useable) {
		this.useable = useable;
	}

	public String getAddtime() {
		return addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getLogintime() {
		return logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}

	public String getLoginip() {
		return loginip;
	}

	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}

}
