package com.nht.moniwebsvc.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Vector;


public class DateTime 
{
	static{
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
	}

	public static String dateSep = "-";
	public static String timeSep = ":";
	public static String dateSep_1 = ".";

	private static final String[] weekDay = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public DateTime() {
	}  

	public static String plusZero(String str){
		if (str.length() == 1) {
			str = "0" + str;
		}
		return str;
	}
	
	public static String changePattern(String date, String pattern){
		if(date == null){
			//skip
			date = "";
		}else if(date.length() == 8){
			date = date.substring(0,4) + pattern + date.substring(4,6) + pattern + date.substring(6,8);
		}else if(date.length() == 6){
			date = date.substring(0,2) + pattern + date.substring(2,4) + pattern + date.substring(4,6);						
		}else if(date.length() == 10){
			date = date.substring(0,4) + pattern + date.substring(5,7) + pattern + date.substring(8,10);
		}
	    return date;
	}			
	
	/**
	 *
	 * For example, String time = DateTime.getFormatString("yyyy-MM-dd HH:mm:ss");
	 *
	 * @param java.lang.String pattern  "yyyy, MM, dd, HH, mm, ss and more"
	 * @return formatted string representation of current day and time with  your pattern.
	 */
	public static int getNumberByPattern(String pattern) 
	{
		java.text.SimpleDateFormat formatter =
			new java.text.SimpleDateFormat(pattern, java.util.Locale.KOREA);
		String dateString = formatter.format(new java.util.Date());
		return Integer.parseInt(dateString);
	}

	/**
	* 현재날짜의 년도를 구하는 Method
	*
	* @param
	* @exception
	* @author
	*/
	public static int getYear() 
	{
		return getNumberByPattern("yyyy");
	}

	/**
	* 현재날짜의 월을 구하는 Method
	*
	* @param
	* @exception
	* @author
	*/
	public static int getMonth() 
	{
		return getNumberByPattern("MM");
	}

	/**
	* 현재날짜의 일자를 구하는 Method
	*
	* @param
	* @exception
	* @author
	*/
	public static int getDay() 
	{
		return getNumberByPattern("dd");
	}

	/**
	* 주중 요일을 구하는 Method
	*/
	public static String getDayOfWeek()
	{
		Calendar c = Calendar.getInstance();		
		return weekDay[c.get(java.util.Calendar.DAY_OF_WEEK) - 1];
	}

	/**
	* 특정일의 요일을 구하는 Method
	*/
	public static String getDayOfWeek(int year, int month, int day) throws ParseException 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Calendar c = Calendar.getInstance();
		c.setTime( dateFormat.parse(year + "-" + month + "-" + day) );
		
