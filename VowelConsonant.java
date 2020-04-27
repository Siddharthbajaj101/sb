import java.util.Scanner; 

public class VowelConsonant
{
  public static void main(String args[])
  {
    
    Scanner sc = new Scanner (System.in) ;
    
    char character = sc.next().charAt(0);
    
    switch(character)
    {
       case 'a' :
       case 'A' :
       case 'e' :
       case 'E' :
       case 'I' :
       case 'i' :
       case 'o' :
       case 'O' :
       case 'U' :
       case 'u' :
       System.out.println("it is a vowel");
    break;
       case 'b' :
       case 'B' :
       case 'c' :
       case 'C' :
       case 'd' :
       case 'D' :
       case 'f' :
       case 'F' :
       case 'g' :
       case 'G' :
       case 'h' :
       case 'H' :
       case 'j' :
       case 'J' :
       case 'k' :
       case 'K' :
       case 'l' :
       case 'L' :
       case 'p' :
       case 'P' :
       case 'm' :
       case 'M' :
       case 'n' :
       case 'N' :
       case 'q' :
       case 'Q' :
       case 'r' :
       case 'R' :
       case 's' :
       case 'S' :
       case 't' :
       case 'T' :
       case 'v' :
       case 'V' :
       case 'x' :
       case 'X' :
       case 'Y' :
       case 'y' :
       case 'z' :
       case 'Z' :
       case 'w' :
       case 'W' :
       System.out.println("it is a consonant") ;      
        break;
        default :
        System.out.println("it is an another character") ;      
        break;
    }
    
    
  }
}
