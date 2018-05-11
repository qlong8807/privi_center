/**
 * 
 */
package com.xa.jans.utils;

/**
 * @author zyl
 * @date 2016年5月25日
 * 
 */
public class Constants {
	
	public static final String NO_EXCEPTION_CODE  = "0001";

	public static final String SELECT_TYPE = "SELECT";
	
	public static final String INSERT_TYPE = "INSERT";
	
	public static final String UPDATE_TYPE = "UPDATE";
	
	public static final String DELETE_TYPE = "DELETE";
	
	public static final String SESSION_USER = "session_user";
	
	public static final String SUCESS_STATE = "true";
	
	public static final String ERROR_STATE = "false";
	
	public static final String ERROR_TIP = "系统未知错误";
	
	public static final String VISITOR = "guest";
	
	
	public static final String LOGIN_SIGN = "LOGIN_SIGN";
	public static final String LOGIN_SUCCESS = "LOGIN_SUCCESS";
	
	public static final String DELETE_SUCCESS = "success";
	public static final String DELETE_ERROR = "删除失败";
	
    public static final String GBK_ENCODE_FORMATE = "GBK";
	
	
	/**
	 * 正则-日期<br>
	 */
	public static final String RGX_DATE = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";
	/**
	 * 正则-手机
	 */
	public static final String RGX_MOBILE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	
	 /** 
     * 邮箱 
     */  
    public static final String EMAIL_REGEX="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";  

	
}