		return weekDay[c.get(java.util.Calendar.DAY_OF_WEEK) - 1];
	}

	/**
	* 현재 시각의 시간를 구하는 Method
	*
	* @param
	* @exception
	* @author
	*/
	public static int getHour() 
	{
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.HOUR_OF_DAY);
	}

	/**
	* 현재 시각의 분을 구하는 Method
	*
	* @param
	* @exception
	* @author
	*/
	public static int getMinute() 
	{
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.MINUTE);
	}

	/**
	* 현재시각의 초을 구하는 Method
	*
	* @param
	* @exception
	* @author
	*/
	public static int getSecond() 
	{
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.SECOND);
	}

	/**
	* YYY-MM-DD 형태의 스트링을 구하는 Method
	* @param pattern String
	* @exception
	* @author
	*/
	public static String getDateString() 
	{
		return getYear() + "-" + getMonth() + "-" + getDay();
	}

	/**
	* YYY-MM-DD 형태의 스트링을 Pattern에 의해 구하는 Method
	* Pattern 값에 따른 결과 반영
	* @param pattern String
	* @exception
	* @author
	*/
	public static String getDateString(String pattern) 
	{
		String month = getMonth() + "";
		String day = getDay() + "";

		if (month.length() == 1) {
			month = "0" + month;
		}
		if (day.length() == 1) {
			day = "0" + day;
		}

		return getYear() + pattern + month + pattern + day;
	}

	/**
	* 년/월/일/시/분/초 스트링를 구하는 Method
	*
	* @param
	* @exception
	* @author
	*/
	public static String getDateTimeString() 
	{
		String month = getMonth()  + "";
		String day   = getDay()    + "";
		String hour  = getHour()   + "";
		String min   = getMinute() + "";
		String sec   = getSecond() + "";

		if (month.length() == 1) month = "0" + month;
		if (day.length()   == 1) day   = "0" + day  ;
		if (hour.length()  == 1) hour  = "0" + hour ;
		if (min.length()   == 1) min   = "0" + min  ;
		if (sec.length()   == 1) sec   = "0" + sec  ;
		
		return getYear() + "" + month + "" + day + "" + hour + "" + min + sec;
	}

    /**
     * xx분 전후의 년월일시분초 스트링
     * @return
     */
	public static String getDateTimeStringBah(int gap) 
	{
		String month = getMonth()  + "";
		String day   = getDay()    + "";
		String hour  = getHour()   + "";
		String min   = getMinute() + "";
		String sec   = getSecond() + "";

        if(!"24".equals(hour) && gap > 0){
        	hour = Integer.toString(Integer.parseInt(hour) + 1);
        } else if(!"0".equals(hour) && gap < 0){
			hour = Integer.toString(Integer.parseInt(hour) - 1);        
        }

		if (month.length() == 1) month = "0" + month;
		if (day.length()   == 1) day   = "0" + day  ;
		if (hour.length()  == 1) hour  = "0" + hour ;
		if (min.length()   == 1) min   = "0" + min  ;
		if (sec.length()   == 1) sec   = "0" + sec  ;
		
		return getYear() + "" + month + "" + day + "" + hour + "" + min + sec;
	}

	/**
		* 주어진 년도가 윤년인지를 구하는 Method
		*
		* @param int year
		* @exception
		* @author
		*/
	public static boolean checkEmbolism(int year) 
	{
		int remain = 0;
		int remain_1 = 0;
		int remain_2 = 0;

		remain = year % 4;
		remain_1 = year % 100;
		remain_2 = year % 400;

		// the ramain is 0 when year is divided by 4;
		if (remain == 0) {
			// the ramain is 0 when year is divided by 100;
			if (remain_1 == 0) {
				// the remain is 0 when year is divided by 400;
				if (remain_2 == 0)
					return true;
				else
					return false;
			} else
				return true;
		}
		return false;
	}
	/**
	* 주어진 년,월의 일수를 구하는 Method
	*
	* @param    String year, String month
	* @exception
	* @author
	*/
	public static int getMonthDate(int year, int month) 
	{
		int[] dateMonth = new int[12];

		dateMonth[0] = 31;
		dateMonth[1] = 28;
		dateMonth[2] = 31;
		dateMonth[3] = 30;
		dateMonth[4] = 31;
		dateMonth[5] = 30;
		dateMonth[6] = 31;
		dateMonth[7] = 31;
		dateMonth[8] = 30;
		dateMonth[9] = 31;
		dateMonth[10] = 30;
		dateMonth[11] = 31;

		if (checkEmbolism(year)) {
			dateMonth[1] = 29;
		}

		int day = dateMonth[month - 1];

		return day;
	}

	public static String getMonthName(int month)
	{
		String[] months = {"1월", "2월", "3월", "4월", "5월", "6월",
			"7월", "8월", "9월", "10월", "11월", "12월"};
		
		return months[month-1];
	}
	
	/**
	 * 6자리 시간을 hh:mm or hh:mm:ss 으로 반환
	 * @param time 기준시간
	 * @param format (hh:mm, hh:mm:ss)
	 */
	public static String getDecodeTime(String datetime, String format) 
	{
		String result = null;
		if(datetime != null ||datetime.length() > 0 ){
			if(format == null || format.equals("hh:mm")){
				if(datetime.length() >= 4)
					result = datetime.substring(0,2) + ":" + datetime.substring(2,4);
				else
					result = "";
			}else if(format.equals("hh:mm:ss")){
				if(datetime.length() >= 6)
					result = datetime.substring(0,2) + ":" + datetime.substring(2,4) + ":" + datetime.substring(4,6);
				else
					result = "";
			}
		}
		return result;
	}

	/**
	 * 14자리(예 : 20020626142535)의 날짜를 2002-06-26 처럼 변환.
	 * Insert the method's description here.
	 * Creation date: (2002-06-26 오후 4:40:05)
	 * @param datetime java.lang.String
	 */
	public static String getDecodeDate(String datetime) 
	{
		return datetime.substring(0, 4)
			+ "-"
			+ datetime.substring(4, 6)
			+ "-"
			+ datetime.substring(6, 8);
	}

	public static String getDecodeDate(String datetime, String format) 
	{
		String result = "";
		if(datetime != null && datetime.length() == 8){
			result = datetime.substring(0, 4)
			+ format
			+ datetime.substring(4, 6)
			+ format
			+ datetime.substring(6, 8);
		}
		return result;
	}
	
	public static String getDateFormatDateTime(String datetime) 
	{
		String date = getDecodeDate(datetime);

		int time = Integer.parseInt(datetime.substring(8, 10));

		return date
			+ " "
			+ time
			+ ":"
			+ datetime.substring(10, 12)
			+ ":"
			+ datetime.substring(12);
	}

	public static String getCurrentTime(String format){
		return plusZero(getHour()+"") + format + plusZero(getMinute()+"") + format + plusZero(getSecond()+"");
	}
	
	public static Date convertStringToDate(String dateTime)
		throws ParseException 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		return dateFormat.parse(getDateFormatDateTime(dateTime));
	}
	
	public static int getFirstOfWeek(int year, int month, int day) throws ParseException 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar c = Calendar.getInstance();
		c.setTime( dateFormat.parse(year + "-" + month + "-" + day) );
		
		return c.get( java.util.Calendar.DAY_OF_WEEK );
	}
	
	
	
	/*
	 * @param java.util.Date Date value 
	 * @param String Formatter 
	 * @exception "" return 
	 * @author YHW 
	 * @date 2004/05/27
	 * 
	 * formatter -  ref. javadoc SimpleDateFormat
	 * 		ex) "yyyy-MM-dd HH:mm" is 2004-05-25 15:23  
	 * 		ex) "yyyyMMdd" is 20040525
	 */ 
	public static String getDateToFormatString(java.util.Date dDate , String stFormat){
		
		String stValue = "" ; 
		SimpleDateFormat formatDate = new SimpleDateFormat(stFormat);
		
		try {
			stValue = formatDate.format(dDate);		
		
		}catch(Exception e){
			e.printStackTrace() ;
		}
		
		// exception 발생후 리턴값은 "" 
		return stValue; 
			
	}
	
	public static String getCurrentDate(){
		String returnValue = "";
		
		Calendar cal = Calendar.getInstance();
		returnValue =  cal.get(Calendar.YEAR) + getDateToString(cal.get(Calendar.MONTH) + 1) + getDateToString(cal.get(Calendar.DAY_OF_MONTH));	
		return returnValue;
	}
	
	/*
	 * @param String formatted String value 
	 * @param String Formatter 
	 * @exception null return 
	 * @author YHW 
	 * @date 2004/05/27
	 * 
	 * formatted String value changed java.util.Date 
	 *
	 * formatter -  ref. javadoc SimpleDateFormat
	 * 		ex) "yyyy-MM-dd HH:mm" is 2004-05-25 15:23  
	 * 		ex) "yyyyMMdd" is 20040525
	 */	
	public static java.util.Date getFormatStringToDate(String stValue , String stFormat){
		
		java.util.Date dDate = null ;
		SimpleDateFormat formatDate = new SimpleDateFormat(stFormat);
		
		try{
			dDate = formatDate.parse(stValue);
		}catch(Exception e){
			e.printStackTrace();	
		}
		
		// exception 발생후 리턴값 null 
		return dDate; 
			
	}
	
	
    /**
     * 주어진 날짜의 주중 순번 sun = 1, sat = 7
     * @param sDate
     * @return 1
     */
    public static int getDayOfWeek(String sDate) {
        int n = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(sDate.substring(0, 4)),
                Integer.parseInt(sDate.substring(4, 6)) - 1, //월만 0부터 시작...
                Integer.parseInt(sDate.substring(6, 8)));
        n = cal.get(Calendar.DAY_OF_WEEK);
        return n;
    }
	
    /**
     * 주어진 날짜에 대한 그 주의 시작일(일), 종료일(토) 
     * @param sDate
     * @return 2004051620040522
     */
    public static String getThisWeek(String sDate) {
        String sLastWeek = null;
        int nDate = getDayOfWeek(sDate);
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(sDate.substring(0, 4)), 
                Integer.parseInt(sDate.substring(4, 6)) - 1,//월만 0부터 시작...
                Integer.parseInt(sDate.substring(6, 8)));
        cal.add(Calendar.DATE, - (nDate - 1));
        sLastWeek = cal.get(Calendar.YEAR) + getDateToString(cal.get(Calendar.MONTH) + 1);
        sLastWeek += getDateToString(cal.get(Calendar.DAY_OF_MONTH));
        cal.add(Calendar.DATE, 6);
        sLastWeek += cal.get(Calendar.YEAR) + getDateToString(cal.get(Calendar.MONTH) + 1);
        sLastWeek += getDateToString(cal.get(Calendar.DAY_OF_MONTH));
        return sLastWeek;
    }
	
    /**
     * 날자 2자리수 맞추기
     * @param sDate
     * @return 
     */
    public static String getDateToString(int sDate) {
        String str = null;
        if(sDate < 10) {
			str = "0" + sDate;
        }else{
			str = "" + sDate;
        }
        return str;
    }
    
    /**
	* 특정일의 요일을 구하는 Method
	*/
	public static String getDayOfWeekStr(String sDate)
	{
		return weekDay[getDayOfWeek(sDate) - 1];
	}

	/**
	 * 지정된 날짜에 날을 더한다. 
	 * @param dateTime
	 * @param addDAy
	 * @return
	 */
	public static String addDay(String dateTime, int addDAy){

		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		ParsePosition pos = new ParsePosition(0);
		java.util.Date date = formatter.parse(dateTime, pos);

		Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				cal.add(Calendar.DATE,addDAy);
		
		return cal.get(Calendar.YEAR) + getDateToString(cal.get(Calendar.MONTH) + 1) + getDateToString(cal.get(Calendar.DAY_OF_MONTH));

	}

	/**
	 * 지정된 날짜에 날을 더한다. 
	 * @param dateTime
	 * @param addDAy
	 * @return
	 */
	public static String addDay(Date date, int addDAy){

		Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				cal.add(Calendar.DATE,addDAy);
		
		return cal.get(Calendar.YEAR) + getDateToString(cal.get(Calendar.MONTH) + 1) + getDateToString(cal.get(Calendar.DAY_OF_MONTH));
	}
	
	/**
	 * 지정된 날짜에 날을 더한다. 
	 * @param dateTime
	 * @param addDAy
	 * @return
	 */
	/*public static String[] minusDayList(int minusDAy){
		
		Calendar cal = Calendar.getInstance();
				cal.add(Calendar.DATE, minusDAy);
				cal.get(Calendar.YEAR) + getDateToString(cal.get(Calendar.MONTH) + 1) + getDateToString(cal.get(Calendar.DAY_OF_MONTH));
				
		return ;
	}*/

	/**
	 *  특정 포맷의 날짜를 Date형으로 바꾼다.
	 * @param dateTime
	 * @param yyyyMMdd
	 * @return
	 */
	public static Date conversionDate(String dateTime, String format){
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		ParsePosition pos = new ParsePosition(0);
		java.util.Date date = formatter.parse(dateTime, pos);
		return date;
	}
	/**
	 * 지정된 날짜의 기간을 구한다
	 * @param dateTime
	 * @param addDAy
	 * @return
	 */
	public static int getBetweenDays(String startdate, String enddate)
    {
		try
        {
            int i = getBetweenDays(startdate) - getBetweenDays(enddate);
            return i;
        }
        catch(Exception e)
        {
            int j = 0;
            return j;
        }
    }
	
	public static int getBetweenDays(String strVal)
	{
        try
        {
            int j=0;
        	if(strVal.length() == 8) {
            	int year1 = Integer.parseInt(strVal.substring(0, 4));
            	int month1 = Integer.parseInt(strVal.substring(4, 6));
            	int day1 = Integer.parseInt(strVal.substring(6));
            	String sDate = getDateString("");
            	int year2 = Integer.parseInt(sDate.substring(0, 4));
            	int month2 = Integer.parseInt(sDate.substring(4, 6));
            	int day2 = Integer.parseInt(sDate.substring(6));
            	
            	Calendar calTemp = Calendar.getInstance();
                int M1 = month1 - 1;
                int M2 = month2 - 1;
                int sumDaysOfYears = ((year2 - year1) * 365 + getLeapMonthOfYear(year2)) - getLeapMonthOfYear(year1);
                calTemp.set(year2, M2, day2);
                int sumDaysOfYear2 = calTemp.get(6);
                calTemp.set(year1, M1, day1);
                int sumDaysOfYear1 = calTemp.get(6);
                int sum = (sumDaysOfYears + sumDaysOfYear2) - sumDaysOfYear1;
                j = sum;
            }
        	
            return j;
        }
        catch(Exception e)
        {
            int i = 0;
            return i;
        }
    }
	
	public static int getLeapMonthOfYear(int year)
    {
        return ((year - 1) / 4 - (year - 1) / 100) + (year - 1) / 400;
    }
	
	public static String getDate(String pattenrn){
		java.util.GregorianCalendar cal = new  java.util.GregorianCalendar();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattenrn); 
		return sdf.format(date);
	}
	

	/**
	 * check date string validation with the default format "yyyyMMdd".
	 * @param s date string you want to check with default format "yyyyMMdd".
     * @return date java.util.Date
	 */
	public static java.util.Date check(String s) throws java.text.ParseException {
		return check(s, "yyyyMMdd");
	}
	

	/**
	 * check date string validation with an user defined format.
	 * @param s date string you want to check.
	 * @param format string representation of the date format. For example, "yyyy-MM-dd".
     * @return date java.util.Date
	 */
	public static java.util.Date check(String s, String format) throws java.text.ParseException {
		if ( s == null )
			throw new java.text.ParseException("date string to check is null", 0);
		if ( format == null )
			throw new java.text.ParseException("format string to check date is null", 0);

		java.text.SimpleDateFormat formatter =
            new java.text.SimpleDateFormat (format, java.util.Locale.KOREA);
		java.util.Date date = null;
		try {
			date = formatter.parse(s);
		}
		catch(java.text.ParseException e) {
            /*
			throw new java.text.ParseException(
				e.getMessage() + " with format \"" + format + "\"",
				e.getErrorOffset()
			);
            */
            throw new java.text.ParseException(" wrong date:\"" + s +
            "\" with format \"" + format + "\"", 0);
		}

		if ( ! formatter.format(date).equals(s) )
			throw new java.text.ParseException(
				"Out of bound date:\"" + s + "\" with format \"" + format + "\"",
				0
			);
        return date;
	}
	/**
	 * return add month to date strings
	 * @param String date string
	 * @param int 더할 월수
	 * @return int 날짜 형식이 맞고, 존재하는 날짜일 때 월수 더하기
	 *           형식이 잘못 되었거나 존재하지 않는 날짜: java.text.ParseException 발생
	 */
    public static String addMonths(String s, int month) throws Exception {
        return addMonths(s, month, "yyyyMMdd");
    }

	/**
	 * return add month to date strings with user defined format.
	 * @param String date string
	 * @param int 더할 월수
	 * @param format string representation of the date format. For example, "yyyy-MM-dd".
	 * @return int 날짜 형식이 맞고, 존재하는 날짜일 때 월수 더하기
	 *           형식이 잘못 되었거나 존재하지 않는 날짜: java.text.ParseException 발생
	 */
    public static String addMonths(String s, int addMonth, String format) throws Exception {
 		java.text.SimpleDateFormat formatter =
		    new java.text.SimpleDateFormat (format, java.util.Locale.KOREA);
		java.util.Date date = check(s, format);

 		java.text.SimpleDateFormat yearFormat =
		    new java.text.SimpleDateFormat("yyyy", java.util.Locale.KOREA);
 		java.text.SimpleDateFormat monthFormat =
		    new java.text.SimpleDateFormat("MM", java.util.Locale.KOREA);
 		java.text.SimpleDateFormat dayFormat =
		    new java.text.SimpleDateFormat("dd", java.util.Locale.KOREA);
        int year = Integer.parseInt(yearFormat.format(date));
        int month = Integer.parseInt(monthFormat.format(date));
        int day = Integer.parseInt(dayFormat.format(date));

        month += addMonth;
        if (addMonth > 0) {
            while (month > 12) {
                month -= 12;
                year += 1;
            }
        } else {
            while (month <= 0) {
                month += 12;
                year -= 1;
            }
        }
 		java.text.DecimalFormat fourDf = new java.text.DecimalFormat("0000");
 		java.text.DecimalFormat twoDf = new java.text.DecimalFormat("00");
        String tempDate = String.valueOf(fourDf.format(year))
                         + String.valueOf(twoDf.format(month))
                         + String.valueOf(twoDf.format(day));
        java.util.Date targetDate = null;

        try {
            targetDate = check(tempDate, "yyyyMMdd");
        } catch(java.text.ParseException pe) {
            day = lastDay(year, month);
            tempDate = String.valueOf(fourDf.format(year))
                         + String.valueOf(twoDf.format(month))
                         + String.valueOf(twoDf.format(day));
            targetDate = check(tempDate, "yyyyMMdd");
        }

        return formatter.format(targetDate);
    }	

    public static ArrayList user_calendar(int year, int month){
 	   ArrayList cal = new ArrayList();
 	   int date = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
 	   int leafday = 28;
 	   if(year%4==0 && year/100!=0) leafday = 29;
 	   int [] months = {0, 31, leafday, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 	   Vector temp_vector = new Vector();
 	   for(int i=1; i<month; i++){
 		   date += months[i];
 	   }
 	   int weekday = 0;
 	   weekday = (date)%7;
 	   
 	   //System.out.println("weekday >> " + weekday);
 	   if(weekday != 0){
	 	   for(int i=0; i<weekday; i++){
	 		   temp_vector.addElement("");
	 	   }
 	   }
 	   int temp_weekday = weekday;
 	   //System.out.println("months[month] >> " + months[month]);
 	   for(int i=1; i<=months[month]; i++){ 		   
 		   //System.out.println("i >> " + i);
 		   //System.out.println("temp_weekday >> " + temp_weekday);
 		   if(temp_weekday == 7){ 			   
 			   //System.out.println("1 date "+i+" >> " + (date-1+i));

 			/*   if(temp_vector.size() != 0 && temp_vector.size() < 7){
 				   int loopSize = 7 - temp_vector.size();
 				   System.out.println("loopSize >> " + loopSize);
 				   Vector temp_vector2 = new Vector();
 				   for(int j=0; j<loopSize; j++){
 					   System.out.println("j >> " + j);
 					   temp_vector2.addElement("");
 				   }
 				   for(int j=0; j<temp_vector.size(); j++){
 					   String temp_data = (String)temp_vector.get(j);
 					   temp_vector2.addElement(temp_data);
 				   }
 				   temp_vector = new Vector();
 				   temp_vector = temp_vector2; 
 			   }*/
 			   
 			   //1주씩
			   cal.add(temp_vector);
			   temp_weekday = 1;
// 			   temp_vector.removeAllElements();
 			   temp_vector = new Vector();
 			   temp_vector.addElement(String.valueOf(i));
 		   }else{
 			   temp_weekday++;
 			   temp_vector.addElement(String.valueOf(i));
 		   }
 	   }

 		  System.out.println("temp_vector.size() >> " + temp_vector.size());
	  if(temp_vector.size() != 0){
		  int loopSize = 7 - temp_vector.size();
		  System.out.println("loopSize >> " + loopSize);
		  for(int i=0; i<loopSize; i++){
			  System.out.println("i >> " + i);
			  temp_vector.addElement("");
		  } 			  

		  cal.add(temp_vector);
	  }
 	   
 	   return cal;
    }
    
    public static int getWeekOfYear(String year, String month, String day){
    	//주계산
        int n = 0;
        Calendar cal = Calendar.getInstance();
        //String sDate = DateTime.getCurrentDate();
        cal.set(Integer.parseInt(year),
                Integer.parseInt(month) - 1, //월만 0부터 시작...
                Integer.parseInt(day));
        //n = cal.get(Calendar.DAY_OF_WEEK);
        n = cal.get(Calendar.WEEK_OF_YEAR);
//        n = cal.get(Calendar.WEEK_OF_MONTH);
        return n;
    }
    public static int getTotalDayOfYear(String year) throws ParseException{
    	int year_i = Integer.parseInt(year);
    	int date = (year_i-1)*365 + (year_i-1)/4 - (year_i-1)/100 + (year_i-1)/400;
    	int leafday = 28;
    	if(year_i%4==0 && year_i/100!=0) leafday = 29;
    	int [] months = {0, 31, leafday, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    	for(int i=1; i<=12; i++){
    	   date += months[i];
    	}
    	return date;
    }
    
    public static int getTotalDayOfYear2(String year) throws ParseException{
    	int year_i = Integer.parseInt(year);
    	int date = (year_i-1)*365 + (year_i-1)/4 - (year_i-1)/100 + (year_i-1)/400;    	
    	return date;
    }
    
    public static int getWeekOfYearCurrent(String year, String month, String day) throws ParseException{
    	//주계산
    	System.out.println("getWeekOfYear >> " + day);
    	int result = 0;
    	int year_i = Integer.parseInt(year);
    	int month_i = Integer.parseInt(month);
    	int day_i = Integer.parseInt(day);
    	int date = getTotalDayOfYear2(year);
    	int weekday = 0;
    	int t_c_day_from_y = 0;
    	int week_start_day = 0;
    	weekday = (date)%7;    	
    	if(weekday != 0){
    		week_start_day = 7 - weekday;
    	}
    	System.out.println("date >> " + date);
    	System.out.println("week_start_day >> " + week_start_day);
 	
    	
    	for(int i=1; i<month_i; i++){
    		t_c_day_from_y += lastDay(year_i, i);
    	}

    	System.out.println("t_c_day_from_y >> " + t_c_day_from_y);
    	System.out.println("day_i >> " + day_i); 	    	
    	t_c_day_from_y = t_c_day_from_y + (day_i) - (week_start_day);
    	System.out.println("t_c_day_from_y >> " + t_c_day_from_y);
    	double temp_db = ((double)t_c_day_from_y/(double)7)-0.01;
    	System.out.println("temp_db >> " + temp_db);
    	result = (int)Math.ceil(temp_db);
 	    	
 	    if(result == 0)	result = 52;	
 	    return result;
    } 
    
    public static int lastDay(int year, int month) throws java.text.ParseException {
        int day = 0;
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: day = 31;
                     break;
            case 2: if ((year % 4) == 0) {
                        if ((year % 100) == 0 && (year % 400) != 0) { day = 28; }
                        else { day = 29; }
                    } else { day = 28; }
                    break;
            default: day = 30;
        }
        return day;
    }    
	
	public static void main(String args[]){
				System.out.println(DateTime.getDate("HHmmssS"));
	}
}
