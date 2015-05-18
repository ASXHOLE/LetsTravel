package com.bean;

public class LoginVerification {
	private String logName="admin";
	private String logPsw="admin";
	public Boolean LoginVerify(String logName,String logPsw){
		if(logName.equals(this.logName)&&logPsw.equals(this.logPsw)){
			return true;
		}else{
			return false;
		}
	}
}
