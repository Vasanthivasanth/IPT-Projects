package com.utility;

public class ConfigReader {

private	 String chromeLaunch=PropertyFileReader.getAPropertyFiles().getProperty("chromeLaunch");
private	  String launchUrl=PropertyFileReader.getAPropertyFiles().getProperty("launchUrl");
private	 String Mobileno=PropertyFileReader.getAPropertyFiles().getProperty("Mobileno");
private	  String cardno=PropertyFileReader.getAPropertyFiles().getProperty("cardno");
private	 String expdate=PropertyFileReader.getAPropertyFiles().getProperty("expdate");
private	  String cvv=PropertyFileReader.getAPropertyFiles().getProperty("cvv");
public  String getChromeLaunch() {
	return chromeLaunch;
}
public  String getLaunchUrl() {
	return launchUrl;
}
public  String getMobileno() {
	return Mobileno;
}
public  String getCardno() {
	return cardno;
}
public  String getExpdate() {
	return expdate;
}
public  String getCvv() {
	return cvv;
}
}
