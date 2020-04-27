import java.util.Scanner;
public class Display
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int c = sc.nextInt();
  Temperature input = new Temperature();
  input.convert(c);
  
 }
}
