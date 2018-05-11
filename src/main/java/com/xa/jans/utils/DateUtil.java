/**   
 *@Title: DateUtil.java 
 *@Package com.cyber.framework.tools 
 *@Description: TODO(用一句话描述该文件做什么) 
 *@author 123774135@qq.com   
 *@date 2017年1月30日 下午8:35:19 
 *@version V1.0   
 */
package com.xa.jans.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @ClassName: DateUtil
 * @author 123774135@qq.com
 * @date 2017年1月30日 下午8:35:19
 */
public class DateUtil {

	private static Logger logger = LoggerFactory.getLogger(DateUtil.class);

	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static String format1 = "yyyy-MM-dd HH:mm:ss";
	/**
	 * yyyy-MM-dd
	 */
	public static String format2 = "yyyy-MM-dd";
	/**
	 * yyyy/MM/dd
	 */
	public static String format3 = "yyyy/MM/dd";
	/**
	 * yyyyMMddHHmmss
	 */
	public static String format4 = "yyyyMMddHHmmss";
	/**
	 * yyyyMMdd
	 */
	public static String format5 = "yyyyMMdd";
	/**
	 * yyyyMM
	 */
	public static String format6 = "yyyyMM";

	/**
	 * HHmmss
	 */
	public static String format_time1 = "HHmmss";
	/**
	 * HH:mm:ss
	 */
	public static String format_time2 = "HH:mm:ss";

	public static String now(String dateForomate) {
		SimpleDateFormat formate = new SimpleDateFormat(dateForomate);
		return formate.format(new Date());
	}

