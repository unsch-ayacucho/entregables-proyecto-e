package pe.edu.unsch.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Profile;


@Entity
@Table(name = "account_profile", catalog = "bdentrada")
public class AccountProfile implements java.io.Serializable {

	private Integer idaccountprofile;
	private Account account;
	private Profile profile;
	private Byte status;

	public AccountProfile() {
	}

	public AccountProfile(Account account, Profile profile) {
		this.account = account;
		this.profile = profile;
	}

	public AccountProfile(Account account, Profile profile, Byte status) {
		this.account = account;
		this.profile = profile;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idaccountprofile", unique = true, nullable = false)
	public Integer getIdaccountprofile() {
		return this.idaccountprofile;
	}

	public void setIdaccountprofile(Integer idaccountprofile) {
		this.idaccountprofile = idaccountprofile;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idaccount", nullable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idprofile", nullable = false)
	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}
