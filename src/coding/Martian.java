package coding;

import java.util.Random;

public class Martian {
	 private String name; 
	   public static int count = 0; 
	   private Random rand = new Random(); 
	   public Martian() { 
	      name = getRandomName(); 
	      count++; 
	   } 
	   private String getRandomName() { 
	      char capital = (char) ('A' + rand.nextInt(26)); 
	      int number = 10 + rand.nextInt(90); 
	      return String.valueOf(capital) + number; 
	   } 
	   @Override 
	   public String toString() { 
	      return String.format("%s\\%s", name, count); 
	   } 
	   public void doSomething() { 
	      if(count<5){
	    	  System.out.println(name + " is hiding");
	      }else {
	    	  System.out.println("Attack!");
	      }
		
	   } 
	   public static Martian[] invade(int numberOfMartians) { 
	      Martian[] martians = new Martian[numberOfMartians]; 
	      for (int i = 0; i < martians.length; i++) { 
	         martians[i] = new Martian(); 
	      } 
	      return martians; 
	   } 
	   public static Martian[] invade() { 
	      return invade(2 + new Random().nextInt(9)); 
	   } 
}
