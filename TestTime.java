/*
Write a class Time with three data members to store hr, min and seconds. Create two 
constructors and apply checks to set valid time. (hr<24, min<60, sec<60). Also create 
display function which displays all data members.
 */

package Assignment30_09_24;

public class TestTime {

	public static void main(String[] args) {
		Time time1 = new Time(12, 30, 45);
		System.out.println("1st Time");
		time1.display();
		System.out.println("==========================");
		
		Time time2 = new Time(25, 10, 15);
		System.out.println("2nd Time");
		time2.display();
		System.out.println("==========================");
		
		Time time3 = new Time();
		System.out.println("3rd Time");
		time3.display();
		System.out.println("==========================");
		
		time3.setTime(23, 59, 59);
		System.out.println("4th Time");
		time3.display();
		System.out.println("==========================");
		
		time3.setTime(24, 60, 60);
		System.out.println("5th Time");
		time3.display();
	}

}
