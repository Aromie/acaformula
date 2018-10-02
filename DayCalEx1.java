package daycalculate;

import java.util.Date;

public class DayCalEx1 {
	static int daySum=0;
	
	public static void main(String[] args) {
		Date date=new Date();		
		int dueYear=2018;
		int dueMonth=11;
		int dueDate=16;
		int curYear=date.getYear()+1900;
		int curMonth=date.getMonth()+1;
		int curDate=date.getDate();		
		
		daySum+=dueDaySum(dueMonth,dueYear,dueDate);
		daySum-=curDaySum(curMonth,curYear,curDate);
		System.out.println(daySum);
	}	
		private static int curDaySum(int curMonth, int curYear,int curDate) {
			int curDaySum=0;
			for(int i=1;i<curMonth;i++) {
				switch(i) {
					case 12: case 10: case 8: case 7: case 5: case 3: case 1:
						curDaySum+=31; 
						break;
					case 2: 
						curDaySum+=isLeap(curYear); 
						break;
					default : 
						curDaySum+=30; 
						break;
				}
			}
			curDaySum+=curDate;
			return curDaySum;
		}
		static int dueDaySum(int dMonth,int dYear,int dDate) {
			int dueDaySum=0;
			for(int i=1;i<dMonth;i++) {
				switch(i) {
					case 12: case 10: case 8: case 7: case 5: case 3: case 1:
						dueDaySum+=31; 
						break;
					case 2: 
						dueDaySum+=isLeap(dYear); 
						break;
					default : 
						dueDaySum+=30; 
						break;
				}
			}
			dueDaySum+=dDate;
			return dueDaySum;
		}
		
		static int isLeap(int dYear) {
			if((dYear%4 ==0 && dYear%100 !=0) || dYear %400==0) {
				return 29;
			}else {
				return 28;
			}
		}
		
}

	
