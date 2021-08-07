package com.kh.model.vo;

import java.io.Serializable;

// PC방 회원 정보 관리 클래스
public class PcMember implements Serializable{

	private static final long serialVersionUID = 6898540478741072552L;
	private String userId;		// 아이디
	private String userName;	// 이름
	private String userPw;		// 비밀번호
	private int userBirth;		// 생년월일
	private char gender;		// 성별
	private String userPhone;	// 핸드폰번호
	private String userEmail;	// 이메일
	
	public PcMember() {}

	public PcMember(String userId, String userName, String userPw, int userBirth, char gender, String userPhone,
			String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPw = userPw;
		this.userBirth = userBirth;
		this.gender = gender;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(int userBirth) {
		this.userBirth = userBirth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	@Override
	public String toString() {
		return "\nPcMember [userId=" + userId + ", userName=" + userName + ", userPw=" + userPw + ", userBirth="
				+ userBirth + ", gender=" + gender + ", userPhone=" + userPhone + ", userEmail=" + userEmail + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gender;
		result = prime * result + userBirth;
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPhone == null) ? 0 : userPhone.hashCode());
		result = prime * result + ((userPw == null) ? 0 : userPw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PcMember other = (PcMember) obj;
		if (gender != other.gender)
			return false;
		if (userBirth != other.userBirth)
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPhone != other.userPhone)
			return false;
		if (userPw == null) {
			if (other.userPw != null)
				return false;
		} else if (!userPw.equals(other.userPw))
			return false;
		return true;
	}

}
