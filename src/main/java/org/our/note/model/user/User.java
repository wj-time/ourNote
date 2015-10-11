package org.our.note.model.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user")
public class User implements Serializable, Cloneable {

	private static final long serialVersionUID = 1076875498665483718L;

	/**
	 * id
	 */
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	/**
	 * 邮箱(验证通过后才会存在该值)
	 */
	@Column(name = "email", length = 32, unique = true)
	private String email;

	/**
	 * 手机号(验证通过后才会存在该值)
	 */
	@Column(name = "mobile", length = 32, unique = true)
	private String mobile;

	/**
	 * 密码 MD5
	 */
	@Column(name = "password", length = 64, nullable = false)
	private String password;


	/**
	 * 注册时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "reg_time", nullable = false)
	private Date regTime;

	/**
	 * 最后登陆时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastest_login_time")
	private Date lastestLoginTime;

	/**
	 * 最后登陆ip
	 */
	@Column(name = "lastest_login_ip", length = 32)
	private String lastestLoginIp;

	/**
	 * 真实姓名
	 */
	@Column(name = "real_name")
	private String realName;
	
	/**
	 * qq
	 */
	@Column(name = "qq")
	private String qq;
	
	/**
	 * website
	 */
	@Column(name = "website")
	private String website;
	
	/**
	 * github
	 */
	@Column(name = "github")
	private String github;
	
	/**
	 * 昵称
	 */
	@Column(name = "nick_name", length = 50, nullable = false, unique = true)
	private String nickname;

	/**
	 * 用户是否可用
	 */
	@Column(name = "enable", nullable = false)
	private Boolean enable = true;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public Date getLastestLoginTime() {
		return lastestLoginTime;
	}

	public void setLastestLoginTime(Date lastestLoginTime) {
		this.lastestLoginTime = lastestLoginTime;
	}

	public String getLastestLoginIp() {
		return lastestLoginIp;
	}

	public void setLastestLoginIp(String lastestLoginIp) {
		this.lastestLoginIp = lastestLoginIp;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}
