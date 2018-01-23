/***************************************************************
****Angel Guillermo  Martinez Cruz******************************
****AreaOfCircle************************************************
****This pogram calculate the area of a circle.*****************
***************************************************************/
import java.util.*;
public class AreaOfCircle{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double r, pi, area;
    System.out.print("Se va a calcular el area de un circulo");
    System.out.printIn("\nIngrese radio.");
    r=sc.nextDouble();
    pi=3.1416;
    area=((pi*r)/(2));
    System.out.print("El area del circulo es: "+area);
  }
}
