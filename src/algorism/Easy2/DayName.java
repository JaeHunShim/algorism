package algorism.Easy2;
/*2016년 1월 1일은 금요일입니다. 2016년 A월 B일은 무슨 요일일까요? 두 수 A,B를 입력받아 A월 B일이 무슨 요일인지 출력하는 getDayName 함수를 완성하세요. 
요일의 이름은 일요일부터 토요일까지 각각
SUN,MON,TUE,WED,THU,FRI,SAT
를 출력해주면 됩니다. 예를 들어 A=5, B=24가 입력된다면 5월 24일은 화요일이므로 TUE를 반환하면 됩니다.*/

import java.util.Calendar;
class DayName
{
    public String getDayName(int a, int b)
    {
    	//1. 캘린터에 년도와 월과 일을 받아서 넣고
    Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, a-1);
		cal.set(Calendar.DATE, b);
		String[] week  = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		String week1="";
		//week 같은 경우는 1~7로 리턴하기때문에 1,7까지 else if문을 사용
		for(int i =0; i<week.length; i++) {
			if(cal.get(Calendar.DAY_OF_WEEK) == 1) {
				week1 = week[0];
			}else if(cal.get(Calendar.DAY_OF_WEEK) == 2) {
				week1 = week[1];
			}else if(cal.get(Calendar.DAY_OF_WEEK) == 3) {
				week1 = week[2];
			}else if(cal.get(Calendar.DAY_OF_WEEK) == 4) {
				week1 = week[3];
			}else if(cal.get(Calendar.DAY_OF_WEEK) == 5) {
				week1 = week[4];
			}else if(cal.get(Calendar.DAY_OF_WEEK) == 6) {
				week1 = week[5];
			}else if(cal.get(Calendar.DAY_OF_WEEK) == 7) {
				week1 = week[6];
			}
		}
      return week1;
  }
    public static void main(String[] args)
    {
        DayName test = new DayName();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}