	/**
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Date parseDate(String date, String pattern) {
		try {
			DateFormat df = new SimpleDateFormat(pattern);
			Date parse = df.parse(date);
			return parse;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据指定的规则返回字符串
	 * 
	 * @param pattern
	 * @return
	 */
	public static String getDateString(String pattern) {
		try {
			DateFormat df = new SimpleDateFormat(pattern);
			String format = df.format(new Date());
			return format;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 比较日期大小
	 * d1>d2=1 d1<d2=-1 d1=d2=0
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static int compare_date(Date d1, Date d2) {
		try {
			if (d1.getTime() > d2.getTime()) {
				return 1;
			} else if (d1.getTime() < d2.getTime()) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}

	public static Date toDate(String date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date parse = null;
		try {
			parse = sdf.parse(date);
		} catch (ParseException e) {
			logger.error("日期解析错误:" + date + ",format:" + format);
			e.printStackTrace();
		}
		return parse;
	}

	/**
	 * 获取date所在星期的星期一
	 * 
	 * @param date
	 * @param format
	 *            返回的格式
	 * @return
	 */
	public static String getMonDay(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
		Calendar c = Calendar.getInstance(Locale.CHINA);
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setTimeInMillis(date.getTime());
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		// System.out.println("周一时间:"+sdf.format(c.getTime()));
		return sdf.format(c.getTime());
	}

	/**
	 * 获取date所在星期的星期天
	 * 
	 * @param date
	 * @param format
	 *            返回的格式
	 * @return
	 */
	public static String getSunDay(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
		Calendar c = Calendar.getInstance(Locale.CHINA);
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setTimeInMillis(date.getTime());
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		// System.out.println("周天时间:"+sdf.format(c.getTime()));
		return sdf.format(c.getTime());
	}

	public static int compare_str_date(String date1, String date2, String format) {
		DateFormat df = new SimpleDateFormat(format);
		try {
			Date dt1 = df.parse(date1);
			Date dt2 = df.parse(date2);
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}

	/**
	 * @param sDate
	 * @param format
	 * @return 字符串格式的日期
	 */
	public static String getStringDate(Date sDate, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(sDate);
	}

	// 根据当前日期获取本月最后一天
	public static String getLastDayOfMonth(String date, String format) {
		Date sDate = parseDate(date, format);
		Calendar cDay1 = Calendar.getInstance();
		cDay1.setTime(sDate);
		final int lastDay = cDay1.getActualMaximum(Calendar.DAY_OF_MONTH);
		Date lastDate = cDay1.getTime();
		lastDate.setDate(lastDay);
		return getStringDate(lastDate, format);
	}

	// 根据当前日期获取本月第一天
	public static String getFirstDayOfMonth(String date, String format) {
		Date sDate = parseDate(date, format);
		Calendar cDay1 = Calendar.getInstance();
		cDay1.setTime(sDate);
		final int firstDay = cDay1.getActualMinimum(Calendar.DAY_OF_MONTH);
		Date lastDate = cDay1.getTime();
		lastDate.setDate(firstDay);
		return getStringDate(lastDate, format);
	}

	public static String getPastDate(int past, String format) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
		Date today = calendar.getTime();
		SimpleDateFormat date = new SimpleDateFormat(format);
		String result = date.format(today);
		return result;
	}

	/**
	 * 获取两天之间相隔的天数
	 * @param day1 早点的日期
	 * @param day2 晚点的日期
	 * @return
	 */
	public static int getBetweenDays(String day1, String day2) {
		SimpleDateFormat sdf = new SimpleDateFormat(format5);
		Calendar cal = Calendar.getInstance();
		long time1 = 0;
		long time2 = 0;
		try {
			cal.setTime(sdf.parse(day1));
			time1 = cal.getTimeInMillis();
			cal.setTime(sdf.parse(day2));
			time2 = cal.getTimeInMillis();
		} catch (ParseException e) {
			logger.info(e.getMessage(),"日期格式有误");
			e.printStackTrace();
		}
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}
	
	
	/**
	 * 获取两天之间相隔的月数
	 * @param day1 早点的日期
	 * @param day2 晚点的日期
	 * @return
	 */
	public static int getBetweenMonths(String day1, String day2) {
		 try {
		SimpleDateFormat sdf = new SimpleDateFormat(format6);
        Calendar bef = Calendar.getInstance();
        Calendar aft = Calendar.getInstance();
		bef.setTime(sdf.parse(day1));
        aft.setTime(sdf.parse(day2));
        int result = aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH);
        int month = (aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR)) * 12;
        return Integer.parseInt(String.valueOf(month + result+1));
		 } catch (ParseException e) {
			return 0;
		 }
	}
	
	public static int getPartflag(String tradeDate) {
		Calendar ca = Calendar.getInstance();
		int partflag = 0;
		try {
			ca.setTime(parseDate(tradeDate, format5));
			// 得到当前日期是这一年中的第几天
			int days = ca.get(Calendar.DAY_OF_YEAR);
			// 数据分区标志，从0 开始
			partflag = days - 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}

		return partflag;
	}
	
	/**
	 * 获得某一天之前的几天
	 * @param date 某一天
	 * @param period 前几天
	 * @return 前几天的Date格式
	 * 例如：date=20170930,period=3,return=20170927
	 */
	public static Date getADayBefore(Date date,int period) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DATE,cal.get(Calendar.DATE)-period);  
		return cal.getTime();
	}
	/**
	 * 获得某一天之后的几天
	 * @param date 某一天
	 * @param period 前几天
	 * @return 前几天的Date格式
	 * 例如：date=20170915,period=3,return=20170918
	 */
	public static Date getADayAfter(Date date,int period) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DATE,cal.get(Calendar.DATE)+period);  
		return cal.getTime();
	}
	
	public static Date addDays(Date date, int days) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		c.set(Calendar.DATE, c.get(Calendar.DATE) + days);

		return c.getTime();
	}
	
	//获取前?天日期
	public static String getDaysLater(int days, String formatStr) {
		Date date = new Date();
		return formatDate(addDays(date, days), formatStr);
	}
	
	//按照指定格式格式化日期
	public static String formatDate(Date date, String formatStr) {
		String dateString = "";
		SimpleDateFormat sdf = null;

		if (formatStr != null && !formatStr.equals("")) {
			sdf = new SimpleDateFormat(formatStr);
		} else {
			sdf = new SimpleDateFormat("yyyyMMdd");
		}
		dateString = sdf.format(date);
		return dateString;
	}
	
	//当前年份加n年
	public static String getCurrentYearAddN(int n) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, n);
		Date date = cal.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat(format5);
		return dateFormat.format(date);
	}
	
	
	/***
	 * 日期补0 2010-01-2 ==>2010-01-02 
	 * 支持/-混输
	 * @author mjf
	 * @date 2017年11月30日	
	 *
	 * @param sDate
	 * @return 标准日期格式： yyyy-MM-dd。
	 * @throws ParseException
	 */
	public static String dateZeroFill(String sDate) throws Exception{
		sDate = sDate.replaceAll("/", "-");
		Date date = DateUtil.SDF_YYYY_MM_DD.parse(sDate);
		sDate = DateUtil.SDF_YYYY_MM_DD.format(date);System.out.println(sDate+" "+ DateUtil.SDF_YYYY_MM_DD);
		return sDate;	
	}
	
	/**
	 * 校验日期类型。
	 * 
	 * */
	public static boolean validateDateType(String sDate) {
		return sDate.indexOf("/") != -1 ? false : true;
	}
	
	
	/**
	 * SimpleDateFormat<br/>
	 * YYYY-MM-DD
	 */
	public static  SimpleDateFormat SDF_YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");
	public static void main(String[] args) {
		/*
		 * System.out.println(getMonDay(new Date(), "yyyyMMdd"));
		 * System.out.println(getSunDay(new Date(), "yyyyMMdd"));
		 * System.out.println(compare_str_date("20170621","20170601", "yyyyMMdd"));
		 */

//		System.out.println(getDateString(DateUtil.format_time2));
		System.out.println(getADayBefore(new Date(), 3));
		System.out.println(getADayBefore(new Date(), 30));
		System.out.println(getADayBefore(new Date(), 300));
		System.out.println(getADayBefore(new Date(), 500));
		System.out.println(getDaysLater(-1, "yyyyMMdd"));
		System.out.println(getPartflag("20171030"));
	}
}
