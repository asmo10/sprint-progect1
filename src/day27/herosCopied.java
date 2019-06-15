package day27;

import java.util.Arrays;

public class herosCopied {

	public static void main(String[] args) {

		//Andrew, I will bite you later on
		// 100% I will do it
		// I am so dangerous
		//meaw!!!!!!
    

String[] dcComicHeros = {"Superman",
            "Batman",
            "Aquaman",
            "Wonder Woman",
            "The Flash"
            ,"Green Lantern",
            "Vasyl"
          } ;  
    
    String[] herosCopied = new String[ dcComicHeros.length] ; 
    for (int i = 0; i < herosCopied.length; i++) {
      herosCopied[i] = dcComicHeros[i] ; 
    }

    System.out.println( Arrays.toString( herosCopied) );
    
//    // Sort this array 
//    // use for each loop to loop through all of them 
//    // if this array has the hero you are looking for 
//    // print Bingo 
//    
    Arrays.sort(herosCopied);
    System.out.println( Arrays.toString( herosCopied) );
    System.out.println( Arrays.toString( dcComicHeros) );
    
    
    
    
    for (String hero : dcComicHeros) {
      //System.out.println(hero);
      if(hero.equals("Vasyl")) {
        System.out.println("Bingo");
      }
    }

	}}


