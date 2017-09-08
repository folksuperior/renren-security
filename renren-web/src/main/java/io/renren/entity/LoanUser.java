package io.renren.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;*/

//@Table(name = "user")
public class LoanUser implements Serializable{

	private static final long serialVersionUID =1L;
   // @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String accountId;

    private String userName;

    private Date updateTime;

    private String createTime;
    
    //@JsonIgnore
    private String passWord;

    private String mobile;
    
    private Integer status;

    private String lockStatus;
    
    private String inviteCode;
    
    private String weixinUrl;
    
    private String weixinKey;
    
    private String deviceToken;
    
    private String deviceInfo;
    
    private Integer recommendUserId;
    
    private Integer level;
    
    private Date lockTime;
    
    private Integer userType;
    
    private String regIp;
    
    private String agentId;
    
    private Integer apptype;
    
    private String userSource;
    
    private String investCode;
    
    private String bdUserCode;
    
    //@Transient
    private BigDecimal tendAmount;
    
    //@Transient
    private String activityCode;

    //@Transient
    private int phoneStatus;
    //@Transient
    private int faceStatus;
    //@Transient
    private int isEntrust;//是否委托扣款,1、是 2、否
    //@Transient
    private int emailStatus;
    //@Transient
    private int accountStatus;
    //@Transient
    private int creditStatus;
    //@Transient
    private int safequestionStatus;
    //@Transient
    private int videoStatus;
    //@Transient
    private int vipStatus;
    //@Transient
    private String isBaseInfo;
    //@Transient
    private int isPassword;//是否设置交易密码,1、是 2、否
    //@Transient
    private String realName;
    //@Transient
    private String isOverdue;//身份证过期状态：0 过期  1 未过期
    //@Transient
    private String isLegal;//年龄是否合法：0 不合法 1 合法
    //@Transient
    private String isLive;
    //@Transient
    private String isActivate;//是否激活 1.已激活 2.未激活
    //@Transient
    private String isBankCard;//是否绑卡,1、是 2、否
    //@Transient
    private String isIdCard;//是否实名,1、是 2、否
    //@Transient
    private String isPhoneStatus;//是否验证手机,1、是 2、否
    //@Transient
    private String isSinaUser;//是否是新浪用户  0、否 1、是
    //@Transient
    private String isOpenAccount;//新网是否已经开户
    //@Transient
    private String isAuthorized;//新网是否已授权  0 否  1 是
    
    //@Transient
    private Integer sesameCredStatus;//芝麻佂信授权 0 否 1 是
    //@Transient
    private int juxinliCredStatus;//聚信立征信验证 0 未验证 1 已验证
    
    //@Transient
    private int creditCardStatus;//信用卡认证 0 未验证 1 已验证

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

	public String getWeixinUrl() {
		return weixinUrl;
	}

	public void setWeixinUrl(String weixinUrl) {
		this.weixinUrl = weixinUrl;
	}

	public String getWeixinKey() {
		return weixinKey;
	}

