package coding;

public class MartianApp {

	public static void main(String[] args) {
		
		Martian martian = new Martian(); 
	      System.out.println(martian); 
	      Martian[] martians = { new Martian(), new Martian(), new Martian() }; 
	      for (int i = 0; i < martians.length; i++) { 
	         martians[i].doSomething(); 
	      } 
	      Martian[] invaders = Martian.invade(13); 
	      for (int i = 0; i < invaders.length; i++) { 
	         System.out.println(invaders[i]); 
	      } 
	      Martian[] unknownInvaders = Martian.invade(); 
	      for (int i = 0; i < unknownInvaders.length; i++) { 
	         unknownInvaders[i].doSomething(); 
	      } 

	}

}
