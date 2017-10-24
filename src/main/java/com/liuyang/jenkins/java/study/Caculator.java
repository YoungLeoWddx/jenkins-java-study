package com.liuyang.jenkins.java.study;


/**
 * <p>计算器类</p>
 * @author 柳杨
 * @version V1.0.0 
 * created on 2017年10月14日  15:13:05
 */
public class Caculator {
	/**JAN 一月*/
	public static final int JAN = 1;
	/**FEBR 二月*/
	public static final int FEBR = 2;
	/**MAR 三月*/
	public static final int MAR = 3;
	/**APRI 四月*/
	public static final int APRI = 4;
	/**MAY 五月*/
	public static final int MAY = 5;
	/**JUNE 六月*/
	public static final int JUNE = 6;
	/**JULY 七月*/
	public static final int JULY = 7;
	/**AUG 八月*/
	public static final int AUG = 8;
	/**SEMP 九月*/
	public static final int SEMP = 9;
	/**OCT 十月*/
	public static final int OCT = 10;
	/**NOV 十一月*/
	public static final int NOV = 11;
	/**DEC 十二月*/
	public static final int DEC = 12;
	
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
		case MAR:
		case APRI:
		case MAY:
			season = "spring";
			break;
		case JUNE:
		case JULY:
		case AUG:
			season = "summer";
			break;
		case SEMP:
		case OCT:
		case NOV:
			season = "autumn";
			break;
		case DEC:
		case JAN:
		case FEBR:
			season = "winter";
			break;
		default:
			season = "unknown";
			break;
		}
		return season;
	}
	
	/**
	 * 测试空指针异常检查
	 */
	public void testNull(){
		String abc = Math.abs(-1) > 2 ? "abc" : null;
		System.out.println(abc.length());
	}
}