	public void setWeixinKey(String weixinKey) {
		this.weixinKey = weixinKey;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public Integer getRecommendUserId() {
		return recommendUserId;
	}

	public void setRecommendUserId(Integer recommendUserId) {
		this.recommendUserId = recommendUserId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Date getLockTime() {
		return lockTime;
	}

	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public Integer getApptype() {
		return apptype;
	}

	public void setApptype(Integer apptype) {
		this.apptype = apptype;
	}

	public String getUserSource() {
		return userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}

	public String getInvestCode() {
		return investCode;
	}

	public void setInvestCode(String investCode) {
		this.investCode = investCode;
	}

	public String getBdUserCode() {
		return bdUserCode;
	}

	public void setBdUserCode(String bdUserCode) {
		this.bdUserCode = bdUserCode;
	}

	public BigDecimal getTendAmount() {
		return tendAmount;
	}

	public void setTendAmount(BigDecimal tendAmount) {
		this.tendAmount = tendAmount;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public int getPhoneStatus() {
		return phoneStatus;
	}

	public void setPhoneStatus(int phoneStatus) {
		this.phoneStatus = phoneStatus;
	}

	public int getFaceStatus() {
		return faceStatus;
	}

	public void setFaceStatus(int faceStatus) {
		this.faceStatus = faceStatus;
	}

	public int getIsEntrust() {
		return isEntrust;
	}

	public void setIsEntrust(int isEntrust) {
		this.isEntrust = isEntrust;
	}

	public int getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(int emailStatus) {
		this.emailStatus = emailStatus;
	}

	public int getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	public int getCreditStatus() {
		return creditStatus;
	}

	public void setCreditStatus(int creditStatus) {
		this.creditStatus = creditStatus;
	}

	public int getSafequestionStatus() {
		return safequestionStatus;
	}

	public void setSafequestionStatus(int safequestionStatus) {
		this.safequestionStatus = safequestionStatus;
	}

	public int getVideoStatus() {
		return videoStatus;
	}

	public void setVideoStatus(int videoStatus) {
		this.videoStatus = videoStatus;
	}

	public int getVipStatus() {
		return vipStatus;
	}

	public void setVipStatus(int vipStatus) {
		this.vipStatus = vipStatus;
	}

	public String getIsBaseInfo() {
		return isBaseInfo;
	}

	public void setIsBaseInfo(String isBaseInfo) {
		this.isBaseInfo = isBaseInfo;
	}

	public int getIsPassword() {
		return isPassword;
	}

	public void setIsPassword(int isPassword) {
		this.isPassword = isPassword;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIsOverdue() {
		return isOverdue;
	}

	public void setIsOverdue(String isOverdue) {
		this.isOverdue = isOverdue;
	}

	public String getIsLegal() {
		return isLegal;
	}

	public void setIsLegal(String isLegal) {
		this.isLegal = isLegal;
	}

	public String getIsLive() {
		return isLive;
	}

	public void setIsLive(String isLive) {
		this.isLive = isLive;
	}

	public String getIsActivate() {
		return isActivate;
	}

	public void setIsActivate(String isActivate) {
		this.isActivate = isActivate;
	}

	public String getIsBankCard() {
		return isBankCard;
	}

	public void setIsBankCard(String isBankCard) {
		this.isBankCard = isBankCard;
	}

	public String getIsIdCard() {
		return isIdCard;
	}

	public void setIsIdCard(String isIdCard) {
		this.isIdCard = isIdCard;
	}

	public String getIsPhoneStatus() {
		return isPhoneStatus;
	}

	public void setIsPhoneStatus(String isPhoneStatus) {
		this.isPhoneStatus = isPhoneStatus;
	}

	public String getIsSinaUser() {
		return isSinaUser;
	}

	public void setIsSinaUser(String isSinaUser) {
		this.isSinaUser = isSinaUser;
	}

	public String getIsOpenAccount() {
		return isOpenAccount;
	}

	public void setIsOpenAccount(String isOpenAccount) {
		this.isOpenAccount = isOpenAccount;
	}

	public String getIsAuthorized() {
		return isAuthorized;
	}

	public void setIsAuthorized(String isAuthorized) {
		this.isAuthorized = isAuthorized;
	}

	public Integer getSesameCredStatus() {
		return sesameCredStatus;
	}

	public void setSesameCredStatus(Integer sesameCredStatus) {
		this.sesameCredStatus = sesameCredStatus;
	}

	public int getJuxinliCredStatus() {
		return juxinliCredStatus;
	}

	public void setJuxinliCredStatus(int juxinliCredStatus) {
		this.juxinliCredStatus = juxinliCredStatus;
	}

	public int getCreditCardStatus() {
		return creditCardStatus;
	}

	public void setCreditCardStatus(int creditCardStatus) {
		this.creditCardStatus = creditCardStatus;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", accountId=" + accountId + ", userName=" + userName + ", updateTime=" + updateTime
				+ ", createTime=" + createTime + ", passWord=" + passWord + ", mobile=" + mobile + ", status=" + status
				+ ", lockStatus=" + lockStatus + ", inviteCode=" + inviteCode + ", weixinUrl=" + weixinUrl
				+ ", weixinKey=" + weixinKey + ", deviceToken=" + deviceToken + ", deviceInfo=" + deviceInfo
				+ ", recommendUserId=" + recommendUserId + ", level=" + level + ", lockTime=" + lockTime + ", userType="
				+ userType + ", regIp=" + regIp + ", agentId=" + agentId + ", apptype=" + apptype + ", userSource="
				+ userSource + ", investCode=" + investCode + ", bdUserCode=" + bdUserCode + ", tendAmount="
				+ tendAmount + ", activityCode=" + activityCode + ", phoneStatus=" + phoneStatus + ", faceStatus="
				+ faceStatus + ", isEntrust=" + isEntrust + ", emailStatus=" + emailStatus + ", accountStatus="
				+ accountStatus + ", creditStatus=" + creditStatus + ", safequestionStatus=" + safequestionStatus
				+ ", videoStatus=" + videoStatus + ", vipStatus=" + vipStatus + ", isBaseInfo=" + isBaseInfo
				+ ", isPassword=" + isPassword + ", realName=" + realName + ", isOverdue=" + isOverdue + ", isLegal="
				+ isLegal + ", isLive=" + isLive + ", isActivate=" + isActivate + ", isBankCard=" + isBankCard
				+ ", isIdCard=" + isIdCard + ", isPhoneStatus=" + isPhoneStatus + ", isSinaUser=" + isSinaUser
				+ ", isOpenAccount=" + isOpenAccount + ", isAuthorized=" + isAuthorized + ", sesameCredStatus="
				+ sesameCredStatus + ", juxinliCredStatus=" + juxinliCredStatus + ", creditCardStatus="
				+ creditCardStatus + "]";
	}
    
    
}