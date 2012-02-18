package weibocon.org.data;

import java.util.Date;

public class LoginUser {
	private Integer Uid;
	private String AccessToken;
	private String AccessSecret;
	private Boolean IsOnline;
	private Date LastLogOut;
	private Date CurrentLogin;
	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return Uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		Uid = uid;
	}
	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return AccessToken;
	}
	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		AccessToken = accessToken;
	}
	/**
	 * @return the accessSecret
	 */
	public String getAccessSecret() {
		return AccessSecret;
	}
	/**
	 * @param accessSecret the accessSecret to set
	 */
	public void setAccessSecret(String accessSecret) {
		AccessSecret = accessSecret;
	}
	/**
	 * @return the isOnline
	 */
	public Boolean getIsOnline() {
		return IsOnline;
	}
	/**
	 * @param isOnline the isOnline to set
	 */
	public void setIsOnline(Boolean isOnline) {
		IsOnline = isOnline;
	}
	/**
	 * @return the lastLogOut
	 */
	public Date getLastLogOut() {
		return LastLogOut;
	}
	/**
	 * @param lastLogOut the lastLogOut to set
	 */
	public void setLastLogOut(Date lastLogOut) {
		LastLogOut = lastLogOut;
	}
	/**
	 * @return the currentLogin
	 */
	public Date getCurrentLogin() {
		return CurrentLogin;
	}
	/**
	 * @param currentLogin the currentLogin to set
	 */
	public void setCurrentLogin(Date currentLogin) {
		CurrentLogin = currentLogin;
	}

}
