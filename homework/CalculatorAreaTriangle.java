/***************************************************************
****Angel Guillermo  Martinez Cruz******************************
****CalculatorAreaTriangle**************************************
****This pogram calculate the area of a triangle.***************
***************************************************************/
import java.util.*;
  public class CalculatorAreaTriangle{
    public static Scanner entrada=new Scanner(System.in);

    double A, B;
    public static void main(String[] args) {
    A=solicitarValor("Indique el valor de la altura del triangulo: ");
    B=solicitarValor("Indique el valor de la base del triangulo: ");
    Area=(A*B)(2);
    System.out.printIn(Area);
  }
}
