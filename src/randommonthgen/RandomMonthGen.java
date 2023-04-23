package randommonthgen;

public class RandomMonthGen {

	public static void main(String[] args) {
		int min=1;
		int max=12;
		double ran1= Math.floor(Math.random()*(max-min+1)+min);
		int randomFinal=(int)ran1;
		String month="";
		switch( randomFinal)
		{
		case 1: month="january";break;
		case 2: month="February";break;
		case 3: month= "March";break;
		case 4: month= "April";break;
		case 5: month="May";break;
		case 6: month="June";break;
		case 7: month= "July";break;
		case 8: month= "August";break;
		case 9: month="September";break;
		case 10: month= "October";break;
		case 11: month= "November";break;
		case 12: month= "December";break;
		default: month="invalid";break;
		
		}
		System.out.println(month);
	}

}
