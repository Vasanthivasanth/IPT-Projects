package com.utility;

public class ConfigReader {

private	static String chromeLaunch=PropertyFileReader.getAPropertyFiles().getProperty("chromeLaunch");
private	 static String launchUrl=PropertyFileReader.getAPropertyFiles().getProperty("launchUrl");
private	static String Mobileno=PropertyFileReader.getAPropertyFiles().getProperty("Mobileno");
private	 static String cardno=PropertyFileReader.getAPropertyFiles().getProperty("cardno");
private	static String expdate=PropertyFileReader.getAPropertyFiles().getProperty("expdate");
private	 static String cvv=PropertyFileReader.getAPropertyFiles().getProperty("cvv");
public static String getChromeLaunch() {
	return chromeLaunch;
}
public static String getLaunchUrl() {
	return launchUrl;
}
public static String getMobileno() {
	return Mobileno;
}
public static String getCardno() {
	return cardno;
}
public static String getExpdate() {
	return expdate;
}
public static String getCvv() {
	return cvv;
}
}
