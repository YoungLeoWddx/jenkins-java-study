package com.liuyang.jenkins.java.study;


/**
 * Description:
 * 计算器类
 * @author Leo
 * @version V1.0  
 * created on 2017年10月14日下午3:13:05
 */
public class Caculator {
	/**
	 * 加法运算
	 * @param a  第一个被加数
	 * @param b  第二个被加数
	 * @return  返回求和的结果
	 */
	public int add(int a,int b){
		return a + b;
	}
	
	/**
	 * 减法运算
	 * @param a 被减数
	 * @param b 减数
	 * @return 返回求差的结果
	 */
	public int min(int a,int b){
		if(a < b){
			return a;
		}
		
		return b;
	}
	
	/**
	 * 求两个整数中的最大值
	 * @param a 比较数a
	 * @param b 比较数b
	 * @return 返回最大的结果
	 */
	public int max(int a, int b){
		if(a > b){
			return a;
		}
		return b;
	}
	
	/**
	 * 根据输入的月份数字，返回月份的字符串
	 * @param month 月份的数字
	 * @return 返回对应月份数字的字符串
	 */
	public String toSeason(int month){
		String season = null;
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "autumn";
			break;
		case 12:
		case 1:
		case 2:
			season = "winter";
			break;
		default:
			season = "unknown";
		}
		return season;
	}
}
