package com.practice.SeleniumTest;

import org.apache.commons.lang3.StringUtils;

public class stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String keyString=null; String key="/networks/0/links/networkLinks/logical/circuits/SSONMediaChannels/&/SSONMediaCarriers/0";

		String keyStringarr[]=key.split("/");
		if(StringUtils.isNumeric(keyStringarr[keyStringarr.length-1])) { keyString=keyStringarr[keyStringarr.length -2];

	

		}

		else {

		keyString=keyStringarr[keyStringarr.length-1];
		}
		System.out.println(":"+keyString);
	}

}
