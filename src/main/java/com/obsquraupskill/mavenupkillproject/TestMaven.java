package com.obsquraupskill.mavenupkillproject;

public class TestMaven {

	public static void main(String[] args) throws Exception {
		 System.out.println(ExcelRead.readStringData(0,0));
		 double d = ExcelRead.readNumericData(0,1);
		 System.out.println(d);
	}
}
