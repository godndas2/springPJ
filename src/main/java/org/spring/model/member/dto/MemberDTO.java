package org.spring.model.member.dto;

import java.util.Date;

public class MemberDTO {
	private String userid;
	private String passswd;
	private String name;
	private String email;
	private Date join_date;
	
	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", passswd=" + passswd + ", name=" + name + ", email=" + email
				+ ", join_date=" + join_date + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassswd() {
		return passswd;
	}
	public void setPassswd(String passswd) {
		this.passswd = passswd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	
	
}
