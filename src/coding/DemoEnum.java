package coding;

public class DemoEnum {

	public static void main(String[] args) {
		
		DayOfTheWeek firstDay = DayOfTheWeek.MO;
		
		System.out.println("firstDay :" + firstDay);
		
		for(DayOfTheWeek dotw : DayOfTheWeek.values()) {
			System.out.print(dotw + " ");
		}
	}
	enum DayOfTheWeek{
		MO,TU,WE,TH,FR,SA,SU;
	}
}
